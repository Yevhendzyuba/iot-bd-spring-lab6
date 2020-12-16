package com.spring.lab6.domain.implementation;

import com.spring.lab6.domain.GeneralModelInterface;

import javax.persistence.*;


@Entity
@Table(name = "sensor_data", schema = "mydb", catalog = "")
public class SensorData implements GeneralModelInterface {
    private Integer id;
    private String time;
    private String lightning;
    private String temperature;
    private String humidity;
    private Location locationByLocationId;


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
    @Column(name = "lightning")
    public String getLightning() {
        return lightning;
    }

    public void setLightning(String lightning) {
        this.lightning = lightning;
    }

    @Basic
    @Column(name = "temperature")
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Basic
    @Column(name = "humidity")
    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SensorData that = (SensorData) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (lightning != null ? !lightning.equals(that.lightning) : that.lightning != null) return false;
        if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) return false;
        if (humidity != null ? !humidity.equals(that.humidity) : that.humidity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (lightning != null ? lightning.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (humidity != null ? humidity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", lightning='" + lightning + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", locationId=" + locationByLocationId +
                '}';
    }
}
