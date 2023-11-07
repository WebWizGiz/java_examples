package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    public void add(Product product) throws Exception {   //response request pattern
        //is kurallari buraya yaziyoruz
        if (product.getUnitPrice()<10){
            throw new Exception("Urun fiyati 10dan kucuk olamaz");
        }

        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
    }
}
