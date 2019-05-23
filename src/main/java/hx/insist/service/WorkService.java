package hx.insist.service;

import com.github.pagehelper.PageInfo;
import hx.insist.pojo.Work;

import java.util.List;

public interface WorkService {
    public void addwork(Work work);
    public void deletework(Integer id);
    public int getIdByimg(String img);
    public List<Work> get6Work();
    public Work getWorkByWid(Integer wid);
    public PageInfo<Work> getAllWork(int currentPage, int pageSize);//分页查询 PageInfo是page信息
}
