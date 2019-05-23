package com.hughes.msd_assignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hughe on 07/11/2018.
 */

public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "climbs.db";
    private static final String TABLE_CLIMBS = "climbs";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_LOCATION = "location";
    public static final String COLUMN_ELEVATION = "elevation";
    public static final String COLUMN_BASEELEV = "baseelev";
    public static final String COLUMN_MAXELEV = "maxelev";
    public static final String COLUMN_AVGGRAD = "avggrad";
    public static final String COLUMN_STEEPESTGRAD = "steepestgrad";
    public static final String COLUMN_FASTESTTIME = "fastesttime";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_CLIMBS + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT " +
                COLUMN_NAME + "TEXT " +
                COLUMN_LOCATION + "TEXT" +
                COLUMN_ELEVATION + "INTEGER" +
                COLUMN_BASEELEV + "INTEGER" +
                COLUMN_MAXELEV + "INTEGER" +
                COLUMN_AVGGRAD + "INTEGER" +
                COLUMN_STEEPESTGRAD + "INTEGER" +
                COLUMN_FASTESTTIME + "TEXT" +
                ");"



                ;

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLIMBS);
        onCreate(db);
    }

    //Add a new row to DB
    public void addClimb(Climb climb){
        ContentValues values = new ContentValues();

        values.put(COLUMN_NAME, climb.getName());
        values.put(COLUMN_LOCATION, climb.getLocation());
        values.put(COLUMN_ELEVATION, climb.getTotelevation());
        values.put(COLUMN_BASEELEV, climb.getBaseelev());
        values.put(COLUMN_MAXELEV, climb.getMaxelev());
        values.put(COLUMN_AVGGRAD, climb.getAvggrad());
        values.put(COLUMN_STEEPESTGRAD, climb.getSteepestgrad());
        //values.put(COLUMN_FASTESTTIME, climb.getFastesttime());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_CLIMBS, null, values);
        db.close();


    }
}
