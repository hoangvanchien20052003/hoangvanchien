package phuong_tien.model;

import java.util.Objects;

public abstract class PhuongTien {
        private int bienKiemsoat;
        private String tenBanSanXuat;
        private int namSanXuat;
        private String chuSoHuu;

        public PhuongTien(int bienKiemsoat, String tenBanSanXuat, int namSanXuat, String chuSoHuu) {
            this.bienKiemsoat = bienKiemsoat;
            this.tenBanSanXuat = tenBanSanXuat;
            this.namSanXuat = namSanXuat;
            this.chuSoHuu = chuSoHuu;
        }

        public PhuongTien(int bienKiemsoat){
            this.bienKiemsoat = bienKiemsoat;
        }

        public int getBienKiemsoat() {
            return bienKiemsoat;
        }

        public void setBienKiemsoat(int bienKiemsoat) {
            this.bienKiemsoat = bienKiemsoat;
        }

        public String getTenBanSanXuat() {
            return tenBanSanXuat;
        }

        public void setTenBanSanXuat(String tenBanSanXuat) {
            this.tenBanSanXuat = tenBanSanXuat;
        }

        public int getNamSanXuat() {
            return namSanXuat;
        }

        public void setNamSanXuat(int namSanXuat) {
            this.namSanXuat = namSanXuat;
        }

        public String getChuSoHuu() {
            return chuSoHuu;
        }

        public void setChuSoHuu(String chuSoHuu) {
            this.chuSoHuu = chuSoHuu;
        }

        @Override
        public String toString() {
            return "Phuongtien{" +
                    "bienKiemsoat=" + bienKiemsoat +
                    ", tenBanSanXuat='" + tenBanSanXuat + '\'' +
                    ", namSanXuat=" + namSanXuat +
                    ", chuSoHuu='" + chuSoHuu + '\'' +
                    ',';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhuongTien that = (PhuongTien) o;
        return bienKiemsoat == that.bienKiemsoat;
    }
}
