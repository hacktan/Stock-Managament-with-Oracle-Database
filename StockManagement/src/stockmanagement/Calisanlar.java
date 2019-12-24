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
@Table(name = "CALISANLAR")
@NamedQueries({
    @NamedQuery(name = "Calisanlar.findAll", query = "SELECT c FROM Calisanlar c"),
    @NamedQuery(name = "Calisanlar.findById", query = "SELECT c FROM Calisanlar c WHERE c.id = :id"),
    @NamedQuery(name = "Calisanlar.findByAdi", query = "SELECT c FROM Calisanlar c WHERE c.adi = :adi"),
    @NamedQuery(name = "Calisanlar.findBySoyadi", query = "SELECT c FROM Calisanlar c WHERE c.soyadi = :soyadi"),
    @NamedQuery(name = "Calisanlar.findByMagazasi", query = "SELECT c FROM Calisanlar c WHERE c.magazasi = :magazasi"),
    @NamedQuery(name = "Calisanlar.findByMaas", query = "SELECT c FROM Calisanlar c WHERE c.maas = :maas")})
public class Calisanlar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "MAGAZASI")
    private String magazasi;
    @Column(name = "MAAS")
    private Integer maas;

    public Calisanlar() {
    }

    public Calisanlar(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getMagazasi() {
        return magazasi;
    }

    public void setMagazasi(String magazasi) {
        this.magazasi = magazasi;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
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
        if (!(object instanceof Calisanlar)) {
            return false;
        }
        Calisanlar other = (Calisanlar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "stockmanagement.Calisanlar[ id=" + id + " ]";
    }
    
}
