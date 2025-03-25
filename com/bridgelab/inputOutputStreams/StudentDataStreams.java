package com.bridgelab.inputOutputStreams;

import java.io.*;

public class StudentDataStreams {

    public static void main(String[] args) {
        String filename = "student_data.bin";

        // Store Student Data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(101);
            dos.writeUTF("rohit");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Deepak");
            dos.writeDouble(3.5);

            dos.writeInt(103);
            dos.writeUTF("ritick");
            dos.writeDouble(4.0);

            System.out.println("Student data stored successfully.");

        } catch (IOException e) {
            System.err.println("Error storing student data: " + e.getMessage());
            e.printStackTrace();
        }

        // Retrieve Student Data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) { // Check if there's more data to read.
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

            System.out.println("Student data retrieved successfully.");

        } catch (EOFException e) {
            //EOFException is expected when the end of the file is reached.
            System.out.println("End of file reached");
        } catch (IOException e) {
            System.err.println("Error retrieving student data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}