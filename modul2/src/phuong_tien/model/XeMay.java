package phuong_tien.model;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(int bienKiemsoat, String tenBanSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemsoat, tenBanSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(int bienKiemsoat){
        super(bienKiemsoat);
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "xeMay{" + super.toString() +
                "congSuat=" + congSuat +
                '}';
    }
}
