package org.nikitinia.patterns.structure.facade;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Sender {

    private final List<MobileDocument> mobileDocumentPackage;

    public Sender() {
        this.mobileDocumentPackage = new ArrayList<>();
    }

    public void addDocumentToSenderPackage(MobileDocument mobileDocument) {
        mobileDocumentPackage.add(mobileDocument);
    }

    public boolean removeDocumentFromSenderPackage(MobileDocument mobileDocument) {
        return mobileDocumentPackage.remove(mobileDocument);
    }
}
