package asm;

public class HanhChinh extends NhanVien {
	public HanhChinh() {

	}

	void xuat() {
		super.xuat();
		System.out.println("\n");
	}

	public HanhChinh(String manv, String hoten, double luong) {
		super(hoten, luong, manv, "Nh�n vi�n h�nh ch�nh");
	}

	@Override
	public Double getThuNhap() {
		return getLuong();
	}
}
