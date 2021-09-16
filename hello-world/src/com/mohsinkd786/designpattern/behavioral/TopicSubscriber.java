package com.mohsinkd786.designpattern.behavioral;

public class TopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public TopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg !=null){
            System.out.println("Message Consumed "+msg);
        }else {
            System.out.println(name+" No new messages processed");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
