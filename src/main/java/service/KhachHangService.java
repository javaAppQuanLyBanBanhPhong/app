package service;

import java.util.List;

import entites.KhachHang;
import repositories.GeneralRepository;

public class KhachHangService {
private GeneralRepository<KhachHang> repository;
	
	public KhachHangService() {
		repository = new GeneralRepository<KhachHang>(KhachHang.class, "khachhang");
	}
	public List<KhachHang> getDanhsach() {
		return repository.getDanhsach();
	}

	public KhachHang add(KhachHang entity) {
		return repository.add(entity);
	}
}
