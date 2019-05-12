public class CanCurrencyHandlerFactory implements CurrencyHandlerFactory{
    private static CanCurrencyHandler myInstance;

    public static CurrencyHandler createCurrencyHandler() {
        // Return a singleton Canadian Currency Handler.
        if (myInstance == null) {
            myInstance = new CanCurrencyHandler();
        }

        return myInstance;
    }
}
