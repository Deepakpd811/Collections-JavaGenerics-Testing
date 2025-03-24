package com.bridgelab.inputOutputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadandWrite {
    public static void main(String[] args) {

        String pathname = "readeAndWrite.txt";

        try {

            // read file
            FileInputStream fis = new FileInputStream(pathname);

            // wirte file
            FileOutputStream fos = new FileOutputStream("copied" + pathname);
            int bytedata = 0;

            while ((bytedata = fis.read()) != -1) {
                fos.write(bytedata);
            }

            System.out.println("file successfully copied");

            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found " + pathname);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
