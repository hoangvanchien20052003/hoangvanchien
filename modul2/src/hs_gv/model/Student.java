package hs_gv.model;

public class Student extends Person {
    private String ma;
    private String lop;
    private double diemSo;

    public Student(String ma) {
        this.ma = ma;
    }

    public Student(String ten, int ngaySinh, String gioiTinh, String ma, String lop, double diemSo) {
        super(ten, ngaySinh, gioiTinh);
        this.ma = ma;
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ma='" + ma + '\'' +
                ", lop='" + lop + '\'' +
                ", diemSo=" + diemSo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ma.equals(student.ma);
    }

}
