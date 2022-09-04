package Porblem2;

public class DebitCard {
    private String id;
    private CentralDatabase centralDatabase;
    private AmountCalculator amountCalculator;
    private LedScreen ledScreen;
    private ReceiptPrinter receiptPrinter;

    public DebitCard(String id) {
        this.id = id;
        centralDatabase = new CentralDatabase();
        amountCalculator = new AmountCalculator();
        ledScreen = new LedScreen();
        receiptPrinter = new ReceiptPrinter();
    }

    public void withdraw(int amount) {
        centralDatabase.withdraw();
        amountCalculator.debit();
        ledScreen.light();
        receiptPrinter.print(id, amount);
    }
}
