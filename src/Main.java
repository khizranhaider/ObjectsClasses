import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        double i;
        int no;
        Scanner sc = new Scanner(System.in);

        UserInfo MobileUser = new UserInfo();
        System.out.println("Enter your Name : ");
        a = sc.nextLine();
        MobileUser.Name = a;
        MobileUser.CNIC_Check(MobileUser.CNIC);
        MobileUser.Passport_Check(MobileUser.PassportNo);

        MobilePhone Phone = new MobilePhone();
        System.out.println("Enter your Phone's Company : ");
        a = sc.nextLine();
        Phone.company = a;
        System.out.println("Enter your Phone's Model : ");
        a = sc.nextLine();
        Phone.model = a;
        System.out.println("Enter number of IMEIs of your device (1 or 2) : ");
        no = sc.nextInt();
        if (no == 1) {
            Phone.ImeiCheck1(Phone.IMEI1);
        }
        else if (no == 2) {
            Phone.ImeiCheck2(Phone.IMEI1, Phone.IMEI2);
        }
        System.out.println("Enter your Phone's cost (in PKR) : ");
        i = sc.nextDouble();
        Phone.cost = i;
        Phone.tax(i, no);
    }
}
