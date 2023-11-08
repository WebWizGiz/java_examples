package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {   //response request pattern
        //is kurallari buraya yaziyoruz
        if (product.getUnitPrice() < 10) {
            throw new Exception("Urun fiyati 10dan kucuk olamaz");  //hata firlat, hata firlatilirsa operasyon durur
        }

//        ProductDao productDao = new HibernateProductDao();      //interface onu implemente eden sinifin newini yani referansini tutabilir.dolayisiyla bu calisir
        productDao.add(product);                                //HibernateProductDao ve JdbcProductDao'yu interface"e implment ettigimiz icin ayni referansi tutuyorlar

        for (Logger logger : loggers){                  //[db, mail]
            logger.log(product.getName());
        }

    }
}
