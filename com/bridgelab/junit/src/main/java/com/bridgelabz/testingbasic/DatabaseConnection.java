package com.brigelabz.testingbasic;

public class DatabaseConnection {
    private boolean isConnected = false;

    // connect to database
    public void connect(){
        isConnected = true;
        System.out.println("Database is connected");
    }

    // disconnect to database
    public void disconnect(){
        isConnected = false;
        System.out.println("Database is disconnected");
    }

    // check connection
    public boolean isConnected(){
        return  isConnected;
    }

}
