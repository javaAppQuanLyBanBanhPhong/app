package service;

import java.util.List;

import entites.SanPham;
import repositories.GeneralRepository;

public class Sanphamservice {
	private GeneralRepository<SanPham> repository;
	
	public Sanphamservice() {
		repository = new GeneralRepository<SanPham>(SanPham.class, "sanpham");
	}
	public List<SanPham> getDanhsach() {
		return repository.getDanhsach();
	}

	public SanPham add(SanPham entity) {
		return repository.add(entity);
	}
	public SanPham findById(int id) {
		return repository.findSanphamById(id);
	}
	public SanPham findByName(String name) {
		return repository.findByName(name);
	}
}
