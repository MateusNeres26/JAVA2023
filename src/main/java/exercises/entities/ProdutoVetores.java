package exercises.entities;

public class ProdutoVetores {
    private String name;
    private double price;
    private int num;
    private int idade;
    private double altura;

    public ProdutoVetores(int num) {
        this.num = num;
    }

    public ProdutoVetores(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
