package hx.insist.pojo;

import java.util.Date;

public class Message {
    private String mid;

    private String name;

    private String email;

    private String messpic;

    private String messcontent;

    private Date messdate;

    private Integer floor;

    private Integer praise;

    @Override
    public String toString() {
        return "Message{" +
                "mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", messpic='" + messpic + '\'' +
                ", messcontent='" + messcontent + '\'' +
                ", messdate=" + messdate +
                ", floor=" + floor +
                ", praise=" + praise +
                '}';
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMesspic() {
        return messpic;
    }

    public void setMesspic(String messpic) {
        this.messpic = messpic == null ? null : messpic.trim();
    }

    public String getMesscontent() {
        return messcontent;
    }

    public void setMesscontent(String messcontent) {
        this.messcontent = messcontent == null ? null : messcontent.trim();
    }

    public Date getMessdate() {
        return messdate;
    }

    public void setMessdate(Date messdate) {
        this.messdate = messdate;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }
}