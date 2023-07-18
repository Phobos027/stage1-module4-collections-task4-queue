package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        List<Integer> eatingOrder = new ArrayList<>();
        int i = 1;
        while (!dishes.isEmpty()){
            int dish = dishes.poll();
            if (i % everyDishNumberToEat == 0){
                eatingOrder.add(dish);
            } else dishes.add(dish);
            i++;
        }
        return eatingOrder;
    }
}
