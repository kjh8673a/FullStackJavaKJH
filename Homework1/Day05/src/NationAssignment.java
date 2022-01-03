// 과제) Class Nation 을 만들고 나라이름, 면적, 인구수를 멤버 변수로 만들고, 나라이름변경(), 면적변경(), 인구수변경() 메소드를 만드시오.
//     Class Nation 을 상속한 나라를 3개 만들고, 나라별로 특수한 멤버변수 하나와 메소드 하나를 생성하시오.
//     Class Nation 을 나라이름을 private로 지정하고, 면적과 인구수는 public 으로 지정하시오.
//     Class Nation 을 만들고 행성이름을 만들고 static으로 지정하시오.

package src;

public class NationAssignment {
    public static void main(String[] args) {
        Nation nation = new Nation();
        
        France france = new France();
        france.name = "프랑스";
        france.area = 54908700;
        france.population = 65426177;
        france.language = "프랑스어";
        france.show();

        Swiss swiss = new Swiss();
        swiss.name = "스위스";
        swiss.area = 4129039;
        swiss.population = 8715494;
        swiss.phone = 41;
        swiss.show();
        
        Italy italy = new Italy();
        italy.name = "이탈리아";
        italy.area = 30206800;
        italy.population = 60367471;
        italy.capital = "로마";
        italy.show();

    }
}

class Nation {
    private String name;
    public long area;
    public long population;
    static String planet = "Earth";

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public long getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }
}

class France extends Nation {
    String name;
    String language;

    void show() {
        System.out.println("국가명 : " + this.name);
        System.out.println("면적 : " + this.area + "ha");
        System.out.println("인구 : " + this.population + "명");
        System.out.println("언어 : " + this.language);
        System.out.println();
    }
}

class Swiss extends Nation {
    String name;
    int phone;

    void show() {
        System.out.println("국가명 : " + this.name);
        System.out.println("면적 : " + this.area + "ha");
        System.out.println("인구 : " + this.population + "명");
        System.out.println("국제전화코드 : +" + this.phone);
        System.out.println();
    }
}

class Italy extends Nation {
    String name;
    String capital;

    void show() {
        System.out.println("국가명 : " + this.name);
        System.out.println("면적 : " + this.area + "ha");
        System.out.println("인구 : " + this.population + "명");
        System.out.println("수도 : " + this.capital);
        System.out.println();
    }
}