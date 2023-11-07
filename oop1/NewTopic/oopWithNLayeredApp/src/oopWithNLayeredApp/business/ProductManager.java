package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception {   //response request pattern
        //is kurallari buraya yaziyoruz
        if (product.getUnitPrice() < 10) {
            throw new Exception("Urun fiyati 10dan kucuk olamaz");  //hata firlat, hata firlatilirsa operasyon durur
        }

//        ProductDao productDao = new HibernateProductDao();      //interface onu implemente eden sinifin newini yani referansini tutabilir.dolayisiyla bu calisir
        productDao.add(product);                                //HibernateProductDao ve JdbcProductDao'yu interface"e implment ettigimiz icin ayni referansi tutuyorlar
    }
}
