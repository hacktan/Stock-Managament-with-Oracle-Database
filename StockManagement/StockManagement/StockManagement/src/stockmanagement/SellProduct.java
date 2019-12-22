/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author haktu
 */
public class SellProduct implements StockManagament{

    @Override
    public void DeleteProduct(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SelectProducts(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void AddProducts(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void stockSell(Connection con) {
        System.out.println("Satmak istediğiniz ürünün ID'sini giriniz:");
        Scanner sn = new Scanner(System.in);
        System.out.println("Satışını yapmak istediğiniz ürünün id'sini giriniz:");
        int id = sn.nextInt();
        System.out.println("Satışı Adedini giriniz:");
        int adet = sn.nextInt();
        try {
            
            Statement stmt = con.createStatement();
            String sellSQL = "UPDATE URUNLER SET ADET=ADET - "+adet+" WHERE ID="+id;
            int rs = stmt.executeUpdate(sellSQL);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    
}
