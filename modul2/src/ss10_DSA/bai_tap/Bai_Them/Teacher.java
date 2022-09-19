package ss10_DSA.bai_tap.Bai_Them;

import java.util.ArrayList;

public class Teacher extends Person {
    private String chuyenMon;
    private ArrayList element;

    public Teacher() {

    }

    @Override
    public void themMoi(Object o) {
        element = new ArrayList();
        element.add(o);
    }

    @Override
    public void danhSach() {
        ArrayList elements = new ArrayList();
        for (Object element:elements) {
            System.out.println(element);
        }
    }

    public Teacher(String ma, String ten, Double namSinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, namSinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }


}
