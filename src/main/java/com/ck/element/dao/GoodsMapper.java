package com.ck.element.dao;

import com.ck.element.domain.Good;
import com.ck.element.provider.GoodProvider;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface GoodsMapper {
    @Select("Select * from Good")
    List<Good> findAllGood();

    @Select("select * from Good where name like '%${name}%'")
    List<Good> findByUsername(@Param("name") String name);

   @Select("select * from Good where price < #{price}")
    List<Good> findByPrice(@Param("price") float price);

    /**
     * 通过价格上下限查询商品
     * @param max_price
     * @param min_price
     * @return
     */
   @Select("select * from Good where price< #{max_price} and price > #{min_price} ")
    List<Good>  findByDividePrice(@Param("max_price")float max_price,@Param("min_price")float min_price);

    /**
     * 增加商品
     * @param good
     * @return
     */
    @Insert("INSERT INTO Good(name,price,date) VALUES(#{name}, #{price}, #{date})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(Good good);

    /**
     * 通过id删除商品
     * @param id
     */
    @Delete("delete from Good where id = #{id}")
    void Delete(int id);

    /**
     * 通过id更新商品信息
     */
//    @Update("update Good set price = #{price} where id = #{id}")
    @UpdateProvider(type = GoodProvider.class,method = "updateGood")
    void UpdateGood(Good good);


}
