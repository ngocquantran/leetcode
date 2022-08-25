

import java.time.LocalDate;

public class Account {
    private String id;
    private String name;
    private String brand;
    private LocalDate receiptDate;
    private LocalDate mfg;
    private int exp;
    private int quantity;
    private int soldQuantity;
    private String origin;
    private long price;


    public Account(String id, String name, String brand,  int exp, int quantity, int soldQuantity, String origin, long price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.exp = exp;
        this.quantity = quantity;
        this.soldQuantity = soldQuantity;
        this.origin = origin;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public LocalDate getMfg() {
        return mfg;
    }

    public void setMfg(LocalDate mfg) {
        this.mfg = mfg;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return String.format("%-10s%-30s%-20s%-8d%-8d%-8d%-15s",id,name, brand,exp,quantity,soldQuantity,origin) ;
    }




}
