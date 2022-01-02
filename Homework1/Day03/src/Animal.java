// 문제) 객체 지향 방식으로 Animal의 class를 만들고, Animal의 속성을 2가지 지정하고, 메서드도 2가지를 만들고나서, 
//     OOP.java에서 객체화 한 다음 하나의 속성을 실행하고 나머지 메서드도 실행하는 코드를 작성하세요.

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



