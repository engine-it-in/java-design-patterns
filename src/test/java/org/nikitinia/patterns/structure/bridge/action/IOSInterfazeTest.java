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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class IOSInterfazeTest {

    private final DocumentRepository documentRepository
            = new DocumentRepository();

    private final IOSInterfaze iosInterfazeInterfaze
            = new IOSInterfaze(documentRepository);

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
        assertThat(iosInterfazeInterfaze)
                .isInstanceOf(Interfaze.class)
                .hasFieldOrPropertyWithValue("documentRepository", documentRepository);
    }

    @Test
    void loadDocument_shouldReturnResult() {
        documentRepository.putDocument(document);

        document.setType(Type.IOS);
        assertThat(iosInterfazeInterfaze.loadDocument(document.getNumber()))
                .usingRecursiveComparison()
                .isEqualTo(document);

        assertThat(byteArrayOutputStream.toString().trim())
                .contains("IOS. Load  document");
    }

    @Test
    void loadDocument_shouldThrownException() {
        assertThatThrownBy(()->iosInterfazeInterfaze.loadDocument(document.getNumber()))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void visualizeDocument_shouldDo() {
        documentRepository.putDocument(document);

        iosInterfazeInterfaze.visualizeDocument(document.getNumber());

        assertThat(byteArrayOutputStream.toString().trim())
                .contains("IOS. Visualize document")
                .contains(iosInterfazeInterfaze.loadDocument(document.getNumber()).toString());
    }

}