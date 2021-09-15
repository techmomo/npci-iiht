package com.mohsinkd786.designpattern.structural;

public class ExecutorProxy implements Executor{

    private boolean isLoggedIn;
    private Executor executor;
    private String userName = "admin";
    private String passWord = "123";

    public ExecutorProxy(String user,String pass){
        if(userName.equals(user) && passWord.equals(pass)){
            isLoggedIn = true;
            executor = new ExecutorService();
        }
    }
    @Override
    public void run(String msg) throws Exception {
        if(isLoggedIn){
            executor.run(msg);
        }else {
            throw new Exception("Invalid credentials");
        }
    }
}
