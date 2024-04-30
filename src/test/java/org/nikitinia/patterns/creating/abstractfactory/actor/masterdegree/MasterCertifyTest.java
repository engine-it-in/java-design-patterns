package org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.model.documents.Diploma;
import org.nikitinia.patterns.creating.abstractfactory.action.Certify;

import static org.assertj.core.api.Assertions.assertThat;

class MasterCertifyTest {

    private final MasterCertify masterCertify =
            new MasterCertify();

    @Test
    void checkMasterCertify() {
        assertThat(masterCertify)
                .isInstanceOf(Certify.class);
    }

    @Test
    void checkGetDiploma() {
        assertThat(masterCertify.getDocument())
                .isInstanceOfSatisfying(Diploma.class, diploma -> {

                    assertThat(diploma.number())
                            .isEqualTo(masterCertify.getDocument().number());

                    assertThat(diploma.averageRate())
                            .isEqualTo(masterCertify.getDocument().averageRate());

                    assertThat(diploma.subjects())
                            .isEqualTo(masterCertify.getDocument().subjects());

                });
    }

}