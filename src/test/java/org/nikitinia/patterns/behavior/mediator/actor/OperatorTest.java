package org.nikitinia.patterns.behavior.mediator.actor;

import org.nikitinia.patterns.behavior.mediator.logic.AudioDocumentSystem;

import static org.nikitinia.patterns.behavior.mediator.util.Constant.TEST_NAME;

class OperatorTest {

    private final AudioDocumentSystem audioDocumentSystem = new AudioDocumentSystem();

    private final Operator operator = new Operator(audioDocumentSystem, TEST_NAME);



}