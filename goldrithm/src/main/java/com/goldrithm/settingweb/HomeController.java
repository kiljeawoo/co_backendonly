package com.goldrithm.settingweb;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goldrithm.service.MovieService;
import com.goldrithm.vo.MovieVO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Inject
    private MovieService service;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{

        logger.info("home");
        System.out.println("서비스 진입전");
        List<MovieVO> movieList = service.selectMovie();
        System.out.println("서비스 완료후");
        model.addAttribute("movieList", movieList);

        return "home";
    }

}

