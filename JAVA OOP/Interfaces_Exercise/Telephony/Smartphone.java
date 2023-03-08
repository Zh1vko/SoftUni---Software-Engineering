package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String entry : urls) {

            boolean invalid = false;
            for (int i = 0; i < entry.length(); i++) {
                if (Character.isDigit(entry.charAt(i))) {
                    invalid = true;
                }
            }
            if (invalid) {
                sb.append("Invalid URL!");
                sb.append(System.lineSeparator());
            } else {
                sb.append("Browsing: ").append(entry).append("!");
                sb.append(System.lineSeparator());
            }

        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String entry : numbers) {
            boolean invalid = false;


            for (int i = 0; i < entry.length(); i++) {
                if (!Character.isDigit(entry.charAt(i))) {
                    invalid = true;
                }
            }
            if (invalid) {
                sb.append("Invalid number!");
                sb.append(System.lineSeparator());
            } else {
                sb.append("Calling... ").append(entry);
                sb.append(System.lineSeparator());
            }

        }
        return sb.toString();
    }
}
