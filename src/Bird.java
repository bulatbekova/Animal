public class Bird extends Animal{
    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
