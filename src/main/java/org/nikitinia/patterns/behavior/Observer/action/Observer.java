package org.nikitinia.patterns.behavior.Observer.action;

import java.util.List;

public interface Observer {

    void eventListener(List<String> documents, String action);

}
