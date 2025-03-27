package com.brigelabz.testingbasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
    // method to write to a file 
    public static void writeToFile(String filename,String content) throws IOException{
        try(FileWriter fr = new FileWriter(filename)) {
            fr.write(content);
        }
    }
    
    // method to Read from a file 
    public static String readFromFile(String filename) throws IOException{
        StringBuilder sb = new StringBuilder();
        // try-resuources 
        try(FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)){
                String line;
                while((line=br.readLine())!=null){
                    sb.append(line).append("\n");
                }
        }

        return sb.toString().trim();
    }

}
