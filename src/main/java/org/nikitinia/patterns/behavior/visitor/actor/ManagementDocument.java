package org.nikitinia.patterns.behavior.visitor.actor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.visitor.visitor.Acceptor;
import org.nikitinia.patterns.behavior.visitor.visitor.Visitor;

@AllArgsConstructor
@Getter
public class ManagementDocument implements Acceptor {

    private String id;
    private Document document;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
