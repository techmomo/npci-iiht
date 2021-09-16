package com.mohsinkd786.designpattern.behavioral;

public class OpenFileCommand implements Command {

    private FsReceiver receiver;

    public OpenFileCommand(FsReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.open();
    }
}
