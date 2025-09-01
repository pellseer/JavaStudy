package chapter5.card;

public class Card {
    private static int serialNumber = 10000;
    private int cardNumber;

    public Card(){
        serialNumber++;
        cardNumber = serialNumber;
    }

    public int getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
}
