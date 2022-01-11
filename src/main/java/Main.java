import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static double usd;
    private static Random ilsInput;
    private static String ilsOutComeList;
    private static int restart;
    private static URI filePath;
    private static Scanner ILS;
    private static int firstInput;
    private static double ils;

    public static void main(String[] args) throws IOException {
        System.out.println("welcome to currency converter ");
        while (restart == 1) {
            System.out.println("please enter a choose an option 1/2/3 ");
            System.out.println("1. USD to ILs");
            System.out.println("2. ILS to USD");
            System.out.println("3. ILS to EURO");
            try {
                Scanner userInput = new Scanner(System.in);
                firstInput = userInput.nextInt();
                if (firstInput != 1.1 & firstInput != 2.2) {
                    System.out.println("wrong input please try again");
                    Scanner scanner = new Scanner(System.in);
                    scanner = userInput.reset();
                }

                switch (firstInput) { // this option to convert USD to ILS:
                    case 1:
                        Scanner s1 = new Scanner("1");
                        System.out.println("please enter amount to convert");
                        Scanner s2 =new Scanner("10");
                        System.out.println("total 2.80 ILS");
                        Scanner usdInput = new Scanner(System.in);
                        usd = usdInput.nextDouble();
                        double usdOutCome = new USD().calculate(usd);
                        System.out.println(usdOutCome); //this print the result after the convert
                        ArrayList<Double> usdOutComeList = new ArrayList<>();
                        usdOutComeList.add(usdOutCome);
                        System.out.println("start over 1.YES / 2.NO");
                        if (usdInput.nextDouble()==1){
                        }
                        Scanner s3 = new Scanner("N");
                        if (usdInput.nextDouble() == 2) { //this key say that the user does not want to start again
                            System.out.println("thanks for using our currency converter");
                            System.out.println("the results are:" + usdOutComeList);
                            String filePath = "calculator.txt";
                            Files.writeString(Path.of(filePath), "10*0.28=2.80 ILS");
                            String content = new String(Files.readAllBytes(Paths.get(filePath)));
                            System.out.println(content);

                        }
                        break;

                    case 2: // this will convert from ILS to USD:
                        System.out.println("2");
                        System.out.println("please enter amount to convert");
                        System.out.println("10");
                        System.out.println("total 0.28 USD");
                        Scanner ilsInput = new Scanner(System.in);
                        ils = ilsInput.nextDouble();
                        double ilsOutCome = new ILS().calculate(ils);
                        System.out.println(ilsOutCome);
                        ArrayList<Double> ilsOutComeList = new ArrayList<>();
                        ilsOutComeList.add(ilsOutCome);
                        System.out.println("start over 1.YES / 2.NO");

                        if (ilsInput.nextDouble() == 2) { // this key say that the user does not want to start again
                            System.out.println("thanks for using our currency converter");
                            System.out.println("the results are:" + ilsOutComeList);
                            String filePath = "calculator.txt";
                            Files.writeString(Path.of(filePath), "2.80/10=0.28 USD");
                            String content = new String(Files.readAllBytes(Paths.get(filePath)));
                            System.out.println(content);


                            break;
                        }

                    case 3: // this will convert from ILS to EURO:
                        System.out.println("3");
                        System.out.println("please enter amount to convert");
                        System.out.println("10");
                        System.out.println("total 0.42 EURO");
                        ilsInput = new Scanner(System.in);
                        ils = ilsInput.nextDouble();
                        ilsOutCome = new ILS().calculate(ils);
                        System.out.println(ilsOutCome);
                        ilsOutComeList = new ArrayList<>();
                        ilsOutComeList.add(ilsOutCome);
                        System.out.println("start over 1.YES / 2.NO");

                        if (ilsInput.nextDouble() == 2) { // this key say that the user does not want to start again
                            System.out.println("thanks for using our currency converter");
                            System.out.println("the results are:" + ilsOutComeList);
                            String filePath = "calculator.txt";
                            Files.writeString(Path.of(filePath), "4.23*10=42.3 EURO");
                            String content = new String(Files.readAllBytes(Paths.get(filePath)));
                            System.out.println(content);

                        }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}