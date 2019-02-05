package com.kodilla.hibernate2.invoice.dao;


import com.kodilla.hibernate2.invoice.Invoice;
import com.kodilla.hibernate2.invoice.Item;
import com.kodilla.hibernate2.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private IteamDao iteamDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product potatoes = new Product("potatoes");
        Product tomatoes = new Product("tomatoes");

        Item potatoesItem = new Item(new BigDecimal(10),10,new BigDecimal(100));
        Item tomatoesItem = new Item(new BigDecimal(20),10,new BigDecimal(200));

        Invoice tInvoice1 = new Invoice("12/2019");

        potatoesItem.setProduct(potatoes);
        tomatoesItem.setProduct(tomatoes);

        potatoesItem.setInvoice(tInvoice1);
        tomatoesItem.setInvoice(tInvoice1);

        tInvoice1.getItems().add(potatoesItem);
        tInvoice1.getItems().add(tomatoesItem);

        //When

        productDao.save(potatoes);
        int potatoesID  = potatoes.getId();
        productDao.save(tomatoes);
        int tomatoesId = tomatoes.getId();

        invoiceDao.save(tInvoice1);
        int id = tInvoice1.getId();

        iteamDao.save(potatoesItem);
        int potatoesItemId = potatoesItem.getId();
        iteamDao.save(tomatoesItem);
        int tomatoesItemId = tomatoesItem.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp

        iteamDao.delete(potatoesItemId);
        iteamDao.delete(tomatoesItemId);

        productDao.delete(potatoesID);
        productDao.delete(tomatoesId);

        invoiceDao.delete(id);

    }
}
