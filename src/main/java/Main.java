import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("welcome to currency converter ");
        System.out.println("please enter a choose an option 1/2 ");
        System.out.println("1. dollars to shekels");
        System.out.println("2. shekels to dollars");
        System.out.println("3. shekels to euros");
        Scanner s1 = new Scanner("1");
        System.out.println("please enter amount to convert");
        Scanner s2 = new Scanner("10");
        System.out.println("total 2.80 shekels");
        System.out.println("start over y/n");
        Scanner s3 = new Scanner("n");
        System.out.println("thanks for using our currency converter");
        String filePath = "calculator.text";
        Files.writeString(Paths.get(filePath),"10*0.28=2.80 shekels");
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(content);


    }
}

