package io.swagger.util.common2.android;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseOpenHelper extends SQLiteOpenHelper {
	public static String DB_NAME = "notes.db";
	private static int VERSION = 1;

	public DataBaseOpenHelper(Context context) {
		super(context, DB_NAME, null, VERSION);
	}

	public DataBaseOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		// plan_data
		String plan_data = "CREATE TABLE IF NOT EXISTS plan_data (id integer primary key autoincrement,"
				+ "name varchar(30)"
				+ ",time varchar(30)"
				+ ",remark text"
				+ ")";
		db.execSQL(plan_data);


		// content_data
		String content_data = "CREATE TABLE IF NOT EXISTS content_data (id integer primary key autoincrement,"
				+ "name varchar(255)"
				+ ",ganXiang text"
				+ ",image varchar(255)"
				+ ",audio varchar(255)"
				+ ",continueTime varchar(255)" + ")";
		db.execSQL(content_data);


	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
	}

}
