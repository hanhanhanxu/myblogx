package hx.insist.service;


import hx.insist.pojo.Workinfo;

public interface WorkInfoService {
    public void addWorkInfo(Workinfo workinfo);
    public Workinfo getWorkinfoByWid(Integer wid);
    public void deleteWorkinfoByid(Integer wid);
}
