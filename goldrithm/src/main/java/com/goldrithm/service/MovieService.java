package com.goldrithm.service;

import com.goldrithm.vo.MovieVO;

import java.util.List;

public interface MovieService {

        public List<MovieVO> selectMovie() throws Exception;
}
