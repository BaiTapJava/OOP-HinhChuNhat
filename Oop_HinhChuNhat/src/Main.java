import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chieu Dai: ");
        double chieuDai = sc.nextDouble();

        System.out.println("Chieu Rong: ");
        double chieuRong = sc.nextDouble();

        //Tao doi tuong trong 1 lop chua 2 thuoc tinh
        ClassTinhToanHCN hcn = new ClassTinhToanHCN(chieuDai,chieuRong);

        // Xuat ra man hinh chinh

        System.out.println("Hien Thi Chieu Dai va Chieu Rong: "+hcn.hienThi());

        System.out.println("Chu Vi Hinh Chu Nhat la: " +hcn.ChuVi());

        System.out.println("Dien tich Hinh Chu Nhat: "+ hcn.DienTich());
    }
}
