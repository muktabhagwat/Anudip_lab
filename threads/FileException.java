
  package threads;
 
	/*Q.4 Write a Java program that attempts to open a file (e.g., "sample.txt")
	and handle the FileNotFoundException that may occur if the file does not
	exist.*/
  import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;
 
  public class FileException { public static void main(String[] args) {
  
  String fName = "sample.txt";
 
  try { File fp = new File(fName); Scanner sc = new Scanner(fp);
  
  while (sc.hasNextLine()) { System.out.println(sc.nextLine()); }
  
  } catch (FileNotFoundException e) {
  
 System.out.println("File not found: " + fName); e.printStackTrace(); } } }
 