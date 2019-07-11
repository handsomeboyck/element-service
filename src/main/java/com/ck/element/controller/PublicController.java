package com.ck.element.controller;


import com.ck.element.domain.Command;
import com.ck.element.domain.JsonData;

import com.ck.element.domain.UserQuery;
import com.ck.element.service.CommandService;
import com.ck.element.service.GoodService;
import com.ck.element.service.UserService;

import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

@RestController
@RequestMapping("pub")
public class PublicController {

    @Autowired
    private UserService userService;

    @Autowired
    private GoodService goodService;

    @Autowired
    private CommandService commandService;

    /**
     * 返回需要登陆的页面
     * @return
     */
    @RequestMapping("need_login")
    public JsonData needLogin(){

        return JsonData.buildSuccess("温馨提示：请使用对应的账号登录",-2);

    }

    /**
     * @Descprition 测试连接,通过用户id查询用户
     * @param user_id
     * @return
     */
    @RequestMapping("test_connect")
    public JsonData test_connect(int user_id)
    {
//        List<User>lists =userService.findSimpleUserInfoById(user_id);
        return JsonData.buildSuccess(userService.findSimpleUserInfoById(user_id));


    }

    /**
     * post方式提交评论
     * @param command
     * @return
     */
    @PostMapping("command")
    public JsonData Command(@RequestBody Command command)
    {
        command.setDate(new Date());
        int id = commandService.InsertCommand(command);
        return JsonData.buildSuccess(id);

    }


    /**
     * get方式提交评论
     * @param user_name
     * @param text
     * @return
     */
    @RequestMapping("command")
    public JsonData command(@Param("user_name")String user_name,@Param("text")String text)
    {
        Command command = new Command();
        command.setDate(new Date());
        command.setText(text);
        command.setUser_name(user_name);
        int id = commandService.InsertCommand(command);
        return JsonData.buildSuccess(id);
    }

    @RequestMapping("findCommand")
    public  JsonData findCommand(@Param("limit")int limit)
    {

        return JsonData.buildSuccess(commandService.findCommand(limit));

    }

    /**
     *  通过名字模糊查询商品
     * @param name
     * @return
     */
    @RequestMapping("findByName")
    public JsonData findByName(String name)
    {
        return  JsonData.buildSuccess(goodService.findByName(name));
    }

    /**
     * 通过价格上限查询商品
     * @param price
     * @return
     */
    @RequestMapping("findByPrice")
    public JsonData findByPrice(float price)
    {
        return JsonData.buildSuccess(goodService.findByPrice(price));
    }

    /**
     * 通过价格上下限查询商品
     * @param max_price
     * @param min_price
     * @return
     */
    @RequestMapping("findByDividePrice")
    public JsonData findByDividePrice(float max_price,float min_price)
    {

        return JsonData.buildSuccess(goodService.findByDividePrice(max_price,min_price));
    }

    /**
     * 拒绝访问界面
     * @return
     */

    @RequestMapping("not_permit")
    public JsonData notPermit(){

        return JsonData.buildSuccess("温馨提示：拒绝访问，没权限",-3);
    }

    /**
     * 主页页面
     * @return
     */
    @RequestMapping("index")
    public JsonData index(){

//        List<String> videoList = new ArrayList<>();
//        videoList.add("Mysql零基础入门到实战 数据库教程");
//        videoList.add("Redis高并发高可用集群百万级秒杀实战");
//        videoList.add("Zookeeper+Dubbo视频教程 微服务教程分布式教程");
//        videoList.add("2019年新版本RocketMQ4.X教程消息队列教程");
//        videoList.add("微服务SpringCloud+Docker入门到高级实战");

        return JsonData.buildSuccess(userService.findAllGood());

    }


    /**
     * 登录接口
     * @param userQuery
     * @param request
     * @param response
     * @return
     */

    @PostMapping("login")
    public JsonData login(@RequestBody UserQuery userQuery, HttpServletRequest request, HttpServletResponse response){

        Subject subject = SecurityUtils.getSubject();
        Map<String,Object> info = new HashMap<>();
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userQuery.getName(), userQuery.getPwd());

            subject.login(usernamePasswordToken);

            info.put("msg","登录成功");
            info.put("session_id", subject.getSession().getId());

            return JsonData.buildSuccess(info);

        }catch (Exception e){
            e.printStackTrace();

            return JsonData.buildError("账号或者密码错误");

        }


    }




}
