/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Model {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Cliente> clientes= new ArrayList<>();
        ArrayList<Pais> paises = new ArrayList<>();
        
        
        String digitou = new String();
        Scanner palavra = new Scanner(System.in);
        System.out.println("Deseja inserir um país ou um cliente?");
        
        do{
            System.out.println("Entre com o nome:");
            digitou = palavra.nextLine();

            clientes.add(digitou);  
            
        }while(true);
        System.out.println( Arrays.toString(clientes.toArray() ) );
        
    }
    
}
