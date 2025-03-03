package creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватний конструктор для запобігання створенню об'єктів
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance is created!");
    }
}
