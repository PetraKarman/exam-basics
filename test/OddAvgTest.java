import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OddAvgTest {
  @Test
  public void testOddAverage() throws Exception {
    ArrayList<Integer> testArray = new ArrayList<>();
    testArray.add(5);
    testArray.add(6);
    testArray.add(5);
    OddAvg a = new OddAvg(testArray);
    assertEquals(5, a.oddAverage());
  }

 /* @Test
  public void testSumElementsOneElement() throws Exception {
    ArrayList<Integer> testArray = new ArrayList<>();
    testArray.add(5);
    Sum a = new Sum(testArray);
    assertEquals(5, a.sumElements());
  }

  @Test
  public void testSumElementsEmpty() throws Exception {
    ArrayList<Integer> testArray = new ArrayList<>();
    Sum a = new Sum(testArray);
    assertEquals(0, a.sumElements());
  }

  @Test
  public void testSumElementsNull() throws Exception {
    Sum a = new Sum(null);
    assertEquals(0, a.sumElements());
  }*/
}