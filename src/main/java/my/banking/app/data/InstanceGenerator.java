package my.banking.app.data;

public class InstanceGenerator {

    public static <T> T of(Class<T> clazz) {
        try {
            T instance = clazz.newInstance();
            System.out.println(String.format("New [%s] instance created.",
                    instance.getClass().getSimpleName()));
            return instance;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Could not create a new instance of type: " + clazz.getName());
        }
    }
}
