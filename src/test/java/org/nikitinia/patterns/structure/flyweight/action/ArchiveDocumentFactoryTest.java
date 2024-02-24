package org.nikitinia.patterns.structure.flyweight.action;

import org.junit.jupiter.api.Test;
import org.nikitinia.patterns.structure.flyweight.actor.Note;
import org.nikitinia.patterns.structure.flyweight.actor.Order;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nikitinia.patterns.structure.flyweight.util.Constant.MainValue.NOTE_VALUE;
import static org.nikitinia.patterns.structure.flyweight.util.Constant.MainValue.ORDER_VALUE;

class ArchiveDocumentFactoryTest {

    private final ArchiveDocumentFactory archiveDocumentFactory = new ArchiveDocumentFactory();

    @Test
    void checkArchiveDocumentFactory() {
        assertThat(archiveDocumentFactory)
                .hasNoNullFieldsOrProperties();
    }

    @Test
    void getArchive_shouldReturnResult() {

        assertThat(archiveDocumentFactory.getArchive(ORDER_VALUE))
                .isInstanceOf(Order.class);

        assertThat(archiveDocumentFactory.getArchive(NOTE_VALUE))
                .isInstanceOf(Note.class);

        assertThat(archiveDocumentFactory.getArchive(ORDER_VALUE))
                .isInstanceOf(Order.class);

        assertThat(archiveDocumentFactory.getArchives())
                .isInstanceOf(HashMap.class)
                .hasSize(2);

    }

}