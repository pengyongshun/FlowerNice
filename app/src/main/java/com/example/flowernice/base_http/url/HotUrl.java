package com.example.flowernice.base_http.url;

/**
 * Created by 彭永顺 on 2016/9/5.
 */
public class HotUrl {
    /**
     * 热门
     * 1 列表
     * 2 详情 采用WebView  在列表中的属性articleUrl
     * */
    public static final String HOT_LIST="http://haokan.weijuju.com/mobile/article/getHotArticleList?timestamp=1472982708409&platform=haokan&count=10&pageidx=0&dev=android&userToken=fb84e4778ecc1cc45d8986d7203069f3&random=240555&version=v1.0";
    /**
     * 侧滑
     *
     *注意：这个接口全都为get请求  ，就是timestamp和channelId和random不同
     * */
    //全部
    public static final String HOT_GLISSADE_ALL="http://haokan.weijuju.com/mobile/article/getHotArticleList?timestamp=1472987634089&platform=haokan&count=10&pageidx=0&dev=android&userToken=73097ee385753ea161549fc0e7bbaa8a&random=937030&version=v1.0";
    //时事
    public static final String HOT_GLISSADE_EVENT="";
    //明生
    public static final String HOT_GLISSADE_CAREER="";
    //财富
    public static final String HOT_GLISSADE_TREASURE="";
    //科技
    public static final String HOT_GLISSADE_TECHNOLOGY="";
    //创业
    public static final String HOT_GLISSADE_ENTREPRENEURSHIP="";
    //汽车
    public static final String HOT_GLISSADE_CAR="";
    //楼市
    public static final String HOT_GLISSADE_HOUSE="";
    //教育
    public static final String HOT_GLISSADE_EDUCATION="";
    //政务
    public static final String HOT_GLISSADE_GOVERNMENT="";
    //文化
    public static final String HOT_GLISSADE_CULTURE="";
    //健康
    public static final String HOT_GLISSADE_HEALTH="";
    //时尚
    public static final String HOT_GLISSADE_VOGUE="";
    //美食
    public static final String HOT_GLISSADE_FOOD="";
    //乐活
    public static final String HOT_GLISSADE_FUN="";
    //旅行
    public static final String HOT_GLISSADE_JOURNEY="";
    //体娱
    public static final String HOT_GLISSADE_SPORTS="";

}
