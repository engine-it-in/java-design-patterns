package org.nikitinia.patterns.structure.facade.action;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.util.ArrayList;
import java.util.List;

/**
 * Что -> Класс, реализующий часть обработки - Подготовку мобильных документов с
произвольно определяемым типом мобильной операционной системы;
 * Для чего -> Локализовать обработку подготовку мобильных документов в отдельном классе;
 * Реализация -> Класс с методом создания списка документов с произвольным типом мобильной операционной системы;
 * Ценность -> Локализация отдельной части бизнес логики, требуемой от обработки;
 */
@Slf4j
public class PreparatoryMobileDocumentList {

    public List<MobileDocument> getPrepareMobileDocumentList(List<Document> documentList) {
        List<MobileDocument> mobileDocumentList = new ArrayList<>();
        MobileDocument mobileDocument = null;
        for (Document document : documentList) {
            mobileDocument = new MobileDocument(document, TypeMobile.randomType());
            log.info(
                    "Document with number {} and type {} prepare",
                    mobileDocument.document().getNumber(),
                    mobileDocument.typeMobile());
            mobileDocumentList.add(mobileDocument);
        }
        return mobileDocumentList;
    }
}