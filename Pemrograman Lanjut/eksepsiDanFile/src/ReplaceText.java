import java.io.*;
import java.util.*;

public class ReplaceText {
  public static void main(String[] args) throws Exception {

    // Check if source file exists
    File sourceFile = new File("scores.txt");
    if (!sourceFile.exists()) {
      System.out.println("Source file scores.txt does not exist");
      System.exit(0);
    }

    // Check if target file exists
    File targetFile = new File("scoresRPL.txt");

    try (
      // Create input and output files
      Scanner input = new Scanner(sourceFile);
      PrintWriter output = new PrintWriter(targetFile)
    ) {        
      while (input.hasNext()) {
        String s1 = input.nextLine();
        String s2 = s1.replaceAll("John", "jon");
        output.println(s2);
      }
    }
  }
}
