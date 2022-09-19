package phuong_tien.model;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(int bienKiemsoat, String tenBanSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemsoat, tenBanSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai(int bienKiemsoat){
        super(bienKiemsoat);
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Xetai{" + super.toString() +
                "trongTai=" + trongTai +
                '}';
    }
}
