package ssru.satien_janpla.satien_restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Pc on 13/10/2559.
 */
public class UserTable {
    //Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public UserTable(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }   //Constructor
}   //Main Class
