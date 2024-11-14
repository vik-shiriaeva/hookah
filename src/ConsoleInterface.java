import java.util.List;
import java.util.Scanner;

public class ConsoleInterface {

    private Scanner scanner = new Scanner(System.in);

    HookahConsoleHandler hookahConsoleHandler = new HookahConsoleHandler(scanner);

    public void start() {

        while (true) {
            mainMenu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                hookahConsoleHandler.handle();
            } else if (choice == 2) {
                System.out.println("Welcome to hookah");
            } else if (choice == 3) {
                List<Hookah> listHookah = hookahConsoleHandler.getAllHookah();
                if (listHookah.isEmpty()) {
                    System.out.println("No hookah found");
                } else {
                    for (Hookah hookah : listHookah) {
                        System.out.println(hookah);
                    }
                }
            } else if (choice == 4) {
                hookahConsoleHandler.deleteHookah();
            } else if (choice == 5) {
                System.out.println("По какому вкусу отобрать кальян?");
                System.out.println(hookahConsoleHandler.findByTaste());
            } else if (choice == 6) {
                System.out.println("Какой крепости удалить кальян?");
                hookahConsoleHandler.deleteByFrotress();
            }  else {
                System.exit(0);
            }
        }
    }


    public void mainMenu() {
        System.out.println("1. Заказать кальян");
        System.out.println("2. Заказать чай");
        System.out.println("3. Показать кальяны");
        System.out.println("4. Удалить кальяны");
        System.out.println("5. Показать кальян определенного вкуса");
        System.out.println("6. Удалить кальян определенной тяжести");
        System.out.println("7. Выход");
    }


//
//    public static void choiceTaste(){
//        System.out.println("1. Фрукты");
//        System.out.println("2. Ягоды");
//        System.out.println("3. Выпечка");
//        System.out.println("4. Выход  в меню какое-то");
//    }
}
