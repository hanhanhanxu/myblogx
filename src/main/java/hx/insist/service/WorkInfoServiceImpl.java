package hx.insist.service;


import hx.insist.mapper.WorkinfoMapper;
import hx.insist.pojo.Workinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WorkInfoServiceImpl implements WorkInfoService {

    @Autowired
    private WorkinfoMapper workinfoMapper;

    @Override
    public void addWorkInfo(Workinfo workinfo) {
        workinfo.setWinfoid(UUID.randomUUID().toString());
        //System.out.println("service层的workinfo:"+workinfo);
        workinfoMapper.insert(workinfo);
    }

    @Override
    public Workinfo getWorkinfoByWid(Integer wid) {
        return workinfoMapper.selectByWid(wid);
    }

    @Override
    public void deleteWorkinfoByid(Integer wid) {
        //workinfoMapper.deleteByWid(id);
    }
}
