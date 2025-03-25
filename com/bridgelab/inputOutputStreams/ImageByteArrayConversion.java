package com.bridgelab.inputOutputStreams;

import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class ImageByteArrayConversion {

    public static void main(String[] args) {
        String inputImagePath = "input.jpg"; // Replace with your input image path
        String outputImagePath = "output.jpg";

        try {
            // Read the image into a BufferedImage
            BufferedImage originalImage = ImageIO.read(new File(inputImagePath));

            // Convert BufferedImage to byte array using ByteArrayOutputStream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "jpg", byteArrayOutputStream);
            byte[] imageByteArray = byteArrayOutputStream.toByteArray();

            // Convert byte array back to BufferedImage using ByteArrayInputStream
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageByteArray);
            BufferedImage reconstructedImage = ImageIO.read(byteArrayInputStream);

            // Write the reconstructed BufferedImage to a new file
            ImageIO.write(reconstructedImage, "jpg", new File(outputImagePath));

            System.out.println("Image converted to byte array and back successfully.");

            //Verification
            byte[] originalByteArray = imageToByteArray(inputImagePath);
            byte[] reconstructedByteArray = imageToByteArray(outputImagePath);

            if (Arrays.equals(originalByteArray, reconstructedByteArray)) {
                System.out.println("Images are identical.");
            } else {
                System.out.println("Images are not identical.");
            }

        } catch (IOException e) {
            System.err.println("Error processing image: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static byte[] imageToByteArray(String imagePath) throws IOException {
        BufferedImage image = ImageIO.read(new File(imagePath));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}