package org.nikitinia.patterns.structure.decorator.action;

import org.nikitinia.patterns.structure.decorator.actor.SecurityDocument;

public interface Sender {

    String send(SecurityDocument document);

}
