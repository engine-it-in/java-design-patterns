package org.nikitinia.patterns.structure.facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.model.documents.Document;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@NoArgsConstructor
public class PreparatoryMobileDocumentList {

    public List<MobileDocument> getPrepareMobileDocumentList(List<Document> documentList) {
        List<MobileDocument> mobileDocumentList = new ArrayList<>();
        MobileDocument mobileDocument;
        for (int i = 0; i < documentList.size(); i++) {
            if (i % 2 == 0) {
                mobileDocument = new MobileDocument(documentList.get(i), TypeMobile.randomType());
            } else {
                mobileDocument = new MobileDocument(documentList.get(i), TypeMobile.randomType());
            }
            log.info(
                    "Document with number {} and type {} prepare",
                    mobileDocument.document().getNumber(),
                    mobileDocument.typeMobile());
            mobileDocumentList.add(mobileDocument);
        }
        return mobileDocumentList;
    }


}
