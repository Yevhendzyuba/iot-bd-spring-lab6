package com.spring.lab6.domain.implementation;

import com.spring.lab6.domain.GeneralModelInterface;

import javax.persistence.*;


@Entity
@Table(name = "noozle", schema = "mydb", catalog = "")
public class Noozle implements GeneralModelInterface {
    private Integer id;
    private String cordinates;
    private String diametr;
    private MaxWaterConsumption maxWaterConsumptionByMaxWaterConsumptionId;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cordinates")
    public String getCordinates() {
        return cordinates;
    }

    public void setCordinates(String cordinates) {
        this.cordinates = cordinates;
    }

    @Basic
    @Column(name = "diametr")
    public String getDiametr() {
        return diametr;
    }

    public void setDiametr(String diametr) {
        this.diametr = diametr;
    }

    @ManyToOne
    @JoinColumn(name = "max_water_consumption_id", referencedColumnName = "id", nullable = false)
    public MaxWaterConsumption getMaxWaterConsumptionByMaxWaterConsumptionId() {
        return maxWaterConsumptionByMaxWaterConsumptionId;
    }

    public void setMaxWaterConsumptionByMaxWaterConsumptionId(MaxWaterConsumption maxWaterConsumptionByMaxWaterConsumptionId) {
        this.maxWaterConsumptionByMaxWaterConsumptionId = maxWaterConsumptionByMaxWaterConsumptionId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Noozle that = (Noozle) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cordinates != null ? !cordinates.equals(that.cordinates) : that.cordinates != null) return false;
        if (diametr != null ? !diametr.equals(that.diametr) : that.diametr != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cordinates != null ? cordinates.hashCode() : 0);
        result = 31 * result + (diametr != null ? diametr.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Noozle{" +
                "id=" + id +
                ", cordinates='" + cordinates + '\'' +
                ", diametr='" + diametr + '\'' +
                ", maxWaterConsumptionId=" + maxWaterConsumptionByMaxWaterConsumptionId +
                '}';
    }
}
