package org.nikitinia.patterns.structure.facade.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.exception.FacadeProcessingException;

import java.util.HashMap;
import java.util.List;

/*
 * Что -> Класс, реализующий часть обработки - Отправку мобильных документов по всем получателям,
в которых тип мобильной операционной системы совпадает с типом мобильной операционной системы мобильного документа;
 * Для чего -> Локализовать обработку отправку мобильных документов в отдельном классе;
 * Реализация -> Класс с методом определения соответствия мобильной операционной системы;
 * В чем выгода -> Локализация отдельной части бизнес логики, требуемой от обработки;
 * */
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
                                    .orElseThrow(FacadeProcessingException::new)
                                    .getKey()
                            );
                }
            }
        }
    }

}
