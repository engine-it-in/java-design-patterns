package org.nikitinia.patterns.structure.bridge.actor;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

@Slf4j
public class WebDocument extends Document {
    public WebDocument(Interfaze anInterfaze) {

        super(anInterfaze);
    }

    @Override
    public void createDocument() {
        log.info("create web document");
        interfaze.loadDocument();
        interfaze.visualizeDocument();
        interfaze.closeDocument();
    }
}
