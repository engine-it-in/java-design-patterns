package org.nikitinia.patterns.behavior.iterator.logic;

import lombok.Getter;
import lombok.Setter;
import org.nikitinia.patterns.behavior.iterator.action.Collection;
import org.nikitinia.patterns.behavior.iterator.action.Iterator;


@Getter
@Setter
public class DocumentRepository implements Collection {

    private String DocumentName;

    private double[] averageDocumentTime;

    private ClassIterator classIterator ;

    public DocumentRepository(String documentName, double[] averageDocumentTime) {
        this.DocumentName = documentName;
        this.averageDocumentTime = averageDocumentTime;
        this.classIterator = new ClassIterator();
    }

    @Override
    public Iterator getIterator() {
        return classIterator;
    }

    public class ClassIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < averageDocumentTime.length;
        }

        @Override
        public double next() {
            return averageDocumentTime[index++];
        }

    }

}