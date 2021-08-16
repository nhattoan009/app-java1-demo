package asm;

import java.util.Scanner;

public class NhanVien {
	String hoTen;
	String maNV;
	String vaiTro;
	Double luong;

	public NhanVien(String hoTen, Double luong, String maNV, String vaiTro) {
		this.hoTen = hoTen;
		this.luong = luong;
		this.maNV = maNV;
		this.vaiTro = vaiTro;
	}

	public NhanVien() {
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Double getLuong() {
		return luong;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}

	public void setLuong(Double luong) {
		this.luong = luong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập mã NV: ");
		maNV = scanner.nextLine();
		System.out.print("Nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập lương: ");
		luong = scanner.nextDouble();
		scanner.nextLine();
	}

	void xuat() {
		System.out.printf("Mã: %s - Họ tên: %s - Lương: %s - Thu nhập: %f ", maNV, hoTen, luong, getThuNhap());
	}

	Double getThuNhap() {
		return getLuong();
	}

	Double getThueTN(double thue) {
		if (getThuNhap() < 9) {
			System.out.println("Không cần đống thuế");
		} else if ((getThuNhap() > 9) && getThuNhap() <= 15) {
			thue = getThuNhap() - 9 * 0.1;
		} else if (getThuNhap() > 15000000) {
			thue = ((getThuNhap() - 9 - 6 * (0.1)) + (getThuNhap() - 15 * 0.12));
		}
		return thue;
	}
}
