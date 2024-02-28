package quartaquestao;

public class Billing {
    public void calculatePercentages(double invoicingSP, double invoicingRJ, double invoicingMG, double invoicingES, double othersInvoicing) {
        double totalInvoicing = invoicingSP + invoicingRJ + invoicingMG + invoicingES + othersInvoicing;

        double percentageSP = (invoicingSP / totalInvoicing) * 100;
        double percentageRJ = (invoicingRJ / totalInvoicing) * 100;
        double percentageMG = (invoicingMG / totalInvoicing) * 100;
        double percentageES = (invoicingES / totalInvoicing) * 100;
        double percentageOthers = (othersInvoicing / totalInvoicing) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + percentageSP + "%");
        System.out.println("RJ: " + percentageRJ + "%");
        System.out.println("MG: " + percentageMG + "%");
        System.out.println("ES: " + percentageES + "%");
        System.out.println("Outros: " + percentageOthers + "%");
    }
}
