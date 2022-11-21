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
        code = obj.nextInt();
        name = obj.next();
        designation = obj.next();
        salary = obj.nextDouble();
        companyName = obj.next();
        phnNo= obj.nextLong();
        emailId = obj.next();

    }

}
public class Main {


    public static void main(String[] args) {
        System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Select an Employee \n" +
                "4 - Delete an Employee \n 5 - Exit");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 5){
            System.out.println("You are exiting from the program");
        }
        else{

            ArrayList<employee> earr = new ArrayList<employee>();

            switch(n){

                case 1 :
                    System.out.println("Enter employee details");
                    for(int i = 0; i < 5; i++){

                    employee ei = new employee();
                    earr.add(ei);

                    }
            }

        }
    }
}