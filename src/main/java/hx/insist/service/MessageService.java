package hx.insist.service;

import com.github.pagehelper.PageInfo;
import hx.insist.pojo.Message;

public interface MessageService {

    void addMessage(Message message);
    void delMessage(String mid);
    PageInfo<Message> getAllMessage(int currentPage, int pageSize);//分页查询 PageInfo是page信息
}
