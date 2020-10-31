import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
    makeNumber();
    guessWord();
    }

        static void makeNumber() {
            Scanner scanner = new Scanner(System.in);
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
            if (userData.equals("1")) {
                main(null);
            }
        }

        static void guessWord() {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                    "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                    "pepper", "pineapple", "pumpkin", "potato"};
            int inFruit = random.nextInt(words.length - 1);
            String word = words[inFruit];
            int onFruit = word.length();
            System.out.println("Загадано слово, попробуй отгадай");
            System.out.println(word);
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Ваш ответ: (для выхода нажмите Enter)");
                String answer = scanner.nextLine();
                if (answer.equals(answer)) {
                    System.out.println("Вы выйграли!!!");
                    break;
                }
                char[] chAnswer = answer.toCharArray();
                for (int i = 0; i < onFruit; i++) {
                    if(i >= chAnswer.length) break;
                    if (word.charAt(i) != chAnswer[i]) chAnswer[i] = '#';
                }
                StringBuilder com = new StringBuilder(String.valueOf(chAnswer));
                for (int i = com.length();i < 15; i++) com.append('#');
                System.out.println("com");
                }
            while (true);
            }
        }

