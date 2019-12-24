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
public class AddProduct extends StockManagamentMain implements StockManagament {

    
    
    @Override
    public void UrunlerTabloGuncelle(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
    public void AddProducts(Connection con) {//ürün ekleme kodu
        try {

            Statement stmt = con.createStatement();
            
            String addSQL = "INSERT INTO URUNLER(MAGAZA,BARKOD,URUN_ADI,MARKA,STOK_ADEDI,SONKULLANMATARIHI,ALIS_FIYATI,SATIS_FIYATI) VALUES("  + "," + "'" + getJtfUrunMagaza().getSelectedItem() + "'" + "," + "'" + getJtfUrunBarkod().getText() + "'" + "," + getJtfUrunAdi().getText() + "," + getJtfUrunMarka().getText()+ "," + getJtfUrunAdet().getText()+","+getJtfUrunSonKul().getText()+ "," +getJtfUrunAlisFiyati().getText()+ "," +getJtfUrunSatisFiyati().getText()+ ")";
            System.out.println(getJtfUrunAdi().getText());
            int rs = stmt.executeUpdate(addSQL);
            
            System.out.println("Ürün Başarılıyla Eklendi!");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    

    
    
    
    

}
