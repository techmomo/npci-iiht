package com.mohsinkd786.designpattern.behavioral;

public class CloseFileCommand implements Command {

    private FsReceiver fsReceiver;

    public CloseFileCommand(FsReceiver receiver){
        this.fsReceiver = receiver;
    }

    @Override
    public void execute() {
        this.fsReceiver.close();
    }
}
