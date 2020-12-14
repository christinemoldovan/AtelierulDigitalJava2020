package Lab5.Challenge1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exchange");
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron ronValue = new Ron(20);
        EURO euroValue = new EURO(5);
        USD usdValue = new USD(6);


        USD newValue = exchangeDesk.exchange(ronValue,USD.class,(float)2.4);
        System.out.println("Exchanged result="
                +newValue.getValue());

        EURO newRonValue = exchangeDesk.exchange(ronValue,EURO.class,(float)(1/4.8));
        System.out.println("Exchanged result="
                +newRonValue.getValue());

        EURO newEuroValue = exchangeDesk.exchange(usdValue,EURO.class,(float)(1/1.3));
        System.out.println("Exchanged result="
                +newEuroValue.getValue());
    }
}
