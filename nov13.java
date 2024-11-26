import java.util.Scanner;
class signChecker{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int val=scan.nextInt();
        if (val>0)
        System.out.println("Given Number is Positive !!");
        else if (val<0) System.out.println("Given Number is Negative !!");
        else System.out.println("Given Number is Zero");
        scan.close();

    }
}