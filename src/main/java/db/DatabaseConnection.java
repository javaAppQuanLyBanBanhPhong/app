package db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entites.ChiTietHoaDon;
import entites.HangHoa;
import entites.HoaDon;
import entites.KhachHang;
import entites.SanPham;
import entites.TaiKhoan;

public class DatabaseConnection {
	private SessionFactory sessionFactory;
	private static DatabaseConnection databaseConnection = null;

	private DatabaseConnection() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(TaiKhoan.class)
				.addAnnotatedClass(SanPham.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(HoaDon.class)
				.addAnnotatedClass(ChiTietHoaDon.class)
				.addAnnotatedClass(HangHoa.class)
				.getMetadataBuilder()
				.build();

		this.sessionFactory = metadata.getSessionFactoryBuilder().build();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public synchronized static DatabaseConnection getInstance() {
		if (databaseConnection == null)
			databaseConnection = new DatabaseConnection();

		return databaseConnection;
	}
}
