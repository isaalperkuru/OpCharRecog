package com.OpCharRecog;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class CharacterReader {
	public static double[] pixelarray;
	public static void readImage() throws IOException {

		BufferedImage image = ImageIO.read(new File("C:\\Users\\alper\\Desktop\\OCRData\\5.jpg"));
		byte[][] pixels = new byte[image.getWidth()][];
		
		for (int x = 0; x < image.getWidth(); x++) {
			pixels[x] = new byte[image.getHeight()];

			
			
			for (int y = 0; y < image.getHeight(); y++) {
				pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
				
			}
			
			
		}System.out.print("},");
		byte[] pix = matrixToArray(pixels);
		pixelarray = byteTodouble(pix);
		
			
	}
	public static double[] byteTodouble(byte[] input) {
	    double[] ret = new double[input.length];
	    for (int x = 0; x < input.length; x++) {
	        ret[x] = input[x];
	    }
	    return ret;
	}
	public static byte[] matrixToArray(byte[][] matrix){
		byte newArray[] = new byte[matrix.length*matrix[0].length];
	    for(int i = 0; i < matrix.length; i++) {
	        byte[] row = matrix[i];
	        for(int j = 0; j < row.length; j++) {
	            byte number = matrix[i][j];
	            newArray[i*row.length+j] = number;
	        }
	    }      

    
		return newArray;
		
	}
}