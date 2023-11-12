package factorymethod.logic.create;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.behavior.factorymethod.logic.create.GrandFamily;
import org.patterns.gof.behavior.factorymethod.object.parentsimpleobject.ParentSimpleObject;
import util.TestBuilder;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class GrandFamilyTest {
    @Mock
    private GrandFamily grandFamilyMock;

    private final GrandFamily grandFamily =
            (GrandFamily) new TestBuilder().fabricPrepareFamily(new GrandFamily());

    @Test
    void should_create() {
        doReturn(new ParentSimpleObject()).when(grandFamilyMock).createObject();

        assertThat(grandFamilyMock.createObject())
                .usingRecursiveComparison()
                .isEqualTo(grandFamily.createObject());

        verify(grandFamilyMock, times(1)).createObject();
        verifyNoMoreInteractions(grandFamilyMock);
    }
}
