package entites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "chitiethoadon")
public class ChiTietHoaDon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -703065805497070410L;
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "masanpham")
	private SanPham sanPham;

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mahoadon")
	private HoaDon hoaDon;

	@Column(name = "soLuong", nullable = false)
	private int soLuong;

	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChiTietHoaDon(SanPham sanPham, int soLuong) {
		super();
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public Double tinhTien() {
		return soLuong * sanPham.getGia();
	}

	public double tinhTienSanPham() {
		return sanPham.getGia() * soLuong;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + "]";
	}

}
