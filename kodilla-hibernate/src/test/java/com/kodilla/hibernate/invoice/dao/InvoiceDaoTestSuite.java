package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("PC");
        Product product2 = new Product("Laptop");
        Item item1 = new Item(1, new BigDecimal(2000), new BigDecimal(2500));
        Item item2 = new Item(2, new BigDecimal(1500), new BigDecimal(2000));
        Item item3 = new Item(4, new BigDecimal(3000), new BigDecimal(3500));
        Invoice invoice1 = new Invoice("21");
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        productDao.save(product1);
        productDao.save(product2);
        int id1 = product1.getId();
        int id2 = product2.getId();
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int id1_item = item1.getId();
        int id2_item = item2.getId();
        int id3_item = item3.getId();
        int id_inv = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id1);
        Assert.assertNotEquals(0, id2);
        Assert.assertNotEquals(0, id1_item);
        Assert.assertNotEquals(0, id2_item);
        Assert.assertNotEquals(0, id3_item);
        Assert.assertNotEquals(0, id_inv);


    }
}
