package org.nikitinia.patterns.behavior.chainofresponsobility.logic;

import org.nikitinia.domain.creator.DocumentCreator;
import org.nikitinia.patterns.behavior.chainofresponsobility.dictionary.Priority;
import org.nikitinia.domain.model.documents.Document;
import org.nikitinia.patterns.behavior.chainofresponsobility.actor.Activity;
import org.nikitinia.patterns.behavior.chainofresponsobility.actor.EmailActivity;
import org.nikitinia.patterns.behavior.chainofresponsobility.actor.SmsActivity;
import org.nikitinia.patterns.behavior.chainofresponsobility.actor.TelegramActivity;

public class Chain {

    public static void main(String[] args) {
        Document documentSign = DocumentCreator.documentBuildWithNumber(1.0);
        Document documentPresign = DocumentCreator.documentBuildWithNumber(2.0);
        Document documentDraft = DocumentCreator.documentBuildWithNumber(3.0);

        Activity activity = new SmsActivity(Priority.CRITICAL);
        Activity activityNext = new TelegramActivity(Priority.VIP);
        Activity activityNextNext = new EmailActivity(Priority.NORMAL);

        activity.setNext(activityNext);
        activityNext.setNext(activityNextNext);

        activity.publicity(documentSign, activity);
        activity.publicity(documentPresign, activityNext);
        activity.publicity(documentDraft, activityNextNext);



    }

}
