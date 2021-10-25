package machine;

import java.util.Scanner;

public class Coffee {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public Coffee() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.money = 550;
        this.cups = 9;
    }

    public void fillSupplies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the beans machine has:");
        System.out.print("> ");
        this.water = this.water + sc.nextInt();

        System.out.println("Write how many ml of milk the beans machine has:");
        System.out.print("> ");
        this.milk = this.milk + sc.nextInt();

        System.out.println("Write how many grams of beans beans the beans machine has:");
        System.out.print("> ");
        this.beans = this.beans + sc.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        System.out.print("> ");
        this.cups = this.cups + sc.nextInt();
    }

    public void printSupplies() {
        System.out.println("The coffee machine has");

        System.out.printf("%d ml of water%n", this.water);
        System.out.printf("%d ml of milk%n", this.milk);
        System.out.printf("%d g of beans beans%n", this.beans);
        System.out.printf("%d disposable cups%n", this.cups);
        System.out.printf("$%d of money%n", this.money);

    }
    public void makeEspresso() {

        if (this.water >= 250 && this.beans >= 16 && cups >= 1) {
            this.water = this.water - 250;
            this.beans = this.beans - 16;
            this.cups = this.cups - 1;
            this.money = this.money + 4;
            System.out.println("I have enough resources, making you a coffee!");
        }  else {
            if (this.water < 200) {
                System.out.println("Sorry, not enough water!");
            }
            if (this.beans < 12) {
                System.out.println("Sorry, not enough beans!");
            }
            if (this.cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    public void makeCappuccino() {
        if (this.water >= 200 && this.beans >= 12 && this.milk >= 100
                && cups >= 1) {
            this.water = this.water - 200;
            this.beans = this.beans - 12;
            this.milk = this.milk - 100;
            this.cups = this.cups - 1;
            this.money = this.money + 6;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (this.water < 200) {
                System.out.println("Sorry, not enough water!");
            }if (this.beans < 12) {
                System.out.println("Sorry, not enough beans!");
            }if (this.milk < 100 ) {
                System.out.println("Sorry, not enough milk!");
            }if (this.cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    public void takeMoney() {
        System.out.printf("I gave you $%d%n", this.money);
        this.money = 0;
    }

    public void makeLatte() {
        if (this.water >= 350 && this.beans >= 20
                && this.milk >= 75
                && cups >= 1) {
            this.water = this.water - 350;
            this.beans = this.beans - 20;
            this.milk = this.milk - 75;
            this.cups = this.cups - 1;
            this.money = this.money + 7;
            System.out.println("I have enough resources, making you a coffee!");
        }else {
            if (this.water < 350) {
                System.out.println("Sorry, not enough water!");
            }if (this.beans < 20) {
                System.out.println("Sorry, not enough beans!");
            }if (this.milk < 75 ) {
                System.out.println("Sorry, not enough milk!");
            }if (this.cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }
}
