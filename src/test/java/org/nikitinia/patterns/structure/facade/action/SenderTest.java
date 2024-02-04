package org.nikitinia.patterns.structure.facade.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.creator.RecipientMobileDocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;
import org.nikitinia.patterns.structure.facade.exception.FacadeProcessingException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SenderTest {

    private HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap =
            new HashMap<>();

    private final Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    private final List<MobileDocument> mobileDocumentList =
            List.of(new MobileDocument(document, TypeMobile.WINDOWS));

    private final RecipientMobileDocument recipientMobileDocument =
            RecipientMobileDocumentCreator.RecipientMobileDocumentCreatorWithNameTypeMobile("name", TypeMobile.WINDOWS);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        /*Log*/
        System.setOut(new PrintStream(outputStream));
        /*Attribute*/
        recipientMobileDocumentMap.put(1, recipientMobileDocument);
    }

    private final Sender sender =
            new Sender(recipientMobileDocumentMap, mobileDocumentList);

    @Test
    void checkSender() {
        assertThat(sender)
                .hasFieldOrPropertyWithValue("recipientMobileDocumentMap", recipientMobileDocumentMap)
                .hasFieldOrPropertyWithValue("mobileDocumentList", mobileDocumentList);
    }

    @Test
    void sendDocumentToRecipient_shouldDo() {
        sender.sendDocumentToRecipient();

        assertThat(outputStream.toString().trim())
                .contains("mobile document number")
                .contains("send to")
                .contains("with id")
                .contains(document.getNumber().toString())
                .contains(
                        recipientMobileDocumentMap
                                .entrySet().stream()
                                .filter(entry -> entry.getValue().equals(recipientMobileDocument))
                                .findFirst()
                                .orElseThrow(FacadeProcessingException::new)
                                .getKey()
                                .toString());

    }

}