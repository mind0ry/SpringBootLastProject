package com.sist.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.service.BusanService;
import com.sist.web.service.JejuService;
import com.sist.web.service.SeoulService;
import com.sist.web.vo.BusanVO;
import com.sist.web.vo.JejuVO;
import com.sist.web.vo.SeoulVO;

import lombok.RequiredArgsConstructor;
/*
 *   1. 일반 보안 => 자동 로그인 => 프로시저 / 트리거 / 람다식
 *   2. JWT => 카카오 / 구글 로그인
 *   3. 소켓 : 실시간 : 그룹 / 1:1  =>  Spring AI (챗봇)
 *   4. 실시간 메세지 전송 : Kafka / batch
 *   5. MSA : React => NodeJS
 *   6. => CI/CD => 통합 => Spring Data => elasticSearch / Redis
 */  
@Controller
@RequiredArgsConstructor
public class MainController {

	private final BusanService bService;
	private final JejuService jService;
	private final SeoulService sService;
	
	@GetMapping("/main")
	public String main_page(Model model) {
		
		List<JejuVO> jList=jService.jejuTop4Data();
		
		for(JejuVO vo:jList) {
			String[] addrs=vo.getAddress().split(" ");
			vo.setAddress(addrs[0]+" "+addrs[1]);
		}
		
		List<SeoulVO> sList=sService.seoulTop5Data();
		
		for(SeoulVO vo:sList) {
			String[] addrs=vo.getAddress().split(" ");
			vo.setAddress(addrs[0]+" "+addrs[1]);
		}
		
		List<BusanVO> bList=bService.busanTop4Data();
		
		for(BusanVO vo:bList) {
			String[] addrs=vo.getAddress().split(" ");
			vo.setAddress(addrs[0]+" "+addrs[1]);
		}
		
		model.addAttribute("jList", jList);
		model.addAttribute("sList", sList);
		model.addAttribute("bList", bList);
		
		model.addAttribute("main_jsp", "../main/home.jsp");
		return "/main/main";
	}
}
