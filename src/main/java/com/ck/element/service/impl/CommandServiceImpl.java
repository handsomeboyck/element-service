package com.ck.element.service.impl;


import com.ck.element.dao.CommandMapper;
import com.ck.element.domain.Command;
import com.ck.element.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CommandServiceImpl
 * @Description 评论接口
 * @Author ck
 * @Date 2019/6/27 20:34
 * @Version 1.0
 **/
@Service
public class CommandServiceImpl implements CommandService {
    @Autowired
    private CommandMapper commandMapper;
    public int InsertCommand(Command command)
    {
        commandMapper.insert(command);
        return command.getId();

    }




    public List<Command> findCommand(int limit)
    {
       return commandMapper.findCommand(limit);
    }


}
