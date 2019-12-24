/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author haktu
 */
@Entity
@Table(name = "URUNLER")
@NamedQueries({
    @NamedQuery(name = "Urunler.findAll", query = "SELECT u FROM Urunler u"),
    @NamedQuery(name = "Urunler.findById", query = "SELECT u FROM Urunler u WHERE u.id = :id"),
    @NamedQuery(name = "Urunler.findByMagaza", query = "SELECT u FROM Urunler u WHERE u.magaza = :magaza"),
    @NamedQuery(name = "Urunler.findByBarkod", query = "SELECT u FROM Urunler u WHERE u.barkod = :barkod"),
    @NamedQuery(name = "Urunler.findByUrunAdi", query = "SELECT u FROM Urunler u WHERE u.urunAdi = :urunAdi"),
    @NamedQuery(name = "Urunler.findByMarka", query = "SELECT u FROM Urunler u WHERE u.marka = :marka"),
    @NamedQuery(name = "Urunler.findByStokAdedi", query = "SELECT u FROM Urunler u WHERE u.stokAdedi = :stokAdedi"),
    @NamedQuery(name = "Urunler.findBySonkullanmatarihi", query = "SELECT u FROM Urunler u WHERE u.sonkullanmatarihi = :sonkullanmatarihi"),
    @NamedQuery(name = "Urunler.findByAlisFiyati", query = "SELECT u FROM Urunler u WHERE u.alisFiyati = :alisFiyati"),
    @NamedQuery(name = "Urunler.findBySatisFiyati", query = "SELECT u FROM Urunler u WHERE u.satisFiyati = :satisFiyati")})
public class Urunler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MAGAZA")
    private String magaza;
    @Column(name = "BARKOD")
    private Integer barkod;
    @Column(name = "URUN_ADI")
    private String urunAdi;
    @Column(name = "MARKA")
    private String marka;
    @Column(name = "STOK_ADEDI")
    private Integer stokAdedi;
    @Column(name = "SONKULLANMATARIHI")
    private Integer sonkullanmatarihi;
    @Column(name = "ALIS_FIYATI")
    private Integer alisFiyati;
    @Column(name = "SATIS_FIYATI")
    private Integer satisFiyati;

    public Urunler() {
    }

    public Urunler(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagaza() {
        return magaza;
    }

    public void setMagaza(String magaza) {
        this.magaza = magaza;
    }

    public Integer getBarkod() {
        return barkod;
    }

    public void setBarkod(Integer barkod) {
        this.barkod = barkod;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(Integer stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public Integer getSonkullanmatarihi() {
        return sonkullanmatarihi;
    }

    public void setSonkullanmatarihi(Integer sonkullanmatarihi) {
        this.sonkullanmatarihi = sonkullanmatarihi;
    }

    public Integer getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(Integer alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public Integer getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(Integer satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Urunler)) {
            return false;
        }
        Urunler other = (Urunler) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "stockmanagement.Urunler[ id=" + id + " ]";
    }
    
}
