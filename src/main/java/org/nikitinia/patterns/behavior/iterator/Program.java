package org.nikitinia.patterns.behavior.iterator;

import org.nikitinia.patterns.behavior.iterator.logic.DocumentRepository;

import static org.nikitinia.domain.creator.DocumentCreator.getDocumentListFromThreeDocument;

public class Program {

    public static void main(String[] args) {

        DocumentRepository documentRepository
                = new DocumentRepository(getDocumentListFromThreeDocument());

        while (documentRepository.getIterator().hasNext()) {
            documentRepository.getIterator().next();
        }

    }

}