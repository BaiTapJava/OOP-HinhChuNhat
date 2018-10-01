public class ClassTinhToanHCN {
    double chieuDai,chieuRong;
    public ClassTinhToanHCN(){}//constructor k co kieu tra ve

    public ClassTinhToanHCN(double chieuDai , double chieuRong) //Constructor co kieu tra ve
    {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double DienTich()
    {
        return chieuDai*chieuRong;
    }
    public double ChuVi()
    {
        return (chieuDai+chieuRong)/2;
    }

    public String hienThi()
    {
        return  "Chieu Dai la: "+chieuDai + " Va " + "Chieu Rong: "+chieuRong;
    }
}
