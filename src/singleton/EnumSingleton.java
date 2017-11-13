package singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void performAction() {
        System.out.println("Action performed!");
    }
}
