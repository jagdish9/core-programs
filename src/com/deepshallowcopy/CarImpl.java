package com.deepshallowcopy;

import java.util.ArrayList;
import java.util.List;

public class CarImpl {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");

        Car honda = new Car("Honda", colors);

        Car deepCopyOfHonda = new Car(honda.getName(), new ArrayList<>(honda.getColors()));
        deepCopyOfHonda.getColors().add("Green");

        System.out.print("Original: "+ honda.getColors());
        System.out.println();
        System.out.print("DeepCopy: "+ deepCopyOfHonda.getColors());

        System.out.println("\n");

        Car shallowCopyOfHonda = honda;
        shallowCopyOfHonda.getColors().add("Green");
        System.out.print("Original: "+ honda.getColors());
        System.out.println();
        System.out.print("ShallowCopy: "+ shallowCopyOfHonda.getColors());
    }
}
