package Week03.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class CoinChanger {
    private int ten, twenty, fifty, oneDollar, twoDollar;

    public CoinChanger(int ten, int twenty, int fifty, int oneDollar, int twoDollar) {
        this.ten = ten;
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneDollar = oneDollar;
        this.twoDollar = twoDollar;
    }

    public int getTen() {
        return ten;
    }

    public int getTwenty() {
        return twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public int getOneDollar() {
        return oneDollar;
    }

    public int getTwoDollar() {
        return twoDollar;
    }

    public int computeChange() {
        int totalCents = 0;
        return totalCents = getTen() * 10 + getTwenty() * 20 + getFifty() * 50 + getOneDollar() * 100 + getTwoDollar() * 200;
    }

    public int dollars( ) {
        return computeChange() / 100;
    }

    public int cents() {
        return computeChange() % 100;
    }

    @Override
    public String toString() {
        return "The total value of the coin collection is: $" + dollars() + "." + cents();
    }
}
