
import controller.DictionaryManager;
import menu.Menu;

public class Main {
      public static void main(String[] args) {
        String title = "Dictionary program";
        String[] s = new String[]{"Add Word", "Delete Word", "Translate", "Exit"};
        Menu<String> menu = new DictionaryManager(title, s);
        menu.run();

    }
}
