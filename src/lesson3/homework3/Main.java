package lesson3.homework3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Red", "Green", "Yellow", "Black", "White", "Blue"};
        doArray(array, 2,4);

        System.out.println("------------------------");

        doFruitBoxes();
    }

    public static void doArray(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void doFruitBoxes() {
        Box<Apple> appleBox = new Box<Apple>(1);
        Box<Orange> orangeBox = new Box<Orange>(1.5);
        Box<Apple> appleBox2 = new Box<Apple>(1);

        for (int i = 0; i < 5; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());

        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));
        System.out.println("------------------------");

        appleBox.addFruits(appleBox2);
    }
}
