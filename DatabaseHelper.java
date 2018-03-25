package com.example.pc.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pc on 24-Mar-18.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
     public static final String DATABASE_NAME="Contact.db";
    public static final String TABLE_NAME="Contact" ;
    public static final String COL1_username="username";
    public static final String COL2_password="password";
    SQLiteDatabase db;
    private static final String TABLE_CREATE="create table Contact(username integer primary key not null auto_increment" +
            ","+"password text not null)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME,null, 1);
        SQLiteDatabase db=this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db=db;
    }
    public void insertContact(Contact c) {
        db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        ContentValues contentValues=new ContentValues();
       contentValues.put(COL1_username, c.getUsername());
       contentValues.put(COL2_password, c.getPass());
        db.insert(TABLE_NAME,null,contentValues);
        db.close();
    }

    public String searchpass(String username)
    {
        db=this.getReadableDatabase();
        String query="select * from"+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        String a,b;
        b="not found";
        if(cursor.moveToFirst())
        {
            do {
                a=cursor.getString(0);
                if(a.equals(username))
                {
                    b=cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());

        }
        return b;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String query="drop TABLE IF EXISTS"+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
