<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Basic page needs -->
<meta charset="utf-8">
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <![endif]-->
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>MyStore premium HTML5 &amp; CSS3 template</title>
<meta name="description" content="">

<!-- Mobile specific metas  -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Favicon  -->
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico">

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=PT+Sans:400,700italic,700,400italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Arimo:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Dosis:400,300,200,500,600,700,800' rel='stylesheet' type='text/css'>

<!-- CSS Style -->

<!-- Bootstrap CSS -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

<!-- font-awesome & simple line icons CSS -->
<link rel="stylesheet" type="text/css" href="css/font-awesome.css" media="all">
<link rel="stylesheet" type="text/css" href="css/simple-line-icons.css" media="all">

<!-- owl.carousel CSS -->
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="css/owl.theme.css">

<!-- animate CSS  -->
<link rel="stylesheet" type="text/css" href="css/animate.css" media="all">

<!-- flexslider CSS -->
<link rel="stylesheet" type="text/css" href="css/flexslider.css" >

<!-- jquery-ui.min CSS  -->
<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">

<!-- Revolution Slider CSS -->
<link rel="stylesheet" type="text/css" href="css/revolution-slider.css">

<!-- style CSS -->
<link rel="stylesheet" type="text/css" href="css/style.css" media="all">
<style type="text/css">
.box{
	margin-top:30px,40px,10px,40px;
	margin-left: 60px;

}
th,td{
	text-align:center;
}
</style>


</head>

<body class="shopping_cart_page">

     

<!--[if lt IE 8]>
      <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
  <![endif]--> 
  
<!-- 手机版菜单 -->

<div id="mobile-menu">
  <ul>
    <li><a href=<%=request.getContextPath() +"/FindGoodsServlet" %> class="home1">首页</a></li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=美食">美食</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=水果" class="">水果</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=零食">零食</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=肉奶蛋">肉奶蛋</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=生活用品">生活用品</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=日常用品" class="">日常用品</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=杯具">杯具</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=椅柜">椅柜</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=被子">被子</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=书籍">书籍</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=小说" class="">小说</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=文学">文学</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=童话">童话</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=时装">时装</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=衣服" class="">衣服</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=裤子">裤子</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=内裤">内裤</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=数码">数码</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=手机类" class="">手机类</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=电脑类">电脑类</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=鞋包饰品">鞋包饰品</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=鞋" class="">鞋</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=包">包</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=美妆">美妆</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=化妆品" class="">化妆品</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=护肤品">护肤品</a></li>
      </ul>
    </li>
  </ul>
</div>

