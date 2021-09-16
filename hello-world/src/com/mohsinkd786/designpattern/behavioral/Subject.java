package com.mohsinkd786.designpattern.behavioral;

public interface Subject {

    // registration of observers
    void register(Observer observer);
    void unregister(Observer observer);

    // notify observers for any state changes
    void notifyObservers();

    // get the updates from the subject
    Object getUpdate(Observer observer);
}
