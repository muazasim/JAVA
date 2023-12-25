import java.io.*; // Import the File class
import java.util.List;
import java.util.Scanner;
// import java.io.IOException;  // Import the IOException class to handle errors
import java.util.stream.Stream;

class ManipulateFile {

    public File myObj = new File("MalikSab.txt");
    public Scanner c = new Scanner(System.in);
    public void fileName() {

        try {

            if (myObj.createNewFile()) {
                System.out.println("File Name : " + myObj.getName());
            }
            else {
                System.out.println("File Name : " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void ReadFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(myObj);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader );

        List<String> lines = bufferedReader.lines().toList();
        for (String line : lines) {

            System.out.println(line);

        }

    }
    public void writetInFile() throws IOException {
        FileWriter file = new FileWriter(myObj ,true);
        BufferedWriter write = new BufferedWriter(file);

        System.out.println("Enter Text to Write in File");
        String text = c.nextLine();
        write.append("\n"+text);
        write.close();
    }
}

public class FileHandling {
    public static void main(String Args[]) {

        ManipulateFile file = new ManipulateFile();
   
        try {
            file.writetInFile();
            file.ReadFile();
        } catch (IOException e) {

            System.out.println(e);

        }
    }

}
