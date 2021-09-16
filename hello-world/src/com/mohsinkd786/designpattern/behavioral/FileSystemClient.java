package com.mohsinkd786.designpattern.behavioral;

public class FileSystemClient {
    public static void main(String[] args) {

        // create the receiver
        FsReceiver receiver = FsReceiverUtil.getFS();

        // open the file
        Command openFileCommand = new OpenFileCommand(receiver);
        FileInvoker invoker = new FileInvoker(openFileCommand);
        invoker.execute();

        // close the file
        Command closeFileCommand = new CloseFileCommand(receiver);
        invoker = new FileInvoker(closeFileCommand);
        invoker.execute();

    }
}
