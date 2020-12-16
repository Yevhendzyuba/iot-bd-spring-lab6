package com.spring.lab6.domain.implementation;


import com.spring.lab6.domain.GeneralModelInterface;

import javax.persistence.*;


@Entity
@Table(name = "max_water_consumption", schema = "mydb", catalog = "")
public class MaxWaterConsumption implements GeneralModelInterface {
    private Integer id;
    private String time;
    private String power;
    private String litres;


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
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "power")
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Basic
    @Column(name = "litres")
    public String getLitres() {
        return litres;
    }

    public void setLitres(String litres) {
        this.litres = litres;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaxWaterConsumption that = (MaxWaterConsumption) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (litres != null ? !litres.equals(that.litres) : that.litres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (litres != null ? litres.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "MaxWaterConsumption{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", power='" + power + '\'' +
                ", litres='" + litres + '\'' +
                '}';
    }
}