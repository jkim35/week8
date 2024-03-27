import java.util.*;
public class factorial{
    public static void main(String[]args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("What number would you like to computer the factorial for? ");
        num = input.nextInt();
        int factorial = 1;
        for(int i = num; i>0;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
