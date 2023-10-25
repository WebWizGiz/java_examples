public class Main_2 {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Aus Laptop", 3000, 6);






        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
