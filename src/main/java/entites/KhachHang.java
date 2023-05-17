package entites;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
@Table(name = "khachhang")
public class KhachHang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3311871723443656507L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int makhachhang;
	@Column(name = "tenkhachhang", columnDefinition = "nvarchar(250)")
	private String tenkhachhang;
	@Column(name = "sodienthoai", columnDefinition = "nvarchar(250)")
	private String sodienthoai;
	@Column(name = "diachi", columnDefinition = "nvarchar(250)")
	private String diachi;

	@OneToMany(mappedBy = "khachHang")
	private List<HoaDon> hoaDons;

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(int id, String tenkhachhang, String sodienthoai, String diachi) {
		super();
		this.makhachhang = id;
		this.tenkhachhang = tenkhachhang;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
	}

	public int getMakhachhang() {
		return makhachhang;
	}

	public void setMakhachhang(int makhachhang) {
		this.makhachhang = makhachhang;
	}

	public String getTenkhachhang() {
		return tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public List<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(List<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

	@Override
	public String toString() {
		return "KhachHang [makhachhang=" + makhachhang + ", tenkhachhang=" + tenkhachhang + ", sodienthoai="
				+ sodienthoai + ", diachi=" + diachi + "]";
	}

}
