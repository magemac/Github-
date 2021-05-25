<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<!-- ../는 파일 위로 한칸 -->


<div class="container">
<!-- 셀렉트는 왠만하면 get 이지만  -->
<!--아이디 비번은 주소에 노출되면 안되기 때문에 get 아닌 Post 사용   -->
	<form action="${cp}/user?cmd=login" method="post">
		<div class="form-group">

			<input type="text" class="form-control" placeholder="Enter username" name="username" value="" required="required"/>
		</div>
		<div class="form-group">

			<input type="text" class="form-control" placeholder="Enter password" name="password" required="required"/>
		</div>
	 <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox" name="rememberMe"> Remember me
    </label>
  </div>

		<button type="submit" class="btn btn-primary">로그인</button>
	</form>

</div>


<%@ include file="../layout/footer.jsp"%>