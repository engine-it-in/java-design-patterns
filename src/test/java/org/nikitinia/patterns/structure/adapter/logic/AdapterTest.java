package org.nikitinia.patterns.structure.adapter.logic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.adapter.action.DocumentDatabase;
import org.nikitinia.patterns.structure.adapter.actor.DocumentRepository;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class AdapterTest {

    private final Adapter adapter = new Adapter();

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    private final Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkAdapter() {
        assertThat(adapter)
                .isInstanceOf(DocumentRepository.class)
                .isInstanceOf(DocumentDatabase.class);
    }

    @Test
    void insert_shouldDo() {
        adapter.insert(document);

        assertThat(outputStream.toString())
                .contains("Save");

        assertThat(adapter.getDocumentMap().get(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);
    }

    @Test
    void select_shouldDo() {
        adapter.insert(document);

        assertThat(adapter.select(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);

        assertThat(outputStream.toString())
                .contains("Load");

    }

    @Test
    void update_shouldDo() {
        adapter.insert(document);
        adapter.update(document);

        assertThat(adapter.getDocumentMap().get(document.getNumber()))
                .isInstanceOfSatisfying(Document.class, documentData ->
                        assertThat(documentData.getStatus()).isEqualTo(Status.SIGN));

        assertThat(adapter.getDocumentMap())
                .hasSize(1);

        assertThat(outputStream.toString())
                .contains("Load")
                .contains("Delete")
                .contains("Save");
    }

    @Test
    void remove_shouldDo() {
        adapter.insert(document);
        adapter.remove(document);

        assertThat(outputStream.toString())
                .contains("Delete");

        assertThat(adapter.getDocumentMap())
                .hasSize(0);
    }

    @Test
    void stateDocumentMap_shouldNotEmpty() {
        adapter.insert(document);
        adapter.stateDocumentMap();

        assertThat(outputStream.toString())
                .contains(String.format("documentMap contain document with number: %s", document.getNumber()));

    }

    @Test
    void stateDocumentMap_shouldEmpty() {
        adapter.stateDocumentMap();

        assertThat(outputStream.toString())
                .contains("DocumentMap is Empty");
    }

}