package org.nikitinia.patterns.creating.prototype.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.nikitinia.patterns.creating.prototype.action.Copy;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatternDocument implements Copy {

    private String name;

    @Override
    public PatternDocument copy() {
        return new PatternDocument(name);
    }
}
