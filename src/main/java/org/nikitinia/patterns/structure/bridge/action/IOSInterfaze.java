package org.nikitinia.patterns.structure.bridge.action;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

@Slf4j
public class IOSInterfaze implements Interfaze {

    @Override
    public void loadDocument() {
        log.info("IOS. Load  document");
    }
    @Override
    public void visualizeDocument() {
        log.info("IOS. Visualize document");
    }

    @Override
    public void closeDocument() {
        log.info("IOS. Close document");
    }
}
