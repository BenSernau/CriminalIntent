package com.bignerdranch.android.criminalintent;

import android.provider.ContactsContract;

import java.util.Date;
import java.util.UUID;

/**
 * Created by bsern on 9/10/2016.
 */
public class  Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;
    private String mNumber;

    public Crime() {
    // Generate unique identifier
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() { return mSuspect; }

    public void setSuspect(String suspect) { mSuspect = suspect; }

    public String getPhotoFilename() { return "IMG_" + getId().toString() + ".jpg"; }

    public void setNumber(String number) { mNumber = number; }

    public String getNumber() { return mNumber; }
}
