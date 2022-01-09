<h1>FullStackJavaKJH</h1>

문제) 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력하시오.
 - Homework1\Day03\src\SumAverage.java

문제) 객체 지향 방식으로 Animal의 class를 만들고, Animal의 속성을 2가지 지정하고, 메서드도 2가지를 만들고나서, OOP.java에서 객체화 한 다음 하나의 속성을 실행하고 나머지 메서드도 실행하는 코드를 작성하세요.
 - Homework1\Day03\src\Animal.java

과제) Class Nation 을 만들고 나라이름, 면적, 인구수를 멤버 변수로 만들고, 나라이름변경(), 면적변경(), 인구수변경() 메소드를 만드시오. Class Nation 을 상속한 나라를 3개 만들고, 나라별로 특수한 멤버변수 하나와 메소드 하나를 생성하시오. Class Nation 을 나라이름을 private로 지정하고, 면적과 인구수는 public 으로 지정하시오. Class Nation 을 만들고 행성이름을 만들고 static으로 지정하시오.
 - Homework1\Day05\src\NationAssignment.java



<h2>진행 중...</h2>
<h3>Day05</h3>
과제5) 블로그 내용 중에 Time class의 내용을 확인하시오.
과제6) 컴퓨터 부품을 class로 작성하고 컴퓨터 부품을 조합하여 컴퓨터 class를 완성하시오.
과제7) 객체지향 방식으로 로또 번호 추천기를 만드시오.
과제8) 객체지향 방식으로 가위바위보를 하는데 두명의 선수가 무작위로 가위 바위 보를 낸 다음 승부를 출력하시오.
과제9) java.util.Date, java.text.SimpleDateFormat 을 임포트하고 현재 날짜를 2021-12-31 23:59:59 로 출력하시오.
과제10) 축구 - 팀 - 사람 의 구조로 상속 가능한 객체지향 코드를 작성하고, 가위바위보 방식으로 팀별 승리팀을 출력하는 코드를 작성하시오.(승리 조건 및 클래스의 속성/메소드는 자유)

<h3>Day09</h3>
과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를 만드시오. location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화)
과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
main에서 객체를 생서후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)
과제5) 출발지와 도착지를 멤버변수로 만들고, 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
출발날짜와 도착날짜를 getter로 만들고, 02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화)
국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산
국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르
과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는 국제선에 따라서
Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)
과제7) ArrayList에 현재시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(기본)
과제8) ArrayList에 내일시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(심화)
과제9) ArrayList에 1년 이내의 날짜를 random하게 만들어서 입력하고, 현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.(심화)
과제10) 키보드 입력으로 오늘 이후 부터 7일 이내의 날짜를 5개 입력받아 Airplane 객체의 출발날짜로 입력한 Arraylist를 만드시오. 도착날짜는 출발날짜 + 1
3명의 Human 객체 Arraylist를 만들고, 무작위로 speed(7 이내)와 direction(국내선, 국제선 중에 1개의 값)을 세팅하시오.
현재 시간을 기준으로 비행기편과 그 비행기편의 날짜가 사용가능한 Human의 정보를 출력하시오. speed는 1 = 1일로 가정
+ 비행기편은 1년 -> 3일로 변경
+ 입력은 Scanner가 아닌 자동생성코드도 괜찮음