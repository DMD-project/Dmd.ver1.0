<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en-US" class="footer-sticky-1">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>m²Dm - interior Shop:</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Work+Sans:200,400&display=swap"
	rel="stylesheet">

<link
	href="/css/ViewProduct.css"
	rel="stylesheet">

<style type="text/css" class="nm-custom-styles">
@media all and (max-width:1080px) {
	.woocommerce-product-gallery__wrapper {
		max-width: 500px;
	}
	.has-bg-color .woocommerce-product-gallery {
		background: #EEEEEE;
	}
}
</style>


<style>
 .woocommerce form .form-row .required {
	visibility: visible;
}

.woocommerce-product-gallery {
	opacity: 1 !important;
}

.btn {
	padding: 10px 60px;
	height: 45px;
	border: none;
	border-radius: 10px;
	color: white;
	font-size: 16px;
	background: #E89F71;
}

.qty-btn {
	font-size: 25px;
	font-weigth: bold;
	color: #777777;
} 
</style>

</head>

<body data-rsssl=1
	class="product-template-default single single-product postid-253 theme-savoy woocommerce woocommerce-page woocommerce-no-js nm-page-load-transition-0 nm-preload header-fixed header-mobile-default header-border-1 widget-panel-dark wpb-js-composer js-comp-ver-6.9.0 vc_responsive">

	<header id="nm-header"
		class="nm-header centered resize-on-scroll clear">
		<%@ include file="../common/includeTop.jsp" %>
	</header>

	<div style="margin: 0px 200px 200px 200px;">
		<div class="nm-page-wrap">

			<div class="nm-page-wrap-inner">
				<div id="nm-header-placeholder" class="nm-header-placeholder"></div>



				<div class="woocommerce-notices-wrapper"></div>
				<div id="product-253"
					class="nm-single-product layout-default gallery-col-7 summary-col-5 thumbnails-vertical has-bg-color meta-layout-default tabs-layout-default product type-product post-253 status-publish first instock product_cat-interior product_tag-classic product_tag-interior product_tag-leather has-post-thumbnail sale featured shipping-taxable purchasable product-type-variable has-default-attributes">
					<div class="nm-single-product-bg clear">

						<%-- <!-- product category -->
						<div style="float: left; align-content: space-between;"
							class="nm-single-product-top">
							<div class="nm-row">
								<div class="col-xs-9">
									<nav id="nm-breadcrumb" class="woocommerce-breadcrumb"
										itemprop="breadcrumb">
										<a href="https://savoy.nordicmade.com">Shop</a><span
											class="delimiter">/</span><a
											href="https://savoy.nordicmade.com/product-category/interior/">${product.cateID}</a><span
											class="delimiter">/</span>${product.name}
									</nav>
								</div>
							</div>
						</div> --%>

						<div id="nm-shop-notices-wrap"></div>
						<div class="nm-single-product-showcase">
							<div class="nm-single-product-summary-row nm-row">
								<div class="nm-single-product-summary-col col-xs-12" style="text-align:center;">
									<span style="float: left;"
										class="woocommerce-product-gallery woocommerce-product-gallery--with-images woocommerce-product-gallery--columns-4 images lightbox-enabled pagination-enabled"
										data-columns="4"
										style="opacity: 0; transition: opacity .25s ease-in-out;">

										<figure class="woocommerce-product-gallery__wrapper">
											<div
												data-thumb="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-100x100.jpg"
												data-thumb-alt="" class="woocommerce-product-gallery__image">
												<img width="500" height="800"
													src="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-680x844.jpg"
													class="wp-post-image" alt="" loading="lazy"
													title="product-classic-chair" data-caption=""
													data-src="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg"
													data-large_image="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg"
													data-large_image_width="1280"
													data-large_image_height="1588"
													srcset="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-680x844.jpg 680w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-300x372.jpg 300w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-450x558.jpg 450w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-242x300.jpg 242w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-825x1024.jpg 825w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-700x868.jpg 700w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-220x273.jpg 220w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-140x174.jpg 140w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-940x1166.jpg 940w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg 1280w"
													sizes="(max-width: 680px) 100vw, 680px" />
											</div>
										</figure>

									</span> <span style="padding: 100px;" class="summary entry-summary">
										<div 
											class="nm-product-summary-inner-col nm-product-summary-inner-col-1">
											<font size=5 class="product_title entry-title">${product.name}</font>
											<p class="price has-sale-flash">

												<i> <span class="woocommerce-Price-amount amount">${product.price} 원</span>
												</i>

											</p>
										</div>
										<div class="nm-row">
											<div class="col-xs-12">
												<ul class="tabs wc-tabs" role="tablist"
													style="padding: 70px;">
													<li class="description_tab current"
														style="padding: 0px 40px;">${product.content}</li>
												</ul>
											</div>
										</div>
										<div
											class="nm-product-summary-inner-col nm-product-summary-inner-col-2">

											<form id="nm-variations-form"
												class="variations_form cart nm-no-select nm-variation-controls-tooltip tooltip-color tooltip-image"
												method="post" enctype='multipart/form-data'
												data-product_id="253"
												data-product_variations="[{&quot;attributes&quot;:{&quot;attribute_pa_color-variant&quot;:&quot;black&quot;},&quot;availability_html&quot;:&quot;&quot;,&quot;backorders_allowed&quot;:false,&quot;dimensions&quot;:{&quot;length&quot;:&quot;&quot;,&quot;width&quot;:&quot;&quot;,&quot;height&quot;:&quot;&quot;},&quot;dimensions_html&quot;:&quot;N\/A&quot;,&quot;display_price&quot;:208,&quot;display_regular_price&quot;:234,&quot;image&quot;:{&quot;title&quot;:&quot;product-classic-chair&quot;,&quot;caption&quot;:&quot;&quot;,&quot;url&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair.jpg&quot;,&quot;alt&quot;:&quot;&quot;,&quot;src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-680x844.jpg&quot;,&quot;srcset&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-680x844.jpg 680w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-300x372.jpg 300w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-450x558.jpg 450w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-242x300.jpg 242w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-825x1024.jpg 825w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-700x868.jpg 700w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-220x273.jpg 220w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-140x174.jpg 140w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-940x1166.jpg 940w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair.jpg 1280w&quot;,&quot;sizes&quot;:&quot;(max-width: 680px) 100vw, 680px&quot;,&quot;full_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair.jpg&quot;,&quot;full_src_w&quot;:1280,&quot;full_src_h&quot;:1588,&quot;gallery_thumbnail_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-100x100.jpg&quot;,&quot;gallery_thumbnail_src_w&quot;:100,&quot;gallery_thumbnail_src_h&quot;:100,&quot;thumb_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-300x372.jpg&quot;,&quot;thumb_src_w&quot;:300,&quot;thumb_src_h&quot;:372,&quot;src_w&quot;:680,&quot;src_h&quot;:844},&quot;image_id&quot;:129,&quot;is_downloadable&quot;:false,&quot;is_in_stock&quot;:true,&quot;is_purchasable&quot;:true,&quot;is_sold_individually&quot;:&quot;no&quot;,&quot;is_virtual&quot;:false,&quot;max_qty&quot;:&quot;&quot;,&quot;min_qty&quot;:1,&quot;price_html&quot;:&quot;&quot;,&quot;sku&quot;:&quot;73253-55&quot;,&quot;variation_description&quot;:&quot;&quot;,&quot;variation_id&quot;:3302,&quot;variation_is_active&quot;:true,&quot;variation_is_visible&quot;:true,&quot;weight&quot;:&quot;&quot;,&quot;weight_html&quot;:&quot;N\/A&quot;},{&quot;attributes&quot;:{&quot;attribute_pa_color-variant&quot;:&quot;beige&quot;},&quot;availability_html&quot;:&quot;&quot;,&quot;backorders_allowed&quot;:false,&quot;dimensions&quot;:{&quot;length&quot;:&quot;&quot;,&quot;width&quot;:&quot;&quot;,&quot;height&quot;:&quot;&quot;},&quot;dimensions_html&quot;:&quot;N\/A&quot;,&quot;display_price&quot;:208,&quot;display_regular_price&quot;:234,&quot;image&quot;:{&quot;title&quot;:&quot;product-classic-chair-beige&quot;,&quot;caption&quot;:&quot;&quot;,&quot;url&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige.jpg&quot;,&quot;alt&quot;:&quot;&quot;,&quot;src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-768x953.jpg&quot;,&quot;srcset&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-768x953.jpg 768w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-450x558.jpg 450w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-600x744.jpg 600w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-242x300.jpg 242w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-825x1024.jpg 825w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-1238x1536.jpg 1238w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige.jpg 1280w&quot;,&quot;sizes&quot;:&quot;(max-width: 680px) 100vw, 680px&quot;,&quot;full_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige.jpg&quot;,&quot;full_src_w&quot;:1280,&quot;full_src_h&quot;:1588,&quot;gallery_thumbnail_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-100x100.jpg&quot;,&quot;gallery_thumbnail_src_w&quot;:100,&quot;gallery_thumbnail_src_h&quot;:100,&quot;thumb_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-450x558.jpg&quot;,&quot;thumb_src_w&quot;:350,&quot;thumb_src_h&quot;:434,&quot;src_w&quot;:680,&quot;src_h&quot;:844},&quot;image_id&quot;:3306,&quot;is_downloadable&quot;:false,&quot;is_in_stock&quot;:true,&quot;is_purchasable&quot;:true,&quot;is_sold_individually&quot;:&quot;no&quot;,&quot;is_virtual&quot;:false,&quot;max_qty&quot;:&quot;&quot;,&quot;min_qty&quot;:1,&quot;price_html&quot;:&quot;&quot;,&quot;sku&quot;:&quot;73253-55&quot;,&quot;variation_description&quot;:&quot;&quot;,&quot;variation_id&quot;:3303,&quot;variation_is_active&quot;:true,&quot;variation_is_visible&quot;:true,&quot;weight&quot;:&quot;&quot;,&quot;weight_html&quot;:&quot;N\/A&quot;},{&quot;attributes&quot;:{&quot;attribute_pa_color-variant&quot;:&quot;brown&quot;},&quot;availability_html&quot;:&quot;&quot;,&quot;backorders_allowed&quot;:false,&quot;dimensions&quot;:{&quot;length&quot;:&quot;&quot;,&quot;width&quot;:&quot;&quot;,&quot;height&quot;:&quot;&quot;},&quot;dimensions_html&quot;:&quot;N\/A&quot;,&quot;display_price&quot;:208,&quot;display_regular_price&quot;:234,&quot;image&quot;:{&quot;title&quot;:&quot;product-classic-chair-brown&quot;,&quot;caption&quot;:&quot;&quot;,&quot;url&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown.jpg&quot;,&quot;alt&quot;:&quot;&quot;,&quot;src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-768x953.jpg&quot;,&quot;srcset&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-768x953.jpg 768w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-450x558.jpg 450w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-600x744.jpg 600w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-242x300.jpg 242w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-825x1024.jpg 825w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-1238x1536.jpg 1238w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown.jpg 1280w&quot;,&quot;sizes&quot;:&quot;(max-width: 680px) 100vw, 680px&quot;,&quot;full_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown.jpg&quot;,&quot;full_src_w&quot;:1280,&quot;full_src_h&quot;:1588,&quot;gallery_thumbnail_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-100x100.jpg&quot;,&quot;gallery_thumbnail_src_w&quot;:100,&quot;gallery_thumbnail_src_h&quot;:100,&quot;thumb_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-450x558.jpg&quot;,&quot;thumb_src_w&quot;:350,&quot;thumb_src_h&quot;:434,&quot;src_w&quot;:680,&quot;src_h&quot;:844},&quot;image_id&quot;:3307,&quot;is_downloadable&quot;:false,&quot;is_in_stock&quot;:true,&quot;is_purchasable&quot;:true,&quot;is_sold_individually&quot;:&quot;no&quot;,&quot;is_virtual&quot;:false,&quot;max_qty&quot;:&quot;&quot;,&quot;min_qty&quot;:1,&quot;price_html&quot;:&quot;&quot;,&quot;sku&quot;:&quot;73253-55&quot;,&quot;variation_description&quot;:&quot;&quot;,&quot;variation_id&quot;:3304,&quot;variation_is_active&quot;:true,&quot;variation_is_visible&quot;:true,&quot;weight&quot;:&quot;&quot;,&quot;weight_html&quot;:&quot;N\/A&quot;}]">


												<div class="single_variation_wrap">
													<div class="woocommerce-variation single_variation"></div>
													<div
														class="woocommerce-variation-add-to-cart variations_button">


													<%-- 	<div class="nm-quantity-wrap  qty-show">
															<label>수량 </label>
															<div class="quantity">
																<button type="button" id="qty-minus" class="qty-btn"
																	onClick="qtyMinus()">-</button>
																&nbsp;
																<form id="qtyForm">
																	<input type="number" id="qtyValue"
																		class="input-text qty text" step="1" min="1" max=""
																		name="prodQty" value="1" size="4" readonly="readonly"
																		pattern="[0-9]*" /> <input type="hidden"
																		name="prodId" value="${product.id}" />
																</form>
																&nbsp;

																<button type="button" id="qty-plus" class="qty-btn"
																	onClick="qtyPlus()">+</button>

															</div>
														</div>
														<script>
															function qtyMinus() {
																
																
																var qty = document
																		.getElementById("qtyValue").value;
																var minusQty = Number(qty) - 1;

																if (minusQty <= 0) {
																	document
																			.getElementById("qtyValue").value = qty;
																} else {
																	document
																			.getElementById("qtyValue").value = minusQty;
																}
																
															}

															function qtyPlus() {
																var qty = document
																		.getElementById("qtyValue").value;
																var plusQty = Number(qty) + 1;

																//alert(plusQty);
																document
																		.getElementById("qtyValue").value = plusQty;
															};
														</script> --%>
														
											<!-- 			<form method="post" name="product_form" action="doService">
															<input type="hidden" name="target_count" value= "">
															<input type="button" name="target_name" value="submit" onClick=product_form.submit();>
														</form>
 -->
														<div style="padding: 10px 10px;">
