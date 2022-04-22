package com.example.pr14;

public class Address {
    private String addressText;
    private String zipCode;

    public Address(String addressText, String zipCode) {
        this.addressText = addressText;
        this.zipCode = zipCode;
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressText='" + addressText + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
