package com.TKA_28Aug;



import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedRea {

	public BufferedReader(FileReader fileReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String targetFileName = "target.txt";

        try {
            
        	 BufferedReader reader = new BufferedReader();


            
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName));

            String line;
            while ((line = ((Object) reader).readLine()) != null) {
                
                writer.write(line);
                writer.newLine(); 
            }

            
            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

	public String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
