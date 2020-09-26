package com.spring.module.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.module.test.model.TestVO;

@Controller
@RequestMapping("/test")
public class TestView {

	
	@RequestMapping(value="/messege", method = RequestMethod.GET)
	public String messege(Model model, TestVO vo) {
		model.addAttribute("messege", "View 확인용!!!");
		
		
		System.out.println("GET메소드 이름 : " + vo.getName());
		System.out.println("GET메소드 나이 : " + vo.getAge());
		model.addAttribute("item",vo);
		System.out.println("---------------");
		
		return "messege";
	}
	
	
	
	
	@RequestMapping(value="/messege", method = RequestMethod.POST)
	public String reMessege(TestVO vo, RedirectAttributes ra) {
		
		System.out.println("POST메소드 이름 : " + vo.getName());
		System.out.println("POST메소드 나이 : " + vo.getAge());
		System.out.println("---------------");
		ra.addFlashAttribute(vo);
		
		return "redirect:/test/messege";
	}
	
}
