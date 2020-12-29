package com.example.android.flavor;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Word{
    private static final int NO_IMAGE_PROVIDED = -1;
    private String name;
    private int no;
    private Context cont;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    //Constructor
    public Word(int n, String na) {
        name = na;
        no = n;
    }

    public Word(int n, String na, int imageResourceId) {
        name = na;
        no = n;
        mImageResourceId = imageResourceId;
    }

    public Word(int n, String na, int imageResourceId, int audioResourceId) {
        name = na;
        no = n;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // Getter and Setter
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

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", cont=" + cont +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
