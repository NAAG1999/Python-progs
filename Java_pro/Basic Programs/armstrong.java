import java.util.Scanner;

class armstrong{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0,temp,a;
        temp = n;
        while(n>0){
            // 153 -> 3
            a = n%10;
            n = n/10;
            sum = sum + (a*a*a);
            //a = a/10;
        }

        //              / --> quotient
        //              % --> remainder

        if(sum == temp){
            System.out.print("Number is an Armstrong");
        }
        else
            System.out.print("Number is not an Armstrong");
    };
}
