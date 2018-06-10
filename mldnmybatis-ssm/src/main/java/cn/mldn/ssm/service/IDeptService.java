package cn.mldn.ssm.service;

import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import cn.mldn.ssm.dao.table.entity.Dept;

public interface IDeptService {

	boolean add(Dept vo);
	@Cacheable(cacheNames = "dept")
	Dept edit(Dept vo);

	@CacheEvict(cacheNames = "dept", key = "#ids[0]")
	boolean delete(List ids);

	@Cacheable(cacheNames = "dept")
	Dept findById(String keyId);
//	public Map<String, Object> list(long currentPage, int lineSize, String column, String keyWord) ;

}
