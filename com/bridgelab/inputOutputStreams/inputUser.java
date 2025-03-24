package com.bridgelab.inputOutputStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class inputUser {
    public static void main(String[] args) {
        
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            FileWriter fw = new FileWriter("userdata.txt");

            System.out.println("Enter name");
            String name = br.readLine();
            System.out.println("Enter age");
            String age = br.readLine();
            System.out.println("Enter favorite language");
            String language = br.readLine();

            fw.write("name:"+ name+ "\n");
            fw.write("age:"+ age + "\n");
            fw.write("language:"+ language + "\n");
            fw.flush();

            fw.close();

           
            
        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
