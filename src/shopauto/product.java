/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopauto;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class product {
    private int product_id,product_price;
    private String product_name,product_brand;
    private Date date;
    

    public product(int product_id, String product_name,int product_price, String product_brand, Date date) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_name = product_name;
        this.product_brand = product_brand;
        this.date = date;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getProduct_price() {
        return product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public Date getDate() {
        return date;
    }
    
    
}
