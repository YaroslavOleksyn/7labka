/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labka7;

/**
 * Клас для представлення персонажа Відьми
 * @author Admin
 */
class Witch extends GameCharacter {
    /**
     * Конструктор для класу Witch.
     */
    public Witch(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    /**
     * Метод для виведення сили, з якою стріляє персонаж.
     */
    @Override
    public void attack() {
        System.out.println(getName() + " застосовуэ магію з силою " + getAttack() + " одиниць.");
    }
}