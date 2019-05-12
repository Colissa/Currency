public class SalesOrder {
    public void process() {
        CurrencyHandler ch = CurrencyHandlerFactory.createCurrencyHandler();
        ch.displayPrice();
        ch.convertPrice();
    }
}
