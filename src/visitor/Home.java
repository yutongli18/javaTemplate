package visitor;

import java.util.ArrayList;
import java.util.List;

// 对象结构类
public class Home {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : animals) {
            animal.accept(person);
        }
    }
}
