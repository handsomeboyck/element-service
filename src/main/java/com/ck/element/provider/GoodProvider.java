package com.ck.element.provider;

import com.ck.element.domain.Good;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ClassName GoodProvider
 * @Description 更新商品的动态SQl类
 * @Author ck
 * @Date 2019/6/29 22:16
 * @Version 1.0
 **/
public class GoodProvider {
    /**
     * 更新商品的方法
     * @param good
     * @return
     */
    public String updateGood(final Good good) {
        return new SQL() {
            {
                UPDATE("Good");
                if (good.getName() != null) {
                    SET("name= #{name}");
                }
                if (good.getPrice() != null) {
                    SET("price = #{price}");
                }
                if(good.getDate()!=null)
                {
                    SET("date = #{date}");
                }
                WHERE("id = #{id}");
            }
        }.toString();
    }
    /**
     * 插入商品的方法
     */
    public String insertGood(final Good good) {
        return new SQL() {
            {
                 INSERT_INTO("Good");
                if (good.getName() != null) {
                    SET("name= #{name}");
                }
                if (good.getPrice() != null) {
                    SET("price = #{price}");
                }
                if(good.getDate() != null)
                {
                    SET("date = {Date}");
                }
            }
        }.toString();
    }

}

