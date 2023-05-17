package service;

import java.util.List;

import entites.HoaDon;
import repositories.GeneralRepository;

public class HoaDonService {
	private GeneralRepository<HoaDon> repository;
	
	public HoaDonService() {
		repository = new GeneralRepository<HoaDon>(HoaDon.class, "hoadon");
	}
	public List<HoaDon> getDanhsach() {
		return repository.getDanhsach();
	}

	public HoaDon add(HoaDon entity) {
		return repository.add(entity);
	}
	public HoaDon findById(String entity) {
		return repository.findHoaDonById(entity);
	}
}
