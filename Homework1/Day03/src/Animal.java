public class Animal {
    public static void main(String[] args) {
        Animaloop dog = new Animaloop();
        dog.name = "Bob";
        dog.age = 2;
        dog.weight = 10;
        
        dog.year();
        System.out.println(dog.age);
        dog.eat();
        System.out.println(dog.weight);
        
    }
}

class Animaloop {
    String name;
    int age;

    int weight;

    void year() {
        age++;
    }

    void eat() {
        weight++;
    }
}



