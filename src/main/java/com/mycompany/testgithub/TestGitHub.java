/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testgithub;

import java.util.Scanner;

/**
 *
 * @author ACE
 */
public class TestGitHub {

    public static void main(String[] args) {
        System.out.println("Hi ace you boy!");
        System.out.println("Hi again!!!!!!!!!");
         Scanner v= new Scanner (System.in);
            int num=0;
            int numeven=0,numodd=0;
            
            for (int i = 0; i<= 10; i++) {
                System.out.println("enter 10 numbers");
                num=v.nextInt();
                if(num%2==0)
                    numeven++;
                else
                    numodd++;
                
                

            }
               System.out.println("sum of all even number"+ numeven );
                System.out.println("sum of all odd number"+ numodd );
        
    }
}
