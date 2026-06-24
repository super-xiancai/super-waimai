package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import java.util.List;

public interface DishService {


      void savewithFlavor(DishDTO dishDTO);

     PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品（含口味）
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品（含口味）
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 启用、停用菜品
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);
}
