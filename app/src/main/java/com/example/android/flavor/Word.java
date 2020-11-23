package com.example.android.flavor;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Word{
    private String name;
    private int no;
    private Context cont;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Word(int n, String na) {
        name = na;
        no = n;
    }




}
