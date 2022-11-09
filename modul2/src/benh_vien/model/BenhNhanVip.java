package benh_vien.model;

public class BenhNhapVip extends BenhAn{
    private String loaiVip;
    private String thoiHangVip;

    public BenhNhapVip(int soThuTu, String maBenhAn, String tenBenNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHangVip) {
        super(soThuTu, maBenhAn, tenBenNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHangVip = thoiHangVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHangVip() {
        return thoiHangVip;
    }

    public void setThoiHangVip(String thoiHangVip) {
        this.thoiHangVip = thoiHangVip;
    }

    @Override
    public String toString() {
        return "BenhNhapVip{" + super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHangVip='" + thoiHangVip + '\'' +
                '}';
    }
}
