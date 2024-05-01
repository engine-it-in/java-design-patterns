package org.nikitinia.patterns.creating.prototype.actor;

import lombok.*;
import org.nikitinia.patterns.creating.prototype.action.Copy;

@Getter
@Setter
@ToString
public class PatternDocument implements Copy {

    private String name;

    public PatternDocument(String name) {
        this.name = name;
    }


    @Override
    public PatternDocument copy() {
        return new PatternDocument(name);
    }

}
