import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
    Scanner entrada_int = new Scanner(System.in);
    int a;
    System.out.println("ingrese nota del alumno:");
    a = entrada_int.nextInt();
    if (a > 75){
        System.out.println("O");
    }
    else {
        if (a >= 60){
            System.out.println("A");


        }else if (a >= 50){
            System.out.println("B");
        } else if (a >= 40){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
        
    }

    }
}
