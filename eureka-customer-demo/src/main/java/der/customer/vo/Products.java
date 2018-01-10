package der.customer.vo;

/**
* @FileName:Products
* @Description:
* @Author: Derrick Ye
*/
public class Products {

    private Long id;
    private String productname;
    private String productinfo;
    private int productstock;
    private double productbuyprice;
    private double productsellprice;
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
