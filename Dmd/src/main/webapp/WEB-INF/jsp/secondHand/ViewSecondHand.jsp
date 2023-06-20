<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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
		<%@ include file="IncludeTop.jsp"%>
	</header>

	<div style="margin: 0px 200px 200px 200px;">
		<div class="nm-page-wrap">

			<div class="nm-page-wrap-inner">
				<div id="nm-header-placeholder" class="nm-header-placeholder"></div>



				<div class="woocommerce-notices-wrapper"></div>
				<div id="product-253"
					class="nm-single-product layout-default gallery-col-7 summary-col-5 thumbnails-vertical has-bg-color meta-layout-default tabs-layout-default product type-product post-253 status-publish first instock product_cat-interior product_tag-classic product_tag-interior product_tag-leather has-post-thumbnail sale featured shipping-taxable purchasable product-type-variable has-default-attributes">
					<div class="nm-single-product-bg clear">

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

									</span> 
										<span style="padding: 100px;" class="summary entry-summary">
										<div 
											class="nm-product-summary-inner-col nm-product-summary-inner-col-1">
											<font size=5 class="product_title entry-title">${secondHand.name}</font>
											<p class="price has-sale-flash">

												<i> <span class="woocommerce-Price-amount amount">${secondHand.price} 원</span>
												</i>

											</p>
										</div>
										<div class="nm-row">
											<div class="col-xs-12">
												<ul class="tabs wc-tabs" role="tablist"
													style="padding: 70px;">
													<li class="description_tab current"
														style="padding: 0px 40px;">${secondHand.content}</li>
												</ul>
											</div>
										</div>
										<div
											class="nm-product-summary-inner-col nm-product-summary-inner-col-2">

								
												<div class="single_variation_wrap">
													<div class="woocommerce-variation single_variation"></div>
													<div
														class="woocommerce-variation-add-to-cart variations_button">


														<div class="nm-quantity-wrap  qty-show">
									
															<div class="quantity">
																<c:choose>
																	<c:when test="${(secondHand.sellerID eq userSession.profile.id) and (secondHand.sellerID != null)}">
																		<!-- 판매자 -->
																		<a href='<c:url value="/secondHand/update">
																			<c:param name="id" value="${secondHand.id}" /></c:url>'>
																			<button type="button" id="update" class="btn">수정하기</button>
																		</a>
																		<br><br>
																		<a href='<c:url value="/secondHand/delete">
																			<c:param name="id" value="${secondHand.id}" /></c:url>'>
																			<button type="button" id="delete" class="btn">삭제하기</button>
																		</a>
																		<p>
																	</c:when>
																	<c:otherwise>
																		<!-- 구매자 / 판매중 -->
																		<c:if test="${fn:contains(secondHand.sellerFlag, 'n')}">
																			<c:choose>
																				<c:when test="${userSession.profile.id != null}">
																					<a href='<c:url value="/secondHand/buy">
																						<c:param name="id" value="${secondHand.id}" />
																						<c:param name="buyerId" value="${userSession.profile.id}" />
																						</c:url>'>
																						<button type="button" id="update" class="btn">구매 요청</button>
																					</a>
																				</c:when>
																				<c:otherwise>
																					<button type="button" id="update" class="btn">판매중</button>
																				</c:otherwise>
																			</c:choose>
																		</c:if>
																		<!-- 구매자 / 판매 완료 -->
																		<c:if test="${fn:contains(secondHand.sellerFlag, 'y')}">
																			<button type="input" id="soldout" class="btn">판매완료</button>
																		</c:if>
																	</c:otherwise>
																</c:choose>

															</div>
														</div>
														
														


														
													</div>
												</div>

										</div>
									</span>
								
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
															<label for="comment">&nbsp;</label>
															<p class="comment-form-comment">
																
																
															</p>
															<p class="form-submit">
																<input name="submit" type="submit" id="submit"
																	class="submit" value=" " /> 
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
	</div>

	<footer
		class="container mx-auto bg-white py-8 border-t border-gray-400">
		<div class="container flex px-3 py-8 ">
			<div class="w-full mx-auto flex flex-wrap">
				<div class="flex w-full lg:w-1/2 ">
					<div class="px-3 md:px-0">
						<h3 class="font-bold text-gray-900">
							m<sup>2</sup>Dm
						</h3>
						<p class="py-4">서울특별시 성북구 화랑로13길 60 02-940-0000 wwww.m²Dm.com</p>
					</div>
				</div>
				<div class="flex w-full lg:w-1/2 lg:justify-end lg:text-right">
					<div class="px-3 md:px-0">
						<h3 class="font-bold text-gray-900">Social</h3>
						<ul class="list-reset items-center pt-3">
							<li><a
								class="inline-block no-underline hover:text-black hover:underline py-1"
								href="#">Add social links</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</footer>
</body>