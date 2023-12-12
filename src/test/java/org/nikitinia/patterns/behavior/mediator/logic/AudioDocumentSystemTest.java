package org.nikitinia.patterns.behavior.mediator.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.mediator.actor.Admin;
import org.nikitinia.patterns.behavior.mediator.actor.Operator;
import org.nikitinia.patterns.behavior.mediator.actor.User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.nikitinia.patterns.behavior.mediator.util.Constant.TEST_NAME;
import static org.nikitinia.patterns.behavior.mediator.util.Constant.TEST_NAME_ANOTHER;

class AudioDocumentSystemTest {

    private final AudioDocumentSystem audioDocumentSystem =
            new AudioDocumentSystem();

    private final Admin admin =
            new Admin(audioDocumentSystem, TEST_NAME);

    private final Operator operator =
            new Operator(audioDocumentSystem, TEST_NAME);

    private final Operator operatorAnother =
            new Operator(audioDocumentSystem, TEST_NAME_ANOTHER);

    private final Document document =
            DocumentCreator.documentBuild();

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkAudioDocumentSystem() {
        assertThat(audioDocumentSystem)
                .hasFieldOrPropertyWithValue("admin", null)
                .hasFieldOrPropertyWithValue("users", new ArrayList<>())
        ;
    }

    @Test
    void setAdmin_shouldSet() {
        audioDocumentSystem.setAdmin(admin);
        assertEquals(
                audioDocumentSystem.admin,
                admin
        );
    }

    @Test
    void setAdmin_shouldNotSet() {
        assertThatThrownBy(() -> audioDocumentSystem.setAdmin(operator))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Not right");
    }

    @Test
    void addUser_shouldThrownNotAdmin() {
        assertThatThrownBy(() -> audioDocumentSystem.addUser(operator))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Not admin in system");
    }

    @Test
    void addUser_shouldAdd() {
        audioDocumentSystem.setAdmin(admin);
        audioDocumentSystem.addUser(operator);
        assertThat(audioDocumentSystem.users)
                .contains(operator);
    }

    @Test
    void addUser_shouldThrownAdminCanNot() {
        audioDocumentSystem.setAdmin(admin);
        assertThatThrownBy(() -> audioDocumentSystem.addUser(admin))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Admin can not do in another system");
    }

    @Test
    void sendDocument_shouldAdminDo() {
        audioDocumentSystem.setAdmin(admin);
        audioDocumentSystem.addUser(operator);
        audioDocumentSystem.sendDocument(document, admin);
        assertEquals(
                "Operator visualize " + document,
                outputStream.toString().trim()
        );
    }

    @Test
    void sendDocument_shouldOperatorDo() {
        audioDocumentSystem.setAdmin(admin);
        audioDocumentSystem.addUser(operator);
        operatorAnother.setEnabled(true);
        audioDocumentSystem.sendDocument(document, operatorAnother);

        assertThat(outputStream.toString().trim())
                .contains("Operator visualize " + document)
                .contains("Admin visualize " + document);
    }

}