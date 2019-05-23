package hx.insist.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import hx.insist.mapper.MessageMapper;
import hx.insist.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public void addMessage(Message message) {
        message.setMid(UUID.randomUUID().toString());
        message.setMessdate(new Date());
        message.setPraise(0);
        messageMapper.insert(message);
    }

    @Override
    public void delMessage(String mid) {
        messageMapper.deleteByPrimaryKey(mid);
    }

    @Override
    public PageInfo<Message> getAllMessage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        //PageHelper.startPage 的下一个查询将会是分页查询。
        List<Message> messages = messageMapper.selectAllMessage();
        PageInfo<Message> pageInfo = new PageInfo(messages);
        return pageInfo;
    }
}
