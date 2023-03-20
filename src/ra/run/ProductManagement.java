package ra.run;

import ra.InputMethods;
import ra.bussinessImp.Product;

public class ProductManagement {
    public static Product[] productList = new Product[100];

    public static int size = 0;
    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần\n" +
                    "4. Xóa sản phẩm theo mã sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm\n" +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm\n" +
                    "7. Thoát");

            System.out.print("Nhập chức năng muốn thực thi:  ");
            int option = InputMethods.getInteger();
            switch (option) {
                case 1:
                    inputProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    interestProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    changeStatusProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại");
                    break;
            }
        }
    }
    //1. Nhập số sản phẩm và nhập thông tin sản phẩm
    public static void inputProduct() {
        while (true) {
            System.out.print("Nhập số sản phẩm trong danh sách : ");
            ProductManagement.size = InputMethods.getInteger();
            if (size > 0 && size <= 100) {
                break;
            }else
            System.err.println("Giá trị kích thước danh sách không hợp lệ! Vui lòng thử lại...");
        }
        for (int i = 0; i < size; i++) {
            Product product = new Product();
            product.inputData();
            productList[i] = product;
        }
    }

    //2. Hiển thị thông tin các sản phẩm
    public static void displayProduct(){
        for (int i = 0; i < size; i++) {
            productList[i].displayData();
        }
    }

    //3. Sắp xếp sản phẩm theo lợi nhuận tăng dần
    public static void interestProduct() {
    }

    //4. Xóa sản phẩm theo mã sản phẩm
    public static void deleteProduct() {
    }

    //5. Tìm kiếm sản phẩm theo tên sản phẩm
    public static void searchProduct() {
    }

    //6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm
    public static void changeStatusProduct() {
    }
}
