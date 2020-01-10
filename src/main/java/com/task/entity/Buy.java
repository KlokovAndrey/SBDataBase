package com.task.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "buy")
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date date;
    @Column(name = "seller_id")
    private int sellerId;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "book_id")
    private int bookId;
    @Column
    private int number;
    @Column
    private double sum;

    public Buy() {
    }

    public Buy(Date date, int sellerId, int customerId, int bookId, int number, double sum) {
        this.date = date;
        this.sellerId = sellerId;
        this.customerId = customerId;
        this.bookId = bookId;
        this.number = number;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "id=" + id +
                ", date=" + date +
                ", sellerId=" + sellerId +
                ", customerId=" + customerId +
                ", bookId=" + bookId +
                ", number=" + number +
                ", sum=" + sum +
                '}';
    }
}
