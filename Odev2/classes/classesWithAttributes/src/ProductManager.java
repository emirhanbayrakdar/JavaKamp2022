public class ProductManager {

    //
    public void Add(Product product){
        System.out.println("Ürün eklendi: " + product.getName());

    }
    public void Description(Product product){
        System.out.println("Ürün açıklaması : " + product.getDescription());
    }


}
