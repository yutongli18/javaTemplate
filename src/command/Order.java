package command;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private int number;
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getNumber() {
        return number;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFoodDir(String foodName, int num) {
        foodDir.put(foodName, num);
    }
}
