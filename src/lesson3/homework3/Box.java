package lesson3.homework3;

import java.util.ArrayList;

public class Box<F> {
    private double weightFruit = 0.0;
    ArrayList<F> fruits = new ArrayList();

    public <F> Box(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(Box<F> boxFruit){
        System.out.println("Before moving. Quantity box 1: " + fruits.size());
        System.out.println("Before moving. Quantity box 2: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        System.out.println("After moving. Quantity box 1: " + fruits.size());
        System.out.println("After moving. Quantity box 2: " + boxFruit.fruits.size());
    }
}
