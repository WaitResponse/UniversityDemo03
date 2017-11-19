<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>今日头条新闻内容模板</title>
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" href="css/index.css"/>
    <script src="js/lib/jquery-3.2.1.js"></script>
  	<script type="text/javascript">
			$(document).ready(function() {
			 $("input[type='text']").focus(function(){
			     $(this).animate({"width":"620px","height":"100px"})
			     }).blur(function(){
			         $(this).animate({"width":"620px","height":"50px"})
			         });
			});
				
			
			$(function(){
				 $(".test").hide();
				 $(":button").click(function(){
						$(".test").toggle('slow');
						$(this).val($(this).val()=="回复· 1条回复"?"回复· 收起回复":"回复· 1条回复");
					}
				);
			});
		</script>
    <style type="text/css">
       #huifu{
				width: 800px;
				height: 100px;
				margin-left: 0px;
				margin-top: 100px;
				border: 0px solid red;
				
			}
        .news-jieshao-cont{
            width: 630px;
            height: auto;
            margin: 24px 15px;
            margin-left: -100px;
            
        }
        .news-jieshao-cont h1{
            display: block;
            width: 100%;
            height: 31px;
            margin-bottom: 15px;
            font-weight: bolder;
            color: #000000;
            text-align: center;
            line-height: 31px;
            font-size: 24px;
        }
        .subtitle{
            position: relative;
            font-size: 11px;
            line-height: 1;
            color: #505050;
            text-align: center;
        }
        .news-item-pic1{
            margin-top: 30px;
            margin-bottom: 20px;
        }
        .p-same-type{
            color:#505050;
            text-align: left;
            font-size: 18px;
            margin-bottom: 20px;
            line-height: 20px;
        }
        .p-same-type1{
            color:gray;
            text-align: left;
            font-size: 14px;
            margin-bottom: 0px;
            line-height: 20px;
            margin-top: 50px;
        }
        .p-same-type2{
            color:gray;
            font-size: 14px;
            float: left;
            margin-left: 60px;
            margin-top: -20px;
            line-height: 20px;
        }
        .p-same-type3{
            color:#505050;
            text-align: left;
            font-size: 18px;
            margin-top: 20px;
            line-height: 20px;
            
        }
        .user-context{
        	width: 380px;
        	height: 400px;
        	margin-left: 0px;
        	
        }
    </style>
    <script src="js/lib/jquery-3.2.1.js"></script>
</head>
<body>
	<div class="g-container">
    <header title="头部导航条" class="g-minwidth" id="header" name="header">
        <ul>
            <li class="h-tianqi">
               <a class="a-header">
                    <iframe  width="150" scrolling="no" height="70" frameborder="0" allowtransparency="true" style="margin-top: 5px;"
	    			src="http://i.tianqi.com/index.php?c=code&id=11&color=%230070C0&icon=1&site=15">
	    		</iframe>
                </a>
            </li>
        </ul>
        <ul class="h-right g-c">
            <li style="margin-right: 14px;" class="g-active">
                <div class="h-login">
                  <a>登录</a>
                </div>
            </li>
            <li><a>联系我们</a></li>
        </ul>
    </header>
    </div>
    
<a href="#"><p style="font-weight:800;font-size: 35px;color: #ED4040;margin-left: 70px;">先知</p></a>
<a href="#"><p style="color:black;float: left;margin-top: -25px;margin-left: 165px;">首页</p></a>
<p style="color: gray;margin-left: 200px;margin-top: -26px;">/正文</p>
<hr style="height:2px;border:none;border-top:2px groove gainsboro;border-top:2px groove gainsboro;margin-top: 20px;"/>
    
