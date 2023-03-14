import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

    Class clazz = Reflection.class;                 // Class

    Class superClazz = clazz.getSuperclass();       // get superClass -> Object

    Class[] clazzInterfaces = clazz.getInterfaces();    // Array with interfaces -> stream.forEach

    Constructor constructors = clazz.getDeclaredConstructor(); // get class constructor

    Reflection reflection = (Reflection) constructors.newInstance();   // cast to Reflection -> instantiate new object reflection


    // Print results:
    System.out.println(clazz);
    System.out.println(superClazz);
    Arrays.stream(clazzInterfaces).forEach(System.out::println);
    System.out.println(reflection);
    }
}
