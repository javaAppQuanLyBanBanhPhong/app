package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import entites.ChiTietHoaDon;
import entites.HoaDon;
import entites.KhachHang;
import entites.SanPham;
import entites.TaiKhoan;

public class App {
	public static void main(String[] args) {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(TaiKhoan.class)
				.addAnnotatedClass(SanPham.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(HoaDon.class)
				.addAnnotatedClass(ChiTietHoaDon.class)
				.getMetadataBuilder()
				.build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
