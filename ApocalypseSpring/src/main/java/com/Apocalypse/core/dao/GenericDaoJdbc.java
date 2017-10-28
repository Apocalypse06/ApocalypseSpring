package com.Apocalypse.core.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class GenericDaoJdbc<T> extends JdbcDaoSupport{
	private Class<T> classOfObjectClass;
	
	 @Autowired 
	 private DataSource dataSource; 

	 @PostConstruct
	 private void initialize(){ 
		 setDataSource(dataSource);
	 } 
	
	@SuppressWarnings("unchecked")
	public GenericDaoJdbc(){
		this.classOfObjectClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Map<String,Object> getMapByKey(String sql, List<Object> values) throws Exception{
		List<Map<String,Object>> list = this.findBySqlQueryMap(sql, values);
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}
	
	public T getBeanByKey(String sql, List<Object> values) throws Exception{
		List<T> list = this.findBySqlQueryBean(sql, values);
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}

	public List<Map<String, Object>> findBySqlQueryMap(String sql, List<Object> values) throws Exception{
		if(values == null){
			return getJdbcTemplate().queryForList(sql);
		}
		return getJdbcTemplate().queryForList(sql, values.toArray());
	}

	public List<T> findBySqlQueryBean(String sql, List<Object> values) throws Exception {
		if(values == null){
			return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<T>(classOfObjectClass));
		}
		return getJdbcTemplate().query(sql, values.toArray(), new BeanPropertyRowMapper<T>(classOfObjectClass));
	} 
	
	public int updateBySql(String sql, Object... values) throws Exception{
		return getJdbcTemplate().update(sql, values);
	}
	
	public int updateBySql(String sql, List<Object> values) throws Exception{
		return getJdbcTemplate().update(sql, values.toArray());
	}
	
	public int batchUpdate(String sql, BatchPreparedStatementSetter pss) throws Exception {
		getJdbcTemplate().batchUpdate(sql, pss);
		return 0;
	}
	
	public int queryForInt(String sql, List<Object> values) throws Exception{
		return getJdbcTemplate().queryForObject(sql, Integer.class, values.toArray());
	}
	
	public String queryForString(String sql, List<Object> values) throws Exception{
		return getJdbcTemplate().queryForObject(sql, String.class, values.toArray());
	}

}
