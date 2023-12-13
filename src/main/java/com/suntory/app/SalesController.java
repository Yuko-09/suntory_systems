package com.suntory.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suntory.dmain.entity.Sales;
import com.suntory.dmain.service.SalesService;

@Controller
@RequestMapping("/saleslist")
public class SalesController {
	/**
	 * セールス情報　Service
	 */
	@Autowired
	SalesService salesService;

	/**
	 * セールス情報一覧画面を表示
	 * @return セールス情報一覧画面のHTML
	 * 
	 */

	@RequestMapping(method = RequestMethod.GET)
	public String SDisplay(Model model) {
		List<Sales> salesList = salesService.searchAll();
		model.addAttribute("salesList", salesList);
		return "saleslist";
	}
}
