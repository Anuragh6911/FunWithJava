public class SumOfOddAndEven {
    public static Integer sumCalculator(int a[]){
         int evenSum = 0;
         int oddSum = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]%2==0){
                evenSum = evenSum +a[i];
            }else{
                oddSum = oddSum+a[i];
            }
        }
        return oddSum-evenSum;
    }

    public static void main(String[] args) {
        System.out.println(sumCalculator(new int[]{}));
    }
}
