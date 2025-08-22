/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswitchcase;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Javaswitchcase {
    public static void main(String[] args) {
 
    
 // configurando o scanner    
Scanner fruta = new Scanner(System.in);
System.out.println("digite um numero de 1 a 3");
int resposta = fruta.nextInt();

// colocando switch
switch(resposta) {
    case 1 -> System.out.println("maça");
        
    case 2 -> System.out.println("banana");
    
    case 3 -> System.out.println("laranja");
      
    default -> System.out.println("o numero e invalido");
}
     
Scanner jogo = new Scanner (System.in);
System.out.println("digite um número de 1 a 5");
int resposta2 = jogo.nextInt();

switch(resposta2) {
    case 1 -> System.out.println("minecraft");
    
    case 2 -> System.out.println("FIFA");
    
    case 3 -> System.out.println("Fortnite");
    
    case 4 -> System.out.println("Call of duty");
    
    case 5 -> System.out.println("The sims");
    
    default -> System.out.println("Seu jogo não foi encontrado");
}
    
Scanner diadasemana = new Scanner(System.in);
System.out.println("digite um numero de 1 a 7");
int resposta3 = diadasemana.nextInt();

switch(resposta3) {
    
    case 1 ->  System.out.println("domingo");
    
    case 2 -> System.out.println("segunda-feira");
    
    case 3 -> System.out.println("terça-feira");
    
    case 4 -> System.out.println("quarta-feira");
    
    case 5 -> System.out.println("quinta-feira");
    
    case 6 -> System.out.println("sexta-feira");
    
    case 7 -> System.out.println("sabádo");
    
    default -> System.out.println("Dia inválido");
}

 }  
}
    

