package _01_JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> currentJar = new Jar();

        currentJar.add(15);
        currentJar.add(323);
        System.out.println(currentJar.remove());

        Jar<String> stringJar = new Jar<>();

        stringJar.add("123");
        stringJar.add("41fa");
        stringJar.add("4a4v4g4a1");
        System.out.println(stringJar.remove());

    }
}
