public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Lion simba = new Lion("Simba",16);

        System.out.println(simba.getName());
        
    }
    

}

class Lion extends Animal{

    public Lion(String name, int age) {
        super(name, age);
    }

    int numClaws = 8;

}