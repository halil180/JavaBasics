public class FindMinandMax {
    public static void main(String[] args) {
        int[] numbers = {12,3123,9123,8,2,46,2,48,231};
        System.out.println(findMinimum(numbers));
        System.out.println(findMax(numbers));
    }

    private static int findMinimum(int[] pNumbers) {
        int min = pNumbers[0];
        //Schleife über alle elemente
        for(int i : pNumbers){
            if(i < min){
                min = i;
            }
        }
        return min;

    }

    private static int findMax(int[] pNumbers) {
        int max = pNumbers[0];
        //Schleife über alle elemente
        for(int i : pNumbers){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
