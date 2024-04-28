//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1-3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 4-5");
        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);
    }

    public static void task3() {
        System.out.println("Задача 6-7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес " + totalWeight);
        var difference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе " + difference);
        var difference2 = (weightBoxer1 + weightBoxer2) % weightBoxer1;
        System.out.println("разница " + difference2);

        System.out.println("Задача 8");
        var totalTime = 640;
        var workTime = 8;
        var workers = totalTime / workTime;
        System.out.println("Всего в компании " + workers + " человек");
        workers = workers + 94;
        var newTime = workers * workTime;
        System.out.println("Необходимо " + newTime + " часов");
    }
}