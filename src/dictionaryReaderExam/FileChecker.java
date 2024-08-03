package dictionaryReaderExam;

import java.io.File;
public class FileChecker {
	 public static void main(String[] args) {
	        // Example usage
	        String path = "example.txt"; // Replace with your file path
	        doesFileExist(path);
	    }

	    /**
	     * Checks if a file exists at the given path.
	     * @param path the relative path of the file
	     */
	    public static void doesFileExist(String path) {
	        File file = new File(path);

	        try {
	            if (file.exists()) {
	                System.out.println("The file exists at path: " + path);
	            } else {
	            	System.out.println("The file does not exist at path: " + path);
	            }
	        } catch (SecurityException e) {
	            System.out.println("Security exception occurred while checking file existence: " + e.getMessage());
	        }
	    }
}
