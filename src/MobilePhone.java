import java.util.Scanner;

public class MobilePhone {
    public String company;
    public String model;
    public double IMEI1;
    public double IMEI2;
    public double cost;

    public void ImeiCheck1(double IMEI1){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while(x > 0){
            System.out.println("Enter your Phone's IMEI no : ");
            double i = sc.nextDouble();
            if(i > 10000000000d && i < 99999999999d) {
                IMEI1 = i;
                x = 0;
            }
            else{
                System.out.println("Invalid IMEI.");
                x = 1;
            }
        }
    }
    public void ImeiCheck2(double IMEI1, double IMEI2){
        int x = 1;
        int y = 1;
        Scanner sc = new Scanner(System.in);
        while(x > 0){
            System.out.println("Enter your Phone's 1st IMEI no : ");
            double i = sc.nextDouble();
            if(i > 10000000000d && i < 99999999999d) {
                IMEI1 = i;
                x = 0;
            }
            else{
                System.out.println("Invalid IMEI.");
                x = 1;
            }
        }
        while(y > 0){
            System.out.println("Enter your Phone's 2nd IMEI no : ");
            double i = sc.nextDouble();
            if(i > 10000000000d && i < 99999999999d) {
                IMEI2 = i;
                y = 0;
            }
            else{
                System.out.println("Invalid IMEI.");
                y = 1;
            }
        }
    }
    public void tax(double cost, int no) {
        if(no == 1) {
            double tax = (cost * 16) / 100;
            System.out.println("Tax on your device is : " + tax + " Rs.");
        }
        else if (no == 2){
            double tax = 2 * ((cost * 16) / 100);
            System.out.println("Tax on your device is : " + tax + " Rs.");
        }
    }
}
