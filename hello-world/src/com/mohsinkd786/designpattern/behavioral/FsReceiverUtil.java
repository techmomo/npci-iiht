package com.mohsinkd786.designpattern.behavioral;

public class FsReceiverUtil {

    public static FsReceiver getFS(){
        String osName = System.getProperty("os.name");
        if(osName.contains("Window")){
            return new WindowsFsReceiver();
        }else{
            return new UnixFsReceiver();
        }
    }
}
