package org.nikitinia.patterns.behavior.iterator;

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
