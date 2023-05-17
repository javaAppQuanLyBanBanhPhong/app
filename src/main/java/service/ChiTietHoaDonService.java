package service;

import java.util.List;

import entites.ChiTietHoaDon;
import entites.HoaDon;
import entites.SanPham;
import repositories.GeneralRepository;

public class ChiTietHoaDonService {
private GeneralRepository<ChiTietHoaDon> repository;
	
	public ChiTietHoaDonService() {
		repository = new GeneralRepository<ChiTietHoaDon>(ChiTietHoaDon.class, "chitiethoadon");
	}
	public List<ChiTietHoaDon> getDanhsach() {
		return repository.getDanhsach();
	}

	public boolean addChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		return repository.addCTHD(chiTietHoaDon);
	}
}
