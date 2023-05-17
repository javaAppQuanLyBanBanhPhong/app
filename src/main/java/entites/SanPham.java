package entites;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sanpham")
public class SanPham implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5855623263515813649L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int masanpham;
	@Column(name = "tensanpham", columnDefinition = "nvarchar(250)")
	private String tensanpham;
	@Column(name = "gia", columnDefinition = "decimal(10,2)")
	private double gia;
	@Column(name = "soluong", columnDefinition = "int")
	private int soluong;
	
	@OneToMany(mappedBy = "sanPham")
	private List<ChiTietHoaDon> chiTietHoaDons;

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPham(String tensanpham, double gia, int soluong) {
		super();
		this.tensanpham = tensanpham;
		this.gia = gia;
		this.soluong = soluong;
	}

	

	public int getMasanpham() {
		return masanpham;
	}

	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	
	public List<ChiTietHoaDon> getChiTietHoaDons() {
		return chiTietHoaDons;
	}

	public void setChiTietHoaDons(List<ChiTietHoaDon> chiTietHoaDons) {
		this.chiTietHoaDons = chiTietHoaDons;
	}

	@Override
	public String toString() {
		return "SanPham [id=" + masanpham + ", tensanpham=" + tensanpham + ", gia=" + gia + ", soluong=" + soluong + "]";
	}

}
