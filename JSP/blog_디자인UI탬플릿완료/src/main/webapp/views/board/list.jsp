<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ include file="../layout/header.jsp"%><!-- ../는 파일 위로 한칸 -->
<%@ include file="../layout/footer.jsp"%>

<div class="container">
	<c:forEach begin="1" end="4">
	<!-- 게시글 아이템 시작 -->
		<div class="card gap_b_20">

			<div class="card-body">
				<h4 class="card-title">제목입니다.</h4>

				<a href="#" class="btn btn-primary">상세보기</a>
				</div>
				</div>
	</c:forEach>

	
	</div>

<!-- 게시글 아이템 종료  -->
