// 문제) 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력하시오.

public class SumAverage {
    public static void main(String[] args) {
        int[] score = new int[] { 100, 88, 100, 100, 90 };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + sum / score.length);
    }
}
