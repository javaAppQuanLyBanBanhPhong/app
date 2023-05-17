package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import dao.TaiKhoanDao;
import db.DatabaseConnection;
import entites.TaiKhoan;

public class TaiKhoanDaoImpl implements TaiKhoanDao {

	private Session session;

	public TaiKhoanDaoImpl() {
		session = DatabaseConnection.getInstance().getSessionFactory().openSession();
	}

	@Override
	public List<TaiKhoan> getTaiKhoans() {
		Transaction transaction = session.beginTransaction();
		List<TaiKhoan> ds = new ArrayList<TaiKhoan>();
		try {
			String sql = "select * from taikhoan";
			NativeQuery<TaiKhoan> query = session.createNativeQuery(sql, TaiKhoan.class);
			ds = query.getResultList();
			transaction.commit();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return null;
	}

	@Override
	public TaiKhoan findByUsername(String username) {
		Transaction transaction = session.beginTransaction();
		TaiKhoan taiKhoan = new TaiKhoan();
		try {
			String sql = "select * from taikhoan where username= :username";
			NativeQuery<TaiKhoan> query = session.createNativeQuery(sql, TaiKhoan.class);
			query.setParameter("username", username);
			taiKhoan = query.getSingleResult();
			transaction.commit();
			return taiKhoan;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return null;
	}

}
