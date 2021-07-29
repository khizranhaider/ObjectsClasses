import java.util.Scanner;

public class UserInfo {
    public String Name;
    public int CNIC;
    public int PassportNo;

    public void CNIC_Check(double CNIC){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while(x > 0){
            System.out.println("Enter your CNIC No : ");
            double i = sc.nextDouble();
            if(i > 1000000000000d && i < 9999999999999d) {
                CNIC = i;
                x = 0;
            }
            else{
                System.out.println("Invalid CNIC.");
                x = 1;
            }
        }
    }
    public void Passport_Check(double PassportNo){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while(x > 0){
            System.out.println("Enter your Passport No : ");
            double i = sc.nextDouble();
            if(i > 100000d && i < 999999d) {
                PassportNo = i;
                x = 0;
            }
            else{
                System.out.println("Invalid Passport No.");
                x = 1;
            }
        }
    }
}
