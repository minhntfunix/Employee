import java.util.*;

public class Main {
    public static ArrayList<Staff> staffList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            System.out.println();
            showMenu();
            System.out.print("Please choose a number: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    Operation.AddEmployee(staffList);
                    break;
                case 2:
                    Operation.AddFresher(staffList);
                    break;

                case 3:
                    Operation.AddIntern(staffList);
                    break;
                case 4:
                    Operation.Search(staffList);
                    break;
                case 5:
                    System.out.println("Program exiting. Goodbye!!");
                    break;

                default:
                    System.out.println("Unrecognized selection. Choose again:");
            }
        }while(choose!=5);
    }


    public static void showMenu() {
        System.out.println("1. Add Employee ");
        System.out.println("2. Add Fresher ");
        System.out.println("3. Add Intern ");
        System.out.println("4. Search ");
        System.out.println("5. Exit ");
    }
}
