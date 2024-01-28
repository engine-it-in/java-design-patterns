package org.nikitinia.patterns.structure.decorator.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.decorator.action.Sender;
import org.nikitinia.patterns.structure.decorator.action.Decrypter;
import org.nikitinia.patterns.structure.decorator.action.Encrypter;
import org.nikitinia.patterns.structure.decorator.action.SecuritySender;
import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

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
