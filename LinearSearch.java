public class LinearSearch {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        if (getLinearSearches(input)) {
            return;
        }
        System.out.println("invalid input");
    }
    private static boolean getLinearSearches(int num) {
        int[] linearSearch = {12, 34, 23, 45, 67, 8, 76, 53, 55, 67, 2, 56, 78, 43, 6};
        for (int i =0; i<linearSearch.length; i++){
            if(linearSearch[i] == num){
                System.out.println("number is exist " + i);
                return true;
            }
        }
        return  false;
    }
}
