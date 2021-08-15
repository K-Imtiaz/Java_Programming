import java.util.Scanner;

public class CaseBreakfront {
    public static void main(String[] args) {
                System.out.print("Enter n: ");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                switch (n) {
                    case 10:
                    System.out.println(" = 10");
                    break;
        
                    case 90:
                    System.out.println(" = 90");
                    break;
        
                    case 100:
                    System.out.println(" = 100");
                    break;
        
                    case -3:
                    System.out.println(" = -3");
                    break;
        
                    default:
                    System.out.println("NONE OF THIS ABOVE");
                }
            }
        
        
    }

