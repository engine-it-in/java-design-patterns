package org.nikitinia.patterns.structure.bridge.actor;

import lombok.AllArgsConstructor;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

@AllArgsConstructor
public abstract class Document {

     Interfaze interfaze;

    public abstract void createDocument();

}
