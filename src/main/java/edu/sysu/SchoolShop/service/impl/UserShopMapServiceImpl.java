package edu.sysu.SchoolShop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sysu.SchoolShop.dao.UserShopMapDao;
import edu.sysu.SchoolShop.dto.UserShopMapExecution;
import edu.sysu.SchoolShop.entity.UserShopMap;
import edu.sysu.SchoolShop.service.UserShopMapService;
import edu.sysu.SchoolShop.util.PageCalculator;

@Service
public class UserShopMapServiceImpl implements UserShopMapService {
	@Autowired
	private UserShopMapDao userShopMapDao;

	@Override
	public UserShopMapExecution listUserShopMap(
			UserShopMap userShopMapCondition, int pageIndex, int pageSize) {
		if (userShopMapCondition != null && pageIndex != -1 && pageSize != -1) {
			int beginIndex = PageCalculator.calculateRowIndex(pageIndex,
					pageSize);
			List<UserShopMap> userShopMapList = userShopMapDao
					.queryUserShopMapList(userShopMapCondition, beginIndex,
							pageSize);
			int count = userShopMapDao
					.queryUserShopMapCount(userShopMapCondition);
			UserShopMapExecution ue = new UserShopMapExecution();
			ue.setUserShopMapList(userShopMapList);
			ue.setCount(count);
			return ue;
		} else {
			return null;
		}

	}
}
