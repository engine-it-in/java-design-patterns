package behavior.TemplateMethod.util;

import org.nikitinia.domain.Agreement;
import org.nikitinia.domain.Type;

public class TestBuilder {

    public static Agreement getTestAgreement() {
        return new Agreement(
                TestData.TEST_NUMBER,
                TestData.TEST_SIGNATORY,
                Type.PLEDGE,
                TestData.TEST_BIG_DECIMAL,
                TestData.TEST_DATE,
                TestData.TEST_DATE
        );
    }

}
