package com.bridgelab.inputOutputStreams;

import java.io.*;

public class BufferedFileCopy {

    public static void main(String[] args) {
        String sourceFile = "large_source.bin"; // Replace with your source file path
        String bufferedDestination = "buffered_destination.bin";
        String unbufferedDestination = "unbuffered_destination.bin";

        // Generate a 100MB dummy file for testing.
        generateLargeFile(sourceFile, 100 * 1024 * 1024); // 100MB

        // Buffered Copy
        long bufferedStartTime = System.nanoTime();
        copyFileBuffered(sourceFile, bufferedDestination);
        long bufferedEndTime = System.nanoTime();
        long bufferedTime = bufferedEndTime - bufferedStartTime;

        // Unbuffered Copy
        long unbufferedStartTime = System.nanoTime();
        copyFileUnbuffered(sourceFile, unbufferedDestination);
        long unbufferedEndTime = System.nanoTime();
        long unbufferedTime = unbufferedEndTime - unbufferedStartTime;

        System.out.println("Buffered Copy Time: " + bufferedTime / 1_000_000 + " ms");
        System.out.println("Unbuffered Copy Time: " + unbufferedTime / 1_000_000 + " ms");
        System.out.println("Buffered is " + (double)unbufferedTime / bufferedTime + " times faster");

        // Clean up dummy files 
        new File(sourceFile).delete();
        new File(bufferedDestination).delete();
        new File(unbufferedDestination).delete();

    }

    public static void copyFileBuffered(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileUnbuffered(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generateLargeFile(String filename, long size) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            byte[] buffer = new byte[4096];
            long bytesWritten = 0;
            // int count =0;
            while (bytesWritten < size) {
                fos.write(buffer, 0, (int) Math.min(buffer.length, size - bytesWritten));
                // System.out.println(count++);
                bytesWritten += buffer.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}