<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="description" content="">
		<meta name="keywords" content="">
		<title></title>
		<link rel="stylesheet" href="css/common.css"/>
    	<link rel="stylesheet" href="css/index.css"/>
    	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
		<script type="text/javascript">
				$(document).ready(function() {
				 $("input[type='text']").focus(function(){
				     $(this).animate({"width":"800px","height":"100px"})
				     }).blur(function(){
				         $(this).animate({"width":"800px","height":"50px"})
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
			.shipin{
				height: 520px; 
				width: 850px;
				margin-left: 70px;
				
			}
			#div0{
				width: 100%;
				height: 100%;
				border: 0px solid red;
			}
			
			#huifu{
				width: 800px;
				height: 100px;
				margin-left: 100px;
				margin-top: 100px;
				border: 0px solid red;
				
			}
			#div_right{
				float: right;
				width: 350px;
				height: 600px;
				margin-left: 50px;
				
			}
			
			a:hover,a:visited
				{
				color:floralwhite;
				} 
			p{
				display:inline;
			}
			
		</style>
	</head>
	<body>
		<div id="div0">
			<!--头部栏
            -->
		<div class="g-container">
    <header title="头部导航条" class="g-minwidth" id="header" name="header">
        <ul>
            <li class="h-tianqi">
               <a class="a-header">
                    <iframe width="150" scrolling="no" height="70" frameborder="0" allowtransparency="true" style="margin-top: 5px;"
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
		<a href="#"><p style="margin-left: 15px;color:black;">首页</p></a>
		<p style="color: gray;">/视频</p>
		<hr style="height:2px;border:none;border-top:2px groove gainsboro;border-top:2px groove gainsboro;margin-top: 20px;"/>
		
		<div id="div_right">
			<iframe name="" frameborder="0" scrolling="no" marginwidth="0" marginheight="0"  width="330px" height="550px" src="videoList.jsp">
			</iframe>
		</div>
		
		<div id="div1">
		<embed src="http://pic.ibaotu.com/00/25/86/008888piCNE6.mp4" class="shipin"  type=audio/mpeg AUTOSTART="1" loop="0">
		</embed>
		</div>
		
		<div id="div2" style="margin-left: 70px;margin-top: 10px;">
			<p style="color:red ;font-size: 18px;">2</p><p style="font-size: 18px;color: darkslategray;">条评论</p>
		</div>
		
		<!-- 评论框变大小 效果-->
		<div id="pinglun">
			<div>
			<img src="images/下载.jpg" style="width: 45px;height: 45px;margin-left: 70px;margin-top: 15px;"/>
			</div>
			<form action="" method="get">
			<input style="border:1px solid #3F404C;background:none;float:left;width:800px;height:45px;margin-left:120px;margin-top:-50px;color: gray;" type="text" name="hkl" value="写下您的评论">
			<input type="submit" value="评论" style="margin-left:811px;margin-top:-49px;border-left:0px solid red;border:0px;float:left;width:110px;height:46px;font-size:17px;color: white;background-color: #3F404C;">
			</form>
			
			<hr style="height:2px;border:none;border-top:2px groove gainsboro;border-top:2px groove gainsboro;margin-top: 50px;margin-left: 40px; width:900px;" />
			<div id="pinglun1" style="margin-top: 10px;">
				<a href="#"><img src="images/20.jpg" style="width: 45px;height: 45px;margin-left: 70px;margin-top: 0px;float: left;"/></a>
				<span style="font-size: 14px;margin-top: 15px;margin-left: 5px; float: left;"><a href="#" style="color: #406599;text-decoration:none;">容颜与美丽于一身的娜美</a></span>
				<p style="color: gray;font-size: 13px;float: left;margin-top: 15px;margin-left: 5px;">18分钟前</p>
				<p style="font-size: 15px;float: left;margin-left: -215px;margin-top: 40px; width: 800px;">最早出现的启明星，在这深蓝色的天幕上闪烁起来了。它是那么大，那么亮，整个广漠的天幕上只有它一个在那里放射着令人注目的光辉，像一盏悬挂在高空的明灯。</p>
			</div>
			
			<div id="huifu">
			 <input id="btn1" type="button" style="float: left;margin-top: 0px;color: #406599;margin-left: 15px;background: none;border: 0px;font-size: 15px;" value="回复· 1条回复" /></a>
				<div class="test">
					<a href="#"><img src="images/21.jpg" style="float:left;width: 45px;height: 45px;margin-left: -100px;margin-top: 40px;"/>
					<span style="float:left;text-decoration:none;color:#406599;font-size: 14px;margin-top: 50px;margin-left: -50px; ">安静</span></a>
					<p style="color: gray;font-size: 13px;float: left;margin-top: 51px;margin-left: -15px;">13分钟前</p>
					<p style="font-size: 15px;float: left;margin-left: 35px;margin-top: 15px; width: 800px;">
						初恋今天结婚了，我去了，没有尴尬，没有扭捏，大大方方的就去了，她还是和当年我看上她时一样漂亮有气质，一样那么温柔 那么可爱。
						但是好奇怪我没有妒忌和不愉快，那一刻终于发现，曾经爱她是真的，现在的祝福也是真的。原来真的有由衷的祝福，感谢她那么优秀，我的青春没白过
					</p>
					<a href="#"><span style="float:left;text-decoration:none;color:#406599;font-size: 14px;margin-left: 35px;margin-top: 0px;">回复</span></a>
				</div>
			</div>
		</div>
		</div>
	</body>
</html>
