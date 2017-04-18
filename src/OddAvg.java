// Create a function called `oddAverage` that takes a list of numbers as parameter
// and returns the average value of the odd numbers in the list
// Create basic unit tests for it with at least 3 different test cases

public class OddAvg {
  public static void main(String[] args) {
    int[] myList = {1, 2, 3, 4, 5, 9};
    System.out.println(oddAverage(myList));
  }

  public static double oddAverage(int[] numberList) {
    double sumOdds = 0;
    double numberOfOdds = 0;
    for (Integer x : numberList) {
      if (x % 2 != 0) {
        numberOfOdds++;
        sumOdds += x;
      }
    }
    double averageOfOdd = sumOdds / numberOfOdds;
    return averageOfOdd;
  }
}