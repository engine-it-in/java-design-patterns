package org.nikitinia.patterns.behavior.iterator.logic;

import org.nikitinia.patterns.behavior.iterator.actor.DocumentRepository;

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