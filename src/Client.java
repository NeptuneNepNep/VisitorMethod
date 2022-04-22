public class Client {
    public static void main(String[] args) {
        //创建home
        Home home = new Home();
        //添加元素
        home.add(new Dog());
        home.add(new Cat());
        home.add(new Cat());
        Owner owner = new Owner();
        home.action(owner);
    }
}
