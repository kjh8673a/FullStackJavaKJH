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
