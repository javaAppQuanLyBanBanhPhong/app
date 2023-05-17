package entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hoadon")
public class HoaDon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6639381494211799501L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mahoadon;
	@Column(name = "ngaylaphoadon", columnDefinition = "date")
	private Date ngaylaphoadon;
	@Column(name = "trangThaiThanhToan")
	private boolean trangthaithanhtoan;

	@OneToMany(mappedBy = "hoaDon")
	private List<ChiTietHoaDon> chiTietHoaDons;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "makhachhang")
	private KhachHang khachHang;

	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoaDon(int mahoadon, Date ngaylaphoadon, boolean trangthaithanhtoan) {
		super();
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.trangthaithanhtoan = trangthaithanhtoan;
	}

	public int getMahoadon() {
		return mahoadon;
	}

	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}

	public Date getNgaylaphoadon() {
		return ngaylaphoadon;
	}

	public void setNgaylaphoadon(Date ngaylaphoadon) {
		this.ngaylaphoadon = ngaylaphoadon;
	}

	public boolean isTrangthaithanhtoan() {
		return trangthaithanhtoan;
	}

	public void setTrangthaithanhtoan(boolean trangthaithanhtoan) {
		this.trangthaithanhtoan = trangthaithanhtoan;
	}

	public List<ChiTietHoaDon> getChiTietHoaDons() {
		return chiTietHoaDons;
	}

	public void setChiTietHoaDons(List<ChiTietHoaDon> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public double tongTien(){
		double tongTien = 0;
		for (ChiTietHoaDon chiTietHoaDon : chiTietHoaDons) {
			tongTien += chiTietHoaDon.tinhTien();
		}
		return tongTien;
	}

	@Override
	public String toString() {
		return "HoaDon [mahoadon=" + mahoadon + ", ngaylaphoadon=" + ngaylaphoadon + ", trangthaithanhtoan="
				+ trangthaithanhtoan + "]";
	}

}
