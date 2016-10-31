package io.swagger.util.common2.sql_server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import io.swagger.util.common1.domain.Student;

/**
 * 
 * 
 * =============================================================================
 * 
 * 描述：对学生表信息的增删改查
 * 
 * 作者： 张继凯 201400800536
 * 
 * 日期： 2015-12-23下午03:07:01
 * 
 * =============================================================================
 */
public class StudentDao {
	/**
	 * 获取所有学生信息。
	 * 
	 * @return
	 */
	public static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Connection conn = DbUtil.getConnect();
		String sql = "select * from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				String stuID = rs.getString("stuID");
				String sname = rs.getString("sname");
				String sex = rs.getString("sex");
				int age = rs.getInt("age");

				student.setStuID(stuID);
				student.setSname(sname);
				student.setSex(sex);
				student.setAge(age);
				studentList.add(student);
			}

			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	/**
	 * 插入一条学生记录
	 * 
	 * @param student
	 *            学生
	 */
	public static boolean insert(Student student) {
		Connection conn = DbUtil.getConnect();
		String sql = "insert into student values(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStuID());
			pstmt.setString(3, student.getSex());
			pstmt.setString(2, student.getSname());
			pstmt.setInt(4, student.getAge());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * 根据学号删除一条记录
	 * 
	 * @param stuID
	 *            学号
	 */
	public static void delete(String stuID) {
		Connection conn = DbUtil.getConnect();
		String sql = "delete from student where stuID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stuID);
			pstmt.execute();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 更新一条记录
	 * 
	 * @param student
	 *            要更新的学生信息
	 */
	public static void update(Student student) {
		Connection conn = DbUtil.getConnect();
		String sql = "update student set sname=?, sex=?, age=? where stuID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareCall(sql);
			pstmt.setString(4, student.getStuID());
			pstmt.setString(2, student.getSex());
			pstmt.setString(1, student.getSname());
			pstmt.setInt(3, student.getAge());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
