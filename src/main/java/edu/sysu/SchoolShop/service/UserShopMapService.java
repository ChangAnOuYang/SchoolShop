package edu.sysu.SchoolShop.service;

import edu.sysu.SchoolShop.dto.UserShopMapExecution;
import edu.sysu.SchoolShop.entity.UserShopMap;

public interface UserShopMapService {

	UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
			int pageIndex, int pageSize);

}
