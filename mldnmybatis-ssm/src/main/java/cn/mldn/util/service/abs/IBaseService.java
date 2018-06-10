package cn.mldn.util.service.abs;

import java.util.List;


public interface IBaseService<K,V> {
	public boolean add(V vo);
	public V edit(V vo);
	public boolean delete(List ids);
	public V findById(K keyId);
}