<!-- end mobile menu -->
<div id="page">
  <!-- Header -->
  <header>
    <div class="header-container">
      <div class="header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-4 col-sm-4 hidden-xs">
              <!-- Default Welcome Message -->
            <div class="welcome-msg ">欢迎来到我的商店 ! </div>
              <span class="phone hidden-sm"></span> </div>

            <!-- top links -->
            <div class="headerlinkmenu col-lg-8 col-md-7 col-sm-8 col-xs-12">
              <div class="links">
                 <div class="myaccount"><a title="我的账户" href="MyAccountServlet"><i class="fa fa-user"></i><span class="hidden-xs">我的账户</span></a></div>
                <div class="login"><a href="LoginOutServlet"><i class="fa fa-unlock-alt"></i><span class="hidden-xs">注销</span></a></div>
              </div>
              <div class="language-currency-wrapper">
                <div class="inner-cl">
                  <div class="block block-language form-language">
                    <div class="lg-cur"> <span> <img src="images/flag-default.jpg" alt="Chinese"> <span class="lg-fr">简体中文</span> <i class="fa fa-angle-down"></i> </span> </div>
                    <ul>
                     <!--  <li> <a class="selected" href="#"> <img src="images/flag-english.jpg" alt="flag"> <span>English</span> </a> </li>
                       --><li> <a href="#"> <img src="images/flag-default.jpg" alt="flag"> <span>简体中文</span> </a> </li>
                      <!-- <li> <a href="#"> <img src="images/flag-german.jpg" alt="flag"> <span>German</span> </a> </li>
                      <li> <a href="#"> <img src="images/flag-brazil.jpg" alt="flag"> <span>Brazil</span> </a> </li>
                      <li> <a href="#"> <img src="images/flag-chile.jpg" alt="flag"> <span>Chile</span> </a> </li>
                      <li> <a href="#"> <img src="images/flag-spain.jpg" alt="flag"> <span>Spain</span> </a> </li>
                     --></ul>
                  </div>
                  <div class="block block-currency">
                    <div class="item-cur"> <span>CNY </span> <i class="fa fa-angle-down"></i></div>
                   <!--  <ul>
                      <li> <a href="#"><span class="cur_icon">€</span> EUR</a> </li>
                      <li> <a href="#"><span class="cur_icon">¥</span> CNY</a> </li>
                      <li> <a class="selected" href="#"><span class="cur_icon">$</span> USD</a> </li>
                    </ul> -->
                  </div>
                </div>

                <!-- End Default Welcome Message -->
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="container">
        <div class="row">
          <div class="col-sm-3 col-md-3 col-xs-12">
            <!-- Header Logo -->
            <div class="logo"><a title="MyStore" href=<%=request.getContextPath() +"/FindGoodsServlet" %>><img alt="e-commerce" src="images/logo.png"></a> </div>
            <!-- End Header Logo -->
          </div>
          <div class="col-xs-9 col-sm-6 col-md-6">
            <!-- Search -->

            <div class="top-search">
              <div id="search">
                
                  <div class="input-group">
                  <form action="SearchGoodsServlet" method="get">
                    <select class="cate-dropdown hidden-xs" name="massage">
                      <option>按物品名</option>
                      <option>按店铺</option>
                      <option>按类别</option>                   
                    </select>
                    <input type="text" class="form-control" placeholder="搜索" name="search">
                    <button class="btn-search" type="submit"><i class="fa fa-search"></i></button>
                  </form>
                  </div>
                
              </div>
            </div>

            <!-- End Search -->
          </div>
          <!-- top cart -->
			
          <div class="col-lg-3 col-xs-3 top-cart">
            <div class="top-cart-contain">
              <div class="mini-cart">
                <div data-toggle="dropdown" data-hover="dropdown" class="basket dropdown-toggle"> <a href="#">
                  <div class="cart-icon"><i class="fa fa-shopping-cart"></i></div>
                  <div class="shoppingcart-inner hidden-xs"><span class="cart-title">购物车</span></div>
                  </a></div>
                <div>
                  <div class="top-cart-content">
                    <div class="block-subtitle hidden-xs">已添加商品</div>
					  <c:set var="sum" value="0"> </c:set> 
                    <ul id="cart-sidebar" class="mini-products-list">
					<c:forEach var="Cart" items="${requestScope.Cart}"> 
                      <li class="item odd"> <a href="ShoppingCartServlet" title="${Cart.goodsname }" class="product-image"><img src="${Cart.img1 }" alt="Lorem ipsum dolor" width="65"></a>
                        <div class="product-details"> <a href="${pageContext.request.contextPath}/DeleteGoodsServlet?param1=${Cart.cartserial}" title="删除" class="remove-cart"><i class="icon-close"></i></a>
                          <p class="product-name"><a href="ShoppingCartServlet">${Cart.goodsname }</a> </p>
                          <strong>${Cart.count }</strong> x <span class="price">¥${Cart.price }</span> </div> 
                      </li>
                      <c:set var="sum" value="${sum + Cart.totalprice }"></c:set>
                    </c:forEach>
                    </ul>
                    <div class="top-subtotal">总计: <span class="price">￥${ sum }</span></div>      
                    <div class="actions"> 	
                      <form action="ShoppingCartServlet">
                      <button class="btn-checkout" type="submit"><i class="fa fa-check"></i><span>购买</span></button>         
                      <button class="view-cart" type="submit" ><i class="fa fa-shopping-cart"></i> <span>查看购物车</span></button>
                    </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>               
        </div>
      </div>
    </div>
  </header>
  <!-- end header -->

  <!-- Navbar -->
  <nav>
    <div class="container">
      <div class="row">
        <div class="col-md-3 col-sm-4">
          <div class="mm-toggle-wrap">
            <div class="mm-toggle"> <i class="fa fa-align-justify"></i> </div>
            <span class="mm-label">菜单</span> </div>
          <div class="mega-container visible-lg visible-md visible-sm">
            <div class="navleft-container">
              <div class="mega-menu-title">
                <h3>全部分类</h3>
              </div>
              <div class="mega-menu-category">
                <ul class="nav">
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=美食">美食</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=水果" class="">水果</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=零食">零食</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=肉奶蛋">肉奶蛋</a></li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=生活用品">生活用品</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=日常用品" class="">日常用品</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=杯具">杯具</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=椅柜">椅柜</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=被子">被子</a></li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=书籍">书籍</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=小说" class="">小说</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=文学">文学</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=童话">童话</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=时装">时装</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=衣服">衣服</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=裤子">裤子</a></li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=内裤">内裤</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=数码">数码</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=手机类">手机类</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=电脑类">电脑类</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=鞋包饰品">鞋包饰品</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=鞋">鞋</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=包">包</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=美妆">美妆</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=小说">化妆品</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=按类别&search=护肤品">护肤品</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-9 col-sm-8">
          <div class="mtmegamenu">
            <ul>
              <li class="mt-root demo_custom_link_cms"> <!-- 首页  -->
                <div class="mt-root-item"><a href= <%=request.getContextPath() +"/FindGoodsServlet" %> >
                  <div class="title title_font"><span class="title-text">首页</span></div>
                  </a>
                </div>
              <li class="mt-root">  <!-- 销量排行榜  -->
                <div class="mt-root-item"><a href=" ${pageContext.request.contextPath}/SearchGoodsServlet?massage=销量排行榜&search=#">
                  <div class="title title_font"><span class="title-text">销量排行榜</span> </div>
                  </a></div>
              </li>
              <li class="mt-root">  <!-- 上架时间  -->
                <div class="mt-root-item"><a href="${pageContext.request.contextPath}/SearchGoodsServlet?massage=最新上架&search=#">
                  <div class="title title_font"><span class="title-text">最新上架</span> </div>
                  </a></div>
              </li>      
              <li class="mt-root">  <!-- 今日推荐  -->
                <div class="mt-root-item">
                  <div class="title title_font"><span class="title-text">今日推荐</span></div>
                </div>
                <ul class="menu-items col-xs-12">
               	
               	<c:forEach var="Rgoods" items="${ requestScope.Rgoods }">
                  <li class="menu-item depth-1 product menucol-1-3 withimage">            
                    <div class="product-item">
                      <div class="item-inner">
                        <div class="product-thumbnail">
                          <div class="icon-sale-label sale-left">Sale</div>
                          <div class="pr-img-area"> <a title="${Rgoods.goodsname}" href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Rgoods.goodsname}"  >
                            <figure> <img class="first-img" src="${Rgoods.img1}" alt=""> <img class="hover-img" src="${Rgoods.img1}" alt=""></figure>
                            </a>
                              <button type="button" class="add-to-cart-mt" onclick="window.location.href='${pageContext.request.contextPath}/AddGoodsServlet?param1=${Rgoods.number}&param2=1'"> <i class="fa fa-shopping-cart"></i><span>添加到购物车</span> </button>
                            </div>
                          
                        </div>
                        <div class="item-info">
                          <div class="info-inner">
                            <div class="item-title"> 
                            	<a title="${Rgoods.goodsname}" href="${pageContext.request.contextPath}/Single_productServlet?param1=${Rgoods.goodsname}">${Rgoods.goodsname}</a>    
                            </div>
                            <div class="item-content">
                              <div class="item-price">
                                <div class="price-box"> 
                                <p class="special-price"> <span class="price-label">Special Price</span> <span class="price"> ¥${ Rgoods.price } </span> </p>
                                <p class="old-price"> <span class="price-label">Regular Price:</span> <span class="price">¥${ Rgoods.price+20 } </span> </p>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>
                 </c:forEach>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </nav>
  <!-- end nav -->

  <!-- Main Container -->
  <section class="main-container col1-layout">
    <div class="main container">
    	
      <div class="col-main">
        <div class="cart">
          
          <div class="page-content page-order"><div class="page-title">
            <h2>我的订单</h2>
          </div>
                
           <c:forEach var="Ordergoodsinfo" items="${requestScope.Ordergoodsinfo}" > 
           <%--  <c:forEach var="NewList" items="${NewList }" >	   --%>
            <%-- <c:if test="${ Ordergoodsinfo.ordernumber eq NewList }">  --%>
            <div class="order-detail-content">          
              <div class="table-responsive">
                <c:set var="sum" value="0"> </c:set>              
                <table class="table table-bordered cart_summary">
                  <thead>    
                    <tr>
                      <td> <h5>收件人: ${Ordergoodsinfo.receiver}</h5></td>  
                      <td> <h5>订单编号:${Ordergoodsinfo.ordernumber} </h5></td>           
                      <td> <h5>联系电话:${Ordergoodsinfo.rphone} </h5></td>
                      <td> <h5>收货地址:<p>${Ordergoodsinfo.address}</p> </h5></td>
                      <td> <h5>创建时间:${Ordergoodsinfo.time} </h5></td>
                    </tr>
                    
                 
                    <tr>
                      <th class="cart_product"><h5>商品</h5></th>
                      <th><h5>商品名</h5></th>
                      <th><h5>单价</h5></th>
                      <th><h5>数量</h5></th>
                      <th><h5>总价</h5></th>
                    </tr>
                  </thead>
                  <tbody>                  	
                  	<c:forEach var="ListCart" items="${requestScope.ListCart}"> 
                    <c:if test="${Ordergoodsinfo.ordernumber eq ListCart.keyword }">                   
                    <tr>
                      <td class="cart_product"><a href="${pageContext.request.contextPath}/Single_productServlet?param1=${ListCart.goodsname}"><img src="${ListCart.img1}" alt="Product"></a></td>
                      <td class="cart_description"><p class="product-name"><a href="${pageContext.request.contextPath}/Single_productServlet?param1=${ListCart.goodsname}">${ListCart.goodsname}</a></p></td>
                      <td class="price"><span>￥${ListCart.price}</span></td>
                      <td class="qty"><span>${ListCart.count }</span></td>
                      <td class="price"><span>￥${ListCart.totalprice}</span></td>                  
                    </tr>
                    	<c:set var="sum" value="${sum + ListCart.totalprice }"></c:set>                    	
                    </c:if>
                    </c:forEach>
                  </tbody>
                  <tfoot>                    
                    <tr>
                      <td colspan="4"><strong>总付款</strong></td>
                      <td colspan="1"><strong>￥${ sum } </strong></td>   
                    </tr>
                  </tfoot>               
                </table>            
              </div>
            </div>
        
            
    
            </c:forEach>
          </div>
        </div>
      </div>
      
    </div>
  </section>
    <!-- Footer -->

  <footer>
    <div class="container" >
      <div class="row">
        <div class="col-sm-6 col-md-4 col-xs-12 col-lg-3">
          <div class="footer-logo"><a href="#"><img src="images/footer-logo.png" alt="fotter logo"></a> </div>
          <p>我不能再胖了，再胖就可爱到爆了！</p>
          <div class="footer-content">
            <div class="email"> <i class="fa fa-envelope"></i>
              <p>1369306648@qq。com</p>
            </div>
            <div class="phone"> <i class="fa fa-phone"></i>
              <p>15108310343</p>
            </div>
            <div class="address"> <i class="fa fa-map-marker"></i>
              <p> 地址：四川成都</p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="footer-coppyright">
      <div class="container">
        <div class="row">
          <div class="col-sm-6 col-xs-12 coppyright"> Copyright © 2019 <a href="#"> MyStore </a>. All Rights Reserved. </div>
        </div>
      </div>
    </div>
  </footer>
  <a href="#" class="totop"> </a> </div>

