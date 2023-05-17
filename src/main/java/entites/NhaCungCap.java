package entites;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhacungcap")
public class NhaCungCap implements Serializable{

	@Id
	@GeneratedValue
	private int maNhaCungCap;
	
	private String tenNhaCungCap;
	
	private Date ngayNhap;
	
	private String soDienThoai;
	
	private String diaChi;
}
