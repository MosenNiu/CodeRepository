package entity;

/**
 * Created by Mosen on 2017/8/16.
 */
public class Shoes {
    private int id;
    private String no;
    private String factory;
    private String color;
    private Double shellPrice;
    private String picture;
    private Integer amount;

    public Shoes() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getFactory() {
        return factory;
    }
    public void setFactory(String factory) {
        this.factory = factory;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getShellPrice() {
        return shellPrice;
    }
    public void setShellPrice(Double shellPrice) {
        this.shellPrice = shellPrice;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shoes shoes = (Shoes) o;

        if (id != shoes.id) return false;
        if (factory != shoes.factory) return false;
        if (no != null ? !no.equals(shoes.no) : shoes.no != null) return false;
        if (color != null ? !color.equals(shoes.color) : shoes.color != null) return false;
        if (shellPrice != null ? !shellPrice.equals(shoes.shellPrice) : shoes.shellPrice != null) return false;
        if (picture != null ? !picture.equals(shoes.picture) : shoes.picture != null) return false;
        if (amount != null ? !amount.equals(shoes.amount) : shoes.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (no != null ? no.hashCode() : 0);
        result = 31 * result + (factory!= null ? color.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (shellPrice != null ? shellPrice.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", factory=" + factory +
                ", color='" + color + '\'' +
                ", shellPrice=" + shellPrice +
                ", picture='" + picture + '\'' +
                ", amount=" + amount +
                '}';
    }
}
