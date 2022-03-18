package Oops.concept;

public class EvenArray {


    public static void main(String[] args) {
        int Array[] = new int[]{3, 2, 8, 1, 4, 7};
        int totalCount = countNumber(Array);
        System.out.println("the total number of the even " + totalCount);
    }

    public static int countNumber(int[] a) {
        int countNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                countNumber++;
            }
        }
        return countNumber;
    }
}