package factorymethod.object.childsimpleobject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.SonSimpleObject;
import util.TestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SonSimpleObjectTest {

    @Mock
    private SonSimpleObject sonSimpleObjectMock;

    private final SonSimpleObject sonSimpleObject = (SonSimpleObject)
            new TestBuilder().fabricPrepareObject(new SonSimpleObject());

    @Test
    void should_getSimpleName() {
        when(sonSimpleObjectMock.getSimpleName()).thenReturn(sonSimpleObject.getSimpleName());
        assertEquals(sonSimpleObjectMock.getSimpleName(), sonSimpleObject.getSimpleName());
        verify(sonSimpleObjectMock, times(1)).getSimpleName();
        verifyNoMoreInteractions(sonSimpleObjectMock);
    }

    @Test
    void should_open() {
        doCallRealMethod().when(sonSimpleObjectMock).open();
        sonSimpleObjectMock.open();
        verify(sonSimpleObjectMock, times(1)).open();
    }

}
