<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>m²Dm - interior Shop:</title>
<link rel="stylesheet"
	href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css" />

<link
	href="https://fonts.googleapis.com/css?family=Work+Sans:200,400&display=swap"
	rel="stylesheet">

<style>
.work-sans {
	font-family: 'Work Sans', sans-serif;
}

#menu-toggle:checked+#menu {
	display: block;
}

.hover\:grow {
	transition: all 0.3s;
	transform: scale(1);
}

.hover\:grow:hover {
	transform: scale(1.02);
}

.carousel-open:checked+.carousel-item {
	position: static;
	opacity: 100;
}

.carousel-item {
	-webkit-transition: opacity 0.6s ease-out;
	transition: opacity 0.6s ease-out;
}

#carousel-1:checked ~ .control-1, #carousel-2:checked ~ .control-2,
	#carousel-3:checked ~ .control-3 {
	display: block;
}

.carousel-indicators {
	list-style: none;
	margin: 0;
	padding: 0;
	position: absolute;
	bottom: 2%;
	left: 0;
	right: 0;
	text-align: center;
	z-index: 10;
}

#carousel-1:checked ~ .control-1 ~ .carousel-indicators li:nth-child(1) .carousel-bullet,
	#carousel-2:checked ~ .control-2 ~ .carousel-indicators li:nth-child(2) .carousel-bullet,
	#carousel-3:checked ~ .control-3 ~ .carousel-indicators li:nth-child(3) .carousel-bullet
	{
	color: #000;
	/*Set to match the Tailwind colour you want the active one to be */
}
</style>

<!--  category-style -->
<style>
#btn_group button {
	border: 1px solid #F28C28;
	background-color: rgba(0, 0, 0, 0);
	color: #F28C28;
	padding: 20px;
}

#btn_group button:hover {
	color: white;
	background-color: #FFDEAD;
}
</style>


</head>

<body
	class="bg-white text-gray-600 work-sans leading-normal text-base tracking-normal">

	<%@ include file="../common/includeTop.jsp" %>

	<section class="bg-white py-8">

		<div class="container mx-auto flex items-center flex-wrap pt-4 pb-12">

			<nav id="store" class="w-full z-30 top-0 px-6 py-1">
				<div
					class="w-full container mx-auto flex flex-wrap items-center justify-between mt-0 px-2 py-3">

					<a
						class="uppercase tracking-wide no-underline hover:no-underline font-bold text-gray-800 text-xl "
						href="<c:url value="/shop/shopMain"></c:url>"> Store </a>


					<!-- category -->
					<div id="btn_group">
						<button id="cat_btn1" onclick="location.href='/shop/shopMain'">전체</button>
						<button id="cat_btn2" onclick="location.href='<c:url value='/shop/category'><c:param name='cateCode' value='9000'/></c:url>'">가구</button>
						<button id="cat_btn3" onclick="location.href='<c:url value='/shop/category'><c:param name='cateCode' value='9001'/></c:url>'">페브릭</button>
						<button id="cat_btn4" onclick="location.href='<c:url value='/shop/category'><c:param name='cateCode' value='9002'/></c:url>'">조명</button>
						<button id="cat_btn5" onclick="location.href='<c:url value='/shop/category'><c:param name='cateCode' value='9003'/></c:url>'">수납/정리</button>
						<button id="cat_btn6" onclick="location.href='<c:url value='/shop/category'><c:param name='cateCode' value='9004'/></c:url>'">소품</button>
						<button id="cat_btn7" onclick="location.href='<c:url value='/shop/category'><c:param name='cateCode' value='9005'/></c:url>'">식물</button>
					</div>
					<div class="flex items-center" id="store-nav-content">

						<a class="pl-3 inline-block no-underline hover:text-black"
							href="#"> <svg class="fill-current hover:text-black"
								xmlns="http://www.w3.org/2000/svg" width="24" height="24"
								viewBox="0 0 24 24">
                                <path
									d="M7 11H17V13H7zM4 7H20V9H4zM10 15H14V17H10z" />
                            </svg>
						</a> 
						<form action="<c:url value='/shop/search' />" method="post">
							<svg class=" pl-3 inline-block no-underline hover:text-black fill-current hover:text-black"
									xmlns="http://www.w3.org/2000/svg" width="30" height="30"
									viewBox="0 0 30 30">
	                                <path
										d="M10,18c1.846,0,3.543-0.635,4.897-1.688l4.396,4.396l1.414-1.414l-4.396-4.396C17.365,13.543,18,11.846,18,10 c0-4.411-3.589-8-8-8s-8,3.589-8,8S5.589,18,10,18z M10,4c3.309,0,6,2.691,6,6s-2.691,6-6,6s-6-2.691-6-6S6.691,4,10,4z" />
	                        </svg>
							<input type="text" name="keyword" size="15" />
						</form>
					</div>
				</div>
			</nav>
			<c:if test="${userSession.profile.id eq 'admin'}">
			<div>
				<a href="<c:url value="/shop/addProduct"></c:url>"> 
					<font color="BLACK">추가</font>
				</a>
			</div>
			</c:if>
			
			<c:forEach var="product" items="${productList.pageList}">
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col">
					<a href="<c:url value="/shop/product" > <c:param name="prodId" value="${product.id}"/></c:url>">
						<img class="hover:grow hover:shadow-lg"
						src="<c:out value="${product.prodIMGUrl}"></c:out>" style="width:300px; height:300px;">
						<div class="pt-3 flex items-center justify-between">
						<p class=""><c:out value="${product.name}"></c:out></p>
						<svg class="h-6 w-6 fill-current text-gray-500 hover:text-black"
							xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                            <path
								d="M12,4.595c-1.104-1.006-2.512-1.558-3.996-1.558c-1.578,0-3.072,0.623-4.213,1.758c-2.353,2.363-2.352,6.059,0.002,8.412 l7.332,7.332c0.17,0.299,0.498,0.492,0.875,0.492c0.322,0,0.609-0.163,0.792-0.409l7.415-7.415 c2.354-2.354,2.354-6.049-0.002-8.416c-1.137-1.131-2.631-1.754-4.209-1.754C14.513,3.037,13.104,3.589,12,4.595z M18.791,6.205 c1.563,1.571,1.564,4.025,0.002,5.588L12,18.586l-6.793-6.793C3.645,10.23,3.646,7.776,5.205,6.209 c0.76-0.756,1.754-1.172,2.799-1.172s2.035,0.416,2.789,1.17l0.5,0.5c0.391,0.391,1.023,0.391,1.414,0l0.5-0.5 C14.719,4.698,17.281,4.702,18.791,6.205z" />
                        </svg>
					</div>
					<p class="pt-1 text-gray-900"><c:out value="${product.price}"></c:out></p>
					</a>
					<br>
				</div>		
			</c:forEach>
			
		</div>
	</section>

	<%@ include file="../common/footer.jsp" %>
</body>
</html>