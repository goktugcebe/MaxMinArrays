import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArrays {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));
        int min = list[0];
        int max = list[0];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        for (int i : list) {
            if (i<number) {
                min = i;
            }
            if (i>number) {
                max = i;
                break;
            }
        }
        System.out.println("Min Value " + min);
        System.out.println("Max Value " + max);
    }
}
