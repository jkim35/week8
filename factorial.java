import java.util.*;
public class factorial{
    public static void main(String[]args){
        int init;
        Scanner input = new Scanner(System.in);
        System.out.print("What number would like to factorialize?: ");
        init = input.nextInt();
        for (int i = init-1;i >= 1;i--){
            init = init*i;
            System.out.println(init);
            System.out.println(i);
        }
        System.out.println("Your factorialized number is: "+init);
    }

}