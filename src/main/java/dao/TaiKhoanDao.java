package dao;

import java.util.List;

import entites.TaiKhoan;

public interface TaiKhoanDao {
	
	List<TaiKhoan> getTaiKhoans();
	
	TaiKhoan findByUsername(String username);
}
