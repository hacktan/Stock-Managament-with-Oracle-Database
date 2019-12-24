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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haktu
 */
public  class TabloManagement extends StockManagamentMain implements StockManagament{

    
    
    public TabloManagement(Connection con) {
        System.out.println(getjTable1().getColumnCount());
        DefaultTableModel model = (DefaultTableModel) getjTable1().getModel();
        //model.addRow(new Object[]{"Mağaza ID", "Mağaza Adı", "Şehir"});

        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            con = DriverManager.getConnection(host, uName, uPass);
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

            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SelectProducts(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UrunlerTabloGuncelle(Connection con) {
        DefaultTableModel model = (DefaultTableModel) getjTable1().getModel();
        //model.addRow(new Object[]{"Mağaza ID", "Mağaza Adı", "Şehir"});

        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            con = DriverManager.getConnection(host, uName, uPass);
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

            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    
}
