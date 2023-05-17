package entites;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhacungcap")
public class HangHoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6907979308249714845L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int masohanghoa;
	private String tennhacungcap;
	private double dongia;
	private int soluong;
	private String sodienthoai;
	private String diachi;
	public HangHoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangHoa(int masohanghoa, String tennhacungcap, double dongia, int soluong, String sodienthoai,
			String diachi) {
		super();
		this.masohanghoa = masohanghoa;
		this.tennhacungcap = tennhacungcap;
		this.dongia = dongia;
		this.soluong = soluong;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
	}
	public int getMasohanghoa() {
		return masohanghoa;
	}
	public void setMasohanghoa(int masohanghoa) {
		this.masohanghoa = masohanghoa;
	}
	public String getTennhacungcap() {
		return tennhacungcap;
	}
	public void setTennhacungcap(String tennhacungcap) {
		this.tennhacungcap = tennhacungcap;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "HangHoa [masohanghoa=" + masohanghoa + ", tennhacungcap=" + tennhacungcap + ", dongia=" + dongia
				+ ", soluong=" + soluong + ", sodienthoai=" + sodienthoai + ", diachi=" + diachi + "]";
	}
	
	
}
