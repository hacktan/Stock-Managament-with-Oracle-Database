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
 * @author haktu
 */
public class DeleteProducts extends Product implements StockManagament {

    @Override
    public void SelectProducts(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
        System.out.println("Silmek İstediğiniz ürünün ID'sini Giriniz: ");
        int silId = sn.nextInt();
        try {

            Statement stmt = con.createStatement();
            String deleteSQL = "DELETE FROM URUNLER WHERE ID=" + silId;
            int rs = stmt.executeUpdate(deleteSQL);
            System.out.println("Ürün Başarıyla Silindi...");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

}
