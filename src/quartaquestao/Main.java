package quartaquestao;

public class Main {
    public static void main(String[] args) {
        double invoicingSP = 67836.43;
        double invoicingRJ = 36678.66;
        double invoicingMG = 29229.88;
        double invoicingES = 27165.48;
        double othersInvoicing = 19849.53;

        Billing billing = new Billing();

        billing.calculatePercentages(invoicingSP, invoicingRJ, invoicingMG, invoicingES, othersInvoicing);
    }
}
