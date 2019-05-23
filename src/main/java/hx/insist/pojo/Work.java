package hx.insist.pojo;

public class Work {
    private Integer wid;

    private String wtitle;

    private String wintro;

    private String wimg;

    public Work() {
    }

    public Work(String wtitle, String wintro, String wimg) {
        this.wtitle = wtitle;
        this.wintro = wintro;
        this.wimg = wimg;
    }

    public Work(Integer wid, String wtitle, String wintro, String wimg) {
        this.wid = wid;
        this.wtitle = wtitle;
        this.wintro = wintro;
        this.wimg = wimg;
    }

    @Override
    public String toString() {
        return "Work{" +
                "wid=" + wid +
                ", wtitle='" + wtitle + '\'' +
                ", wintro='" + wintro + '\'' +
                ", wimg='" + wimg + '\'' +
                '}';
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWtitle() {
        return wtitle;
    }

    public void setWtitle(String wtitle) {
        this.wtitle = wtitle == null ? null : wtitle.trim();
    }

    public String getWintro() {
        return wintro;
    }

    public void setWintro(String wintro) {
        this.wintro = wintro == null ? null : wintro.trim();
    }

    public String getWimg() {
        return wimg;
    }

    public void setWimg(String wimg) {
        this.wimg = wimg == null ? null : wimg.trim();
    }
}