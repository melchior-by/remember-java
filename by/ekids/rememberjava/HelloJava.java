package by.ekids.rememberjava;

public class HelloJava {
    //поля
    //примитивы
    //целочисленные
    static int number = 10;
    static byte aByte = 1;
    static long aBigNumber = 1_000_000L;
    //дробные
    static float aFloat = 10.5F;
    static double aDouble = 1000.798787;
    //булевые
    static boolean trueOrFalse = true;

    //объекты
    static String str = new String("Jack");
    Integer numberCover = 10;
    Integer numberCover2 = Integer.valueOf(10);

    //методы
    public static void main(String[] args) {
        int number2 = 100;
        System.out.println("hello");
        System.out.println(number2);

        printFancy(str);
        printFancy(String.valueOf(number2));

        Cat barsik = new Cat(10, 200.1, "Barsik");
        barsik.setName("Freddy Cruger");
        barsik.setName("Keksik");
        barsik.sayMyName();

        Crocodile crocs = new Crocodile(5, 1000.67, "Crocs");
        crocs.bite();
    }

    public static void printFancy(String name) {
        System.out.println("***" + name + "***");
    }

}
