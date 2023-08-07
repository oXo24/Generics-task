package app;

import app.service.InfoService01;
import app.service.InfoService02;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        LOGGER.info("\n" + getOutput(getData(getOption())));
    }

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - get client's name and email.
                2 - get client's phone and purchase amount.
                """);
        return scanner.nextInt();
    }

    private static String getData(int option) {
        String data;
        switch (option) {
            case 1 -> data = new InfoService01().getData();
            case 2 -> data = new InfoService02().getData();
            default -> data = "No data";
        }
        return data;
    }

    private static String getOutput(String output) {
        return "\n" + output;
    }
}
