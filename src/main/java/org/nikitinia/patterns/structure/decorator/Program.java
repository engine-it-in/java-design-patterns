package org.nikitinia.patterns.structure.decorator;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

public class Program {

    public static void main(String[] args) {

        Document document = DocumentCreator.documentBuildWithNumber(1.0);

        SecurityDocument securityDocument = new SecurityDocument(document, null);

        Sender sender = new Decrypter(
                new Encrypter(
                        new SecuritySender())
        );

        System.out.println(sender.send(securityDocument));

    }

}
