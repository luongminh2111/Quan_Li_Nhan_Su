package query.MinhQuery.cau3;

public class Class3 {
    private String cnganh;
    private Integer soluong;

    public Class3(String cnganh, Integer soluong) {
        this.cnganh = cnganh;
        this.soluong = soluong;
    }

    public String getCnganh() {
        return cnganh;
    }

    public void setCnganh(String cnganh) {
        this.cnganh = cnganh;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "class3{" +
                "cnganh='" + cnganh + '\'' +
                ", soluong=" + soluong +
                '}';
    }
}
