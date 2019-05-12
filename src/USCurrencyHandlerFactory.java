public class USCurrencyHandlerFactory implements CurrencyHandlerFactory {
    private static USCurrencyHandler myInstance;

    public static CurrencyHandler createCurrencyHandler() {
        // Return a singleton US Currency Handler.
        if (myInstance == null) {
            myInstance = new USCurrencyHandler();
        }

        return myInstance;
    }
}
