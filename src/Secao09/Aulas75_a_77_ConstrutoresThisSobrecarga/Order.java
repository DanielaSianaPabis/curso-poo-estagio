package Secao09.Aulas75_a_77_ConstrutoresThisSobrecarga;

import java.util.Date;
public class Order {
    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}
