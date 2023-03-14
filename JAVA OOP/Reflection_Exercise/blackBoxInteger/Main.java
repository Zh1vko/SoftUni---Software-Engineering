package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Field innerValue  = clazz.getDeclaredField("innerValue");
        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());


        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commandLine = input.split("_");
            String command = commandLine[0];
            int value = Integer.parseInt(commandLine[1]);

            Method currentMethod = null;
            for (Method method : methods) {
                if (method.getName().equals(command)) {
                    currentMethod = method;
                    break;
                }
            }

            currentMethod.setAccessible(true);
            currentMethod.invoke(blackBoxInt, value);
            innerValue.setAccessible(true);
            System.out.println(innerValue.get(blackBoxInt));

            input = scanner.nextLine();
        }

    }
}
