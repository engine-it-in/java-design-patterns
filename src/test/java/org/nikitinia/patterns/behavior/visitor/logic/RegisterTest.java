package org.nikitinia.patterns.behavior.visitor.logic;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.behavior.visitor.util.TestBuilder.*;

class RegisterTest {

    private final Register register
            = new Register();

    @Test
    void checkRegister() {
        assertThat(register)
                .hasFieldOrPropertyWithValue("registerMap", new HashMap<>())
                .isInstanceOf(Visitor.class);
    }

    @Test
    void visitFinanceDocument_shouldDo() {
        register.visit(testFinanceDocument);
        assertThat(register.getRegisterMap())
                .hasSize(1)
                .containsEntry(testFinanceDocument.getId(), testFinanceDocument.getDocument());
    }

    @Test
    void visitManagementDocument_shouldDo() {
        register.visit(testManagementDocument);
        assertThat(register.getRegisterMap())
                .hasSize(1)
                .containsEntry(testManagementDocument.getId(), testManagementDocument.getDocument());
    }

    @Test
    void visitPayDocument_shouldDo() {
        register.visit(testPayDocument);
        assertThat(register.getRegisterMap())
                .hasSize(1)
                .containsEntry(testPayDocument.getId(), testPayDocument.getDocument());
    }

}