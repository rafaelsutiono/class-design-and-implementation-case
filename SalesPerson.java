public class SalesPerson {
    private String id;
    private Sales[] salesHistory;
    private int count;

    public SalesPerson(String id) {
        this.id = id;
        this.salesHistory = new Sales[100];
        this.count = 0;
    }

    public SalesPerson(String id, Sales[] s, int c) {
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count++;
    }

    public double calcTotalSales() {
        double totalSales = 0.0;
        for (int i = 0; i < count; i++) {
            totalSales += salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return totalSales;
    }

    public Sales largestSale() {
        Sales largest = null;
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (salesHistory[i].getValue() > maxValue) {
                maxValue = salesHistory[i].getValue();
                largest = salesHistory[i];
            }
        }
        return largest;
    }
}