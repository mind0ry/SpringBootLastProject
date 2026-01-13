package com.sist.web.vo;

import java.util.*;
// DRUD => 모든 사이트의 필수 : 댓글 (옵션)
import lombok.Data;

@Data
public class BoardVO {

	private int no,hit,replycount;
	private String name,subject,content,dbday,pwd;
	private Date regdate;
}
