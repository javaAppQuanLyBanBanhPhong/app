package service;

import java.util.List;

import entites.TaiKhoan;
import repositories.GeneralRepository;

public class TaiKhoanService {
	private GeneralRepository<TaiKhoan> repository;

	public TaiKhoanService() {
		repository = new GeneralRepository<TaiKhoan>(TaiKhoan.class, "taikhoan");
	}

	public List<TaiKhoan> getDanhsach() {
		return repository.getDanhsach();
	}

	public TaiKhoan add(TaiKhoan entity) {
		return repository.add(entity);
	}
}
