public class animal {
    public String name;
    public int age;

    public animal(String name , int age) {
        this.name=name;
        this.age=age;
    }


    public boolean run (int distance , int runPossibilities){
        return distance<runPossibilities;

    }

    public boolean swim (int distance , int swimPossibilities){
        return distance<swimPossibilities;

    }

    public boolean jump (int distance , double jumpPossibilities){
        return distance<jumpPossibilities;

    }

}
class Dog extends animal {
    static private int runPossibilities = 500;
    static private double jumpPossibilities = 0.5;
    static private int swimPossibilities = 10;

    private Dog(String name, int age) {
        super(name, age);

    }

    public static void main(String[] args) {
        Dog dog = new Dog("tuzic", 5);


        System.out.println("Run:" + dog.run(150, runPossibilities));
        System.out.println("Jump:" + dog.jump(5, jumpPossibilities));
        System.out.println("Swim:" + dog.swim(5, swimPossibilities));
    }


    }
class Cat extends animal {
    static private int runPossibilities = 200;
    static private double jumpPossibilities = 2;
    static private int swimPossibilities = 0;
    @Override
    public boolean swim (int distance , int swimPossibilities) {
        return false;
    }
    private Cat(String name, int age) {
        super(name, age);

    }

    public static void main(String[] args) {
       Cat cat = new Cat("Murzik" , 4);
        System.out.println("Run:" + cat.run(150, runPossibilities));
        System.out.println("Jump:" + cat.jump(5, jumpPossibilities));
        System.out.println("Swim:" + cat.swim(5, swimPossibilities));
    }
}