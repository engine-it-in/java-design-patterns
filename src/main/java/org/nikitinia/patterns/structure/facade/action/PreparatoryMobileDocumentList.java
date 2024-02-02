package org.nikitinia.patterns.structure.facade.action;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@NoArgsConstructor
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