import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainMenu menu = new MainMenu();
        LoginPanel loginPanel = new LoginPanel();
        loginPanel.login();
        menu.displayMainMenu();
    }
}