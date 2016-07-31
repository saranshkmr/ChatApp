package com.sksha.chatapp;

import java.util.Date;

/**
 * Created by sksha on 27-07-2016.
 */
public class Messages {
    private String mText;
    private String mSender;
    private Date mDate;

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public String getmSender() {
        return mSender;
    }

    public void setmSender(String mSender) {
        this.mSender = mSender;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }
}
