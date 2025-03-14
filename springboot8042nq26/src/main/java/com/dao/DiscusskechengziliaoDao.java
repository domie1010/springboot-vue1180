package com.dao;

import com.entity.DiscusskechengziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskechengziliaoVO;
import com.entity.view.DiscusskechengziliaoView;


/**
 * 课程资料评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:35
 */
public interface DiscusskechengziliaoDao extends BaseMapper<DiscusskechengziliaoEntity> {
	
	List<DiscusskechengziliaoVO> selectListVO(@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);
	
	DiscusskechengziliaoVO selectVO(@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);
	
	List<DiscusskechengziliaoView> selectListView(@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);

	List<DiscusskechengziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);

	
	DiscusskechengziliaoView selectView(@Param("ew") Wrapper<DiscusskechengziliaoEntity> wrapper);
	

}
