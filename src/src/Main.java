public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.computeFactorial();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.computeFibonacci();

        Palindrome palindrome = new Palindrome();
        palindrome.computePalindrome();

        double[] doubleList = {1.0, 6.2, 4.4, 2.8};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(doubleList);

        int[] intList = {1, 5, 8, 10, 14, 26, 33, 46, 88, 100, 120};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.recursiveBinarySearch(intList, 88);

        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.towersOfHanoi();


    }
}