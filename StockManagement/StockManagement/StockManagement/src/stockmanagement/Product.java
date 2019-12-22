/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.util.Scanner;

/**
 *
 * @author Hacktan
 */
public class Product {

    private int id, perPrice, amount, ExpDate;
    public int k = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    private String name, variety;

    public Scanner sn = new Scanner(System.in);

    public Product() { //Constructor

    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(int perPrice) {
        this.perPrice = perPrice;
    }

    static int Secenekler() {
        int id;
        Scanner scan = new Scanner(System.in);
        System.out.println("[0] Ürün Ekle");
        System.out.println("[1] Ürün Listele");
        System.out.println("[2] Ürün Sil");
        System.out.println("[3] Stoktan Ürün Sat");
        id = scan.nextInt();
        return id;
    }

    public int getExpDate() {
        return ExpDate;
    }

    public void setExpDate(int ExpDate) {
        this.ExpDate = ExpDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
