package baiThiTuanHai.computer;

public class Computer {
    private int number;
    private String manuacturer;
    private int year;
    private double price;

    public Computer() {
        this.number = 0;
        this.manuacturer = null;
        this.year = 2026;
        this.price = 0;
    }

    public Computer(int number, String manuacturer, int year, double price) {
        this.number = number;
        this.manuacturer = manuacturer;
        this.year = year;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getManuacturer() {
        return manuacturer;
    }

    public void setManuacturer(String manuacturer) {
        this.manuacturer = manuacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("year khong duoc am");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("price khong duoc am");
        }
    }

    public void displayInfo() {
        System.out.println("Number (ID) : " + number);
        System.out.println("Manufacturer : " + manuacturer);
        System.out.println("Year of manufacture : " + year);
        System.out.println("Price : " + price);
    }
}
