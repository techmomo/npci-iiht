package com.mohsinkd786.designpattern.behavioral;

public class WriteFileCommand implements Command {

    private FsReceiver fsReceiver;

    public WriteFileCommand(FsReceiver receiver){
        this.fsReceiver = receiver;
    }

    @Override
    public void execute() {
        this.fsReceiver.write();
    }
}
