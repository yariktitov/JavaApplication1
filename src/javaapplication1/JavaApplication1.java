/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bot> Привет. Как тебя зовут?");
        Scanner in = new Scanner(System.in, "windows-1251");
        String name = in.nextLine();
        //String trueName = new String (name.getBytes(), "CP866"); //Чтобы не было кракозябров
        System. out.println("Bot> Приветствую тебя, " + name);
        System. out.println("Bot> " + name + ", а не хочешь поиграть со мной?" );
        String answer = in.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("Bot> Ура! Со мной поиграют! ");
            //float n = 0;
            /*float n = 0;
            System.out.println("Bot> Я считаю до семи:");
            for (int i = 5; i >= 1; i--) {
            System.out.println("Bot>" + i);
            }*/
            double n = Math.random();
            n = (n * 4) + 1;
            long botNumber = Math.round(n) ;
            System.out.println("Bot> Я загадол число от 1 до 5. Угадай какое?");
            long myNumber = in.nextLong();
            if (myNumber == botNumber) {
                System.out.println("Bot> Ты угадал !");
            }else{
                if (myNumber > botNumber) {
                    System.out.println("Bot> Моё число меньше ");
                }else{
                    System.out.println("Bot> Моё число больше ");
                    
                }
            }
            long myNumber2 = in.nextLong();
            if (myNumber == botNumber) {
                System.out.println("Bot> Ты угадал !");
            }else{
                if (myNumber > botNumber) {
                    System.out.println("Bot> Моё число меньше ");
                }else{
                    System.out.println("Bot> Моё число больше ");
                    
                }
            }
            long myNumber3 = in.nextLong();
            if (myNumber == botNumber) {
                System.out.println("Bot> Ты угадал !");
            }else{
                if (myNumber > botNumber) {
                    System.out.println("Bot> Моё число меньше ");
                }else{
                    
                }
            }
        } else {
            System.out.println("Bot> Прийдется сидеть скучать . ");
        }
        
    }
    
}
