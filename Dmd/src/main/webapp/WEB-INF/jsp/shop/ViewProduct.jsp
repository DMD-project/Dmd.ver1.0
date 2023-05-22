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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Work+Sans:200,400&display=swap"
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
	color:#777777;
}



</style>

</head>

<body data-rsssl=1
	class="product-template-default single single-product postid-253 theme-savoy woocommerce woocommerce-page woocommerce-no-js nm-page-load-transition-0 nm-preload header-fixed header-mobile-default header-border-1 widget-panel-dark wpb-js-composer js-comp-ver-6.9.0 vc_responsive">

	<div class="nm-page-overflow">
		<div class="nm-page-wrap">

			<div class="nm-page-wrap-inner">
				<div id="nm-header-placeholder" class="nm-header-placeholder"></div>

				<header id="nm-header"
					class="nm-header centered resize-on-scroll clear">
					<%@ include file="IncludeTop.jsp"%>
				</header>

				<div class="woocommerce-notices-wrapper"></div>
				<div id="product-253"
					class="nm-single-product layout-default gallery-col-7 summary-col-5 thumbnails-vertical has-bg-color meta-layout-default tabs-layout-default product type-product post-253 status-publish first instock product_cat-interior product_tag-classic product_tag-interior product_tag-leather has-post-thumbnail sale featured shipping-taxable purchasable product-type-variable has-default-attributes">
					<div class="nm-single-product-bg clear">

						<!-- product category -->
						<div class="nm-single-product-top">
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
						</div>

						<div id="nm-shop-notices-wrap"></div>
						<div class="nm-single-product-showcase">
							<div class="nm-single-product-summary-row nm-row">
								<div class="nm-single-product-summary-col col-xs-12">
									<div
										class="woocommerce-product-gallery woocommerce-product-gallery--with-images woocommerce-product-gallery--columns-4 images lightbox-enabled pagination-enabled"
										data-columns="4"
										style="opacity: 0; transition: opacity .25s ease-in-out;">

										<figure class="woocommerce-product-gallery__wrapper">
											<div
												data-thumb="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-100x100.jpg"
												data-thumb-alt="" class="woocommerce-product-gallery__image">
												<a
													href="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg"><img
													width="680" height="844"
													src="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-680x844.jpg"
													class="wp-post-image" alt="" loading="lazy"
													title="product-classic-chair" data-caption=""
													data-src="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg"
													data-large_image="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg"
													data-large_image_width="1280"
													data-large_image_height="1588"
													srcset="https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-680x844.jpg 680w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-300x372.jpg 300w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-450x558.jpg 450w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-242x300.jpg 242w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-825x1024.jpg 825w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-700x868.jpg 700w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-220x273.jpg 220w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-140x174.jpg 140w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair-940x1166.jpg 940w, https://savoy.nordicmade.com/wp-content/uploads/2015/08/product-classic-chair.jpg 1280w"
													sizes="(max-width: 680px) 100vw, 680px" /></a>
											</div>
										</figure>

									</div>

									<div class="summary entry-summary">
										<div
											class="nm-product-summary-inner-col nm-product-summary-inner-col-1">
											<h1 class="product_title entry-title">${product.name}</h1>
											<p class="price has-sale-flash">
												<del aria-hidden="true">
													<span class="woocommerce-Price-amount amount"><bdi>
														<span class="woocommerce-Price-currencySymbol">&#92;</span>234.00</bdi></span>
												</del>
												<ins>
													<span class="woocommerce-Price-amount amount"><bdi>
														<span class="woocommerce-Price-currencySymbol">&#92;</span>${product.price}</bdi></span>
												</ins>
												<span class="onsale"><span class="nm-onsale-before">-</span>11<span
													class="nm-onsale-after">%</span></span>
											</p>
										</div>
										<div
											class="nm-product-summary-inner-col nm-product-summary-inner-col-2">

											<form id="nm-variations-form"
												class="variations_form cart nm-no-select nm-variation-controls-tooltip tooltip-color tooltip-image"
						
												method="post" enctype='multipart/form-data'
												data-product_id="253"
												data-product_variations="[{&quot;attributes&quot;:{&quot;attribute_pa_color-variant&quot;:&quot;black&quot;},&quot;availability_html&quot;:&quot;&quot;,&quot;backorders_allowed&quot;:false,&quot;dimensions&quot;:{&quot;length&quot;:&quot;&quot;,&quot;width&quot;:&quot;&quot;,&quot;height&quot;:&quot;&quot;},&quot;dimensions_html&quot;:&quot;N\/A&quot;,&quot;display_price&quot;:208,&quot;display_regular_price&quot;:234,&quot;image&quot;:{&quot;title&quot;:&quot;product-classic-chair&quot;,&quot;caption&quot;:&quot;&quot;,&quot;url&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair.jpg&quot;,&quot;alt&quot;:&quot;&quot;,&quot;src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-680x844.jpg&quot;,&quot;srcset&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-680x844.jpg 680w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-300x372.jpg 300w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-450x558.jpg 450w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-242x300.jpg 242w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-825x1024.jpg 825w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-700x868.jpg 700w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-220x273.jpg 220w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-140x174.jpg 140w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-940x1166.jpg 940w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair.jpg 1280w&quot;,&quot;sizes&quot;:&quot;(max-width: 680px) 100vw, 680px&quot;,&quot;full_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair.jpg&quot;,&quot;full_src_w&quot;:1280,&quot;full_src_h&quot;:1588,&quot;gallery_thumbnail_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-100x100.jpg&quot;,&quot;gallery_thumbnail_src_w&quot;:100,&quot;gallery_thumbnail_src_h&quot;:100,&quot;thumb_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2015\/08\/product-classic-chair-300x372.jpg&quot;,&quot;thumb_src_w&quot;:300,&quot;thumb_src_h&quot;:372,&quot;src_w&quot;:680,&quot;src_h&quot;:844},&quot;image_id&quot;:129,&quot;is_downloadable&quot;:false,&quot;is_in_stock&quot;:true,&quot;is_purchasable&quot;:true,&quot;is_sold_individually&quot;:&quot;no&quot;,&quot;is_virtual&quot;:false,&quot;max_qty&quot;:&quot;&quot;,&quot;min_qty&quot;:1,&quot;price_html&quot;:&quot;&quot;,&quot;sku&quot;:&quot;73253-55&quot;,&quot;variation_description&quot;:&quot;&quot;,&quot;variation_id&quot;:3302,&quot;variation_is_active&quot;:true,&quot;variation_is_visible&quot;:true,&quot;weight&quot;:&quot;&quot;,&quot;weight_html&quot;:&quot;N\/A&quot;},{&quot;attributes&quot;:{&quot;attribute_pa_color-variant&quot;:&quot;beige&quot;},&quot;availability_html&quot;:&quot;&quot;,&quot;backorders_allowed&quot;:false,&quot;dimensions&quot;:{&quot;length&quot;:&quot;&quot;,&quot;width&quot;:&quot;&quot;,&quot;height&quot;:&quot;&quot;},&quot;dimensions_html&quot;:&quot;N\/A&quot;,&quot;display_price&quot;:208,&quot;display_regular_price&quot;:234,&quot;image&quot;:{&quot;title&quot;:&quot;product-classic-chair-beige&quot;,&quot;caption&quot;:&quot;&quot;,&quot;url&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige.jpg&quot;,&quot;alt&quot;:&quot;&quot;,&quot;src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-768x953.jpg&quot;,&quot;srcset&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-768x953.jpg 768w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-450x558.jpg 450w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-600x744.jpg 600w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-242x300.jpg 242w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-825x1024.jpg 825w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-1238x1536.jpg 1238w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige.jpg 1280w&quot;,&quot;sizes&quot;:&quot;(max-width: 680px) 100vw, 680px&quot;,&quot;full_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige.jpg&quot;,&quot;full_src_w&quot;:1280,&quot;full_src_h&quot;:1588,&quot;gallery_thumbnail_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-100x100.jpg&quot;,&quot;gallery_thumbnail_src_w&quot;:100,&quot;gallery_thumbnail_src_h&quot;:100,&quot;thumb_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-beige-450x558.jpg&quot;,&quot;thumb_src_w&quot;:350,&quot;thumb_src_h&quot;:434,&quot;src_w&quot;:680,&quot;src_h&quot;:844},&quot;image_id&quot;:3306,&quot;is_downloadable&quot;:false,&quot;is_in_stock&quot;:true,&quot;is_purchasable&quot;:true,&quot;is_sold_individually&quot;:&quot;no&quot;,&quot;is_virtual&quot;:false,&quot;max_qty&quot;:&quot;&quot;,&quot;min_qty&quot;:1,&quot;price_html&quot;:&quot;&quot;,&quot;sku&quot;:&quot;73253-55&quot;,&quot;variation_description&quot;:&quot;&quot;,&quot;variation_id&quot;:3303,&quot;variation_is_active&quot;:true,&quot;variation_is_visible&quot;:true,&quot;weight&quot;:&quot;&quot;,&quot;weight_html&quot;:&quot;N\/A&quot;},{&quot;attributes&quot;:{&quot;attribute_pa_color-variant&quot;:&quot;brown&quot;},&quot;availability_html&quot;:&quot;&quot;,&quot;backorders_allowed&quot;:false,&quot;dimensions&quot;:{&quot;length&quot;:&quot;&quot;,&quot;width&quot;:&quot;&quot;,&quot;height&quot;:&quot;&quot;},&quot;dimensions_html&quot;:&quot;N\/A&quot;,&quot;display_price&quot;:208,&quot;display_regular_price&quot;:234,&quot;image&quot;:{&quot;title&quot;:&quot;product-classic-chair-brown&quot;,&quot;caption&quot;:&quot;&quot;,&quot;url&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown.jpg&quot;,&quot;alt&quot;:&quot;&quot;,&quot;src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-768x953.jpg&quot;,&quot;srcset&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-768x953.jpg 768w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-450x558.jpg 450w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-600x744.jpg 600w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-242x300.jpg 242w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-825x1024.jpg 825w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-1238x1536.jpg 1238w, https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown.jpg 1280w&quot;,&quot;sizes&quot;:&quot;(max-width: 680px) 100vw, 680px&quot;,&quot;full_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown.jpg&quot;,&quot;full_src_w&quot;:1280,&quot;full_src_h&quot;:1588,&quot;gallery_thumbnail_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-100x100.jpg&quot;,&quot;gallery_thumbnail_src_w&quot;:100,&quot;gallery_thumbnail_src_h&quot;:100,&quot;thumb_src&quot;:&quot;https:\/\/savoy.nordicmade.com\/wp-content\/uploads\/2020\/10\/product-classic-chair-brown-450x558.jpg&quot;,&quot;thumb_src_w&quot;:350,&quot;thumb_src_h&quot;:434,&quot;src_w&quot;:680,&quot;src_h&quot;:844},&quot;image_id&quot;:3307,&quot;is_downloadable&quot;:false,&quot;is_in_stock&quot;:true,&quot;is_purchasable&quot;:true,&quot;is_sold_individually&quot;:&quot;no&quot;,&quot;is_virtual&quot;:false,&quot;max_qty&quot;:&quot;&quot;,&quot;min_qty&quot;:1,&quot;price_html&quot;:&quot;&quot;,&quot;sku&quot;:&quot;73253-55&quot;,&quot;variation_description&quot;:&quot;&quot;,&quot;variation_id&quot;:3304,&quot;variation_is_active&quot;:true,&quot;variation_is_visible&quot;:true,&quot;weight&quot;:&quot;&quot;,&quot;weight_html&quot;:&quot;N\/A&quot;}]">

												<table class="variations" cellspacing="0"
													role="presentation">
													<tbody>
														<tr>
															<th class="label"><label for="pa_color-variant">Color</label></th>
															<td class="value">
																<div class="nm-select-hidden">
																	<select id="pa_color-variant" class=""
																		name="attribute_pa_color-variant"
																		data-attribute_name="attribute_pa_color-variant"
																		data-show_option_none="yes"><option value="">Choose
																			an option</option>
																		<option value="black" selected='selected'>Black</option>
																		<option value="beige">Beige</option>
																		<option value="brown">Brown</option></select>
																</div>
																<ul
																	class="nm-variation-control nm-variation-control-image">
																	<li class="nm-variation-option selected"
																		data-value="black"><div
																			class="nm-pa-image-thumbnail-wrap">
																			<img
																				src="https://savoy.nordicmade.com/wp-content/uploads/2020/10/swatch-chair-black.jpg"
																				class="nm-pa-image-thumbnail">
																		</div> <span>Black</span></li>
																	<li class="nm-variation-option" data-value="beige"><div
																			class="nm-pa-image-thumbnail-wrap">
																			<img
																				src="https://savoy.nordicmade.com/wp-content/uploads/2020/10/swatch-chair-beige.jpg"
																				class="nm-pa-image-thumbnail">
																		</div> <span>Beige</span></li>
																	<li class="nm-variation-option" data-value="brown"><div
																			class="nm-pa-image-thumbnail-wrap">
																			<img
																				src="https://savoy.nordicmade.com/wp-content/uploads/2020/10/swatch-chair-brown.jpg"
																				class="nm-pa-image-thumbnail">
																		</div> <span>Brown</span></li>
																</ul> <a class="reset_variations" href="#">Clear</a>
															</td>
														</tr>
									
													</tbody>
												</table>

												<div class="single_variation_wrap">
													<div class="woocommerce-variation single_variation"></div>
													<div
														class="woocommerce-variation-add-to-cart variations_button">

														
														<div class="nm-quantity-wrap  qty-show">
															<label>Quantity</label> <label
																class="nm-qty-label-abbrev">Qty</label>
															
															<div class="quantity">
																<button type="button" id="qty-minus" class="qty-btn" onClick="qtyMinus()">-</button>
																&nbsp;
																<form id="qtyForm">
																	<input type="number" id="qtyValue"
																		class="input-text qty text" step="1" min="1" max=""
																		name="prodQty" value="1" size="4" readonly="readonly"
																		pattern="[0-9]*" />
																	<input type="hidden" name="prodId" value="${product.id}" />
																</form>&nbsp;
																	
																<button type="button" id="qty-plus" class="qty-btn" onClick="qtyPlus()">+</button>
														
															</div>
														</div>
														<script>
															function qtyMinus() {
																var qty = document.getElementById("qtyValue").value;
																var minusQty = Number(qty) - 1;
																
																if(minusQty <= 0) {
																	document.getElementById("qtyValue").value = qty;
																} else {
																	document.getElementById("qtyValue").value = minusQty;
																}
															}
														
															function qtyPlus() {
																var qty = document.getElementById("qtyValue").value;
																var plusQty = Number(qty) + 1;
																
																//alert(plusQty);
																document.getElementById("qtyValue").value = plusQty;
															};
														</script>

														<div style="padding: 10px 10px;">
															<button type="submit" formaction="/order/Cart" id="cart" class="btn">Cart</button>															</button>
															<button type="button" id="buy" class="btn">Buy</button>
														</div>
														
							
														<input type="hidden" name="add-to-cart" value="253" /> <input
															type="hidden" name="product_id" value="253" /> <input
															type="hidden" name="variation_id" class="variation_id"
															value="0" />
													</div>
												</div>

											</form>
							
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="woocommerce-tabs wc-tabs-wrapper">
					<div class="nm-product-tabs-col">
						<div class="nm-row">
							<div class="col-xs-12">
								<ul class="tabs wc-tabs" role="tablist" style="padding: 70px;">
									<li class="description_tab current" id="tab-title-description"
										role="tab" aria-controls="tab-description"
										style="padding: 0px 40px;"><a href="#tab-description">
											Description </a></li>
									<li class="additional_information_tab"
										id="tab-title-additional_information" role="tab"
										aria-controls="tab-additional_information"
										style="padding: 0px 40px;"><a
										href="#tab-additional_information"> Additional information
									</a></li>
									<li class="reviews_tab" id="tab-title-reviews" role="tab"
										aria-controls="tab-reviews" style="padding: 0px 40px;"><a
										href="#tab-reviews"> Reviews <span>0</span>
									</a></li>
								</ul>
							</div>
						</div>

						<div
							class="woocommerce-Tabs-panel woocommerce-Tabs-panel--description panel wc-tab current"
							id="tab-description" role="tabpanel"
							aria-labelledby="tab-title-description">
							<div class="nm-row">
								<div class="col-xs-12">
									<div class="nm-tabs-panel-inner entry-content">

										<p>Authentic keffiyeh master cleanse. Fingerstache
											semiotics PBR quinoa. Pop-up Godard kale chips, trust fund
											Neutra fingerstache paleo Wes Anderson. Deep v single-origin
											coffee cred Thundercats beard. Mumblecore before they sold
											out roof party biodiesel. Banksy swag Portland readymade
											synth messenger bag cliche.</p>
									</div>
								</div>
							</div>
						</div>
						<div
							class="woocommerce-Tabs-panel woocommerce-Tabs-panel--additional_information panel wc-tab"
							id="tab-additional_information" role="tabpanel"
							aria-labelledby="tab-title-additional_information">
							<div class="nm-row">
								<div class="col-xs-12">
									<div class="nm-tabs-panel-inner">

										<div class="nm-additional-information-inner">
											<table class="woocommerce-product-attributes shop_attributes">
												<tr
													class="woocommerce-product-attributes-item woocommerce-product-attributes-item--attribute_pa_weight">
													<th class="woocommerce-product-attributes-item__label">Weight</th>
													<td class="woocommerce-product-attributes-item__value"><p>1.73
															kg</p></td>
												</tr>
												<tr
													class="woocommerce-product-attributes-item woocommerce-product-attributes-item--attribute_pa_dimensions">
													<th class="woocommerce-product-attributes-item__label">Dimensions</th>
													<td class="woocommerce-product-attributes-item__value"><p>100
															x 37 x 100 cm</p></td>
												</tr>
												<tr
													class="woocommerce-product-attributes-item woocommerce-product-attributes-item--attribute_pa_materials">
													<th class="woocommerce-product-attributes-item__label">Materials</th>
													<td class="woocommerce-product-attributes-item__value"><p>80%
															cotton, 20% linen</p></td>
												</tr>
												<tr
													class="woocommerce-product-attributes-item woocommerce-product-attributes-item--attribute_pa_other-info">
													<th class="woocommerce-product-attributes-item__label">Other
														Info</th>
													<td class="woocommerce-product-attributes-item__value"><p>American
															heirloom jean shorts pug seitan letterpress.</p></td>
												</tr>
												<tr
													class="woocommerce-product-attributes-item woocommerce-product-attributes-item--attribute_pa_size">
													<th class="woocommerce-product-attributes-item__label">Size</th>
													<td class="woocommerce-product-attributes-item__value"><p>One
															Size, XL, L, M, S</p></td>
												</tr>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div
							class="woocommerce-Tabs-panel woocommerce-Tabs-panel--reviews panel wc-tab"
							id="tab-reviews" role="tabpanel"
							aria-labelledby="tab-title-reviews">
							<div class="nm-row">
								<div class="col-xs-12">
									<div class="nm-tabs-panel-inner">
										<div id="reviews" class="woocommerce-Reviews">
											<div id="comments">
												<p class="woocommerce-noreviews">There are no reviews
													yet.</p>
											</div>

											<div id="review_form_wrapper">
												<a href="#" id="nm-review-form-btn" class="button border">Add
													a review</a>

												<div id="review_form">
													<div id="respond" class="comment-respond">
														<h3 id="reply-title" class="comment-reply-title">
															Be the first to review &ldquo;Ceramic Tealight
															Holder&rdquo; <small><a rel="nofollow"
																id="cancel-comment-reply-link"
																href="/product/ceramic-tealight-holder/#respond"
																style="display: none;">Cancel reply</a></small>
														</h3>
														<form
															action="https://savoy.nordicmade.com/wp-comments-post.php"
															method="post" id="commentform" class="comment-form">
															<p class="comment-notes">
																<span id="email-notes">Your email address will
																	not be published.</span> <span class="required-field-message"
																	aria-hidden="true">Required fields are marked <span
																	class="required" aria-hidden="true">*</span></span>
															</p>
															<p id="nm-comment-form-rating"
																class="comment-form-rating">
																<label for="rating">Your rating&nbsp;<span
																	class="required">*</span></label><select name="rating"
																	id="rating" required>
																	<option value="">Rate&hellip;</option>
																	<option value="5">Perfect</option>
																	<option value="4">Good</option>
																	<option value="3">Average</option>
																	<option value="2">Not that bad</option>
																	<option value="1">Very poor</option>
																</select>
															</p>
															<p class="comment-form-comment">
																<label for="comment">Your review&nbsp;<span
																	class="required">*</span></label>
																<textarea id="comment" name="comment" cols="45" rows="8"
																	required></textarea>
															</p>
															<p class="comment-form-author">
																<label for="author">Name&nbsp;<span
																	class="required">*</span></label><input id="author"
																	name="author" type="text" value="" size="30" required />
															</p>
															<p class="comment-form-email">
																<label for="email">Email&nbsp;<span
																	class="required">*</span></label><input id="email" name="email"
																	type="email" value="" size="30" required />
															</p>
															<p class="form-submit">
																<input name="submit" type="submit" id="submit"
																	class="submit" value="Submit" /> <input type='hidden'
																	name='comment_post_ID' value='243' id='comment_post_ID' />
																<input type='hidden' name='comment_parent'
																	id='comment_parent' value='0' />
															</p>
															<p style="display: none;">
																<input type="hidden" id="akismet_comment_nonce"
																	name="akismet_comment_nonce" value="f1df86e05d" />
															</p>
															<p style="display: none !important;">
																<label>&#916;<textarea name="ak_hp_textarea"
																		cols="45" rows="8" maxlength="100"></textarea></label><input
																	type="hidden" id="ak_js_1" name="ak_js" value="199" />
															</p>
														</form>
													</div>
													<!-- #respond -->
												</div>
											</div>

											<div class="clear"></div>
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
						<!-- 						<h3 class="font-bold text-gray-900">About</h3>
						<p class="py-4">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Maecenas vel mi ut felis tempus commodo nec id
							erat. Suspendisse consectetur dapibus velit ut lacinia.</p> -->


						<h3 class="font-bold text-gray-900">m<sup>2</sup>Dm</h3>
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
</html>