<<<<<<< HEAD
															<button type="button" id="cart"
																class="btn" >
																<a class="pl-3 inline-block no-underline hover:text-black" href='<c:url value="/shop/addProdToCart">
																<c:param name="prodId" value="${product.id}"/>
 																</c:url>'>  				
																Cart</a>
																</button><!--장바구니 -->
															<button type="button" id="buy" class="btn">Buy</button>			
=======
															<button type="submit" formaction="/order/Cart" id="cart"
																class="btn">Cart</button><!--장바구니 -->
																<a class="nav-link js-scroll-trigger" href="<c:url value="/shop/viewCart"/>"><font color="black">CART</font></a>
															</button>
															
															<button type="button" id="buy" class="btn" href="<c:url value="/shop/order"/>">Buy</button>
															<a href="<c:url value="/shop/order"></c:url>"> <font color="BLACK"> Buy </font>
											
>>>>>>> branch 'main' of https://github.com/lakedata/Dmd.git
														</div>


														<input type="hidden" name="add-to-cart" value="253" /> <input
															type="hidden" name="product_id" value="253" /> <input
															type="hidden" name="variation_id" class="variation_id"
															value="0" />
													</div>
												</div>

											</form>

										</div>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="woocommerce-tabs wc-tabs-wrapper">
					<div class="nm-product-tabs-col">

						<div
							class="woocommerce-Tabs-panel woocommerce-Tabs-panel--reviews panel wc-tab"
							id="tab-reviews" role="tabpanel"
							aria-labelledby="tab-title-reviews">
							<div class="nm-row">
								<div class="col-xs-12">
									<div class="nm-tabs-panel-inner">
										<div id="reviews" class="woocommerce-Reviews">

											<div id="review_form_wrapper">

												<div id="review_form" style="text-align:center;">
													<div id="respond" class="comment-respond">

														<form
															action="https://savoy.nordicmade.com/wp-comments-post.php"
															method="post" id="commentform" class="comment-form">
															<label for="comment">Your review&nbsp;</label>
															<p class="comment-form-comment">
																
																<textarea id="comment" name="comment" cols="45" rows="8"
																	required></textarea>
															</p>
															<p class="form-submit">
																<input name="submit" type="submit" id="submit"
																	class="submit" value="Submit" /> 
															</p>

														</form>
													</div>
													<!-- #respond -->
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="../common/footer.jsp" %>
</body>
</html>
