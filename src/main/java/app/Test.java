package app;

import dao.TaiKhoanDao;
import dao.impl.TaiKhoanDaoImpl;
import entites.ChiTietHoaDon;
import entites.HoaDon;
import entites.SanPham;
import entites.TaiKhoan;
import service.ChiTietHoaDonService;
import service.HoaDonService;
import service.Sanphamservice;
import service.TaiKhoanService;

public class Test {
	public static void main(String[] args) {
		TaiKhoanService service = new TaiKhoanService();
		Sanphamservice sanphamservice = new Sanphamservice();
		ChiTietHoaDonService chiTietHoaDonService = new ChiTietHoaDonService();
		HoaDonService hoaDonService = new HoaDonService();
		
		HoaDon hoaDon = hoaDonService.findById("HD0423");
		SanPham sanPham = sanphamservice.findById(2);
		System.out.println(hoaDon);
		System.out.println(sanPham);
		
		ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
		chiTietHoaDon.setSanPham(sanPham);
		chiTietHoaDon.setHoaDon(hoaDon);
		chiTietHoaDon.setSoLuong(10);
		
		chiTietHoaDonService.addChiTietHoaDon(chiTietHoaDon);		
	}
}
