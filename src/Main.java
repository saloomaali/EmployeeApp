import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;
class employee{
    int code;
    String name;
    String designation;
    double salary;
    String companyName;
    long phnNo;
    String emailId;
    employee(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the code");
        code = obj.nextInt();
        System.out.println("Enter name");
        name = obj.next();
        System.out.println("Give the designation");
        designation = obj.next();
        System.out.println("Enter the salary");
        salary = obj.nextDouble();
        System.out.println("Enter company name");
        companyName = obj.next();
        System.out.println("Enter phn No");
        phnNo= obj.nextLong();
        System.out.println("Enter email Id");
        emailId = obj.next();

    }

}
public class Main {


    public static void main(String[] args) {
        ArrayList<employee> earr = new ArrayList<employee>();

        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            if (n == 5) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {


                switch (n) {

                    case 1:
                        System.out.println("Enter employee details");
                        for (int i = 0; i < 5; i++) {

                            employee ei = new employee();
                            earr.add(ei);

                        }
                        break;

                    case 2:
                        System.out.println("Employee Details Showing");
                        for (employee e : earr) {
                            System.out.println(e);
                        }
                        break;

                    case 3 :
                        System.out.println("Enter the employee code");
                        Scanner obj1 = new Scanner(System.in);
                        int Ecode = obj1.nextInt();
                        for (employee e : earr) {
                            if (Ecode == e.code){
                                System.out.println("Employee with employee code " + Ecode + "is " + e);
                            }
                        }
                        }
                }

            }
        }
    }
}