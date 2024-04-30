package org.nikitinia.patterns.creating.abstractfactory.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.domain.model.documents.Diploma;
import org.nikitinia.patterns.creating.abstractfactory.actor.masterdegree.MasterCertify;

import static org.assertj.core.api.Assertions.assertThat;

class CertifyTest {

    private final Certify certify =
            new MasterCertify();

    @Test
    void checkCertify() {
        assertThat(certify)
                .isInstanceOfSatisfying(Certify.class, certifyData -> {
                    assertThat(certifyData.getDocument())
                            .isInstanceOf(Diploma.class);
                });
    }

}