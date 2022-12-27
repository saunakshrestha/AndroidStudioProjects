package com.saunakshrestha.recyclerview;

public class ContactModel {
    int image;
    String contactName, contactNo;

    public ContactModel(int image, String contactName, String contactNo) {
        this.contactName = contactName;
        this.contactNo = contactNo;
        this.image = image;
    }

}
