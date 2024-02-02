package org.nikitinia.patterns.structure.facade.action;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;

import java.util.HashMap;
import java.util.random.RandomGenerator;

/*
 * Что -> Класс, реализующий часть обработки - Определение маршрута;
 * Для чего -> Локализовать обработку получателей и создание для них произвольного коэффициента отправки;
 * Реализация -> Класс с методом помещения получателя в маршрут с уникальным id;
 * В чем выгода -> Локализация отдельной части бизнес логики, требуемой от обработки;
 * */
@Slf4j
@Getter
public class DeliveryRoute {

    private final HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap;

    public DeliveryRoute() {
        this.recipientMobileDocumentMap = new HashMap<>();
    }


    public void addRecipientToDeliveryRoute(RecipientMobileDocument recipientMobileDocument) {
        int id = 0;

        while (recipientMobileDocumentMap.containsKey(id)) {
            id = RandomGenerator.getDefault().nextInt(1, 100);
        }
        recipientMobileDocumentMap.put(id, recipientMobileDocument);

        log.info("{} {} {} was added to delivery route with id {}",
                recipientMobileDocument.name(),
                recipientMobileDocument.surname(),
                recipientMobileDocument.patronymic(),
                id
        );
    }

}