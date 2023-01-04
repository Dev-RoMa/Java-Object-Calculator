/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mul;
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class multiplication {
    //arguments
    int number1;
    int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    
    //
    Scanner scan = new Scanner(System.in);
    public void readM(){
        System.out.println("1 = ");
        number1 = scan.nextInt();
        System.out.println("2 = ");
        number2 = scan.nextInt();
        int mult = number1+number2;
        System.out.println("Multiplication = "+mult);
    };
    
}