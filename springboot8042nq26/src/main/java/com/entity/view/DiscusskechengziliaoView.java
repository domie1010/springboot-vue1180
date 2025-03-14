package com.entity.view;

import com.entity.DiscusskechengziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 课程资料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 10:48:35
 */
@TableName("discusskechengziliao")
public class DiscusskechengziliaoView  extends DiscusskechengziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskechengziliaoView(){
	}
 
 	public DiscusskechengziliaoView(DiscusskechengziliaoEntity discusskechengziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusskechengziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
