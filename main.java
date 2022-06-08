import java.util.ArrayList;
import java.util.Comparator;

class Ship {
    public String name, color;
    public int age, price, speed;

    public Ship(String name, String color, int age, int price, int speed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.price = price;
        this.speed = speed;
    }

    int get_age() {
        return this.age;
    }

    int get_speed() {
        return this.speed;
    }


    public void show_info() {
        String text = String.format("| Назва: %s | Колір: %s | Вік: %s | Ціна: %s | Швидкість: %s |", this.name, this.color, this.age, this.price, this.speed);
        System.out.println(text);
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList<>();

        ships.add(new Ship("Яхта", "Білий", 24, 9000000, 90));
        ships.add(new Ship("Фрегат", "Чорний", 42, 125000000, 124));
        ships.add(new Ship("Пароплав", "Червоний", 65,36000000, 55));
        ships.add(new Ship("Парусна яхта", "Рожевий",58, 15000000, 75));
        ships.add(new Ship("Галеон", "Оранжевий", 130, 45000000, 95));

        System.out.println(" ");
        System.out.println("С11 = " + 1115 % 11);
        System.out.println(" \nЗавдання - Визначити клас морський човен, який складається як мінімум з 5-и полів.\n");

        System.out.println("    Результат сортування за збільшенням віку кораблів");
        ships.sort(Comparator.comparing(Ship::get_age));
        ships.forEach(Ship::show_info);
        System.out.println(" ");
        System.out.println("    Результат сортування за зменшенням швидкості кораблів");
        ships.sort(Comparator.comparing(Ship::get_speed,Comparator.reverseOrder()));
        ships.forEach(Ship::show_info);
        System.out.println(" ");

    }
}