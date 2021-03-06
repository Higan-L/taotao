package com.taotao.mapper;

import java.util.List;

import com.taotao.pojo.TbContentCategory;

public interface TbContentCategoryMapper {
	/**
	 * 根据当前id查询内容分类信息 
	 * @param parentId 父级类目id
	 * @return 当前父级类目下的子内容分类
	 */
	List<TbContentCategory> getTbContentCategoryByParentId(long parentId);
	/**
	 * 添加一个分类信息 到数据库
	 * @param tbContentCategory 需要添加的分类信息对象
	 */
	void addTbContentCategory(TbContentCategory tbContentCategory);
	/**
	 * 根据当前id查询 指定内容分类
	 * @param parentId 当前父级目录id
	 * @return 当前父级目录分类信息
	 */
	TbContentCategory getTbContentCategoryById(long parentId);
	/**
	 * 修改内容分类信息
	 * @param tbContentCategory 需要修改的内容分类信息对象
	 */
	void updateTbContentCategory(TbContentCategory tbContentCategory);
}