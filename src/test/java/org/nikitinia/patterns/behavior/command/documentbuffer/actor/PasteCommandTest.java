package org.nikitinia.patterns.behavior.command.documentbuffer.actor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PasteCommandTest {

    private final Document document =
            DocumentCreator.documentBuild();
    private final PasteCommand pasteCommand
            = new PasteCommand(document);

    @Test
    void pasteCommand_shouldCheck() {
        assertThat(pasteCommand)
                .isInstanceOf(Command.class)
                .hasFieldOrPropertyWithValue("document", document);
    }

    @Test
    void execute_shouldReturnFalse() {
        assertThat(pasteCommand.execute())
                .isFalse();
    }

    @Test
    void execute_shouldReturnTrue() {
        Document testDocument = DocumentCreator.documentBuild();
        testDocument.getTextField().setBuffer("");
        final PasteCommand pasteCommandLocal = new PasteCommand(testDocument);

        assertThat(pasteCommandLocal.execute())
                .isTrue();
    }

    @Test
    void execute_shouldReturnTrue_checkBackUp() {
        Document testDocument = DocumentCreator.documentBuild();
        testDocument.getTextField().setBuffer("");
        final PasteCommand pasteCommandLocal = new PasteCommand(testDocument);

        pasteCommandLocal.execute();

        assertEquals(
                pasteCommandLocal.getBackUp(),
                document.getTextField().getText());

    }

    @Test
    void undo_shouldBackUpNull() {
        pasteCommand.undo();
        assertNull(document.getTextField().getBuffer());
    }

    @Test
    void undo_shouldBackUpNonNull() {
        pasteCommand.backUp();
        pasteCommand.undo();

        assertEquals(
                document.getTextField().getText(),
                pasteCommand.getBackUp());
    }

}
