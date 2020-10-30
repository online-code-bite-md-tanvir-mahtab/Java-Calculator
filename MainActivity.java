import java.util.Scanner;


/**
 * MainActivity
 */
public class MainActivity extends NormalCalculator {
    private static Scanner input = new Scanner(System.in);

    MainActivity(double d, double e) {
        super(d, e);
    }

    public static void main(String[] args) {
        MainActivity mainActivity;
        Scintific scintific;
        double firstNumber;
        double secondNumber;
        double scientificNumber;
        int whichToDo;
        System.out.println("Enter your choise do you went to start the calculation or not \n");
        System.out.println("Enter Yes to start the program \n or \n prese No to exit the program");
        String choise = input.nextLine();
        while (choise.equals("Yes")) {
            /*
             * now i am going to create the menu that user will get the idea what to chose
             */
            System.out.println("1. for the normal calculator press 1");
            System.out.println("2. for the scientific calculator press 2");
            System.out.println("3. for exit every thing just press 0");
            System.out.println("Enter your choosing option in the the top:");
            int choseSimpleOrScientific = input.nextInt();
            input.nextLine();
            switch (choseSimpleOrScientific) {
                case 1:
                    System.out.println("you have pressed the simple calculator");
                    System.out.println("Enter 1 to do the calculate:");
                    System.out.println("Enter 0 to do exit the calculate to the main menue:");
                    System.out.println("Enter what you went to do:");
                    whichToDo = input.nextInt();
                    input.nextLine();
                    while (whichToDo == 1) {
                        System.out.println("1. +");
                        System.out.println("2. -");
                        System.out.println("3. *");
                        System.out.println("4. /");
                        System.out.println("5. %");

                        System.out.println("Enter your option chose the symbol that are shown:");
                        String mathoSymbole = input.nextLine();
                        input.nextLine();
                        switch (mathoSymbole) {
                            case "+":
                                System.out.println("Enter your first Number:");
                                firstNumber = input.nextDouble();
                                System.out.println("Enter your second Number :");
                                secondNumber = input.nextDouble();
                                mainActivity = new MainActivity(firstNumber, secondNumber);
                                System.out.println(mainActivity.Sub());
                                break;
                            case "-":
                                System.out.println("Enter your first Number:");
                                firstNumber = input.nextDouble();
                                System.out.println("Enter your second Number :");
                                secondNumber = input.nextDouble();
                                mainActivity = new MainActivity(firstNumber, secondNumber);
                                System.out.println("Ans:"+mainActivity.Sum());
                                break;
                            case "*":
                                System.out.println("Enter your first Number:");
                                firstNumber = input.nextDouble();
                                System.out.println("Enter your second Number :");
                                secondNumber = input.nextDouble();
                                mainActivity = new MainActivity(firstNumber, secondNumber);
                                System.out.println("Ans:"+mainActivity.Mod());
                                break;
                            case "/":
                                System.out.println("Enter your first Number:");
                                firstNumber = input.nextDouble();
                                System.out.println("Enter your second Number :");
                                secondNumber = input.nextDouble();
                                mainActivity = new MainActivity(firstNumber, secondNumber);
                                System.out.println("Ans:"+mainActivity.Div());
                                break;
                            case "%":
                                System.out.println("Enter your parsentage Number:");
                                firstNumber = input.nextDouble();
                                System.out.println("Enter your which Number you went to parsentage :");
                                secondNumber = input.nextDouble();
                                mainActivity = new MainActivity(firstNumber, secondNumber);
                                System.out.println("Ans:"+mainActivity.Parsentage(firstNumber,secondNumber));
                                break;
                            default:
                                whichToDo = 0;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("you have Prssed the scinentific calculator");
                    System.out.println("Enter 1 to do the calculate:");
                    System.out.println("Enter 0 to do exit the calculate to the main menue:");
                    System.out.println("Enter what you went to do:");
                    whichToDo = input.nextInt();
                    input.nextLine();
                    while (whichToDo == 1) {
                        System.out.println("1. Sin");
                        System.out.println("2. Cos");
                        System.out.println("3. Squar");
                        System.out.println("4.Comming soon.....!!! ");
                        System.out.println("5.Comming soon........!!!! ");

                        System.out.println("Enter your option :");
                        String mathoSymbole = input.nextLine();
                        input.nextLine();
                        switch (mathoSymbole) {
                            case "Sin":
                                System.out.println("Enter your first Number:");
                                scientificNumber = input.nextDouble();
                                scintific= new Scintific();

                                System.out.println("Ans:"+scintific.Sin(scientificNumber));
                                break;
                            case "Cos":
                                System.out.println("Enter your first Number:");
                                scientificNumber = input.nextDouble();
                                scintific= new Scintific();
                                
                                System.out.println("Ans:"+scintific.Cos(scientificNumber));
                                break;
                            case "Squar":
                                System.out.println("Enter your first Number:");
                                scientificNumber = input.nextDouble();
                                scintific= new Scintific();
                                
                                System.out.println("Ans:"+scintific.squar(scientificNumber));
                                break;
                            default:
                                whichToDo = 0;
                                break;
                        }
                    }
                    break;
                default:
                    choise = "No";
                    break;
            }

        }

    }
}