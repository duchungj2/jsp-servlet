<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Danh sách bài viết</title>
</head>

<body>
	<div class="main-content">
		<div class="main-content-inner">
			<form action="<c:url value='/admin-new' />" id="formSubmit"
				method="get">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
								chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->

				</div>

				<div class="page-content">

					<div class="row">
						<div class="col-xs-12">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th class="col-xs-3">Title</th>
										<th class="col-xs-3">Thumbnail</th>
										<th class="col-xs-3">Short Description</th>
										<th class="col-xs-3">Content</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="result" items="${model.listResult}">
										<tr>
											<td>${result.title}</td>
											<td>${result.thumbnail}</td>
											<td>${result.shortDescription}</td>
											<td>${result.content}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div class="container">
								<nav aria-label="Page navigation">
									<ul class="pagination" id="pagination"></ul>
									<input type="hidden" value="" id="page" name="page"/>
									<input type="hidden" value="" id="maxPageItem" name="maxPageItem"/>
								</nav>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		var currentPage = ${model.page};
		var totalPage = ${model.totalPage};
		var limit = 2;
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPage,
				visiblePages : 10,
				startPage : currentPage,
				onPageClick : function(event, page) {
					console.info(page + ' (from options)');
					if (currentPage != page) {
						$('#maxPageItem').val(limit);
						$('#page').val(page);
						$('#formSubmit').submit();	
					}
				}
			})
		});
	</script>
</body>

</html>