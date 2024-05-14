package org.nikitinia.patterns.structure.bridge.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.bridge.actor.DocumentRepository;

/**
 * Что -> Реализация логики работы над документами;
 * Для чего -> Конкретные действия над документами;
 * Реализация -> Класс, реализующий интерфейс;
 * Ценность -> Реализация рабочей логики;
 */
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
