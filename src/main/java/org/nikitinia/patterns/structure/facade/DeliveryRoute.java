package org.nikitinia.patterns.structure.facade;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.random.RandomGenerator;

@Slf4j
public class DeliveryRoute {

    private HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap;
    private List<Integer> priorityList;

    public DeliveryRoute(HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap, List<Integer> priorityList) {
        this.recipientMobileDocumentMap = new HashMap<>();
        this.priorityList = new ArrayList<>();
    }


    public void addRecipientToDeliveryRoute(RecipientMobileDocument recipientMobileDocument) {
        int coefficient = 0;

        while (!priorityList.contains(coefficient)) {
            coefficient = RandomGenerator.getDefault().nextInt(1, 100);
        }
        priorityList.add(coefficient);
        recipientMobileDocumentMap.put(coefficient, recipientMobileDocument);

        log.info("{} {} {} was added to delivery route with coefficient {}",
                recipientMobileDocument.name(),
                recipientMobileDocument.surname(),
                recipientMobileDocument.patronymic(),
                coefficient
        );
    }

    public void clearRecipientMobileDocumentMap(RecipientMobileDocument recipientMobileDocument) {
        recipientMobileDocumentMap.clear();
        log.info("Delivery route was clear");
    }

}