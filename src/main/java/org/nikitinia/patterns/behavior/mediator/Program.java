package org.nikitinia.patterns.behavior.mediator;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

public class Program {

    public static void main(String[] args) {
        AudioCommunicationSystem audioCommunicationSystem = new AudioCommunicationSystem();

        Document documentFirst = DocumentCreator.documentBuildWithNumber(1.0);
        Document documentSecond = DocumentCreator.documentBuildWithNumber(2.0);

        User admin = new Admin(audioCommunicationSystem, "admin");
        User userFirst = new Operator(audioCommunicationSystem, "first");
        User userSecond = new Operator(audioCommunicationSystem, "second");

        audioCommunicationSystem.setAdmin(admin);
        audioCommunicationSystem.addUser(userFirst);
        audioCommunicationSystem.addUser(userSecond);

        userFirst.sendDocument(documentFirst);
        userSecond.sendDocument(documentSecond);

    }

}
