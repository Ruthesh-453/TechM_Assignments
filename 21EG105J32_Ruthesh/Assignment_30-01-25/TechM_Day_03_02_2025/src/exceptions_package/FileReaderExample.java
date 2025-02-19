package exceptions_package;

import java.io.*;

public class FileReaderExample {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Error: File '" + fileName + "' not found.");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\eslav\\OneDrive\\Documents\\aasarawifi.txt"; 
        
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

