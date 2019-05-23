package hx.insist.pojo;

public class Workinfo {
    private String winfoid;

    private Integer wid;

    private String winfocontent;

    public Workinfo() {
    }

    public Workinfo(Integer wid) {
        this.wid = wid;
    }

    public Workinfo(Integer wid, String winfocontent) {
        this.wid = wid;
        this.winfocontent = winfocontent;
    }

    public Workinfo(String winfoid, Integer wid, String winfocontent) {
        this.winfoid = winfoid;
        this.wid = wid;
        this.winfocontent = winfocontent;
    }

    @Override
    public String toString() {
        return "Workinfo{" +
                "winfoid='" + winfoid + '\'' +
                ", wid=" + wid +
                ", winfocontent='" + winfocontent + '\'' +
                '}';
    }

    public String getWinfoid() {
        return winfoid;
    }

    public void setWinfoid(String winfoid) {
        this.winfoid = winfoid == null ? null : winfoid.trim();
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWinfocontent() {
        return winfocontent;
    }

    public void setWinfocontent(String winfocontent) {
        this.winfocontent = winfocontent == null ? null : winfocontent.trim();
    }
}