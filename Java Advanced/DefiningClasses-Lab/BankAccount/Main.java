package BankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> accountList = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");
            String command = inputLine[0];
            switch (command) {

                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    System.out.println("Account ID" + bankAccount.getId() + " created");
                    accountList.put(bankAccount.getId(), bankAccount);
                    break;

                case "Deposit":
                    int id = Integer.parseInt(inputLine[1]);
                    double amount = Double.parseDouble(inputLine[2]);

                    if (accountList.containsKey(id)) {
                        BankAccount currentAccount = accountList.get(id);
                        currentAccount.deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, currentAccount.getId());
                    } else  {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest":
                double interestRate = Double.parseDouble(inputLine[1]);
                BankAccount.setInterestRate(interestRate);
                break;

                case "GetInterest":
                int currentID = Integer.parseInt(inputLine[1]);
                int years = Integer.parseInt(inputLine[2]);

                if (accountList.containsKey(currentID)) {
                    BankAccount currentAccount = accountList.get(currentID);
                    double result = currentAccount.getInterest(years);
                    System.out.printf("%.2f%n", result);

                } else {
                    System.out.println("Account does not exist");
                }
                break;
            }

            input = scanner.nextLine();
        }

    }
}
