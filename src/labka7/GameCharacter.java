/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labka7;

/**
 * Абстрактний клас, для представлення персонажів.
 * @author Admin
 */
abstract class GameCharacter {
    
    private String name;
    private int hp;
    private int attack;
    /**
     * Конструктор для класу GameCharacter.
     */
    public GameCharacter(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    /**
     * Абстрактний метод для виконання атаки персонажа.
     */
    public abstract void attack();
    /**
     * Гетер для отримання ім'я
     *
     */
    public String getName() {
        return name;
    }
    /**
     * Сетер для встановлення ім'я
     *
     */
    public void setName(String name) {
        this.name = name;
    }
     /**
     * Гетер для отримання здоров'я персонажа
     *
     */
    public int getHealth() {
        return hp;
    }
    /**
     * Сетер для встановлення здоров'я персонажа
     *
     */
    public void setHP(int hp) {
        this.hp = hp;
    }
    /**
     * Гетер для отримання урони від атаки
     *
     */
    public int getAttack() {
        return attack;
    }
    /**
     * Сетер для встановлення урону від атаки
     *
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
}
