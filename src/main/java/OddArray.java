

import java.util.Scanner;

public class OddArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array you want to enter");
        int number = scanner.nextInt();
        int array[] = new int[number];
        if(number%2==0){
            System.out.printf("Only odd size array is allowed");
        }else{
            System.out.println("Enter the numbers in array");
            for(int i=0; i<number; i++){
                array[i]= scanner.nextInt();
            }
        }
        int middleIndex = ((number+1)/2)-1;
        int checker= 5;
        for(int i=0; i<number; i++){
            if(array[i]>array[middleIndex] || array[i]== array[middleIndex]){
                checker = 1;
            }else if(array[i]<array[middleIndex]){
                checker = 10;
                break;
            }
        }
        System.out.println(checker);
    }
}
