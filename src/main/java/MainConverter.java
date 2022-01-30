import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainConverter {

    public static void main(String[] args) throws IOException {
        double euro = 0;
        double usd;
        double ils;

        int restart = 1;
        double Yes=1.0;
        double No=2.0;
        String filePath= "Converter History";
        boolean choice= true;
        System.out.println("Welcome to userInput converter");
        do {
            int firstInput;
            System.out.println("Please choose an option (1/2/3) \n 1.Coin.USD to Coin.ILS \n 2.Coin.ILS to Coin.USD \n 3.Coin.EURO to Coin.ILS ");
            try {                                           // the hall cod is in try/catch and,an Exception will cause a restart in any point of the program.
                Scanner userInput = new Scanner(System.in);
                firstInput = userInput.nextInt();


                switch (firstInput) {  // 1st option of converter usd to ils
                    case 1:
                        System.out.println("Enter amount of Coin.USD to convert");
                        Scanner usdInput = new Scanner(System.in);
                        usd = usdInput.nextDouble();
                        double usdOutCome = new USD().calculate(usd); //
                        System.out.println(usdOutCome); /// will print the result after convertion
                        ArrayList<Double> usdOutComeList = new ArrayList<>();
                        usdOutComeList.add(usdOutCome);
                        System.out.println("Start over 1=Yes/2=No");
                        if (usdInput.nextDouble() == 2.0) {  // This will print of the user does not want to start over
                            System.out.println("Thanks for using our currency converter\n Your results are: "+usdOutComeList);
                            Files.writeString(Path.of(filePath), "Your results are" + usdOutComeList);

                            choice=false;
                            break;
                        }
                        break;

                    case 2:   // option 2 , convert from Coin.ILS to Coin.USD
                        System.out.println("Enter amount of Coin.ILS to convert");
                        Scanner ilsInput = new Scanner(System.in);
                        ils = ilsInput.nextDouble();
                        double ilsOutCome = new ILS().calculate(ils);
                        System.out.println(ilsOutCome);
                        ArrayList<Double> ilsOutComeList = new ArrayList<>();
                        ilsOutComeList.add(ilsOutCome);
                        System.out.println("Start over 1=Yes / 2=No");
                        if (ilsInput.nextDouble() == 2.0) { // this option will print if the user does not want to start over
                            System.out.println("Thanks for using our currency converter \n Your results are:"+ ilsOutComeList);
                            Files.writeString(Path.of(filePath), "Your results are" + ilsOutComeList);
                            choice=false;
                            break;

                        }
                        break;

                    case 3:
                        System.out.println("Enter the amount to convert. (Coin.EURO to Coin.ILS only)");
                        Scanner eurInput=new Scanner(System.in);
                        euro=eurInput.nextDouble();
                        double eurOutCome=new EUR().calculate(euro);
                        System.out.println(eurOutCome);
                        ArrayList<Double> eurOutComeList=new ArrayList<>();
                        eurOutComeList.add(eurOutCome);
                        System.out.println("Start Over 1=Yes / 2=No");
                        if (eurInput.nextDouble()==2.0){
                            System.out.println("Thanks for using currency converter \n Your results are:"+eurOutComeList);
                            Files.writeString(Path.of(filePath),"Your results are"+eurOutComeList);
                            choice=false;
                            break;
                        }

                }

            }catch (InputMismatchException | IOException exception){ // this will catch and exceptions and will restart the program
                exception.printStackTrace();
                System.out.println("Wrong input we accept only numbers");
                Scanner scanner = new Scanner(System.in);
                scanner=scanner.reset();

            }

        }while (choice); //
    }

    private static class USD {
        public double calculate(double usd) {
            return usd;
        }
        }





    private static class ILS {
        public double calculate(double ils) {


            return ils;
        }
    }

    private static class EUR {
        public double calculate(double eur) {

            return eur;
        }
        }
    }

