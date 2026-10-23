package baiThiTuanHai.computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> listComputers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin may tinh");
        System.out.println("nhap so luong may tinh muon them : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap number : ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("nhap manufacturer : ");
            String manufacturer = sc.nextLine();
            System.out.println("nhap year : ");
            int year = sc.nextInt();
            System.out.println("nhap price : ");
            double price = sc.nextDouble();
            sc.nextLine();
            Computer com = new Computer();
            com.setNumber(number);
            com.setManuacturer(manufacturer);
            com.setYear(year);
            com.setPrice(price);
            listComputers.add(com);
            System.out.println("Thong tin may tinh vua nhap");
            com.displayInfo();
        }

        for (int i = 0; i < listComputers.size(); i++) {
            System.out.println("danh sach :");
            Computer computer = listComputers.get(i);
            computer.displayInfo();
        }
        sc.close();
    }
}
