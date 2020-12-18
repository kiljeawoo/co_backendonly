package com.goldrithm.dao;

import com.goldrithm.vo.MovieVO;

import java.util.List;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
