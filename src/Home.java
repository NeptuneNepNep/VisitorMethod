import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Animal> nodeList = new ArrayList<Animal>();

    //添加元素
    public void add(Animal animal) {
        nodeList.add(animal);
    }
    //接收访问者
    public void action(Person person) {
        //遍历集合 让访问者访问每一个元素
        for(Animal animal: nodeList) {
            animal.accept(person);
        }
    }
}
