package org.nikitinia.patterns.behavior.iterator.run;

import org.nikitinia.patterns.behavior.iterator.logic.DocumentRepository;

public class Program {

    public static void main(String[] args) {

        double[] averageGrade = {1, 1.1, 5};

        DocumentRepository documentRepository = new DocumentRepository("Some", averageGrade);

        System.out.println(documentRepository.getDocumentName());

        while (documentRepository.getIterator().hasNext()) {
            System.out.println(documentRepository.getIterator().next());
        }

    }

}
