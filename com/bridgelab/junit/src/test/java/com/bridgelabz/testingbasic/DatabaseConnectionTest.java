package com.brigelabz.testingbasic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    // connection established before each test case 
    @BeforeEach
    void setup() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }
    
    // remove connection after each test case 
    @AfterEach
    void removeConnection(){
        dbConnection.disconnect();
    }


    @Test
    void connect() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void disconnect() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }


}