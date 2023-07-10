package com.bilibili.server.service;

import com.bilibili.server.domain.Video;
import com.bilibili.server.domain.VideoExample;
import com.bilibili.server.dto.PageDto;
import com.bilibili.server.dto.VideoDto;
import com.bilibili.server.mapper.VideoMapper;
import com.bilibili.server.mapper.my.MyVideoMapper;
import com.bilibili.server.service.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kkjz
 * @create 2023-07-07 12:06
 */

@Service
public class VideoService {

    //dao装载
    @Resource
    VideoMapper videoMapper;

    @Resource
    MyVideoMapper myVideoMapper;

    /**
     *首页不同类别随机查询
     */
    public List<VideoDto> videoBycategoryWithlimit(char category, Integer limit) {
        VideoExample videoExample = new VideoExample();
        VideoExample.Criteria criteria = videoExample.createCriteria();

        if(category!='\0')
            criteria.andVideocAtegoryEqualTo(String.valueOf(category));

        List<Video> videoList = myVideoMapper.selectByVideoCategory(category, limit);
        System.out.println(videoList.get(0).getVideoID());
        List<VideoDto> VideoDtoList = CopyUtil.copyList(videoList, VideoDto.class);

        return VideoDtoList;
    }

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        VideoExample videoExample = new VideoExample();
        videoExample.setOrderByClause("sort asc");
        List<Video> videoList = videoMapper.selectByExample(videoExample);
        PageInfo<Video> pageInfo = new PageInfo<>(videoList);
        pageDto.setTotal(pageInfo.getTotal());
        List<VideoDto> VideoDtoList = CopyUtil.copyList(videoList, VideoDto.class);
        pageDto.setList(VideoDtoList);
    }


    /******
     *
     * 通过VideoID获取完整信息的Video
     */
    public VideoDto videoByID(String id) {
        Video video = videoMapper.selectByPrimaryKey(Integer.parseInt(id));
        VideoDto videoDto = CopyUtil.copy(video, VideoDto.class);
        return videoDto;
    }


//    public Integer uploadVideo(VideoDto video) {
//        return videoMapper.insert(video);
//    }
//
//
//    public Integer delVideoByVideoIDAndUserID(String videoID, String userID) {
//        VideoDto video = videoMapper.selectByPrimaryKey(videoID);
//        // 多一步判断视频为用户所有
//        if (video.getUserID().equals(userID))
//            return videoMapper.deleteByPrimaryKey(videoID);
//        return 0;
//    }
//
//
//    public Integer getAllCountByUserID(String userID) {
//        return videoMapper.getAllCount(userID);
//    }
//
//
//    public List<VideoDto> getVideoByPage(String userID, int page) {
//        //给sql作index用
//        page = (page - 1) * 5;
//        return videoMapper.selectByPage(userID, page);
//    }
}
