/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hacktan
 */
public class AddProduct extends Product implements StockManagament {

    @Override
    public void SelectProducts(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteProduct(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stockSell(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddProducts(Connection con) {
        setId(k);
        k++;
        System.out.println("Ürünün Markasını Giriniz: ");
        setName(sn.nextLine());

        System.out.println("Ürünün Türünü Giriniz: ");
        setVariety(sn.nextLine());

        System.out.println("Ürünün Tekil Fiyatını Giriniz: ");
        setPerPrice((sn.nextInt()));

        System.out.println("Ürünün Son Kullanma Tarihini Giriniz: ");
        setExpDate(sn.nextInt());

        System.out.println("Stok Adedi Giriniz: ");
        setAmount(sn.nextInt());

        System.out.println("Ürün Başarılıyla Eklendi!");

        try {

            Statement stmt = con.createStatement();
            String addSQL = "INSERT INTO URUNLER VALUES(" + getId() + "," + "'" + getVariety() + "'" + "," + "'" + getName() + "'" + "," + getAmount() + "," + getExpDate() + "," + getPerPrice() + ")";
            int rs = stmt.executeUpdate(addSQL);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

}
