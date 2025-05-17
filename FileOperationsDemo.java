import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileOperationsDemo {
    private static final Path FILE_PATH = Paths.get("demo_file.txt");

    public static void main(String[] args) {
        createAndWriteFile();
        readFile();
        appendToFile();
        readFile();
        deleteFile();
    }

    public static void createAndWriteFile() {
        try (BufferedWriter writer = Files.newBufferedWriter(FILE_PATH)) {
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            System.out.println("[INFO] File created and written successfully.");
        } catch (IOException e) {
            System.err.println("[ERROR] Unable to write to file: " + e.getMessage());
        }
    }

    public static void readFile() {
        try {
            System.out.println("[INFO] Reading file content:");
            List<String> lines = Files.readAllLines(FILE_PATH);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.err.println("[ERROR] File not found: " + FILE_PATH);
        } catch (IOException e) {
            System.err.println("[ERROR] Unable to read file: " + e.getMessage());
        }
    }

    public static void appendToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH.toFile(), true))) {
            writer.write("This is an appended line.\n");
            System.out.println("[INFO] Line appended to file.");
        } catch (IOException e) {
            System.err.println("[ERROR] Unable to append to file: " + e.getMessage());
        }
    }

    public static void deleteFile() {
        try {
            Files.deleteIfExists(FILE_PATH);
            System.out.println("[INFO] File deleted successfully.");
        } catch (IOException e) {
            System.err.println("[ERROR] Unable to delete file: " + e.getMessage());
        }
    }
}
