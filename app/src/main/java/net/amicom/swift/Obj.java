package net.amicom.swift;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by amicom on 2015. 5. 23..
 */
public class Obj implements Parcelable {

    private String name;
    private int bytes;
    private String last_modified;

    public Obj() {

    }

    public Obj(Parcel src) {
        setName(src.readString());
        setBytes(src.readInt());
        setLast_modified(src.readString());
    }


    public class CustomCreator implements Parcelable.Creator<Obj> {
        public Obj createFromParcel(Parcel src) {
            return new Obj(src);
        }

        public Obj[] newArray(int size) {
            return new Obj[size];
        }
    }

    public Obj(String name, int bytes, String last_modified) {

        this.name = name;
        this.bytes = bytes;
        this.last_modified = last_modified;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        @Override
        public Obj createFromParcel(Parcel in) {
            return new Obj(in);
        }

        @Override
        public Obj[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Obj[size];
        }

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(bytes);
        dest.writeString(last_modified);

    }
}
