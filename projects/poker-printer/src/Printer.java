import java.text.MessageFormat;

public class Printer {

    MessageFormat cardFormatter;

    public void printCard(BaseCard baseCard, Card card){
        Object[] cardArray = {card.getValue(), card.getSuit()};
        cardFormatter = new MessageFormat(baseCard.toString());
        String format = cardFormatter.format(cardArray);
        System.out.print(format);
    }

    public void printTitle(){
        System.out.println(" ♠ ♣ ♥ ♦ Pokerino ♠ ♣ ♥ ♦");
    }
}