package com.mohsinkd786.designpattern.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private List<Observer> observers;
    private String message;

    public Topic(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        if(observer !=null){
            if(!observers.contains(observer)){
                observers.add(observer);
            }
        }
    }

    @Override
    public void unregister(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob:observers) {
            ob.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void sendMessage(String message){
        this.message = message;
        notifyObservers();
    }
}
