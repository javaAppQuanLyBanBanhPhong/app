package repositories;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import db.DatabaseConnection;
import entites.ChiTietHoaDon;
import entites.HoaDon;
import entites.SanPham;

public class GeneralRepository<T> {

	private Class<T> type;
	private String tableName;
	private Session session;

	public GeneralRepository(Class<T> type, String tableName) {
		this.type = type;
		this.tableName = tableName;
		session = DatabaseConnection.getInstance().getSessionFactory().openSession();
	}

	public List<T> getDanhsach() {
		Transaction tx = session.beginTransaction();
		List<T> list = new ArrayList<T>();
		try {
			String sql = "select * from " + tableName;
			NativeQuery<T> query = session.createNativeQuery(sql, type);
			list = query.getResultList();
			tx.commit();
			return list;
		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}

	public T add(T entity) {
		Transaction tx = session.beginTransaction();
		try {
			session.persist(entity);
			tx.commit();
			return entity;
		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}
	public boolean addCTHD(ChiTietHoaDon chiTietHoaDon) {
		Transaction tx = session.beginTransaction();
		try {
			session.persist(chiTietHoaDon);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			return false;
		}
	}
	
	public T findSanphamById(int id) {
		Transaction tx = session.beginTransaction();
		try {
			String sql = "select * from " + tableName+" where masanpham="+id;
			NativeQuery<T> query = session.createNativeQuery(sql, type);
			tx.commit();
			return query.getSingleResult();
		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}
	public SanPham findByName(String name) {
		Transaction tx = session.beginTransaction();
		try {
			String sql = "select * from sanpham where tensanpham=:x";
			NativeQuery<SanPham> query = session.createNativeQuery(sql, SanPham.class);
			query.setParameter("x", name);
			tx.commit();
			return query.getSingleResult();
		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}
	public HoaDon findHoaDonById(String name) {
		Transaction tx = session.beginTransaction();
		try {
			String sql = "select * from hoadon where mahoadon=:x";
			NativeQuery<HoaDon> query = session.createNativeQuery(sql, HoaDon.class);
			query.setParameter("x", name);
			tx.commit();
			return query.getSingleResult();
		} catch (Exception e) {
			tx.rollback();
			return null;
		}
	}

}
