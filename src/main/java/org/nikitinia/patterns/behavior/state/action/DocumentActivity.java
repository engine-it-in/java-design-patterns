package org.nikitinia.patterns.behavior.state.action;

import org.nikitinia.domain.model.documents.Document;

import java.util.TreeSet;

public interface DocumentActivity {
    void doAction();

    void printHistory();
}
