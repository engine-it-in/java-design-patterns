package org.nikitinia.patterns.structure.facade.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.nikitinia.patterns.structure.facade.action.DeliveryRoute;
import org.nikitinia.patterns.structure.facade.action.PreparatoryMobileDocumentList;
import org.nikitinia.patterns.structure.facade.actor.MobileDocument;
import org.nikitinia.patterns.structure.facade.dictionary.TypeMobile;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.nikitinia.patterns.structure.facade.util.TestBuilder.*;

@ExtendWith(MockitoExtension.class)
class FacadeWorkTest {

    private FacadeWork facadeWork;

    @Mock
    private PreparatoryMobileDocumentList preparatoryMobileDocumentList;

    @Mock
    private DeliveryRoute deliveryRoute;

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {

        System.setOut(new PrintStream(outputStream));

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

        MOBILE_DOCUMENT_LIST.add(new MobileDocument(DOCUMENT, TypeMobile.ANDROID));

        when(preparatoryMobileDocumentList.getPrepareMobileDocumentList(any()))
                .thenReturn(MOBILE_DOCUMENT_LIST);

        assertThat(facadeWork.prepareMobileDocumentList())
                .usingRecursiveComparison()
                .isEqualTo(MOBILE_DOCUMENT_LIST);

        verify(preparatoryMobileDocumentList).getPrepareMobileDocumentList(any());
    }

    @Test
    void prepareSenderRoute_shouldPrepare() {

        when(deliveryRoute.getRecipientMobileDocumentMap())
                .thenReturn(RECIPIENT_MOBILE_DOCUMENT_HASH_MAP);

        assertThat(facadeWork.prepareSenderRoute())
                .usingRecursiveComparison()
                .isEqualTo(RECIPIENT_MOBILE_DOCUMENT_HASH_MAP);

        verify(deliveryRoute).getRecipientMobileDocumentMap();
    }

    @Test
    void doWork_shouldDo() {

        MOBILE_DOCUMENT_LIST.add(new MobileDocument(DOCUMENT, TypeMobile.ANDROID));

        when(preparatoryMobileDocumentList.getPrepareMobileDocumentList(any()))
                .thenReturn(MOBILE_DOCUMENT_LIST);

        RECIPIENT_MOBILE_DOCUMENT_HASH_MAP.put(1, RECIPIENT_MOBILE_DOCUMENT);

        when(deliveryRoute.getRecipientMobileDocumentMap())
                .thenReturn(RECIPIENT_MOBILE_DOCUMENT_HASH_MAP);

        facadeWork.doWork();

        assertThat(outputStream.toString().trim())
                .contains("mobile document number")
                .contains(DOCUMENT.getNumber().toString())
                .contains("send to")
                .contains(RECIPIENT_MOBILE_DOCUMENT.toString())
                .contains("with id")
                .contains("1");

        verify(preparatoryMobileDocumentList).getPrepareMobileDocumentList(any());
        verify(deliveryRoute).getRecipientMobileDocumentMap();
    }

}