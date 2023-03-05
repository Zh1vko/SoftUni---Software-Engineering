package _03_GenericScale;

public class Main {
    public static void main(String[] args) {

    Scale<Integer> scale = new Scale<>(5, 10);
        System.out.println(scale.getHeavier());

    Scale<String> stringScale = new Scale<>("a", "v");
        System.out.println(stringScale.getHeavier());
    }
}
