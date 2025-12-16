import java.awt.Color;

/**
 * Demonstrates morphing of an image into its grayscale version.
 * The program receives two command-line arguments:
 * 1) the name of a PPM image file
 * 2) the number of morphing steps
 *
 * Example:
 * java Editor4 thor.ppm 50
 */
public class Editor4 {

    public static void main(String[] args) {

        String fileName = args[0];
        int n = Integer.parseInt(args[1]);

        // Read the source image
        Color[][] sourceImage = Runigram.read(fileName);

        // Create grayscale target image
        Color[][] grayImage = Runigram.grayScaled(sourceImage);

        // Set canvas according to source image
        Runigram.setCanvas(sourceImage);

        // Morph from source to grayscale
        Runigram.morph(sourceImage, grayImage, n);
    }
}
