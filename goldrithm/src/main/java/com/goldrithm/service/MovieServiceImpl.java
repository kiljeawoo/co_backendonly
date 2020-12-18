package com.goldrithm.service;

import com.goldrithm.dao.MovieDAO;
import com.goldrithm.vo.MovieVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDAO dao;

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        System.out.println("서비스에 진입함.");

        return dao.selectMovie();

    }
}
