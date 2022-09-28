public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",21234,3);

        //        product.setId(24135);   böyle de yapılabilir yapmak için public Product(int id, String name, String description, double price,int stockAmount) Product.java içindeki parantez içlerindeki silinmeli
//        product.setDescription("Asus Laptop");
//        product.setName("Laptop");
//        product.setStockAmount(3);
//        product.setPrice(21234);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Description(product);


    }
}

//Java Dersi 34 Constructor ile çalışmak -->