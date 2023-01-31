package com.example.task;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Data {
   /* public Data(int sno, String data, String desc) {
        this.sno = sno;
        this.data = data;
        this.desc = desc;
    }*/

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "Sno")
    private int sno;
    @ColumnInfo(name = "Title")
    private String data;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @ColumnInfo(name = "Description")
    private String desc;
}
