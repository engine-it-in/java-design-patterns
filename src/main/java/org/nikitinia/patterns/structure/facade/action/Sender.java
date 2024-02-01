package org.nikitinia.patterns.structure.facade.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;

import java.util.HashMap;
import java.util.List;

@Getter
@AllArgsConstructor
@Slf4j
public class Sender {

    private HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap;

    private List<MobileDocument> mobileDocumentList;


    public void sendDocumentToRecipient() {
        for (RecipientMobileDocument recipientMobileDocument: recipientMobileDocumentMap.values()) {
            for (MobileDocument mobileDocument: mobileDocumentList) {
                if (recipientMobileDocument.typeMobile() == mobileDocument.typeMobile()) {
                    log.info("mobile document number {} send to {} with id {}",
                            mobileDocument.document().getNumber(),
                            recipientMobileDocument,
                            recipientMobileDocumentMap
                                    .entrySet().stream()
                                    .filter(entry -> entry.getValue().equals(recipientMobileDocument))
                                    .findFirst()
                                    .get()
                                    .getKey()
                            );
                }
            }
        }
    }

}
