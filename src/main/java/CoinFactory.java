public class CoinFactory {
    public static ILS getCoinInstance(Coins coin){
        switch (coin){
            case ILS:
                return new ILS();
        }
        return null;
    }
}
