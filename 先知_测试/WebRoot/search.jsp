<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>搜索模块</title>
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" href="css/index.css"/>
    <link rel="stylesheet" href="css/templatePic.css"/>
    <script src="js/lib/jquery-3.2.1.js"></script>
</head>
<body>
<div class="g-container" style="width: 100%;height: auto;">
    <div class="topbarWrapper">
        <ul class="left topNav">
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >推荐</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >热点</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >视频</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >科技</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >社会</a
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >国际</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >娱乐</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >体育</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >旅游</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >探索</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="#" target="_blank" >育儿</a>
            </li>
            <li class="tb-item">
                <a class="tb-link" href="/news_world/" target="_blank" >游戏</a>
            </li>
        </ul>
        
    </div>
    <div class="midbar-wrapper">
        <div class="midbar-inner g-c">
            <img src="images/logo.png" class="inner-logo left" style="margin-left: -20px;"/>
            <!--搜索框-->
            <div class="s-form left">
                <div class="s-form-center">
                    <input type="text" placeholder="请输入关键字" class="s-input"/>
                    <a class="s-search"><img src="images/ic_serach_pub.png"/></a>
                </div>
                <ul class="s-search-lianxiang">
                    <li class="search-item">
                        <a href="#">
                            <i class="search-no search-no-1">1</i>
                            <span class="search-txt">直播行业危机渐显</span>
                        </a>
                    </li>
                    <li class="search-item">
                        <a href="#">
                            <i class="search-no search-no-2">2</i>
                            <span class="search-txt">20押金引发血案</span>
                        </a>
                    </li>
                    <li class="search-item">
                        <a href="#">
                            <i class="search-no search-no-3">3</i>
                            <span class="search-txt">举债2500万自杀</span>
                        </a>
                    </li>
                    <li class="search-item">
                        <a href="#">
                            <i class="search-no search-no-4">4</i>
                            <span class="search-txt">的哥开车看电子书</span>
                        </a>
                    </li>
                </ul>

            </div>
            <a class="login-in right" >登录</a>
        </div>
    </div>
    <!--列表新闻导航-->
    <div class="news-nav-zhanwei" style="width: 100%;height: 40px;box-shadow: 0 0 2px 2px #d9d9d9;background-color: #FFFFFF;z-index: 10;">
        <div style="width: 1000px;margin: 0 auto;height: 40px;text-align: center">
            <ul class="g-c hidden-nav-ul" style="width: auto;height:40px;display: inline-block;">
                <li class="news-li-active"><a href="#">全部</a></li>
                <li><a href="#">视频</a></li>
                <li><a href="#">用户</a></li>
                
            </ul>
        </div>
    </div>
    <div class="news-nav" style="width: 1000px;margin: 15px auto">
        <ul class="g-c">
            <li class="news-li-active"><a href="#">全部</a></li>
            <li><a href="#">视频</a></li>
            <li><a href="#">用户</a></li>
        
        </ul>
    </div>
    <!--全部-->
                <div class="list-news-container" style="margin-left: 180px;">
                    
                    <ul class="news-list">
                        <li style='padding-top: 0'>
                            <div class="item-inner-one item-inner-same g-c">
                                <div>
                                    <div class="item-inner-img sc-tr">
                                        <a href="#" target="_blank">
                                            <img src="images/34.jpg"/>
                                        </a>
                                    </div>
                                    <div class="item-inner-title">
                                        <span class="item-inner-center">
                                            <a class="it-news-tl" href="#">直播行业危机渐显，用户迅速缩水，平台关闭上百家，这又是为什么</a>
                                            <p class="it-news-footer">
                                                <a class="item-news-icon item-news-same" href="#"></a>
                                                <a href="#" class="item-news-same item-news-name">长安街知事</a>
                                                <a class="item-news-same" href="#">.25评论</a>
                                                <span class="item-news-same">.52分钟前</span>
                                            </p>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li >
                            <div class="item-inner-one item-inner-same g-c">
                                <div>
                                    <div class="item-inner-img sc-tr">
                                        <a href="#" target="_blank">
                                            <img src="images/35.jpg"/>
                                        </a>
                                    </div>
                                    <div class="item-inner-title">
                                    <span class="item-inner-center">
                                        <a class="it-news-tl" href="#">直播行业危机渐显，放弃本职工作成为主播的你路在何方</a>
                                        <p class="it-news-footer">
                                            <a class="item-news-icon item-news-same" href="#"></a>
                                            <a href="#" class="item-news-same item-news-name">忧郁的嘴巴</a>
                                            <a class="item-news-same" href="#">.25评论</a>
                                            <span class="item-news-same">.52分钟前</span>
                                        </p>
                                    </span>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li >
                            <div class="item-inner-one item-inner-same g-c">
                                <div>
                                    <div class="item-inner-img sc-tr">
                                        <a href="#" target="_blank">
                                            <img src="images/36.jpg"/>
                                        </a>
                                    </div>
                                    <div class="item-inner-title">
                                    <span class="item-inner-center">
                                        <a class="it-news-tl" href="#">直播行业危机渐显：主播日子要不好过了，是日落西山了吗！</a>
                                        <p class="it-news-footer">
                                            <a class="item-news-icon item-news-same" href="#"></a>
                                            <a href="#" class="item-news-same item-news-name">娱乐眼界</a>
                                            <a class="item-news-same" href="#">.25评论</a>
                                            <span class="item-news-same">.52分钟前</span>
                                        </p>
                                    </span>
                                    </div>
                                </div>

                            </div>
                        </li>
                        <li >
                            <div class="item-inner-one item-inner-same g-c">
                                <div>
                                    <div class="item-inner-img sc-tr">
                                        <a href="#" target="_blank">
                                            <img src="images/37.jpg"/>
                                        </a>
                                    </div>
                                    <div class="item-inner-title">
                                    <span class="item-inner-center">
                                        <a class="it-news-tl" href="#">直播行业危机渐显，乱像频发惹人担忧</a>
                                        <p class="it-news-footer">
                                            <a class="item-news-icon item-news-same" href="#"></a>
                                            <a href="#" class="item-news-same item-news-name">踏雪飞舞</a>
                                            <a class="item-news-same" href="#">.25评论</a>
                                            <span class="item-news-same">.52分钟前</span>
                                        </p>
                                    </span>
                                    </div>
                                </div>
                            </div>
                        </li>

                        <li>
                            <div class="item-inner-two item-inner-same g-c">
                                <div>
                                    <div class="item-inner-center">
                                        <a class="it-news-tl" href="#">直播行业危机渐显：行业乱象令人堪忧 直播又将何去何从</a>
                                        <div class="item-type-two">
                                            <a href="#" target="_blank" class="sc-tr">
                                                <img src="images/38-1.jpg"/>
                                            </a>
                                            <a href="#" target="_blank" class="sc-tr">
                                                <img src="images/38-2.jpg"/>
                                            </a>
                                            <a href="#" target="_blank" class="sc-tr">
                                                <img src="images/38-3.jpg"/>
                                            </a>
                                            <a href="#" target="_blank" class="sc-tr">
                                                <img src="images/38-4.jpg"/>
                                            </a>
                                        </div>
                                        <p class="it-news-footer">
                                            <a class="item-news-icon item-news-same" href="#"></a>
                                            <a href="#" class="item-news-same item-news-name">老逗逗</a>
                                            <a class="item-news-same" href="#">.25评论</a>
                                            <span class="item-news-same">.52分钟前</span>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </li>

                        <li>
                            <div class="item-inner-three item-inner-same g-c">
                            	<div class="item-inner-img sc-tr">
                                        <a href="#" target="_blank">
                                            <img src="images/39.jpg"/>
                                        </a>
                                    </div>
                                <div>
                                    <div class="item-inner-center">
                                        <a class="it-news-tl" href="#">直播行业危机渐显 平台用户量大幅缩水行业进冷静期</a>

                                        <p class="it-news-footer">
                                            <a class="item-news-icon item-news-same" href="#"></a>
                                            <a href="#" class="item-news-same item-news-name">中金在线视听</a>
                                            <a class="item-news-same" href="#">.25评论</a>
                                            <span class="item-news-same">.52分钟前</span>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </li>
           			</ul>     
                </div>        
</div>
<script src="js/index.js"></script>
<script src="js/templatePic.js"></script>
<script>
    let $newsNav = $('.news-nav');
    let $newsNavTop = $newsNav.offset().top;
    let $newsNavHeight = $newsNav.outerHeight(true);
    let $newsNavZhanWei = $('.news-nav-zhanwei');
    let windowBarTop;
    $(window).scroll(function (e) {
      windowBarTop = $(document).scrollTop();
      if(windowBarTop >= $newsNavTop+$newsNavHeight){
        $newsNavZhanWei.css({'display':'block','position':'fixed','top':'0'});
      }else{
        $newsNavZhanWei.css('display','none');
      }
    });
</script>
</body>
</html>
