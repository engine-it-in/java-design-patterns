package org.nikitinia.patterns.structure.facade.logic;

import lombok.AllArgsConstructor;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.action.DeliveryRoute;
import org.nikitinia.patterns.structure.facade.action.PreparatoryMobileDocumentList;
import org.nikitinia.patterns.structure.facade.action.Sender;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
 * Что -> Класс фасад, который объединяет работу созданных классов в едином месте;
 * Для чего -> Интегрировать работу классов в едином месте;
 * Реализация -> Класс с методом, запускающим работу;
 * В чем выгода -> Исполнение рабочей логики;
 * */
@AllArgsConstructor
public class FacadeWork {

    private PreparatoryMobileDocumentList preparatoryMobileDocumentList;

    private DeliveryRoute deliveryRoute;

    public List<MobileDocument> prepareMobileDocumentList() {
        /*Создали список документов*/
        List<Document> documentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            documentList.add(DocumentCreator.documentBuildWithNumber(Double.valueOf(String.valueOf(i))));
        }

        /*Подготовили мобильные документы*/
        return preparatoryMobileDocumentList
                .getPrepareMobileDocumentList(documentList);

    }

    public HashMap<Integer, RecipientMobileDocument> prepareSenderRoute() {
        /*Подготовили Подготовили получателей мобильный документов*/
        List<RecipientMobileDocument> recipientMobileDocumentList = List.of(
                RecipientMobileDocument.builder().name("Иван").surname("Иванов").patronymic("Иванович").typeMobile(TypeMobile.ANDROID).build(),
                RecipientMobileDocument.builder().name("Петр").surname("Петров").patronymic("Петрович").typeMobile(TypeMobile.ANDROID).build(),
                RecipientMobileDocument.builder().name("Семен").surname("Семенов").patronymic("Семенович").typeMobile(TypeMobile.ANDROID).build(),
                RecipientMobileDocument.builder().name("Николай").surname("Николаев").patronymic("Николаевич").typeMobile(TypeMobile.IOS).build(),
                RecipientMobileDocument.builder().name("Андрей").surname("Андреев").patronymic("Андреевич").typeMobile(TypeMobile.WINDOWS).build()
        );

        /*Готовим маршрут для получателей мобильных документов*/
        for (RecipientMobileDocument recipientMobileDocument : recipientMobileDocumentList) {
            deliveryRoute.addRecipientToDeliveryRoute(recipientMobileDocument);
        }

        return deliveryRoute.getRecipientMobileDocumentMap();
    }

    public void doWork() {

        /*Отправляем документы*/
        Sender sender = new Sender(prepareSenderRoute(), prepareMobileDocumentList());
        sender.sendDocumentToRecipient();

    }


}
