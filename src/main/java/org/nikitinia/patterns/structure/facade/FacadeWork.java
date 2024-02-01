package org.nikitinia.patterns.structure.facade;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.util.ArrayList;
import java.util.List;


public class FacadeWork {

    public void doWork() {
        /*Создали список документов*/
        List<Document> documentList = new ArrayList<>();
        for (int i =0 ; i<5; i++) {
            documentList.add(DocumentCreator.documentBuildWithNumber(Double.valueOf(String.valueOf(i))));
        }

        /*Подготовили мобильные документы*/
        PreparatoryMobileDocumentList preparatoryMobileDocumentList = new PreparatoryMobileDocumentList();
        List<MobileDocument> mobileDocumentList = preparatoryMobileDocumentList.getPrepareMobileDocumentList(documentList);

        /*Подготовили Подготовили получателей мобильный документов*/
        List<RecipientMobileDocument> recipientMobileDocumentList = List.of(
                RecipientMobileDocument.builder().name("Иван").surname("Иванов").patronymic("Иванович").typeMobile(TypeMobile.ANDROID).build(),
                RecipientMobileDocument.builder().name("Петр").surname("Петров").patronymic("Петрович").typeMobile(TypeMobile.ANDROID).build(),
                RecipientMobileDocument.builder().name("Семен").surname("Семенов").patronymic("Семенович").typeMobile(TypeMobile.ANDROID).build(),
                RecipientMobileDocument.builder().name("Николай").surname("Николаев").patronymic("Николаевич").typeMobile(TypeMobile.IOS).build(),
                RecipientMobileDocument.builder().name("Андрей").surname("Андреев").patronymic("Андреевич").typeMobile(TypeMobile.WINDOWS).build()
        );

        /*Готовим маршрут для получателей мобильных документов*/
        DeliveryRoute deliveryRoute = new DeliveryRoute();
        for (RecipientMobileDocument recipientMobileDocument: recipientMobileDocumentList) {
            deliveryRoute.addRecipientToDeliveryRoute(recipientMobileDocument);
        }

        /*Отправляем документы*/
        Sender sender = new Sender(deliveryRoute.getRecipientMobileDocumentMap(), mobileDocumentList);
        sender.sendDocumentToRecipient();


    }


}
