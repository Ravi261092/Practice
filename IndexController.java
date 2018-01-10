package com.soe.web.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soe.service.domain.AddCategoryService;
import com.soe.service.domain.AddPostService;
import com.soe.service.domain.FreeStudyCatService;
import com.soe.service.domain.FreeStudySubCatService;
import com.soe.service.domain.HighlightsService;
import com.soe.service.domain.LatestNewsService;
import com.soe.service.domain.ResultService;
import com.soe.service.domain.SliderService;
import com.soe.service.pojo.AddPostDetails;
import com.soe.service.pojo.CategoryDetails;
import com.soe.service.pojo.FreeStudyCatPojo;
import com.soe.service.pojo.FreeStudySubCategoryPojo;
import com.soe.service.pojo.HighlightsPojo;
import com.soe.service.pojo.LatestNewsPojo;
import com.soe.service.pojo.LoginDetails;
import com.soe.service.pojo.ResultPojo;
import com.soe.service.pojo.SliderPojo;

@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {
	@SuppressWarnings("unused")
	private static final Logger logger = LogManager.getLogger(IndexController.class);

	@Autowired
	private FreeStudyCatService freeStudyCatServiceImpl;

	@Autowired
	private FreeStudySubCatService freeStudySubCatServiceImpl;

	@Autowired
	private HighlightsService highlightsServiceImpl;

	@Autowired
	private SliderService sliderServiceImpl;

	@Autowired
	private AddCategoryService addCategoryServiceImpl;

	@Autowired
	private ResultService resultService;

	@Autowired
	private LatestNewsService latestNewsService;

	@Autowired
	private AddPostService addPostService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model, final Principal principal) {
		
		return "index";
	}
}
