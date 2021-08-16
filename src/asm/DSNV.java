package asm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DSNV {
	private ArrayList<NhanVien> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	void nhap() throws IOException {
		do {
			System.out.println("Nhập loại nhân viên: 1: Hành chính 2: Trưởng phòng 3: Tiếp thị x: Thoát");
			String loai = scanner.nextLine();
			if (loai.equals("x"))
				break;
			int x = Integer.parseInt(loai);

			switch (x) {
			case 1:
				System.out.println("NHÂN VIÊN HÀNH CHÍNH");
				HanhChinh hanhChinh = new HanhChinh();
				hanhChinh.nhap();
				list.add(hanhChinh);
				break;
			case 2:
				System.out.println("TRƯỞNG PHÒNG");
				TruongPhong truongPhong = new TruongPhong();
				truongPhong.nhap();
				list.add(truongPhong);
				break;
			case 3:
				System.out.println("NHÂN VIÊN TIẾP THỊ");
				TiepThi tiepThi = new TiepThi();
				tiepThi.nhap();
				list.add(tiepThi);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + x);
			}
		} while (true);
	}

	void xuat() {
		System.out.println("DANH SÁCH NHÂN VIÊN : ");
		for (NhanVien nv : list) {
			if (nv instanceof HanhChinh) {
				((HanhChinh) nv).xuat();
			} else if (nv instanceof TiepThi) {
				((TiepThi) nv).xuat();
			} else if (nv instanceof TruongPhong) {
				((TruongPhong) nv).xuat();
			}
			System.out.println("\n");
		}
	}

	void timKiem() {
		System.out.print("Nhập mã nhân viên cần tìm: ");
		String ma = scanner.nextLine();
		NhanVien nvfound = null;
		for (NhanVien nv : list) {
			if (nv.getMaNV().equalsIgnoreCase(ma)) {
				nvfound = nv;
				break;
			}
		}
		if (nvfound != null) {
			System.out.println("thông tin nhân viên đã tìm thấy theo mã : ");
			nvfound.xuat();
		} else {
			System.out.println("Không tìm thấy nhân viên có mã: " + ma);
		}
	}

	void xoa() {
		System.out.print("Nhập mã nhân viên cần xóa:  ");
		String ma = scanner.nextLine();
		NhanVien nvfound = null;
		for (NhanVien nv : list) {
			if (nv.getMaNV().equalsIgnoreCase(ma)) {
				nvfound = nv;
				break;
			}
		}
		if (nvfound != null) {
			list.remove(nvfound);
			System.out.println("Đã xóa !");
		} else {
			System.out.printf("Nhân viên có mã %f không tìm thấy !!", ma);
		}
	}

	void capNhat() {
		System.out.print("Nhập mã nhân viên cần cập nhật: ");
		String ma = scanner.nextLine();

		NhanVien nvfound = null;

		for (NhanVien item : list) {
			if (item.getMaNV().equalsIgnoreCase(ma)) {
				nvfound = item;
				break;
			}
		}
		if (nvfound != null) {
			if (nvfound instanceof HanhChinh) {
				((HanhChinh) nvfound).nhap();
			} else if (nvfound instanceof TruongPhong) {
				((TruongPhong) nvfound).nhap();
			} else if (nvfound instanceof TiepThi) {
				((TiepThi) nvfound).nhap();
			}
		} else {
			System.out.println("Không tìm thấy mã nhân viên, mã: " + ma);
		}
	}

	void timTheoLuong() {
		System.out.print("Nhập khoảng lương thấp nhất: ");
		double min = scanner.nextDouble();
		System.out.print("Nhập khoảng lương cao nhất");
		double max = scanner.nextDouble();
		boolean found = false;
		for (NhanVien nv : list) {
			if (nv.getLuong() >= min && nv.getLuong() <= max) {
				nv.xuat();
				System.out.println("\n");
				found = true;
			}
		}
		if (found == false) {
			System.out.println("Không có nhân viên nào có trong khoản cần tìm ");
		}
	}

	void sapXepTheoTen() {
		Collections.sort(list, (a, b) -> a.getHoTen().compareTo(b.getHoTen()));
		//Collections.reverse(list);

		System.out.println("Danh sách nhân viên đã xắp sếp:");
		for (NhanVien x : list) {
			x.xuat();
		}
	}

	void sapXepTheoThuNhap() {
		Collections.sort(list, (a, b) -> (int) (a.getThuNhap() - b.getThuNhap()));
		//Collections.reverse(list);

		System.out.println("Danh sách nhân viên sau khi xắp sếp:");
		for (NhanVien x : list) {
			x.xuat();
		}
	}

	void topLuongCaoNhat() {
		Collections.sort(list, (a, b) -> (int) (b.getThuNhap() - a.getThuNhap()));
		System.out.println("Danh sách nhân viên có thu nhập cao nhất");
		for (int i = 0; i < 2 && i < list.size(); i++) {
			list.get(i).xuat();
		}
	}

	void luongTB() {
		double tong = 0;
		int x = 0;
		for (NhanVien nv : list) {
			tong += nv.getLuong();
			x++;
		}
		System.out.println("Tong: " + tong);
		System.out.println("TB: " + tong / x);
	}
}
