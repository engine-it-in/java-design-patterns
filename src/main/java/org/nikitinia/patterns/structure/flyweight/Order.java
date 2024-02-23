package org.nikitinia.patterns.structure.flyweight;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.nikitinia.domain.model.documents.Document;

import java.util.HashMap;
import java.util.Map;

@Slf4j
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
