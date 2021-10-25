package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private final Coffee coffee;

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffee);
    }

    public CoffeeMachine(Coffee coffee) {
        this.coffee = coffee;
        while (true) {
            printMenu();
        }
    }

    private void buyCoffee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String s = sc.next();
        if (s.matches("\\d+")) {
            int choice = Integer.parseInt(s);
            switch (choice) {
                case 1:
                    this.coffee.makeEspresso();
                    break;
                case 2:
                    this.coffee.makeLatte();
                    break;
                case 3:
                    this.coffee.makeCappuccino();
                    break;
            }
        } else if ("back".equals(s)) {
            printMenu();
        }
    }

    private void printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        System.out.print("> ");
        String input = sc.next();

        switch (input) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                coffee.fillSupplies();
                break;
            case "take":
                coffee.takeMoney();
                break;
            case "remaining":
                coffee.printSupplies();
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("not available!");
        }
    }

}