<!-- End Footer -->
<!-- JS --> 

<!-- jquery js --> 
<script type="text/javascript" src="js/jquery.min.js"></script> 

<!-- bootstrap js --> 
<script type="text/javascript" src="js/bootstrap.min.js"></script> 

<!-- owl.carousel.min js --> 
<script type="text/javascript" src="js/owl.carousel.min.js"></script> 

<!-- bxslider js --> 
<script type="text/javascript" src="js/jquery.bxslider.js"></script> 

<!--jquery-slider js --> 
<script type="text/javascript" src="js/slider.js"></script> 

<!-- megamenu js --> 
<script type="text/javascript" src="js/megamenu.js"></script> 
<script type="text/javascript">
        /* <![CDATA[ */   
        var mega_menu = '0';
        
        /* ]]> */
        $(function(){
              $(".navleft-container").hover(function(){
                  $(".mega-menu-category").show();
              },function(){
                  $(".mega-menu-category").hide();
              })
          }) 
        </script> 

<!-- jquery.mobile-menu js --> 
<script type="text/javascript" src="js/mobile-menu.js"></script> 

 

<!--jquery-ui.min js --> 
<script type="text/javascript" src="js/jquery-ui.js"></script> 

<!-- main js --> 
<script type="text/javascript" src="js/main.js"></script> 

 
</body>
</html>

</body>
</html>