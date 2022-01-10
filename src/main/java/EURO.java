public abstract class EURO extends Coin {
    private final double value = 4.23;

    @Override
    public double getValue() { return value;}

    @Override
    public double calculate(double input) { return 10 * getValue();}

}
