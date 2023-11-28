package org.nikitinia.patterns.behavior.command.documentbuffer.action;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CopyCommandTest {

    private final Document document =
            DocumentCreator.documentBuild();
    private final CopyCommand copyCommand =
            new CopyCommand(document);

    @Test
    void copyCommand_extendsFromCommand() {
        assertThat(copyCommand)
                .isInstanceOf(Command.class)
                .hasFieldOrPropertyWithValue("document", document)
                .hasFieldOrProperty("backUp");
    }

    @Test
    void execute_shouldReturnTrue() {
        assertThat(copyCommand.execute())
                .isTrue();
    }

    @Test
    void execute_shouldSetBuffer() {
        copyCommand.execute();
        assertEquals(
                document.getTextField().getBuffer(),
                document.getTextField().getText());
    }

    @Test
    void backUp_shouldDo() {
        copyCommand.backUp();
        assertEquals(
                copyCommand.getBackUp(),
                copyCommand.getDocument().getTextField().getText()
        );
    }

    @Test
    void undo_shouldReturnResult_thenBackUpNull() {
        copyCommand.undo();
        assertNull(copyCommand.getBackUp());
        assertNull(copyCommand.getDocument().getTextField().getBuffer());
    }

    @Test
    void undo_shouldReturnResult_thenBackUpNonNull() {
        copyCommand.backUp();
        copyCommand.undo();
        assertNotNull(copyCommand.getBackUp());
        assertEquals(copyCommand.getDocument().getTextField().getText(), copyCommand.getBackUp());
    }


}
