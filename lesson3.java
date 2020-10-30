import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main (String[] args){

        Scanner scanner  = new Scanner(System.in);
        Random numbers = new Random();

        int tryThree = 0;
        int random = numbers.nextInt(9);
        System.out.println("Угадай число с трех раз, введите от 0 до 9");

        while (tryThree < 3) {
            int number = scanner.nextInt();
            if (number > random) {
                System.out.println("Число больше, чем загаданное:");
                System.out.println(" ");
            } else if (number < random) {
                System.out.println("Число меньше, чем загаданное:");
                System.out.println(" ");
            } else if (number == random) {
                System.out.println("Ты победил!!!");
                System.out.println(" ");
            }
            tryThree++;
        }
        System.out.print("Повторить игру еще раз? нажмите 1 если да и 0 если нет:");
        String userData = scanner.next();
        if(userData.equals("1")){
            main(null);
        }
    }
}