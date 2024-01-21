package org.nikitinia.patterns.structure.bridge.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.dictionarys.Type;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.bridge.actor.DocumentRepository;

@Slf4j
@AllArgsConstructor
@Getter
public class IOSInterfaze implements Interfaze {

    private DocumentRepository documentRepository;

    @Override
    public Document loadDocument(Double id) {
        log.info("IOS. Load  document");
        Document document = documentRepository.getDocument(id);
        document.setType(Type.IOS);
        return document;
    }

    @Override
    public void visualizeDocument(Double id) {
        log.info("IOS. Visualize document");
        System.out.println(loadDocument(id).toString());
    }

}
