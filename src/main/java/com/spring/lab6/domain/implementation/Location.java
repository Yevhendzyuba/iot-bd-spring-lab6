package com.spring.lab6.domain.implementation;


import com.spring.lab6.domain.GeneralModelInterface;

import javax.persistence.*;


@Entity
@Table(name = "location", schema = "mydb", catalog = "")
public class Location implements GeneralModelInterface {
    private Integer id;
    private String section;
    private String number;
    private String subscription;


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
    @Column(name = "section")
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Basic
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "subscription")
    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location that = (Location) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (section != null ? !section.equals(that.section) : that.section != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (subscription != null ? !subscription.equals(that.subscription) : that.subscription != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (section != null ? section.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (subscription != null ? subscription.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", section='" + section + '\'' +
                ", number='" + number + '\'' +
                ", subscription='" + subscription + '\'' +
                '}';
    }
}

