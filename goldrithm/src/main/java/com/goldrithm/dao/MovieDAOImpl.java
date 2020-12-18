package com.goldrithm.dao;

import com.goldrithm.vo.MovieVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Inject
    private SqlSession sqlSession;

    private static final String Namespace = "com.goldrithm.mybatis.sql.test";

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        System.out.println("쿼리실행전");

        return sqlSession.selectList(Namespace + ".selectMovie");
    }

}