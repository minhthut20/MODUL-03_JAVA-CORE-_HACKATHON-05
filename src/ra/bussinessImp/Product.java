package ra.bussinessImp;

import ra.InputMethods;
import ra.bussiness.IProduct;

public class Product implements IProduct, Comparable<Product>{

    private int productid;

    private String productName;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private Boolean productStatus;

    public Product() {
    }

    public Product(int productid, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, Boolean productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest() {
        this.interest = this.exportPrice-this.importPrice;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }


    @Override
    public void inputData() {
        System.out.println("---------------SP---------------");
        System.out.print("Nhập mã sản phẩm : ");
        setProductid(InputMethods.getInteger());
        System.out.print("Nhập tên sản phẩm : ");
        setProductName(InputMethods.getString());
        System.out.print("NHập tiêu đề sản phẩm : ");
        setTitle(InputMethods.getString());
        System.out.print("Mô tả sản phẩm : ");
        setDescriptions(InputMethods.getString());
        System.out.print("Giá nhập hàng : ");
        setImportPrice(InputMethods.getFloat());
        System.out.print("Giá xuất hàng : ");
        setExportPrice(InputMethods.getFloat());
        System.out.print("Trạng thái của sản phẩm : ");
        setProductStatus(InputMethods.getBoolean());
        setInterest();
    }

    @Override
    public void displayData() {
        System.out.println("---------------Thông tin sản phẩm ---------------");
        System.out.println("Mã sản phẩm : " + getProductid());
        System.out.println("Tên sản phẩm : " + getProductName());
        System.out.println("Tiêu đè sản phẩm : " + getTitle());
        System.out.println("Mô tả sản phẩm : " + getDescriptions());
        System.out.println("Giá nhập hàng : " + getImportPrice());
        System.out.println("Giá xuất hàng : " + getExportPrice());
        System.out.println("Trạng thái sản phẩm : " + (getProductStatus()? "còn hàng":"hết hàng"));
        System.out.println("Lợi nhuận : " + getInterest());
        System.out.println("--------------------------------------------------");
    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.getInterest() - product.getInterest());
    }
}

