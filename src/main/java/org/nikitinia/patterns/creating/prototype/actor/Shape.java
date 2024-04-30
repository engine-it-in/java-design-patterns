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
public class Shape implements Copy {

    private String name;
    private String color;


    @Override
    public Shape copy() {
        return new Shape(name, color);
    }
}
