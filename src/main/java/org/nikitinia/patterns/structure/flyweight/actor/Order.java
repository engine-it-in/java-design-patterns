package org.nikitinia.patterns.structure.flyweight.actor;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.structure.flyweight.action.Archive;

import java.util.HashMap;

/**
 * Что -> Документ "приказ";
 * Для чего -> Агрегирует документ и дополняет его внешними атрибутами;
 * Реализация -> Класс, имплементирующий логику архивации документа;
 * Ценность -> Класс с типизацией интерфейса, который может быть использован для работы с документом;
 */
@Slf4j
@Getter
public class Order implements Archive {

    private final String company;

    private final HashMap<Long, Document> archiveBox;

    public Order() {
        this.company = RandomString.make();
        this.archiveBox = new HashMap<>();
    }

    @Override
    public void archive(Document document) {
        archiveBox.put(document.getNumber().longValue(), document);
        log.info("Order number {} put in Archive, for company {}", document.getNumber(), company);
    }
}
