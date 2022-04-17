import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Сиграем в игру `Угадай число`- У вас три попытки!");
            int compNumber = random();
            System.out.println("Подсказка - "+compNumber);
        for (int i = 1; i <= 3; i++) {
            int humNumber = scan();
            if (humNumber == compNumber) {
                System.out.println("Вы выиграли! Возьми с полки пирожок :-)");
                i=4;
            } else {
                System.out.println("Не угадали, попытка№"+i);
            }
        }
    }
    public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(11) + 1;
        return randoNumber;
    }

    public static int scan(){
        System.out.println("Введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = scanner.nextInt();
        return humanNumber;
    }
}

