import java.util.*;

public class Deck {

  List<Card> cardList = new ArrayList<>();
  String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
  String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

  public Deck(int numberOfCards) {
    fillDeck(numberOfCards);
  }

  private void fillDeck(int n) {
    Random random = new Random();
    int firstNum = random.nextInt(4);
    for (int i = firstNum; i < n + firstNum; i++) {
      cardList.add(new Card(colors[i % 4], values[random.nextInt(13)]));
    }
  }

  public void shuffle() {
    Collections.shuffle(cardList);
  }

  public Card draw() {
    return cardList.remove(cardList.size() - 1);
  }

  private int sumColors(String color) {
    int sum = 0;
    for (Card x : cardList) {
      if (x.color.equals(color)) {
        sum++;
      }
    }
    return sum;
  }

  @Override
  public String toString() {
    return cardList.size() + " - " + sumColors("Clubs") + " Clubs " + sumColors("Diamonds") + " Diamonds " +
            sumColors("Hearts") + " Hearts " + sumColors("Spades") + " Spades ";
  }

}

// Create a Deck class, that has a list of cards in it
// Create a constructor that takes a whole number as parameter
// The constructor should fill the list with the number of different cards using at least 4 different colors
// (except if the number given is smaller than four, than all cards should have different colors)
// We should be able to shuffle the deck, which randomly orders the cards
// We should be able to draw the top card which returns the drawn card and also removes it from the deck
// Deck should be represented as string in this format:
// 12 cards -  3 Clubs, 3 Diamonds, 3 Hearts, 3 Spades
