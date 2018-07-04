package entity;

import java.io.Serializable;

/**
 * Created by Mosen on 2017/8/16.
 */
public class Factory implements Serializable {
    private int id;
    private String name;
    private String location;
    private String telephone;
//    private Double payment;

    public Factory() {
    }

    public Factory(String name) {
        this.name = name;
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
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
//    public Double getPayment() {
//        return payment;
//    }
//    public void setPayment(Double payment) {
//        this.payment = payment;
//    }

    @Override
    public String toString() {
        return "Factory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", telephone='" + telephone + '\'' +
//                ", payment=" + payment +
                '}';
    }
}
