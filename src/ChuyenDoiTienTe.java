import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vnd = 1;
        double $;
        System.out.println("Moi ban nhap so tien can chuyen doi tu $ => VND : ");
        $=input.nextDouble();
        System.out.println(" So tien ban nhan duoc la : "+ doiTien($,vnd) +"VND");
    }

    private static double doiTien(double $, double vnd) {
        vnd=$*23000;
        return vnd ;
    }
}
