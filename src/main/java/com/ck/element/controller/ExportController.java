package com.ck.element.controller;

import com.ck.element.domain.Good;
import com.ck.element.service.GoodService;
import com.ck.element.util.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import java.util.List;

/**
 * @ClassName ExportController
 * @Description TODO
 * @Author ck
 * @Date 2019/6/29 22:57
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class ExportController {
    @Autowired
    private GoodService goodService;
    @RequestMapping("export")
    public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取数据
        System.out.println("KKKKKKKK");
        List<Good> list = goodService.findAllGoods();
        //日期格式化

        //定义渠道
        String url = "";
        //excel标题
        String[] title = {"id","商品名称","商品价格","商品日期"};

        //excel文件名
        String fileName = "商品信息表"+System.currentTimeMillis()+".xls";

        //sheet名
        String sheetName = "商品信息表一";
        String content[][] = new String[list.size()][title.length];
        for (int i = 0; i < list.size(); i++) {
            Good good= list.get(i);

            //时间戳格式化日期yyyy-MM-dd hh:mm:ss

//            System.out.println(userInfo);
            content[i][0] = good.getId().toString();
            content[i][1] = good.getName();
            content[i][2] = good.getPrice().toString();
            content[i][3] = good.getDate().toString();




        }

        //创建HSSFWorkbook
        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);

        //响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public String getWeekOfDate(Date date) {
//        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
//        if (w < 0)
//            w = 0;
//        return weekDays[w];
//    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
