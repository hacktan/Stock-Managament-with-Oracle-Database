/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haktu
 */
public class DeleteProducts extends StockManagamentMain implements StockManagament {

    @Override
    public void UrunlerTabloGuncelle(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteProduct(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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

    public void urunlerTablo() {
        DefaultTableModel model = (DefaultTableModel) getjTable1().getModel();
        

        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM URUNLER";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String magaza = rs.getString("MAGAZA");
                int barkod = rs.getInt("BARKOD");
                String name = rs.getString("URUN_ADI");
                String marka = rs.getString("MARKA");
                int stokAdedi = rs.getInt("STOK_ADEDI");
                int sonKul = rs.getInt("SONKULLANMATARIHI");
                int alisFiyati = rs.getInt("ALIS_FIYATI");
                int satisFiyati = rs.getInt("SATIS_FIYATI");

                model.addRow(new Object[]{id, name, magaza, marka, stokAdedi, alisFiyati, satisFiyati, sonKul, barkod});
                setjTable1(getjTable1());
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    
    public void DeleteMagaza(Connection con, int id) {
        DefaultTableModel model = (DefaultTableModel) getjTable2().getModel();
        int silId = id;
        try {

            Statement stmt = con.createStatement();
            String deleteSQL = "DELETE FROM MAGAZALAR WHERE MAGAZA_KODU=" + silId;
            int rs = stmt.executeUpdate(deleteSQL);
            System.out.println("Mağaza Başarıyla Silindi...");

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public void DeleteUrun(Connection con, int id) {
        System.out.println("Silmek İstediğiniz ürünün ID'sini Giriniz: ");
        DefaultTableModel model = (DefaultTableModel) getjTable1().getModel();
        int silId = id;
        try {

            Statement stmt = con.createStatement();
            String deleteSQL = "DELETE FROM URUNLER WHERE ID=" + silId;
            int rs = stmt.executeUpdate(deleteSQL);
            System.out.println("Ürün Başarıyla Silindi...");

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public void DeleteCalisan(Connection con, int id) {
        System.out.println("Silmek İstediğiniz ürünün ID'sini Giriniz: ");
        DefaultTableModel model = (DefaultTableModel) getjTable3().getModel();
        int silId = id;
        try {

            Statement stmt = con.createStatement();
            String deleteSQL = "DELETE FROM CALISANLAR WHERE ID=" + silId;
            int rs = stmt.executeUpdate(deleteSQL);
            System.out.println("Çalışan Başarıyla Silindi...");

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

}
