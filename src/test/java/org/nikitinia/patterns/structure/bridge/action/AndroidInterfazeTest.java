package org.nikitinia.patterns.structure.bridge.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.dictionarys.Type;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.bridge.actor.DocumentRepository;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class AndroidInterfazeTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final AndroidInterfaze androidInterfaze
            = new AndroidInterfaze(documentRepository);

    private final Document document
            = DocumentCreator.documentBuildWithNumber(1.0);

    private final ByteArrayOutputStream byteArrayOutputStream
            = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    void checkAndroidInterfaze() {
        assertThat(androidInterfaze)
                .isInstanceOf(Interfaze.class)
                .hasFieldOrPropertyWithValue("documentRepository", documentRepository);
    }

    @Test
    void loadDocument_shouldReturnResult() {
        documentRepository.putDocument(document);

        document.setType(Type.ANDROID);
        assertThat(androidInterfaze.loadDocument(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);

        assertThat(byteArrayOutputStream.toString().trim())
                .contains("Android. Load  document");
    }

    @Test
    void visualizeDocument_shouldDo() {
        documentRepository.putDocument(document);

        androidInterfaze.visualizeDocument(document.getNumber());

        assertThat(byteArrayOutputStream.toString().trim())
                .contains("Android. Visualize document")
                .contains(androidInterfaze.loadDocument(document.getNumber()).toString());
    }

}