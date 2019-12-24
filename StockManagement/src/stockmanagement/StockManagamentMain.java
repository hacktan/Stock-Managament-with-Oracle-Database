/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.io.BufferedWriter;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author haktu
 */
public class StockManagamentMain extends javax.swing.JFrame {

    /**
     * Creates new form StockManagamentMain
     */
    public StockManagamentMain() {
        initComponents();
        magazaTabloGetir();
        urunlerTabloGetir();
        calisanlarTabloGetir();
        comboMagazalar();
    }

    public void magazaTabloGetir() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM MAGAZALAR";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("MAGAZA_ADI");
                String sehir = rs.getString("MAGAZA_SEHIR");
                int kod = rs.getInt("MAGAZA_KODU");
                model.addRow(new Object[]{id, name, sehir, kod});
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public void comboMagazalar() {
        try {
            jtfUrunMagaza.removeAllItems();
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            Statement stmt = con.createStatement();

            String SQL = "SELECT DISTINCT MAGAZA_ADI FROM MAGAZALAR";

            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                jtfUrunMagaza.addItem(rs.getString("MAGAZA_ADI"));
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public JTextField getJtfUrunID() {
        return jtfUrunID;
    }

    public void setJtfUrunID(JTextField jtfUrunID) {
        this.jtfUrunID = jtfUrunID;
    }

    public void urunlerTabloGetir() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

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

            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }

    public JTable getjTable3() {
        return jTable3;
    }

    public void setjTable3(JTable jTable3) {
        this.jTable3 = jTable3;
    }

    public void calisanlarTabloGetir() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM CALISANLAR";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String magaza = rs.getString("MAGAZASI");
                String name = rs.getString("ADI");
                String surname = rs.getString("SOYADI");
                int maas = rs.getInt("MAAS");
                model.addRow(new Object[]{id, name, surname, magaza, maas});
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jtfMagazaID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtfMagazaSehir = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfMagazaKodu = new javax.swing.JTextField();
        btnMagazaEkle = new javax.swing.JButton();
        btnMagazaDuzenle = new javax.swing.JButton();
        btnMagazaSil = new javax.swing.JButton();
        btnMagazaTemizle = new javax.swing.JButton();
        jtfMagazaAdi = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfUrunAdi = new javax.swing.JTextField();
        jtfUrunMarka = new javax.swing.JTextField();
        jtfUrunAdet = new javax.swing.JTextField();
        jtfUrunSonKul = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfUrunAlisFiyati = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfUrunSatisFiyati = new javax.swing.JTextField();
        jtfUrunBarkod = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnUrunEkle = new javax.swing.JButton();
        btnUrunDuzenle = new javax.swing.JButton();
        btnUrunSil = new javax.swing.JButton();
        btnUrunTemizle = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jtfUrunMagaza = new javax.swing.JComboBox<>();
        jtfUrunID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jtfCalisanID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtfCalisanSoyadi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtfCalisanMagazasi = new javax.swing.JTextField();
        btnCalisanEkle = new javax.swing.JButton();
        btnCalisanDuzenle = new javax.swing.JButton();
        btnCalisanSil = new javax.swing.JButton();
        btnCalisanTemizle = new javax.swing.JButton();
        jtfMaas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtfCalisanAdi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Programı");
        setResizable(false);

        jTabbedPane1.setToolTipText("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mağaza"));
        jPanel3.setToolTipText("Magaza");

        jLabel14.setText("Mağaza ID");

        jLabel15.setText("Şehir");

        jLabel16.setText("Şube Kodu");

