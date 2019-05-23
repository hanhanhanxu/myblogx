package hx.insist.service;

import hx.insist.mapper.AdminMapper;
import hx.insist.pojo.Admin;
import hx.insist.utils.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        //加密账号密码再去验证
        admin.setAusername(WebUtil.md5(admin.getAusername()));
        admin.setApassword(WebUtil.md5(admin.getApassword()));
        return adminMapper.selectByUnPw(admin);
    }
}