<div class="g-container">
		<div id="div_right">
			<iframe class="user-context" frameborder="0" scrolling="no" marginwidth="0" marginheight="0"  width="330px" height="550px" src="userRelease.jsp" style="float: right;">
			</iframe>
		</div>
    <div style="width: 660px;height: auto;margin: 0 auto">
        
        <div class="news-jieshao-cont">
            <h1>秦时明月韩非紫女还活着，被逆鳞保护进入阴阳家，现是阴阳家首领</h1>
	            
            <div class="subtitle">
                <div class="news-text">
                    <p class="p-same-type1">孝说动漫</p>
                    <time class="p-same-type2">2017-10-13 23:50</time>
                    
                    <p class="p-same-type3">
                        《秦时明月》系列动漫《天行九歌》里面，逆鳞剑可以说是一个超凡存在，
                        说他是人，又不像人，平时一般都是待在剑里面，只有在韩非有生命危险的时候，
                        马上从千里之外赶过来，打败了敌人，又瞬间跑回逆鳞剑里面去。如果逆鳞会说话，
                        韩非一定会对他说，老哥，别打了人就跑了，留下来聊聊天，万一哪天我挂了，咱俩还不知道对方的名字，多尴尬。
                        逆鳞用眼神告诉韩非，放心，有我在，你不会挂的。
                    </p>
                    <img src="images/22.jpg" class="news-item-pic1"/>
                    <p class="p-same-type">韩非紫女</p>
                    <img src="images/23.jpg" class="news-item-pic1"/>
                    <p class="p-same-type">
                        除了逆鳞经常保护韩非之外，还有鬼谷卫庄和紫女经常保护韩非。
                        其中紫女是经常保护韩非的，比逆鳞保护韩非的次数还多，
                        目前已经保护了韩非大概五次了。
                        鬼兵，兀鸠，天泽，夜幕，阴阳家，这些都对韩非出手过。
                    </p>
                    <p class="p-same-type">逆鳞护主</p>
                    <img src="images/24.jpg" class="news-item-pic1"/>
                    <p class="p-same-type">
                       逆鳞剑这么逆天，韩非是死不了的，有人说韩非被阴阳家六魂恐咒杀死的。
                       那么韩非的尸体在哪里？没有尸体，就没有死，有没有可能逆鳞保护韩非潜入阴阳家？
                    </p>
                    
                    <p class="p-same-type">阴阳首领</p>
                    <img src="images/25.jpg" class="news-item-pic1"/>
                    <p class="p-same-type">
                      逆鳞杀死前任阴阳家首领，让韩非当上新的阴阳家首领，
                      紫女顺理成章地继承了月神的位置，月神的头发和紫女的头发，都是紫色的，
                      还有月神一直蒙着脸，紫女非常有可能就是月神。
                    </p>
                </div>
            </div>
        </div>
        
      <div id="div2" style="margin-left: -95px;margin-top: 0px;">
			<p style="color:red ;font-size: 18px;">2</p><p style="font-size: 18px;color: darkslategray;margin-left: 15px;margin-top: -24px;">条评论</p>
		</div>
		<!-- 评论框变大小 效果-->
		<div id="pinglun">
			<div>
			<img src="images/下载.jpg" style="width: 45px;height: 45px;margin-left: -100px;margin-top: 15px;"/>
			</div>
			<form action="" method="get">
			<input style="border:1px solid #3F404C;background:none;float:left;width:620px;height:45px;margin-left:-45px;margin-top:-45px;color: gray;" type="text" name="hkl" value="写下您的评论">
			<input type="submit" value="评论" style="margin-left:467px;margin-top:-47px;border-left:0px solid red;border:0px;float:left;width:110px;height:46px;font-size:17px;color: white;background-color: #3F404C;">
			</form>
			
			<hr style="height:2px;border:none;border-top:2px groove gainsboro;border-top:2px groove gainsboro;margin-top: 50px;margin-left: -110px; width:710px;" />
			<div id="pinglun1" style="margin-top: 10px;">
				<a href="#"><img src="images/20.jpg" style="width: 45px;height: 45px;margin-left: -100px;margin-top: 0px;float: left;"/></a>
				<span style="font-size: 14px;margin-top: 15px;margin-left: -40px; float: left;"><a href="#" style="color: #406599;text-decoration:none;">容颜与美丽于一身的娜美</a></span>
				<p style="color: gray;font-size: 13px;float: left;margin-top: 15px;margin-left: 5px;">18分钟前</p>
				<p style="font-size: 15px;float: left;margin-left: -215px;margin-top: 60px; width: 620px;">最早出现的启明星，在这深蓝色的天幕上闪烁起来了。它是那么大，那么亮，整个广漠的天幕上只有它一个在那里放射着令人注目的光辉，像一盏悬挂在高空的明灯。</p>
			</div>
			
        <div id="huifu">
			 <input id="btn1" type="button" style="float: left;margin-top: 20px;color: #406599;margin-left: -620px;background: none;border: 0px;font-size: 15px;" value="回复· 1条回复" /></a>
				<div class="test" style="margin-left: -75px;">
					<a href="#"><img src="images/21.jpg" style="float:left;width: 45px;height: 45px;margin-left: -620px;margin-top: 60px;"/>
					<span style="float:left;text-decoration:none;color:#406599;font-size: 14px;margin-top: 70px;margin-left: -565px; ">安静</span></a>
					<p style="color: gray;font-size: 13px;float: left;margin-top: 72px;margin-left: -535px;">13分钟前</p>
					<p style="font-size: 15px;float: left;margin-left: -135px;margin-top: 105px; width: 620px;">
						初恋今天结婚了，我去了，没有尴尬，没有扭捏，大大方方的就去了，她还是和当年我看上她时一样漂亮有气质，一样那么温柔 那么可爱。
						但是好奇怪我没有妒忌和不愉快，那一刻终于发现，曾经爱她是真的，现在的祝福也是真的。原来真的有由衷的祝福，感谢她那么优秀，我的青春没白过
					</p>
					<a href="#"><span style="float:left;text-decoration:none;color:#406599;font-size: 14px;margin-left: -620px;margin-top: 190px;">回复</span></a>
				</div>
		</div>
		</div>
		
   </div>
</div>
</body>
</html>