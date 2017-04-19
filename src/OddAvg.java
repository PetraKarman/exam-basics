// Create a function called `oddAverage` that takes a list of numbers as parameter
// and returns the average value of the odd numbers in the list
// Create basic unit tests for it with at least 3 different test cases

import java.util.ArrayList;

public class OddAvg {
  private ArrayList<Integer> numbers;

  public OddAvg(ArrayList<Integer> numbers) {
    this.numbers = numbers;
  }

  public double oddAverage() {
    int sumOdds = 0;
    int numberOfOdds = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0) {
        numberOfOdds++;
        sumOdds += i;
      }
    }
    double averageOfOdds = sumOdds / (double)numberOfOdds;
    return averageOfOdds;
  }
}
