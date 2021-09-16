package com.mohsinkd786.designpattern.behavioral;

public interface Observer {

    // update the observer
    void update();

    // attaching the subject
    void setSubject(Subject subject);

}
