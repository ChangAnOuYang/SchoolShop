package edu.sysu.SchoolShop.dao;

import java.util.List;

import edu.sysu.SchoolShop.entity.Area;

public interface AreaDao {
	/**
	 * 列出地域列表
	 * 
	 * @param areaCondition
	 * @return
	 */
	List<Area> queryArea();

	/**
	 * 
	 * @param area
	 * @return
	 */
	int insertArea(Area area);

	/**
	 * 
	 * @param area
	 * @return
	 */
	int updateArea(Area area);

	/**
	 * 
	 * @param areaId
	 * @return
	 */
	int deleteArea(long areaId);

	/**
	 * 
	 * @param areaIdList
	 * @return
	 */
	int batchDeleteArea(List<Long> areaIdList);
}
