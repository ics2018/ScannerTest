/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scannertest;

import java.util.Scanner;

/**
 *
 * @author rkaune
 */
public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age =0;
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your age ");
        age = input.nextInt();
        System.out.println("Your age is " + age);
        input.close();
        // TODO code application logic here
    }
    
}
