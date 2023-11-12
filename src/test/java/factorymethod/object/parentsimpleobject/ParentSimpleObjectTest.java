package factorymethod.object.parentsimpleobject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.behavior.factorymethod.object.parentsimpleobject.ParentSimpleObject;
import util.TestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ParentSimpleObjectTest {

    @Mock
    private ParentSimpleObject parentSimpleObjectMock;

    private final ParentSimpleObject parentSimpleObject = (ParentSimpleObject)
            new TestBuilder().fabricPrepareObject(new ParentSimpleObject());

    @Test
    void should_getTypeNameTest() {
        when(parentSimpleObjectMock.getTypeName()).thenReturn(parentSimpleObject.getTypeName());
        assertEquals(parentSimpleObjectMock.getTypeName(), parentSimpleObject.getTypeName());
        verify(parentSimpleObjectMock, times(1)).getTypeName();
        verifyNoMoreInteractions(parentSimpleObjectMock);
    }

    @Test
    void should_getSimpleName() {
        when(parentSimpleObjectMock.getSimpleName()).thenReturn(parentSimpleObject.getSimpleName());
        assertEquals(parentSimpleObjectMock.getSimpleName(), parentSimpleObject.getSimpleName());
        verify(parentSimpleObjectMock, times(1)).getSimpleName();
        verifyNoMoreInteractions(parentSimpleObjectMock);
    }

    @Test
    void should_open() {
        doCallRealMethod().when(parentSimpleObjectMock).open();
        parentSimpleObjectMock.open();
        verify(parentSimpleObjectMock, times(1)).open();
    }

}
