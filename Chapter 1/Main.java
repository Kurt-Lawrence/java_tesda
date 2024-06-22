
public class Main {
    
    static int count = 0;

    String name;
    int age;

    void errors(){};

    Main(String name, int age){
        this.name = name;
        this.age = age;

        count++;
    }

    public static void main(String[] args) {

        String greet = "Hello World";
        String greet2 = " Hello World".trim();


        System.out.println(greet.equals(greet2));


    }
    
}
