package entites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class TaiKhoan implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4918664297174281334L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mataikhoan;
	@Column(name = "username", columnDefinition = "nvarchar(50)")
	private String username;
	@Column(name = "password", columnDefinition = "nvarchar(50)")
	private String password;

	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(int id, String username, String password) {
		super();
		this.mataikhoan = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return mataikhoan;
	}

	public void setId(int id) {
		this.mataikhoan = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TaiKhoan [id=" + mataikhoan + ", username=" + username + ", password=" + password + "]";
	}

}
