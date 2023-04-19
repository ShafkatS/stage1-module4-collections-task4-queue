package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
       Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.add(queue.poll());
            }
            list.add(queue.poll());
        }
        System.out.println(list);
        return list;
    }
}
