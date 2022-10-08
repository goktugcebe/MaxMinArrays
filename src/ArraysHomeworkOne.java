import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysHomeworkOne {

    public static void main(String[] args) {
    sortingArray();
    }

   static void sortingArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz");
        int boyut=scanner.nextInt();
        System.out.println("Dizi icin sayilari giriniz: ");
       int[] list= new int[boyut];
        for(int i=0;i<boyut;i++){
           list[i] =scanner.nextInt();
        }
       System.out.println("Siraya konmadan onceki hali: "+Arrays.toString(list));
        Arrays.sort(list);
       System.out.println("Siraya konduktan sonraki hali: "+Arrays.toString(list));
    }
}
