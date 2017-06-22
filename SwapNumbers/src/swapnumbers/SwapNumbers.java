/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnumbers;

import java.util.Scanner;

/**
 *
 * @author FLAdmin
 */
public class SwapNumbers {
    Scanner s=new Scanner(System.in);
    int num1=0;
    int num2=0;
    void setNum(){
        System.out.println("Please input num1 ");
        num1=Math.abs(s.nextInt());
        System.out.println("Please input num2 ");
        num2=Math.abs(s.nextInt());       
    }
    
    void swap(){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
    }

    void getNum(){
        System.out.println("After swap num1 : "+num1);
        System.out.println("After swap num2 : "+num2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwapNumbers  sn= new SwapNumbers();
        sn.setNum();
        sn.swap();
        sn.getNum();
    }
    
}
