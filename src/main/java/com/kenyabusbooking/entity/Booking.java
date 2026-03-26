package com.kenyabusbooking.entity;

import java.time.LocalDateTime;

public class Booking {
    private Long bookingId;
    private Long passengerId;
    private Long busId;
    private String seatNumber;
    private LocalDateTime bookingDate;
    private String paymentStatus;
    private Double totalPrice;

    public Booking(Long bookingId, Long passengerId, Long busId, String seatNumber, LocalDateTime bookingDate, String paymentStatus, Double totalPrice) {
        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.busId = busId;
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
        this.paymentStatus = paymentStatus;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}