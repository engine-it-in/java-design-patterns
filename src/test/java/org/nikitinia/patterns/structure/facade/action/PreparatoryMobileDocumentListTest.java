package org.nikitinia.patterns.structure.facade.action;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.map;

class PreparatoryMobileDocumentListTest {

    private final Document document =
            DocumentCreator.documentBuildWithNumber(1.0);

    private final List<Document> documentList = List.of(
            document
    );

    private final PreparatoryMobileDocumentList preparatoryMobileDocumentList =
            new PreparatoryMobileDocumentList();

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void checkPreparatoryMobileDocumentListTest() {
        assertThat(preparatoryMobileDocumentList)
                .hasAllNullFieldsOrProperties();
    }

    @Test
    void getPrepareMobileDocumentList_shouldDo() {

        assertThat(preparatoryMobileDocumentList.getPrepareMobileDocumentList(documentList))
                .isInstanceOfSatisfying(List.class, list -> {

                    assertThat(list.get(documentList.size() - 1))
                            .isInstanceOfSatisfying(MobileDocument.class, mobileDocument -> {

                                assertThat(mobileDocument.document().getNumber())
                                        .isEqualTo(document.getNumber());

                                assertThat(mobileDocument.typeMobile())
                                        .isInstanceOf(TypeMobile.class);

                            });
                });

        assertThat(outputStream.toString().trim())
                .contains("Document with number")
                .contains("and type")
                .contains("prepare")
                .contains(document.getNumber().toString())
                .containsAnyOf(
                        TypeMobile.ANDROID.toString(),
                        TypeMobile.IOS.toString(),
                        TypeMobile.WINDOWS.toString()
                );
    }

}