package entities;

public class ProductCalc extends Product{
    private Double total;

    public ProductCalc(Double total) {
        this.total = total;
    }

    public ProductCalc(String name, Double total) {
        super(name);
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void calcTotal(){
        this.total = super.getValue() * super.getQuantity();
    }

}
