import java.io.FileWriter; 
import java.io.IOException;
public class filehandling {
public static void main(String[] args) {
try {
FileWriter mywriter = new FileWriter("./file.txt");

mywriter.write("Files in Java might be tricky, but it is fun enough!");
mywriter.close();
System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
System.out.println("An error occurred.");
}
}
}