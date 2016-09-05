package com.example.flowernice.base_http.url;

/**
 * Created by 彭永顺 on 2016/9/5.
 */
public class OrdingUrl {
    /**
     * 订阅
     * 1 列表
     * 2 详情  采用WebView  在列表中的属性articleUrl
     * */
    public static final String ORDING_LIST="http://haokan.weijuju.com/mobile/article/getSubscribeArticleList?timestamp=1472982282280&platform=haokan&count=10&pageidx=0&dev=android&userToken=fb84e4778ecc1cc45d8986d7203069f3&random=885866&version=v1.0";
    /**
     * 订阅的菜单项里面的
     * （1）列表
     * （2）推荐公众号详情   根据（1）中的列表中的officialAccountId来
     * （3）公众号分类
     * */
    //（1）列表
    public static final String ORDING_MEUN_LIST="http://haokan.weijuju.com/mobile/officialAccount/getOfficialAccountIndexPage?random=553098&timestamp=1472991877800&platform=haokan&dev=android&userToken=73097ee385753ea161549fc0e7bbaa8a&version=v1.0";
    //（2）推荐公众号详情   根据（1）中的列表中的officialAccountId来
    public static final String ORDING_MEUN_DETIAL="http://haokan.weijuju.com/mobile/officialAccount/getOfficialAccountInfo?random=424374&timestamp=1472992289569&platform=haokan&officialAccountId=huxiu_com&dev=android&userToken=73097ee385753ea161549fc0e7bbaa8a&version=v1.0";
    //推荐公众号详情里面的查看图文信息  根据上一步的officialAccountId来
    public static final String ORDING_MEUN_DETIAL_TELETEXT="http://haokan.weijuju.com/mobile/article/getOfficialAccountArticleList?timestamp=1472992499105&platform=haokan&count=20&pageidx=0&dev=android&userToken=73097ee385753ea161549fc0e7bbaa8a&random=567319&officialAccountIds=thepapernews&version=v1.0";
    //推荐公众号详情里面的查看图文信息里面的item   采用WebView  在列表中的属性articleUrl
    //（3）公众号分类
    //列表   根据（1）中的channelId来
    public static final String ORDING_MEUN_PUBLICK_NUMBER="http://haokan.weijuju.com/mobile/officialAccount/getOfficialAccountListInChannel?timestamp=1472992893215&platform=haokan&count=20&pageidx=0&dev=android&channelId=56595853&userToken=73097ee385753ea161549fc0e7bbaa8a&random=433559&version=v1.0";
    //进入公众号的item  根据（3）中的列表的officialAccountId来   会回到（2）推荐公众号详情界面
    public static final String ORDING_MEUN_PUBLICK_NUMBER_ITEM="http://haokan.weijuju.com/mobile/officialAccount/getOfficialAccountInfo?random=421323&timestamp=1472993080235&platform=haokan&officialAccountId=cctvnewscenter&dev=android&userToken=73097ee385753ea161549fc0e7bbaa8a&version=v1.0";
    //点击 查看图文信息  根据上一步的officialAccountId来
    public static final String ORDING_MEUN_PUBLICK_NUMBER_ITEM_DETIAL="http://haokan.weijuju.com/mobile/article/getOfficialAccountArticleList?timestamp=1472993920365&platform=haokan&count=20&pageidx=0&dev=android&userToken=73097ee385753ea161549fc0e7bbaa8a&random=456030&officialAccountIds=dskbdskb&version=v1.0";
    //推荐公众号详情里面的查看图文信息里面的item  采用WebView  在列表中的属性articleUrl
    /**
     * 公众号搜索
     * （1）列表
     * （2）推荐公众号详情   根据（1）中的列表中的officialAccountId来
     * （3）公众号分类
     * */
    public static final String ORDING_MEUN_SERCH="http://haokan.weijuju.com/mobile/officialAccount/searchOfficicalAccount?timestamp=1472995438381&platform=haokan&count=20&pageidx=0&dev=android&param=????&userToken=73097ee385753ea161549fc0e7bbaa8a&random=969130&version=v1.0";

}
