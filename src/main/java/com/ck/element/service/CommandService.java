package com.ck.element.service;

import com.ck.element.domain.Command;


import java.util.List;

/**
 * 评论服务类
 */

public interface CommandService {
    int InsertCommand(Command command);

    List<Command> findCommand(int limit);
}
