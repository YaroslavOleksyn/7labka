/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labka7;

import java.util.Scanner;

/**
 * Головник клас для взаємодії з персонажами.
 * @author Admin
 */
public class Labka7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    GameCharacter character = null;
        while(true) 
        {
        System.out.println("========================");
        System.out.println("1. Створити Мага");
        System.out.println("2. Створити Лучника");
        System.out.println("3. Створити Гнома");
        System.out.println("4. Створити Відьму");
        System.out.println("5. Створити Шута");
        System.out.println("6. Атакувати персонажа");
        System.out.println("9. Вийти");
        System.out.println("========================");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                character = new Wizard("Маг", 110, 15);
                System.out.println("Маг створений!");
                break;
            case 2:
                character = new Archer("Лучник", 100, 12);
                System.out.println("Лучник створений!");
                break;
            case 3:
                character = new Gnome("Гном", 60, 20);
                System.out.println("Гном створений!");
                break;
            case 4:
                character = new Witch("Відьма", 85, 8);
                System.out.println("Відьма створена!");
                break;
            case 5:
                character = new Jester("Шут", 50, 30);
                System.out.println("Шут створений!");
                break;
            case 6:
                if (character != null) 
                {
                    character.attack();
                } 
                else 
                {
                    System.out.println("Створіть персонажа перед атакою.");
                }
                break;
            case 9:
                System.out.println("Вихід з програми...");
                System.exit(0);
            default:
                System.out.println("Немає такої дії.");
            }
        }
    }
}
