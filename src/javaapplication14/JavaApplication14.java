/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author onur_
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("kaç sayı girmek istiyorsunuz : ");
        int sayi = input.nextInt();
        int[] arr = new int[sayi];
        int toplam= 0;
        
        for (int i = 0; i < arr.length; i++) {
              System.out.println((i+1)+".sayiyi gir : ");
              int sayilar =  input.nextInt();
              arr[i] = sayilar;
              toplam = toplam + arr[i]; 
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i+1); j++) {
                if (arr[j]> arr[j+1]) {
                    int tmp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                    System.out.println(tmp);
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        
        
       
    }
    
}
