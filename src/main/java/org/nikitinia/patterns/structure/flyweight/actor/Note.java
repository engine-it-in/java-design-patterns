package org.nikitinia.patterns.structure.flyweight.actor;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.flyweight.action.Archive;

import java.util.HashMap;

/*
 * Что -> Документ "записка";
 * Для чего -> Агрегирует документ и дополняет его внешними атрибутами;
 * Реализация -> Класс, имплементирующий логику архивации документа;
 * В чем выгода -> Класс с типизацией интерфейса, который может быть использован для работы с документом;
 * */
@Slf4j
@Getter
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
