package org.nikitinia.patterns.structure.facade.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.facade.action.DeliveryRoute;
import org.nikitinia.patterns.structure.facade.action.PreparatoryMobileDocumentList;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FacadeWorkTest {

    @Mock
    private PreparatoryMobileDocumentList preparatoryMobileDocumentList;
//        = Mockito.mock(PreparatoryMobileDocumentList.class);

    @Mock
    private DeliveryRoute deliveryRoute;

    private FacadeWork facadeWork;

    @BeforeEach
    void setUp() {
        facadeWork = new FacadeWork(preparatoryMobileDocumentList, deliveryRoute);
    }

    @Test
    void checkFacadeWork() {
        assertThat(facadeWork)
                .hasFieldOrPropertyWithValue("preparatoryMobileDocumentList", preparatoryMobileDocumentList)
                .hasFieldOrPropertyWithValue("deliveryRoute", deliveryRoute);
    }

    @Test
    void prepareMobileDocumentList_shouldReturnResult() {

        List<Document> documentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            documentList.add(DocumentCreator.documentBuildWithNumber(Double.valueOf(String.valueOf(i))));
        }

        Document document = DocumentCreator.documentBuildWithNumber(1.0);

        List<MobileDocument> mobileDocumentList = List.of(new MobileDocument(document, TypeMobile.ANDROID));

        when(preparatoryMobileDocumentList.getPrepareMobileDocumentList(documentList))
                .thenReturn(mobileDocumentList);

        assertThat(facadeWork.prepareMobileDocumentList())
                .usingRecursiveComparison()
                .isEqualTo(mobileDocumentList);
    }


}