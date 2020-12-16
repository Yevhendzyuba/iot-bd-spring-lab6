package com.spring.lab6.domain.implementation;


import com.spring.lab6.domain.GeneralModelInterface;

import javax.persistence.*;

@Entity
@Table(name = "data_of_sensors", schema = "mydb", catalog = "")
public class DataOfSensors implements GeneralModelInterface {
    private Integer id;
    private String time;
    private SensorData sensorDataBySensorDataId;
    private Noozle noozleByNoozleId;


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

    @ManyToOne
    @JoinColumn(name = "noozle_id", referencedColumnName = "id", nullable = false)
    public Noozle getNoozleByNoozleId() {
        return noozleByNoozleId;
    }

    public void setNoozleByNoozleId(Noozle noozleByNoozleId) {
        this.noozleByNoozleId = noozleByNoozleId;
    }

    @ManyToOne
    @JoinColumn(name = "sensor_data_id", referencedColumnName = "id", nullable = false)
    public SensorData getSensorDataBySensorDataId() {
        return sensorDataBySensorDataId;
    }

    public void setSensorDataBySensorDataId(SensorData sensorDataBySensorDataId) {
        this.sensorDataBySensorDataId = sensorDataBySensorDataId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataOfSensors that = (DataOfSensors) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DataOfSensord{" +
                "id=" + id +
                ", time=" + time +
                ", noozleId=" + noozleByNoozleId +
                ", sensorDataId=" + sensorDataBySensorDataId +
                '}';
    }

}

