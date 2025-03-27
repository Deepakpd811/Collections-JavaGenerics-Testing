package com.brigelabz.testingbasic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelab.junit.src.main.java.com.bridgelabz.testingbasic.FileProcessor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    private String filename = "myfile.txt";
    private FileProcessor file;

    // Initializes the FileProcessor instance before each test
    @BeforeEach
    void setup(){
        file = new FileProcessor();
    }

    // Tests writing to a file and reading from it
    @Test
    void writeToFileAndreadFile() throws IOException {
        String content = "Hello, JUnit!";
        file.writeToFile(filename, content);

        String result = file.readFromFile(filename);
        assertEquals(content, result, "File content should match the written content");
    }

    // Checks if the file exists after writing content
    @Test
    void testFileExistAfterWrite() throws IOException{
        file.writeToFile(filename,"hello test");
        assertTrue(Files.exists(Paths.get(filename)));
    }

     // Ensures an exception is thrown when trying to read a non-existent file
    @Test
    void testFileNotExist() throws IOException{
        Exception exception = assertThrows(FileNotFoundException.class, () -> file.readFromFile("nonExistentFile.txt"));
        assertTrue(exception.getMessage().contains("nonExistentFile.txt"), "FileNotFoundException should be thrown for missing file");
    }


}