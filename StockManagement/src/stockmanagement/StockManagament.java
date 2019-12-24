/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;

/**
 *
 * @author haktu
 */
public interface StockManagament {
    public void stockSell(Connection con);
    public void AddProducts(Connection con);
    public void DeleteProduct(Connection con);
    public void SelectProducts(Connection con);
    public void UrunlerTabloGuncelle(Connection con);
    
}
