package com.bilibili.server.mapper.my;

import com.bilibili.server.domain.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kkjz
 * @create 2023-07-09 16:09
 */
public interface MyVideoMapper {

    List<Video> selectByVideoCategory(@Param("videoCategory") char videoCategory, @Param("limitNum") Integer limitNum);
}
