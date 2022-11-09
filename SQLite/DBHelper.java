package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context){
        super(context,"userdata.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userdetails(name TEXT primary key,contact Text,dob Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists Userdetails");

    }

    public boolean insertuserdata(String name,String contact,String dob){

        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",name);
        cv.put("contact",contact);
        cv.put("dob",dob);
        long result=DB.insert("Userdetails",null,cv);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean updateuserdate(String name,String contact,String dob){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("contact",contact);
        cv.put("dob",dob);
        Cursor cursor=DB.rawQuery("Select * from Userdetails where name= ?", new String[]{name});
        if(cursor.getCount()>0){
            long result=DB.update("Userdetails",cv,"name= ?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public boolean deletedate(String name){
        SQLiteDatabase DB=this.getWritableDatabase();

        Cursor cursor=DB.rawQuery("Select * from Userdetails where name= ?", new String[]{name});
        if(cursor.getCount()>0){
            long result=DB.delete("Userdetails","name= ?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public Cursor getdata(){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor=DB.rawQuery("Select * from Userdetails",null);
        return cursor;
    }
}
