package asm;

public class HanhChinh extends NhanVien {
	public HanhChinh() {

	}

	void xuat() {
		super.xuat();
		System.out.println("\n");
	}

	public HanhChinh(String manv, String hoten, double luong) {
		super(hoten, luong, manv, "Nhân viên hành chính");
	}

	@Override
	public Double getThuNhap() {
		return getLuong();
	}
}
