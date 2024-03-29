package org.nikitinia.patterns.structure.flyweight.actor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.flyweight.action.Archive;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class NoteTest {

    private final Note note = new Note();

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    private final Document document = DocumentCreator.documentBuildWithNumber(1.0);

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkNote() {
        assertThat(note)
                .isInstanceOfSatisfying(Note.class, noteData -> {

                    assertThat(noteData)
                            .isInstanceOf(Archive.class);

                    assertThat(noteData.getReceiver())
                            .containsPattern(Pattern.compile("[a-zA-Z0-9]*"));

                    assertThat(noteData.getArchiveBox())
                            .usingRecursiveComparison()
                            .isEqualTo(new HashMap<>());
                });
    }

    @Test
    void archive_shouldReturnResult() {
        note.archive(document);

        assertThat(note.getArchiveBox())
                .containsEntry(document.getNumber().longValue(), document);

        assertThat(outputStream.toString().trim())
                .contains("Note number")
                .contains(document.getNumber().toString())
                .contains("put in Archive, receiver is")
                .contains(note.getReceiver());
    }

}