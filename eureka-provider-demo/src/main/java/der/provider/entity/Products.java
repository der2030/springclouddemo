package der.provider.entity;

import javax.persistence.*;

/**
* @FileName:Products
* @Description:
* @Author: Derrick Ye
*/
@Entity
@Table(name="gitdemo_products")
public class Products {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="product_name")
    private String productname;
    @Column(name="product_info")
    private String productinfo;
    @Column(name="product_stock")
    private int productstock;
    @Column(name="product_buyprice")
    private double productbuyprice;
    @Column(name = "product_sellprice")
    private double productsellprice;
    @Column(name="product_discount")
    private double productdiscount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo;
    }

    public int getProductstock() {
        return productstock;
    }

    public void setProductstock(int productstock) {
        this.productstock = productstock;
    }

    public double getProductbuyprice() {
        return productbuyprice;
    }

    public void setProductbuyprice(double productbuyprice) {
        this.productbuyprice = productbuyprice;
    }

    public double getProductsellprice() {
        return productsellprice;
    }

    public void setProductsellprice(double productsellprice) {
        this.productsellprice = productsellprice;
    }

    public double getProductdiscount() {
        return productdiscount;
    }

    public void setProductdiscount(double productdiscount) {
        this.productdiscount = productdiscount;
    }
}
