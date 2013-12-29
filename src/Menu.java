import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); //screw scanner since it doesnt have a nextString
    public Menu() {
    }

    public void showMenu() throws IOException {
        Integer menuchoice = -1;
        System.out.println("Welcome to Server Tycoon Version 0.1!");
        System.out.println("What would you like to do?");
        System.out.println("1: Create a new Company");
        System.out.print("> ");

        menuchoice = Integer.parseInt(input.readLine());
        switch (menuchoice) {
            case 1:
                startMenu();
        }
    }
    public void gameMenu() {
        System.out.print("Welcome to the Server Tycoon! Type help to see commands!");


    }
    public void startMenu() throws IOException {
        String companyName;
        System.out.println("What do you want to name the company?");
        System.out.print("> ");
        companyName = input.readLine();
        System.out.println("You have chosen a name of: " + companyName);
        Company playerCompany = new Company(companyName);
        gameMenu();
    }


}
