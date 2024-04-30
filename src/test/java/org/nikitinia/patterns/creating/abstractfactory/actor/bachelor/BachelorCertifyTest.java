package org.nikitinia.patterns.creating.abstractfactory.actor.bachelor;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.model.documents.Diploma;
import org.nikitinia.patterns.creating.abstractfactory.action.Certify;

import static org.assertj.core.api.Assertions.assertThat;

class BachelorCertifyTest {

    private final BachelorCertify bachelorCertify =
            new BachelorCertify();

    @Test
    void checkBachelorCertify() {
        assertThat(bachelorCertify)
                .isInstanceOf(Certify.class)
                .isInstanceOfSatisfying(BachelorCertify.class, bachelorCertifyData -> {

                    assertThat(bachelorCertifyData.getDocument())
                            .isInstanceOfSatisfying(Diploma.class, diploma -> {

                                assertThat(diploma.number())
                                        .isEqualTo(bachelorCertifyData.getDocument().number());

                                assertThat(diploma.averageRate())
                                        .isEqualTo(bachelorCertifyData.getDocument().averageRate());

                                assertThat(diploma.subjects())
                                        .isEqualTo(bachelorCertifyData.getDocument().subjects());

                            });

                });
    }

}