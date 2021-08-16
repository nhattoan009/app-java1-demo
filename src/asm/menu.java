package asm;

import java.io.IOException;
import java.util.Scanner;

public class menu {
	public static void main(String[] args) throws IOException {
		DSNV dsnv = new DSNV();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int x = 0;

			System.out.println("--Chon mot chuc nang--");

			System.out.println("1. Nhap danh sach nhan vien ");
			System.out.println("2. Xuat danh sach nhan vien ");
			System.out.println("3. Tim kiem nhan vien theo ma");
			System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim");
			System.out.println("5. Cap nhat thong tin nhan vien theo ma");
			System.out.println("6. Tim cac nhan vien theo khoang luong");
			System.out.println("7. Sap xep nhan vien theo ho và ten");
			System.out.println("8. Sap xep nhan vien theo thu nhap");
			System.out.println("9. Xuat nhan vien co thu nhap cao nhat");
			System.out.println("10. Tong luong");
			System.out.println("0. thoat");
			System.out.println("----------");

			x = scanner.nextInt();

			switch (x) {
			case 1:
				dsnv.nhap();
				break;
			case 2:
				dsnv.xuat();
				break;
			case 3:
				dsnv.timKiem();
				break;
			case 4:
				dsnv.xoa();
				break;
			case 5:
				dsnv.capNhat();
				break;
			case 6:
				dsnv.timTheoLuong();
				break;
			case 7:
				dsnv.sapXepTheoTen();
				break;
			case 8:
				dsnv.sapXepTheoThuNhap();
				break;
			case 9:
				dsnv.topLuongCaoNhat();
				break;
			case 10:
				dsnv.luongTB();
				break;
			case 0:
				System.out.println("thoat chuong trinh");
				System.exit(0);
				break;
			default:
				System.out.println("Moi nhap lai");

			}

		}
	}
}
