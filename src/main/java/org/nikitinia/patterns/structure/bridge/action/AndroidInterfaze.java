package org.nikitinia.patterns.structure.bridge.action;

import lombok.extern.slf4j.Slf4j;
import org.nikitinia.patterns.structure.bridge.action.Interfaze;

@Slf4j
public class AndroidInterfaze implements Interfaze {

    @Override
    public void loadDocument() {
        log.info("Android. Load  document");
    }
    @Override
    public void visualizeDocument() {
        log.info("Android. Visualize document");
    }

    @Override
    public void closeDocument() {
        log.info("Android. Close document");
    }
}
