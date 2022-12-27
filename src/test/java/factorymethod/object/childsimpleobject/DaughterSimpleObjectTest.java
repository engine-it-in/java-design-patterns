package factorymethod.object.childsimpleobject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.DaughterSimpleObject;

import util.TestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DaughterSimpleObjectTest {
    @Mock
    private DaughterSimpleObject daughterSimpleObjectMock;

    private final DaughterSimpleObject daughterSimpleObject = (DaughterSimpleObject)
            new TestBuilder().fabricPrepareObject(new DaughterSimpleObject());

    @Test
    void should_getSimpleName() {
        when(daughterSimpleObjectMock.getSimpleName()).thenReturn(daughterSimpleObject.getSimpleName());
        assertEquals(daughterSimpleObjectMock.getSimpleName(), daughterSimpleObject.getSimpleName());
        verify(daughterSimpleObjectMock, times(1)).getSimpleName();
        verifyNoMoreInteractions(daughterSimpleObjectMock);
    }

    @Test
    void should_open() {
        doCallRealMethod().when(daughterSimpleObjectMock).open();
        daughterSimpleObjectMock.open();
        verify(daughterSimpleObjectMock, times(1)).open();
    }

}
