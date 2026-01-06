package com.sist.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.*;

@Mapper
@Repository
public interface SeoulMapper {

	public List<SeoulVO> seoulListData(Map map);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM seoultravel "
			+ "WHERE contenttype=#{contenttype}")
	public int seoulTotalPage(int contenttype);
	
	public SeoulVO seoulAttractionDetailData(int contentid);
	
	public void seoulHitIncrement(int contentid);
	
	public List<SeoulVO> seoulFindData(Map map);
	
	public int seoulFindTotalPage(String address);
	
	public List<SeoulVO> seoulTop5Data();
}
