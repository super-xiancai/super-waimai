package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorsMapper {
    //批量插入

    void insertBatch(List<DishFlavor> flavors);


    //删除口味
//    @Delete("delete from dish_flavor where dish_id= #{dishId}")
//    void deleteByDishId(Long dishId);

    void deleteByDishIds(List<Long> dishIds);
}
