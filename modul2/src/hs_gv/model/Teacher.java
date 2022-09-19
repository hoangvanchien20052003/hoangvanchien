package hs_gv.model;

public class Teacher extends Person{
    private String ma;
    public String chuyenMon;

    public Teacher(String ten, int ngaySinh, String gioiTinh, String ma, String chuyenMon) {
        super(ten, ngaySinh, gioiTinh);
        this.ma = ma;
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ma='" + ma + '\'' +
                ", chuyenMon='" + chuyenMon + '\'' +
                '}';
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
