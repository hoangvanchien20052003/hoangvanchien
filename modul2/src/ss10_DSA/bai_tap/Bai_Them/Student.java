package ss10_DSA.bai_tap.Bai_Them;

import java.time.LocalTime;
import java.util.ArrayList;

public class Student extends Person{
    private String lop;
    private Double diem;
    private ArrayList elements;
    public Student(){

    }

    public String getMa(){
        return this.ma;
    }
    @Override
    public void themMoi(Object o) {
        elements = new ArrayList();
        elements.add(o);
    }

//    public void xoa(String id){
//        for(int i= 0;i < elements.size(); i++){
//            if(elements.get(i).equals(id)){
//                elements.remove(i);
//            }
//        }
//    }
    @Override
    public void danhSach() {
        for(int i = 0; i < elements.size();i++){
            System.out.println(elements.get(i));
        }
    }

    public Student(String ma, String ten, Double namSinh, String gioiTinh, String lop, Double diem){
        super(ma, ten, namSinh, gioiTinh);
        this.lop = lop;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "id: " + this.ma +
                ", name: " + this.ten +
                ", yearOfBirth: " + this.namSinh +
                ", gender: " + this.gioiTinh +
                ", class: " + this.lop +
                ", score: " + this.diem;

    }
}