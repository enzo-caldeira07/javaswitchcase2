/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswitchcase;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class javaswitchcase {
 public static void main (String[] args) {
    
Scanner fruta = new Scanner(System.in);
System.out.println("digite um numero de 1 a 3");
int resposta = fruta.nextInt();

switch(resposta) {
    case 1:
        System.out.println("maça");
        break;
        
    case 2:
    System.out.println("banana");
    break;
    
    case 3:
      System.out.println("laranja");
      break;
      
    default:
     System.out.println("o numero e invalido");
}
     
     
 }  
}
