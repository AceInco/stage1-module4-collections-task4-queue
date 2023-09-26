package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            linkedList.addLast(i);
        }
        int i = everyDishNumberToEat - 1;
        while(list.size() != numberOfDishes){
            list.add(linkedList.remove(i));
            i += everyDishNumberToEat - 1;
            if(i >= linkedList.size()){
                i -= linkedList.size();
            }
            if(list.size() == numberOfDishes - 1){
                list.add(linkedList.remove());
            }
        }
        return list;
    }
}
