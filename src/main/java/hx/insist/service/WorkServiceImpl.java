package hx.insist.service;


import com.github.pagehelper.PageHelper;
import hx.insist.mapper.WorkMapper;
import hx.insist.mapper.WorkinfoMapper;
import hx.insist.pojo.Work;
import hx.insist.pojo.Workinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import com.github.pagehelper.PageInfo;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;
    @Autowired
    private WorkinfoMapper workinfoMapper;

    @Override
    public void addwork(Work work) {
        workMapper.insert(work);

    }

    @Override
    public void deletework(Integer id) {
        workMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int getIdByimg(String img) {
        return workMapper.selectIdByimg(img);
    }

    @Override
    public List<Work> get6Work() {
        List list = workMapper.select6Work();
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public Work getWorkByWid(Integer wid) {
        return workMapper.selectByPrimaryKey(wid);
    }

    @Override//分页查询
    public PageInfo<Work> getAllWork(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        //PageHelper.startPage 的下一个查询将会是分页查询。
        List<Work> works = workMapper.selectAllWork();

        PageInfo<Work> pageInfo = new PageInfo(works);
        return pageInfo;
    }
}
