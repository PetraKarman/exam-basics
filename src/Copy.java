// This should be the basic replica of the 'cp' command
// If ran from the command line without arguments
// It should print out the usage:
// copy [source] [destination]
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination
//

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  public static void main(String[] args) {

    if (args.length == 0) {
      printUsage();
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else if (args.length == 2) {
      File source = new File(args[0]);
      if (source.exists()) {
        try {
          Path filePath = Paths.get(args[0]);
          List<String> lines = Files.readAllLines(filePath);
          List<String> copy = new ArrayList<>();
          for (int i = 0; i < lines.size(); i++) {
            copy.add(lines.get(i));
          }
          Path destinationPath = Paths.get(args[1]);
          Files.write(destinationPath, copy);
        } catch (Exception e) {
          System.out.println("Cannot write");
        }
      } else {
        System.out.println("source doesn't exit");
      }
    }
  }

  private static void printUsage() {
    List<String> usageText = loadFile("usage.txt");
    for (int i = 0; i < usageText.size(); i++) {
      System.out.println(usageText.get(i));
    }
  }

  private static List<String> loadFile(String fileName) {
    Path usage = Paths.get(fileName);
    try {
      List<String> loadedText = Files.readAllLines(usage);
      return loadedText;
    } catch (IOException e) {
      System.out.println("Something is wrong with " + fileName + " file");
    }
    return null;
  }
}


