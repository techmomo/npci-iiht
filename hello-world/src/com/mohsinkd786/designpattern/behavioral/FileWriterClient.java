package com.mohsinkd786.designpattern.behavioral;

public class FileWriterClient {
    public static void main(String[] args) {

        // enable care taker
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        // setup originator with file
        FileWriterOriginator originator = new FileWriterOriginator("test.txt");

        // write to file
        originator.write("Hello how are you");

        System.out.println(originator.toString());

        // save the state of file
        caretaker.save(originator);

        // now write again
        originator.write(" Next line rewrote");

        System.out.println(originator.toString());

        // roll back to previous state

        caretaker.undo(originator);

        // verify the rolled back state
        System.out.println(originator.toString());

    }
}