        btnMagazaEkle.setText("Ekle");
        btnMagazaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagazaEkleActionPerformed(evt);
            }
        });

        btnMagazaDuzenle.setText("Duzenle");
        btnMagazaDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagazaDuzenleActionPerformed(evt);
            }
        });

        btnMagazaSil.setText("Sil");
        btnMagazaSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMagazaSilMouseClicked(evt);
            }
        });
        btnMagazaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagazaSilActionPerformed(evt);
            }
        });

        btnMagazaTemizle.setText("Temizle");
        btnMagazaTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagazaTemizleActionPerformed(evt);
            }
        });

        jLabel25.setText("Mağaza Adı");

        jButton1.setText("Dosyala");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMagazaEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMagazaDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMagazaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMagazaTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMagazaKodu)
                            .addComponent(jtfMagazaSehir)
                            .addComponent(jtfMagazaID)
                            .addComponent(jtfMagazaAdi))))
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMagazaDuzenle, btnMagazaEkle, btnMagazaSil, btnMagazaTemizle});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMagazaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMagazaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMagazaSehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMagazaKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMagazaEkle)
                    .addComponent(btnMagazaDuzenle)
                    .addComponent(btnMagazaTemizle)
                    .addComponent(btnMagazaSil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMagazaDuzenle, btnMagazaEkle, btnMagazaSil, btnMagazaTemizle});

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mağaza ID", "Mağaza Adı", "Mağaza İli", "Şube Kodu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Stok Takip Programı by Hacktan");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Magaza");

        jTabbedPane1.addTab("Mağazalar", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün"));

        jLabel5.setText("Ürün Adı");

        jLabel6.setText("Marka");

        jLabel7.setText("Stok Adedi");

        jLabel8.setText("S.K.T.");

        jLabel9.setText("Alış Fiyatı (₺)");

        jtfUrunAlisFiyati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUrunAlisFiyatiActionPerformed(evt);
            }
        });

        jLabel10.setText("Satış Fiyatı (₺)");

        jtfUrunSatisFiyati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUrunSatisFiyatiActionPerformed(evt);
            }
        });

        jtfUrunBarkod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUrunBarkodActionPerformed(evt);
            }
        });

        jLabel11.setText("Barkod");

        btnUrunEkle.setText("Ekle");
        btnUrunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunEkleActionPerformed(evt);
            }
        });

        btnUrunDuzenle.setText("Duzenle");
        btnUrunDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunDuzenleActionPerformed(evt);
            }
        });

        btnUrunSil.setText("Sil");
        btnUrunSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUrunSilMouseClicked(evt);
            }
        });
        btnUrunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunSilActionPerformed(evt);
            }
        });

        btnUrunTemizle.setText("Temizle");
        btnUrunTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunTemizleActionPerformed(evt);
            }
        });

        jLabel13.setText("Mağaza");

        jtfUrunMagaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Ürün ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnUrunEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUrunDuzenle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUrunSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUrunTemizle))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfUrunSatisFiyati)
                            .addComponent(jtfUrunAlisFiyati)
                            .addComponent(jtfUrunSonKul)
                            .addComponent(jtfUrunAdet)
                            .addComponent(jtfUrunMarka)
                            .addComponent(jtfUrunAdi)
                            .addComponent(jtfUrunBarkod)
                            .addComponent(jtfUrunMagaza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfUrunID))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUrunDuzenle, btnUrunEkle, btnUrunSil, btnUrunTemizle});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtfUrunMagaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunBarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunSonKul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunAlisFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUrunSatisFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUrunEkle)
                    .addComponent(btnUrunDuzenle)
                    .addComponent(btnUrunTemizle)
                    .addComponent(btnUrunSil))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ürün Adı", "Mağazası", "Marka", "Stok Adedi", "Alış Fiyatı", "Satış Fiyatı", "Son Kullanma Tarihi", "Barkod"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Stok Takip Programı by Hacktan");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ürünler", jPanel2);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Çalışan"));
        jPanel6.setToolTipText("Magaza");

        jLabel18.setText("ID");

        jtfCalisanID.setEditable(false);

        jLabel19.setText("Soyadı");

        jLabel20.setText("Çalıştığı Mağaza");

        btnCalisanEkle.setText("Ekle");
        btnCalisanEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalisanEkleActionPerformed(evt);
            }
        });

        btnCalisanDuzenle.setText("Duzenle");
        btnCalisanDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalisanDuzenleActionPerformed(evt);
            }
        });

        btnCalisanSil.setText("Sil");
        btnCalisanSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalisanSilActionPerformed(evt);
            }
        });

        btnCalisanTemizle.setText("Temizle");
        btnCalisanTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalisanTemizleActionPerformed(evt);
            }
        });

        jLabel21.setText("Aylık Maaşı (₺)");

        jLabel24.setText("Adı");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnCalisanEkle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalisanDuzenle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalisanSil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalisanTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCalisanMagazasi)
                            .addComponent(jtfCalisanSoyadi)
                            .addComponent(jtfCalisanID)
                            .addComponent(jtfMaas)
                            .addComponent(jtfCalisanAdi))))
                .addGap(22, 22, 22))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCalisanDuzenle, btnCalisanEkle, btnCalisanSil, btnCalisanTemizle});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCalisanID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCalisanAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCalisanSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCalisanMagazasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalisanEkle)
                    .addComponent(btnCalisanDuzenle)
                    .addComponent(btnCalisanTemizle)
                    .addComponent(btnCalisanSil))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Adı", "Soyadı", "Mağaza", "Maaş"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Stok Takip Programı by Hacktan");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(108, 108, 108))
        );

        jTabbedPane1.addTab("Çalışanlar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:

        int row = jTable3.getSelectedRow();
        String id = jTable3.getModel().getValueAt(row, 0).toString();
        String adi = jTable3.getModel().getValueAt(row, 1).toString();
        String soyadi = jTable3.getModel().getValueAt(row, 2).toString();
        String magazasi = jTable3.getModel().getValueAt(row, 3).toString();
        String maas = jTable3.getModel().getValueAt(row, 4).toString();

        jtfCalisanID.setText(id);
        jtfCalisanAdi.setText(adi);
        jtfCalisanSoyadi.setText(soyadi);
        jtfCalisanMagazasi.setText(magazasi);
        jtfMaas.setText(maas);

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();

        String id = jTable2.getModel().getValueAt(row, 0).toString();
        String adi = jTable2.getModel().getValueAt(row, 1).toString();
        String sehir = jTable2.getModel().getValueAt(row, 2).toString();
        String kod = jTable2.getModel().getValueAt(row, 3).toString();

        jtfMagazaID.setText(id);
        jtfMagazaAdi.setText(adi);
        jtfMagazaSehir.setText(sehir);
        jtfMagazaKodu.setText(kod);

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();

        String id = jTable1.getModel().getValueAt(row, 0).toString();
        String barkod = jTable1.getModel().getValueAt(row, 8).toString();
        String urunAdi = jTable1.getModel().getValueAt(row, 1).toString();
        String marka = jTable1.getModel().getValueAt(row, 3).toString();
        String stokAdedi = jTable1.getModel().getValueAt(row, 4).toString();
        String sonKul = jTable1.getModel().getValueAt(row, 7).toString();
        String alisFiyati = jTable1.getModel().getValueAt(row, 5).toString();
        String satisFiyati = jTable1.getModel().getValueAt(row, 6).toString();

        jtfUrunID.setText(id);
        jtfUrunAdi.setText(urunAdi);
        jtfUrunAdet.setText(stokAdedi);
        jtfUrunAlisFiyati.setText(alisFiyati);
        jtfUrunBarkod.setText(barkod);
        jtfUrunMarka.setText(marka);
        jtfUrunSatisFiyati.setText(satisFiyati);
        jtfUrunSonKul.setText(sonKul);


    }//GEN-LAST:event_jTable1MouseClicked

    private void jtfUrunAlisFiyatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUrunAlisFiyatiActionPerformed
        // TODO add your handling code her
    }//GEN-LAST:event_jtfUrunAlisFiyatiActionPerformed

    private void btnMagazaSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMagazaSilMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnMagazaSilMouseClicked

    public JTextField getJtfMagazaKodu() {
        return jtfMagazaKodu;
    }

    public void setJtfMagazaKodu(JTextField jtfMagazaKodu) {
        this.jtfMagazaKodu = jtfMagazaKodu;
    }

    private void btnMagazaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagazaSilActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            DeleteProducts dll = new DeleteProducts();
            dll.DeleteMagaza(con, Integer.parseInt(getJtfMagazaKodu().getText()));
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            magazaTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnMagazaSilActionPerformed

    private void btnUrunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunSilActionPerformed
        // TODO add your handling code here:

        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            DeleteProducts dl = new DeleteProducts();
            dl.DeleteUrun(con, Integer.parseInt(getJtfUrunID().getText()));
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            urunlerTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnUrunSilActionPerformed

    public JTextField getJtfUrunBarkod() {
        return jtfUrunBarkod;
    }

    public void setJtfUrunBarkod(JTextField jtfUrunBarkod) {
        this.jtfUrunBarkod = jtfUrunBarkod;
    }

    private void jtfUrunBarkodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUrunBarkodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUrunBarkodActionPerformed

    private void btnUrunTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunTemizleActionPerformed
        jtfUrunID.setText("");
        jtfUrunAdi.setText("");
        jtfUrunAdet.setText("");
        jtfUrunAlisFiyati.setText("");
        jtfUrunBarkod.setText("");
        jtfUrunMarka.setText("");
        jtfUrunSatisFiyati.setText("");
        jtfUrunSonKul.setText("");
    }//GEN-LAST:event_btnUrunTemizleActionPerformed

    private void btnUrunSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrunSilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUrunSilMouseClicked

    public JTextField getJtfCalisanID() {
        return jtfCalisanID;
    }

    public void setJtfCalisanID(JTextField jtfCalisanID) {
        this.jtfCalisanID = jtfCalisanID;
    }

    private void btnCalisanSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalisanSilActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            DeleteProducts dl = new DeleteProducts();
            dl.DeleteCalisan(con, Integer.parseInt(getJtfCalisanID().getText()));
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            calisanlarTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }//GEN-LAST:event_btnCalisanSilActionPerformed

    private void btnMagazaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagazaEkleActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();

            String addSQL = "INSERT INTO MAGAZALAR(MAGAZA_ADI,MAGAZA_SEHIR,MAGAZA_KODU) VALUES(" + "'" + jtfMagazaAdi.getText() + "'" + "," + "'" + getJtfMagazaSehir().getText() + "'" + "," + getJtfMagazaKodu().getText() + ")";
            int rs = stmt.executeUpdate(addSQL);

            System.out.println("Mağaza Başarılıyla Eklendi!");
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            magazaTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnMagazaEkleActionPerformed

    private void jtfUrunSatisFiyatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUrunSatisFiyatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUrunSatisFiyatiActionPerformed

    private void btnUrunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunEkleActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();

            String addSQL = "INSERT INTO URUNLER(MAGAZA,BARKOD,URUN_ADI,MARKA,STOK_ADEDI,SONKULLANMATARIHI,ALIS_FIYATI,SATIS_FIYATI) VALUES(" + "'" + getJtfUrunMagaza().getSelectedItem() + "'" + "," + getJtfUrunBarkod().getText() + "," + "'" + getJtfUrunAdi().getText() + "'" + "," + "'" + getJtfUrunMarka().getText() + "'" + "," + getJtfUrunAdet().getText() + "," + getJtfUrunSonKul().getText() + "," + getJtfUrunAlisFiyati().getText() + "," + getJtfUrunSatisFiyati().getText() + ")";
            int rs = stmt.executeUpdate(addSQL);

            System.out.println("Ürün Başarılıyla Eklendi!");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            urunlerTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }//GEN-LAST:event_btnUrunEkleActionPerformed

    private void btnCalisanEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalisanEkleActionPerformed
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();

            String addSQL = "INSERT INTO CALISANLAR(ADI,SOYADI,MAGAZASI,MAAS) VALUES(" + "'" + getJtfCalisanAdi().getText() + "'" + "," + "'" + getJtfCalisanSoyadi().getText() + "'" + "," + "'" + getJtfCalisanMagazasi().getText() + "'" + "," + getJtfMaas().getText() + ")";
            int rs = stmt.executeUpdate(addSQL);

            System.out.println("Çalışan Başarılıyla Eklendi!");
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            calisanlarTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnCalisanEkleActionPerformed

    public JTextField getJtfMagazaID() {
        return jtfMagazaID;
    }

    public void setJtfMagazaID(JTextField jtfMagazaID) {
        this.jtfMagazaID = jtfMagazaID;
    }

    private void btnMagazaDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagazaDuzenleActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();

            String addSQL = "UPDATE MAGAZALAR SET MAGAZA_ADI=" + "'" + jtfMagazaAdi.getText() + "'" + "," + " MAGAZA_SEHIR=" + "'" + getJtfMagazaSehir().getText() + "'" + "," + " MAGAZA_KODU=" + getJtfMagazaKodu().getText() + " WHERE ID=" + getJtfMagazaID().getText();

            int rs = stmt.executeUpdate(addSQL);

            System.out.println("Mağaza Başarılıyla Düzenlendi!");
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            magazaTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }//GEN-LAST:event_btnMagazaDuzenleActionPerformed

    private void btnUrunDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunDuzenleActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();

            String addSQL = "UPDATE URUNLER SET MAGAZA=" + "'" + getJtfUrunMagaza().getSelectedItem() + "'" + "," + " BARKOD=" + getJtfUrunBarkod().getText() + "," + " URUN_ADI=" + "'" + getJtfUrunAdi().getText() + "'" + "," + "MARKA=" + "'" + getJtfUrunMarka().getText() + "'" + "," + "STOK_ADEDI=" + getJtfUrunAdet().getText() + "," + "SONKULLANMATARIHI=" + getJtfUrunSonKul().getText() + "," + "ALIS_FIYATI=" + getJtfUrunAlisFiyati().getText() + "," + "SATIS_FIYATI=" + getJtfUrunSatisFiyati().getText() + " WHERE ID=" + getJtfUrunID().getText();

            int rs = stmt.executeUpdate(addSQL);

            System.out.println("Ürün Başarılıyla Düzenlendi!");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            urunlerTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnUrunDuzenleActionPerformed

    private void btnCalisanDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalisanDuzenleActionPerformed
        // TODO add your handling code here:
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();

            String addSQL = "UPDATE CALISANLAR SET ADI=" + "'" + jtfCalisanAdi.getText() + "'" + "," + " SOYADI=" + "'" + getJtfCalisanSoyadi().getText() + "'" + "," + " MAGAZASI=" + "'" + getJtfCalisanMagazasi().getText() + "'" + "," + "MAAS=" + getJtfMaas().getText() + " WHERE ID=" + getJtfCalisanID().getText();

            int rs = stmt.executeUpdate(addSQL);

            System.out.println("Çalışan Başarılıyla Düzenlendi!");
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            calisanlarTabloGetir();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnCalisanDuzenleActionPerformed

    private void btnCalisanTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalisanTemizleActionPerformed

        jtfCalisanID.setText("");
        jtfCalisanAdi.setText("");
        jtfCalisanMagazasi.setText("");
        jtfCalisanSoyadi.setText("");
        jtfMaas.setText("");
    }//GEN-LAST:event_btnCalisanTemizleActionPerformed

    private void btnMagazaTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagazaTemizleActionPerformed

        jtfMagazaID.setText("");
        jtfMagazaAdi.setText("");
        jtfMagazaSehir.setText("");
        jtfMagazaKodu.setText("");
    }//GEN-LAST:event_btnMagazaTemizleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String host = "jdbc:derby://localhost:1527/StokData";
            String uName = "hacktan";
            String uPass = "1234";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM CALISANLAR";
            ResultSet rs = stmt.executeQuery(SQL);
            String str = "Bunu dosyaya yazdir";

        

        FileWriter fileWriter;
            
        File file = new File("CalisanlarListesi.txt");
        FileWriter myWriter = new FileWriter("CalisanlarListesi.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        myWriter.append("ID ");
                myWriter.append("İsim ");
                myWriter.append("Soyisim ");
                myWriter.append("Maaş");
                myWriter.append("\n");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String magaza = rs.getString("MAGAZASI");
                String name = rs.getString("ADI");
                String surname = rs.getString("SOYADI");
                int maas = rs.getInt("MAAS");
                myWriter.append(Integer.toString(id)+" ");
                myWriter.append(name+" ");
                myWriter.append(surname+" ");
                myWriter.append(Integer.toString(maas)+"₺");
                myWriter.append("\n");
                
        
                
      
      
             
            }
            myWriter.close();
        }catch (IOException ex) {
                Logger.getLogger(StockManagamentMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException err ) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public JTextField getJtfUrunSatisFiyati() {
        return jtfUrunSatisFiyati;
    }

    public void setJtfUrunSatisFiyati(JTextField jtfUrunSatisFiyati) {
        this.jtfUrunSatisFiyati = jtfUrunSatisFiyati;
    }

    public JTextField getJtfCalisanAdi() {
        return jtfCalisanAdi;
    }

    public void setJtfCalisanAdi(JTextField jtfCalisanAdi) {
        this.jtfCalisanAdi = jtfCalisanAdi;
    }

    public JTextField getJtfCalisanMagazasi() {
        return jtfCalisanMagazasi;
    }

    public void setJtfCalisanMagazasi(JTextField jtfCalisanMagazasi) {
        this.jtfCalisanMagazasi = jtfCalisanMagazasi;
    }

    public JTextField getJtfCalisanSoyadi() {
        return jtfCalisanSoyadi;
    }

    public void setJtfCalisanSoyadi(JTextField jtfCalisanSoyadi) {
        this.jtfCalisanSoyadi = jtfCalisanSoyadi;
    }

    public JTextField getJtfMaas() {
        return jtfMaas;
    }

    public void setJtfMaas(JTextField jtfMaas) {
        this.jtfMaas = jtfMaas;
    }

    public JTextField getJtfMagazaAdi() {
        return jtfMagazaID;
    }

    public void setJtfMagazaAdi(JTextField jtfMagazaAdi) {
        this.jtfMagazaID = jtfMagazaAdi;
    }

    public JTextField getJtfMagazaSehir() {
        return jtfMagazaSehir;
    }

    public void setJtfMagazaSehir(JTextField jtfMagazaSehir) {
        this.jtfMagazaSehir = jtfMagazaSehir;
    }

    public JTextField getJtfUrunAdet() {
        return jtfUrunAdet;
    }

    public void setJtfUrunAdet(JTextField jtfUrunAdet) {
        this.jtfUrunAdet = jtfUrunAdet;
    }

    public JTextField getJtfUrunAdi() {
        return jtfUrunAdi;
    }

    public void setJtfUrunAdi(JTextField jtfUrunAdi) {
        this.jtfUrunAdi = jtfUrunAdi;
    }

    public JTextField getJtfUrunAlisFiyati() {
        return jtfUrunAlisFiyati;
    }

    public void setJtfUrunAlisFiyati(JTextField jtfUrunAlisFiyati) {
        this.jtfUrunAlisFiyati = jtfUrunAlisFiyati;
    }

    public JComboBox<String> getJtfUrunMagaza() {
        return jtfUrunMagaza;
    }

    public void setJtfUrunMagaza(JComboBox<String> jtfUrunMagaza) {
        this.jtfUrunMagaza = jtfUrunMagaza;
    }

    public JTextField getJtfUrunMarka() {
        return jtfUrunMarka;
    }

    public void setJtfUrunMarka(JTextField jtfUrunMarka) {
        this.jtfUrunMarka = jtfUrunMarka;
    }

    public JTextField getJtfUrunSonKul() {
        return jtfUrunSonKul;
    }

    /**
     * @param args the command line arguments
     */
    public void setJtfUrunSonKul(JTextField jtfUrunSonKul) {
        this.jtfUrunSonKul = jtfUrunSonKul;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockManagamentMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalisanDuzenle;
    private javax.swing.JButton btnCalisanEkle;
    private javax.swing.JButton btnCalisanSil;
    private javax.swing.JButton btnCalisanTemizle;
    private javax.swing.JButton btnMagazaDuzenle;
    private javax.swing.JButton btnMagazaEkle;
    private javax.swing.JButton btnMagazaSil;
    private javax.swing.JButton btnMagazaTemizle;
    private javax.swing.JButton btnUrunDuzenle;
    private javax.swing.JButton btnUrunEkle;
    private javax.swing.JButton btnUrunSil;
    private javax.swing.JButton btnUrunTemizle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jtfCalisanAdi;
    private javax.swing.JTextField jtfCalisanID;
    private javax.swing.JTextField jtfCalisanMagazasi;
    private javax.swing.JTextField jtfCalisanSoyadi;
    private javax.swing.JTextField jtfMaas;
    private javax.swing.JTextField jtfMagazaAdi;
    private javax.swing.JTextField jtfMagazaID;
    private javax.swing.JTextField jtfMagazaKodu;
    private javax.swing.JTextField jtfMagazaSehir;
    private javax.swing.JTextField jtfUrunAdet;
    private javax.swing.JTextField jtfUrunAdi;
    private javax.swing.JTextField jtfUrunAlisFiyati;
    private javax.swing.JTextField jtfUrunBarkod;
    private javax.swing.JTextField jtfUrunID;
    private javax.swing.JComboBox<String> jtfUrunMagaza;
    private javax.swing.JTextField jtfUrunMarka;
    private javax.swing.JTextField jtfUrunSatisFiyati;
    private javax.swing.JTextField jtfUrunSonKul;
    // End of variables declaration//GEN-END:variables
}
