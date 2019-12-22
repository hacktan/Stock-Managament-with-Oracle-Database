/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class SelectProduct extends Product implements StockManagament{

    @Override
    public void stockSell(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddProducts(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteProduct(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SelectProducts(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM URUNLER";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("URUNADI");
                int amount = rs.getInt("ADET");
                int lastUse = rs.getInt("SONKUL");
                int price = rs.getInt("FIYAT");
                String brnd = rs.getString("MARKA");

                System.out.println("Ürün ID:" + id + " Ürünün Adı:" + name + " Ürün Adedi:" + amount + " Ürünün S.K.T.:" + lastUse + " Ürünün Tekil Fiyatı:" + price + " Ürünün Markası:" + brnd);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    
    
    

       
}
