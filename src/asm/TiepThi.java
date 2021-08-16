package asm;

import java.util.Scanner;

public class TiepThi extends NhanVien {
	Double doanhSo;
	Double hoaHong;

	public TiepThi(String hoTen, Double luong, String maNV, String vaiTro, Double doanhSo, Double hoaHong) {
		super(hoTen, luong, maNV, vaiTro);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}

	public TiepThi() {

	}

	public Double getDoanhSo() {
		return doanhSo;
	}

	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}

	public Double getHoaHong() {
		return hoaHong;
	}

	public void setHoaHong(double hoaHong) {
		this.hoaHong = hoaHong;
	}

	void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhập doanh số: ");
		doanhSo = scanner.nextDouble();
		System.out.print("Nhập huê hồng: ");
		hoaHong = scanner.nextDouble();
	}

	void xuat() {
		super.xuat();
		System.out.printf("-Doanh số: %f - Huê hồng: %f \n", doanhSo, hoaHong);

	}

	@Override
	Double getThuNhap() {
		return luong + (doanhSo * hoaHong) / 100;
	}
}
