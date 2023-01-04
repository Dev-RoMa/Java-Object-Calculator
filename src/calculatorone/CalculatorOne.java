/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorone;
import java.util.Scanner;
import add.addition;
import sub.substraction;
import div.division;
import mul.multiplication;

/**
 *
 * @author rodri
 */
public class CalculatorOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        addition add = new addition();
        substraction sub = new substraction();
        multiplication mult = new multiplication();
        division div = new division();
        Scanner scan = new Scanner(System.in);
        int sw = -1;
        int op;
        
        while (sw == -1){
        System.out.println("select an option\n1.-Add\n2.-Subs\n3.-Multiply\n4.-Divide\n5.-Exit");
        op = scan.nextInt();
            switch (op) {
                case 1:
                    add.readA();
                    break;
                case 2:
                    sub.readS();
                    break;
                case 3:
                    mult.readM();
                    break;
                case 4:
                    div.readD();
                    break;
                case 5:
                    sw = 0;
                    break;
                default:
                    System.out.println("Select a correct option");
                    break;
            }
        }
    }
}