package factorymethod.object.simpleobject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.behavior.factorymethod.object.simpleobject.SimpleObject;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SimpleObjectTest {

    @Mock
    private SimpleObject simpleObjectMock;

    @Test
    void should_open() {
        doCallRealMethod().when(simpleObjectMock).open();
        simpleObjectMock.open();
        verify(simpleObjectMock, times(1)).open();
    }



}
