import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;

public class HookahConsoleHandler {

    private final Scanner scanner;
    HookahService hookahService = new HookahService();

    public HookahConsoleHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void SubMenuFrotress() {
        System.out.println("1. Легкий");
        System.out.println("2. Средний");
        System.out.println("3. Тяжелый");
        System.out.println("4. Выход  в главное меню");
    }

    public String choiceFrotress() {

        int choice = scanner.nextInt();
        String frotress = null;
        switch (choice) {
            case 1 -> {
                frotress = "Легкий";
            }
            case 2 -> {
                frotress = "Средний";
            }
            case 3 -> {
                frotress = "Тяжелый";
            }
        }
        return frotress;

    }

    public void SubMenuTaste() {
        System.out.println("1. Фрукты");
        System.out.println("2. Ягоды");
        System.out.println("3. Выпечка");
        System.out.println("4. Выход  в главное меню");
    }

    public String choiceTaste() {
        int choice = scanner.nextInt();
        String taste = null;
        switch (choice) {
            case 1 -> {
                taste = "Фрукты";
            }
            case 2 -> {
                taste = "Ягоды";
            }
            case 3 -> {
                taste = "Выпечка";
            }
        }
        return taste;
    }

    public void handle() {
        System.out.println("Выберете крепость");
        SubMenuFrotress();
        String frotress = choiceFrotress();
        if (frotress == null) {
            return;
        }

        System.out.println("Выберете вкус");
        SubMenuTaste();
        String taste = choiceTaste();
        if (taste == null) {
            return;
        }
        hookahService.createHookah(frotress, taste);
    }

    public List<Hookah> getAllHookah() {
        return hookahService.getAllHookah();
    }

    public void deleteHookah() {
        hookahService.deleteHookahs();
    }

    public List<Hookah> findByTaste(){
        SubMenuTaste();
        String taste = choiceTaste();
        return hookahService.findByTaste(taste);
    }

    public void deleteByFrotress(){
        SubMenuFrotress();
        hookahService.deleteByFrotress(choiceFrotress());
    }
}





