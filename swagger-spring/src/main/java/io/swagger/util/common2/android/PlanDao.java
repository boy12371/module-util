package io.swagger.util.common2.android;

import java.util.ArrayList;
import java.util.List;

import io.swagger.util.common1.domain.Plan;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class PlanDao {

	private final static String TABLE_NAME = "plan_data";

	private DataBaseOpenHelper dbOpenHelper;

	public PlanDao(Context context) {
		dbOpenHelper = new DataBaseOpenHelper(context);
	}

	/**
	 * 插入一条记录
	 * 
	 * @param obj
	 */
	public void insert(Plan obj) {
		SQLiteDatabase database = dbOpenHelper.getWritableDatabase();
		database.beginTransaction();
		database.execSQL("insert into " + TABLE_NAME
				+ " (name,time,remark)values(?,?,?)",
				new Object[] { obj.getName(), obj.getTime(), obj.getRemark() });
		database.setTransactionSuccessful();
		database.endTransaction();
	}

	/**
	 * 修改一条记录
	 * 
	 * @param obj
	 */
	public void update(Plan obj) {
		SQLiteDatabase database = dbOpenHelper.getWritableDatabase();
		database.execSQL("update " + TABLE_NAME
				+ " set name=?,time=?,remark=?  where id=?",
				new Object[] { obj.getName(), obj.getTime(), obj.getRemark(),
						obj.getId() });
	}

	/**
	 * 查询一条记录
	 * 
	 * @return
	 */
	public Plan findById(Integer id) {
		Plan plan = new Plan();
		SQLiteDatabase database = dbOpenHelper.getReadableDatabase();
		Cursor cursor = database.rawQuery("select * from " + TABLE_NAME,
				new String[] { id + "" });
		while (cursor.moveToNext()) {
			plan = new Plan(cursor.getInt(0), cursor.getString(1),
					cursor.getString(2), cursor.getString(3));
		}
		return plan;
	}

	/**
	 * 查询全部
	 * 
	 * @return
	 */
	public List<Plan> findAll() {
		List<Plan> list = new ArrayList<Plan>();
		SQLiteDatabase database = dbOpenHelper.getReadableDatabase();
		Cursor cursor = database.rawQuery("select * from " + TABLE_NAME, null);
		while (cursor.moveToNext()) {
			list.add(new Plan(cursor.getInt(0), cursor.getString(1), cursor
					.getString(2), cursor.getString(3)));
		}
		return list;
	}

}
