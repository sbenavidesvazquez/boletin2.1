//area dun triangulo
package boletin2.pkg1;

import java.util.Scanner;


public class Boletin21 {


    public static void main(String[] args) {
    float base,altura;
    
    System.out.print("base= ");
    Scanner dato =new Scanner(System.in);
    base=dato.nextFloat();
    
    System.out.print("altura= ");
    Scanner dato2 =new Scanner (System.in);
    altura=dato2.nextFloat();
    
    System.out.println("base= "+ base +"altura= "+ altura +"area= "+ base*altura/2);
    }
    
}
