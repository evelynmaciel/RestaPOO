import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
       Scanner n1 =  new Scanner(System.in);

       System.out.println(" ingresa el valor de a");
        int a = n1.nextInt();

        System.out.println("ingresa el valor de b");
        int b = n1.nextInt();
       int r = a-b;
        System.out.println("el resutado es:"+ r);
    }  
    
}