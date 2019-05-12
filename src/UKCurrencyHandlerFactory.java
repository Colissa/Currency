public class UKCurrencyHandlerFactory implements CurrencyHandlerFactory{
    private static UKCurrencyHandler myInstance;

    public static CurrencyHandler createCurrencyHandler() {
        // Return a singleton UK Currency Handler.
        if (myInstance == null) {
            myInstance = new UKCurrencyHandler();
        }

        return myInstance;
    }

}