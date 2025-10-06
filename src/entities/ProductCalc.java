package entities;

public class ProductCalc {
    private String name;
    private Double total;

    public ProductCalc(Double total) {
        this.total = total;
    }

    public ProductCalc(String name, Double total) {
        this.name = name;
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString(){
        return name + ", " + total;
    }

}
