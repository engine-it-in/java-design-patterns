package org.nikitinia.patterns.structure.facade.action;

import ch.qos.logback.classic.PatternLayout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.RecipientMobileDocumentCreator;
import org.nikitinia.patterns.structure.facade.actor.RecipientMobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class DeliveryRouteTest {

    private final HashMap<Integer, RecipientMobileDocument> recipientMobileDocumentMap =
            new HashMap<>();

    private final DeliveryRoute deliveryRoute =
            new DeliveryRoute();

    private final RecipientMobileDocument recipientMobileDocument =
            RecipientMobileDocumentCreator.RecipientMobileDocumentCreatorWithNameTypeMobile("name", TypeMobile.WINDOWS);

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkDeliveryRoute() {
        assertThat(deliveryRoute)
                .hasFieldOrPropertyWithValue("recipientMobileDocumentMap", recipientMobileDocumentMap)
                .hasFieldOrPropertyWithValue("recipientMobileDocumentMap", new HashMap<>())
        ;
    }

    @Test
    void addRecipientToDeliveryRoute_shouldDo() {

        deliveryRoute.addRecipientToDeliveryRoute(recipientMobileDocument);

        assertThat(outputStream.toString().trim())
                .contains("was added to delivery route with id")
                .contains(recipientMobileDocument.name())
                .contains(recipientMobileDocument.surname())
                .contains(recipientMobileDocument.patronymic())
                .containsPattern(Pattern.compile("\\d{1,2}"));

        assertThat(deliveryRoute.getRecipientMobileDocumentMap())
                .containsValues(recipientMobileDocument);
    }

}