package org.nikitinia.patterns.structure.flyweight.action;

import org.nikitinia.patterns.structure.flyweight.actor.Note;
import org.nikitinia.patterns.structure.flyweight.actor.Order;

import java.util.HashMap;
import java.util.Map;

import static org.nikitinia.patterns.structure.flyweight.util.Constant.MainValue.NOTE_VALUE;
import static org.nikitinia.patterns.structure.flyweight.util.Constant.MainValue.ORDER_VALUE;

public class ArchiveDocumentFactory {

    private static final Map<String, Archive> archives = new HashMap<>();

    public Archive getArchive(String archiveName) {

        Archive archive = archives.get(archiveName);

        if (archive == null) {
            switch (archiveName) {
                case ORDER_VALUE -> archive = new Order();
                case NOTE_VALUE -> archive = new Note();
            }
            archives.put(archiveName, archive);
        }

        return archive;

    }
}