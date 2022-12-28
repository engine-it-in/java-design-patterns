package factorymethod.logic.create;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.patterns.gof.creational.factorymethod.logic.create.FamilyDaughter;
import org.patterns.gof.creational.factorymethod.object.childsimpleobject.DaughterSimpleObject;
import util.TestBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FamilyDaughterTest {

    @Mock
    private FamilyDaughter familyDaughterMock;

    FamilyDaughter familyDaughter = (FamilyDaughter)
            new TestBuilder().fabricPrepareFamily(new FamilyDaughter());

    @Test
    void should_create() {
        doReturn(new DaughterSimpleObject()).when(familyDaughterMock).createObject();

        assertThat(familyDaughterMock.createObject())
                .usingRecursiveComparison()
                .isEqualTo(familyDaughter.createObject());

        verify(familyDaughterMock, times(1)).createObject();
        verifyNoMoreInteractions(familyDaughterMock);

    }

}
