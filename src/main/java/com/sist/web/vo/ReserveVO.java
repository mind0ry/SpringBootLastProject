package com.sist.web.vo;

import java.util.Date;

import lombok.Data;

@Data
public class ReserveVO {

	private int no,cno,isReserve;
	private String id,rday,rtime,rinwon,dbday;
	private Date regdate;
	private SeoulVO svo=new SeoulVO();
}
