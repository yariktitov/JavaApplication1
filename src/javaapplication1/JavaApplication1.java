/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
        System.out.println("Bot> Приветствую тебя, " + name);
        System.out.println("Bot> " + name + ", а не хочешь поиграть со мной?");
        String answer = in.nextLine();
        System.out.println(name + "> " + answer);
        if (answer.equals("Да") || answer.equals("да")) {
            System.out.println("Bot> Ура! Со мной поиграют! ");
            double n = Math.random();  //Генерируем число от 0 до 1 
            n = (n * 4) + 1;  // Делаем от 0 до 1 
            long botNumber = Math.round(n); // Округляем 
            System.out.println("Bot> Я загадол число от 1 до 5. Угадай какое?");

            boolean winner = false;

            for (int i = 3; i > 0; i--) {
                long myNumber = in.nextLong(); // Читаем число
                if (myNumber == botNumber) {
                    System.out.println("Bot> Ты угадал ! Моё число действительно было " + botNumber);
                    winner = true;
                    break;
                } else {
                    if (myNumber > botNumber) {
                        System.out.println("Bot> Моё число меньше ");
                    } else {
                        System.out.println("Bot> Моё число больше ");
                    }

                    if ((i - 1) != 0) {
                        System.out.println("Bot> У вас осталось " + (i - 1) + " попыток");
                    } else {
                        System.out.println("Bot> У вас нет больше попыток");
                    }
                }
            }

            if (winner) {
                System.out.println("Bot> Поздравляю ! Ты победил ! ");
            } else {
                System.out.println("Bot> К сожелению ты проиграл . Моё число было " + botNumber);
            }
        } else {
            System.out.println("Bot> Прийдется сидеть скучать . ");
        }

    }

}
