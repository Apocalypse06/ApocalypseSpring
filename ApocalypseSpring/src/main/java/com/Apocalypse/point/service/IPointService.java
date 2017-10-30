package com.Apocalypse.point.service;

import java.util.List;

import com.Apocalypse.point.bean.PointBean;

public interface IPointService {

	public int addPoint(String pointName) throws Exception;

	public List<PointBean> showPoint(String pointName) throws Exception;
	
	public List<PointBean> showPointList() throws Exception;

	public int updatePoint(PointBean pointBean) throws Exception;
}