package org.nikitinia.patterns.structure.bridge.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

@Slf4j
public class MobileDocument extends Document {
    public MobileDocument(Interfaze interfaze) {
        super(interfaze);
    }

    @Override
    public void createDocument() {
        log.info("create mobile document");
        interfaze.loadDocument();
        interfaze.visualizeDocument();
        interfaze.closeDocument();
    }
}
