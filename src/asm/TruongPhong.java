package asm;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
	Double trachNhiem;


	public TruongPhong(String hoTen, Double luong, String maNV, String vaiTro, Double trachNhiem) {
		super(hoTen, luong, maNV, vaiTro);
		this.trachNhiem = trachNhiem;
	}

	public TruongPhong() {
	}

	public Double getTrachNhiem() {
		return trachNhiem;
	}

	public void setTrachNhiem(double trachNhiem) {
		this.trachNhiem = trachNhiem;
	}

	void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhập lương trách nhiệm: ");
		trachNhiem = scanner.nextDouble();
		scanner.nextLine();
	}

	void xuat() {
		super.xuat();
		System.out.printf(" - Lương trách nhiệm: %f \n", trachNhiem);
	}

	@Override
	Double getThuNhap() {
		return getLuong() + trachNhiem;
	}
}
