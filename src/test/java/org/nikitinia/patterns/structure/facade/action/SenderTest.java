package org.nikitinia.patterns.structure.facade.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.RecipientMobileDocumentCreator;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;
import org.nikitinia.patterns.structure.facade.exception.FacadeProcessingException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.structure.facade.util.TestBuilder.DOCUMENT;
import static org.nikitinia.patterns.structure.facade.util.TestBuilder.RECIPIENT_MOBILE_DOCUMENT_HASH_MAP;

class SenderTest {

    private final List<MobileDocument> mobileDocumentList =
            List.of(new MobileDocument(DOCUMENT, TypeMobile.WINDOWS));

    private final RecipientMobileDocument recipientMobileDocument =
            RecipientMobileDocumentCreator.RecipientMobileDocumentCreatorWithNameTypeMobile("name", TypeMobile.WINDOWS);

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        /*Log*/
        System.setOut(new PrintStream(outputStream));
        /*Attribute*/
        RECIPIENT_MOBILE_DOCUMENT_HASH_MAP.put(1, recipientMobileDocument);
    }

    private final Sender sender =
            new Sender(RECIPIENT_MOBILE_DOCUMENT_HASH_MAP, mobileDocumentList);

    @Test
    void checkSender() {
        assertThat(sender)
                .hasFieldOrPropertyWithValue("recipientMobileDocumentMap", RECIPIENT_MOBILE_DOCUMENT_HASH_MAP)
                .hasFieldOrPropertyWithValue("mobileDocumentList", mobileDocumentList);
    }

    @Test
    void sendDocumentToRecipient_shouldDo() {
        sender.sendDocumentToRecipient();

        assertThat(outputStream.toString().trim())
                .contains("mobile document number")
                .contains("send to")
                .contains("with id")
                .contains(DOCUMENT.getNumber().toString())
                .contains(
                        RECIPIENT_MOBILE_DOCUMENT_HASH_MAP
                                .entrySet().stream()
                                .filter(entry -> entry.getValue().equals(recipientMobileDocument))
                                .findFirst()
                                .orElseThrow(FacadeProcessingException::new)
                                .getKey()
                                .toString());

    }

}