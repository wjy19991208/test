package com.example.demo.dao;

import com.example.demo.entity.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

@Mapper
public interface MemberDAO {
    @Select(value = "SELECT * FROM Member")
    List<Member> getAllMember();

    @Insert(value = "INSERT INTO Member(Member.'mid',Member.'name',Member.'phone',Member.'score')\n" +
                "VALUE(#{mid},#{name},#{phone},#{score})")
    int insert(Member member);

    @Update(value = "UPDATE Member SET Member.score =  #{score} WHERE Member.mid = #{mid}")
    int updateScore(Integer mid, Integer score);

    @Delete(value = "DELETE FROM Member WHERE mid = #{mid}")
    int deleteMemb(Integer mid);




}
