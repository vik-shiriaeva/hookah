//import java.util.Scanner;
//
//public class MenuHandler {
//
//    private HookahFrotress hookahFrotress = new HookahFrotress();
//    private HookahTaste hookahTaste = new HookahTaste();
//
//    public void handleMainManuChoice(int choice) {
//        if (choice == 1) {
//             Menu.choiceFrotress();
//             String frotress = hookahFrotress.hookahFrotress();
//             if (frotress.equals("return")) {
//                 return;
//             }
//             Menu.choiceTaste();
//             String taste = hookahTaste.hookahTaste();
//             Hookah hookah = new Hookah(frotress, taste);
//             System.out.println(hookah.toString());
//        }  else if (choice == 2) {
//            System.out.println("хуй");
//        } else if (choice == 3) {
//            System.exit(0);
//        } else {
//            System.out.println("Invalid choice");
//        }
//    }
//}
