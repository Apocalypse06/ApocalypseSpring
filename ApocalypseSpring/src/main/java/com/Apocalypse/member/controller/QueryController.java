package com.Apocalypse.member.controller;

import java.util.List;
import java.util.Map;

import javax.persistence.Index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Apocalypse.point.bean.PointBean;
import com.Apocalypse.point.model.dao.IPointDao;

@RestController
@RequestMapping("/top")
public class QueryController {
	@Autowired
	IPointDao iPointDao;

	@RequestMapping("/get")
	public List<Map<String, Object>> getPoint() throws Exception {
		System.out.println(".....http://localhost:8080/ApocalypseSpring/top/get");
		List<Map<String, Object>> res=iPointDao.getPoint();
		System.out.println(res);
		return res;
	}
}
