/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labka7;

/**
* Клас для представлення персонажа Лучника
* @author Admin
*/
class Archer extends GameCharacter {
    /**
     * Конструктор для класу Archer.
     */
    public Archer(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    /**
     * Метод для виведення сили, з якою стріляє персонаж.
     */
    @Override
    public void attack() {
        System.out.println(getName() + " стріляє з лука з силою " + getAttack() + " одиниць.");
    }
}