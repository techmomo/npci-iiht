package com.mohsinkd786.designpattern.behavioral;

public class FileWriterCaretaker {
    private Object object;

    public void save(FileWriterOriginator fileWriterOriginator){
        this.object = fileWriterOriginator.save();
    }

    public void undo(FileWriterOriginator fileWriterOriginator){
        fileWriterOriginator.undoLastSave(object);
    }
}
