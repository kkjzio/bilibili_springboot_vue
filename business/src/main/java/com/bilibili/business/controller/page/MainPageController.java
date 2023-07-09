package com.bilibili.business.controller.page;

import com.bilibili.server.dto.BannerDto;
import com.bilibili.server.dto.ResponseDto;
import com.bilibili.server.dto.VideoDto;
import com.bilibili.server.service.VideoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;


/**
 * @author kkjz
 * @create 2023-07-06 15:52
 */

@RestController
@RequestMapping("/page")
public class MainPageController {

    @Resource
    private VideoService videoService;

    /**
     * 用来封装banner
     * @param v
     * @param d
     * @return
     */
    private BannerDto makeBannerDto(String v,String d){
        VideoDto videoDto = videoService.videoByID(v);
        BannerDto bannerDto = new BannerDto();
        bannerDto.setVideoID(videoDto.getVideoID());
        bannerDto.setDestrible(d);
        bannerDto.setImageUrl(videoDto.getVideoImage());
        bannerDto.setUrl(videoDto.getVideoAddress());
        return bannerDto;
    }


    @PostMapping("/banner")
    public ResponseDto banner(){
        Properties p = new Properties();
        ArrayList<BannerDto> listBanner = new ArrayList<>();
        ResponseDto ResponseDto = new ResponseDto();
        String v1,v2,v3,v4;
        String d1,d2,d3,d4;
        v1=v2=v3=v4="";
        d1=d2=d3=d4="";

        try {
            // 通过字符流读取
            InputStream in =this.getClass().getClassLoader().getResourceAsStream("slidePic.properties");
            p.load(new InputStreamReader(in, "UTF-8"));

            v1=p.getProperty("videoID.first");
            v2=p.getProperty("videoID.second");
            v3=p.getProperty("videoID.third");
            v4=p.getProperty("videoID.fourth");

            d1=p.getProperty("desc.first");
            d2=p.getProperty("desc.second");
            d3=p.getProperty("desc.third");
            d4=p.getProperty("desc.fourth");
            // 设置首页滑条显示的大头图和介绍 videoID，desc,slidePic

        } catch (Exception e) {
            e.printStackTrace();
        }

        listBanner.add(makeBannerDto(v1,d1));
        listBanner.add(makeBannerDto(v2,d2));
        listBanner.add(makeBannerDto(v3,d3));
        listBanner.add(makeBannerDto(v4,d4));

        ResponseDto.setContent(listBanner);

        return ResponseDto;
    }

    @PostMapping("/listCategory")
    public ResponseDto listCategory(){
        ResponseDto responseDto = new ResponseDto();
        HashMap<String, List> map = new HashMap<>();

        List<VideoDto> list = videoService.videoBycategoryWithlimit('1', 8);// 1 为动画
        List<VideoDto> list2 = videoService.videoBycategoryWithlimit('2', 8);// 2 为MAD
        List<VideoDto> list3 = videoService.videoBycategoryWithlimit('3', 8);// 3 为动漫
        List<VideoDto> list4 = videoService.videoBycategoryWithlimit('0', 6);// 不按种类 随机查6条数据出来
        map.put("list", list);
        map.put("list2", list2);
        map.put("list3", list3);
        map.put("list4", list4);

        responseDto.setContent(map);

        return responseDto;
    }


}
