package factorymethod.logic.create;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.creational.factorymethod.logic.create.FamilySon;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.SonSimpleObject;

import util.TestBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FamilySonTest {

    @Mock
    private FamilySon familySonMock;

    FamilySon familySon = (FamilySon)
            new TestBuilder().fabricPrepareFamily(new FamilySon());

    @Test
    void should_create() {
        doReturn(new SonSimpleObject()).when(familySonMock).createObject();

        assertThat(familySonMock.createObject())
                .usingRecursiveComparison()
                .isEqualTo(familySon.createObject());

        verify(familySonMock, times(1)).createObject();
        verifyNoMoreInteractions(familySonMock);

    }

}
