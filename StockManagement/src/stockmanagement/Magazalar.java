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
@Table(name = "MAGAZALAR")
@NamedQueries({
    @NamedQuery(name = "Magazalar.findAll", query = "SELECT m FROM Magazalar m"),
    @NamedQuery(name = "Magazalar.findById", query = "SELECT m FROM Magazalar m WHERE m.id = :id"),
    @NamedQuery(name = "Magazalar.findByMagazaAdi", query = "SELECT m FROM Magazalar m WHERE m.magazaAdi = :magazaAdi"),
    @NamedQuery(name = "Magazalar.findByMagazaSehir", query = "SELECT m FROM Magazalar m WHERE m.magazaSehir = :magazaSehir"),
    @NamedQuery(name = "Magazalar.findByMagazaKodu", query = "SELECT m FROM Magazalar m WHERE m.magazaKodu = :magazaKodu")})
public class Magazalar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MAGAZA_ADI")
    private String magazaAdi;
    @Column(name = "MAGAZA_SEHIR")
    private String magazaSehir;
    @Basic(optional = false)
    @Column(name = "MAGAZA_KODU")
    private int magazaKodu;

    public Magazalar() {
    }

    public Magazalar(Integer id) {
        this.id = id;
    }

    public Magazalar(Integer id, int magazaKodu) {
        this.id = id;
        this.magazaKodu = magazaKodu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagazaAdi() {
        return magazaAdi;
    }

    public void setMagazaAdi(String magazaAdi) {
        this.magazaAdi = magazaAdi;
    }

    public String getMagazaSehir() {
        return magazaSehir;
    }

    public void setMagazaSehir(String magazaSehir) {
        this.magazaSehir = magazaSehir;
    }

    public int getMagazaKodu() {
        return magazaKodu;
    }

    public void setMagazaKodu(int magazaKodu) {
        this.magazaKodu = magazaKodu;
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
        if (!(object instanceof Magazalar)) {
            return false;
        }
        Magazalar other = (Magazalar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "stockmanagement.Magazalar[ id=" + id + " ]";
    }
    
}
