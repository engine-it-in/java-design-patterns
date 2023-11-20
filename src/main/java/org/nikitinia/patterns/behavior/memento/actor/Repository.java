package org.nikitinia.patterns.behavior.memento.actor;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.patterns.behavior.memento.actor.Memento;

@Getter
@Setter
public class Repository {

    private Memento memento;

}
