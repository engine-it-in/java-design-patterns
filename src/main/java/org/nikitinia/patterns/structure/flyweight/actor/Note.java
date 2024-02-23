package org.nikitinia.patterns.structure.flyweight.actor;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.flyweight.action.Archive;

import java.util.HashMap;

@Slf4j
public class Note implements Archive {

    private final String receiver;

    private final HashMap<Long, Document> archiveBox;

    public Note() {
        this.receiver = RandomString.make();
        this.archiveBox = new HashMap<>();
    }

    @Override
    public void archive(Document document) {
        archiveBox.put(document.getNumber().longValue(), document);
        log.info("Note number {} put in Archive, receiver is {}", document.getNumber(), receiver);
    }
}
