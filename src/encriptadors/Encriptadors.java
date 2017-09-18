/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptadors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Encriptadors {

    /**
     * @param args the command line arguments
     */
    public static void cifrar(String palabra){
       char ascii[] = palabra.toCharArray();
        for(char ch :ascii){
            
            System.out.print(((int)ch-50));
        }
        System.out.println();
    }
    public static void descifrar(int palabra){
       int tamano = Integer.toString(palabra).length();
        List<Integer> lista = new ArrayList<>();
        List<Character>res = new ArrayList<>();
       for(int i=0; i< tamano; i++){
        lista.add(palabra%10);
        palabra = palabra/10;
       }
        System.out.println("-----------------");
        for(int i = tamano; i>0; i--){
            if(i == -1){
                break;
            
            }else{
                //System.out.println(lista.get(i-1));
            }
        }
        System.out.println("----------------------");
        for(int i =0; i<lista.size(); i+=2){
            String cad1 = String.valueOf(lista.get(i));
           // System.out.println("cad1: " +cad1);
            String cad2 = String.valueOf(lista.get(i+1));
            //System.out.println("cad2: "+cad2);
            String cont = cad2+cad1;
            //System.out.println("cont: "+cont);
            int num = Integer.parseInt(cont);
            num = num+50;
            //System.out.println("num: "+num);
            char ch = (char)num;
            res.add(ch);
            //System.out.print(ch);
            
            
        }
        for(int i = res.size()-1; i>=0; i--){
            System.out.print(res.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("desea cifrar(1) o descifrar(2)");
        int n = sc.nextInt();
        
        if(n == 1){
            System.out.println("escribe la palabrita");
            String palabra = sc.next();
            cifrar(palabra);
        }else{
            System.out.println("escribe la palabrita");
            int palabra = sc.nextInt();
            descifrar(palabra);
        }
        
        //cifrar(palabra);
        
        
        
                
    }
    
}
