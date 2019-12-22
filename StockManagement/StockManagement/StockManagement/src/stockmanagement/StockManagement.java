/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hacktan
 */
public class StockManagement extends Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        AddProduct adp = new AddProduct();
        DeleteProducts dlp = new DeleteProducts();
        Product urun = new Product();
        SelectProduct slp = new SelectProduct();

        SellProduct sell = new SellProduct();
        Scanner sn = new Scanner(System.in);
        int secim = 0;
        String host = "jdbc:derby://localhost:1527/StokBase";
        String uName = "hacktan";
        String uPass = "1234";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        while (secim != -1) {
            secim = Product.Secenekler();
            switch (secim) {
                case 0: {
                    adp.AddProducts(con);
                    System.out.println("\n");
                    System.out.println("\n");
                    break;
                }
                case 1: {
                    slp.SelectProducts(con);
                    System.out.println("\n");
                    System.out.println("\n");
                    break;

                }
                case 2: {
                    dlp.DeleteProduct(con);
                    System.out.println("\n");
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    sell.stockSell(con);
                    System.out.println("\n");
                    System.out.println("\n");
                    break;
                }
            }

        }

    }

}
