public class Card {
  String color;
  String value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  @Override
  public String toString() {
    return value + " " + color;
  }
}
// Create a Card class, that has a color and a value
// Create a constructor for setting those values
// Card should be represented as string in this format:
// 9 Hearts
// Jack Diamonds