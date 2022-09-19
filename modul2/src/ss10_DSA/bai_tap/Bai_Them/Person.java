package ss10_DSA.bai_tap.Bai_Them;

import java.sql.Time;
import java.time.LocalTime;
import java.util.*;

public class Person {
    public String ma;
    public String ten;
    public Double namSinh;
    public String gioiTinh;

    public Person() {
    }

    public Person(String ma, String ten, Double namSinh, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public void themMoi(Object o){};
    public void danhSach(){};

//    public abstract void xoa();
}

