package org.nikitinia.patterns.structure.flyweight;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.domain.model.documents.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.nikitinia.patterns.structure.flyweight.Constant.MainValue.NOTE_VALUE;
import static org.nikitinia.patterns.structure.flyweight.Constant.MainValue.ORDER_VALUE;

public class Program {

    public static void main(String[] args) {

        ArchiveDocumentFactory archiveDocumentFactory = new ArchiveDocumentFactory();

        List<Archive> archives = new ArrayList<>();

        archives.add(archiveDocumentFactory.getArchive(ORDER_VALUE));
        archives.add(archiveDocumentFactory.getArchive(NOTE_VALUE));
        archives.add(archiveDocumentFactory.getArchive(NOTE_VALUE));
        archives.add(archiveDocumentFactory.getArchive(ORDER_VALUE));
        archives.add(archiveDocumentFactory.getArchive(ORDER_VALUE));

        for (Archive archive : archives) {
            Document document = DocumentCreator.documentBuildWithNumber(new Random().nextDouble());
            archive.archive(document);
        }
    }

}
