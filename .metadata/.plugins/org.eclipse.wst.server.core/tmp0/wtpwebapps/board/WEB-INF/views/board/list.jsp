<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html>
<html lang="en">

<head>
	<%@include file="../includes/header.jsp" %>
	<title>게시글 목록</title>
	
	<script type="text/javascript">
		$(document).ready(function(){
			var result = '<c:out value="${result}" />';
			
			checkModal(result);
			
			history.replaceState({},null,null);
			
			function checkModal(result){
				if(result === '' || history.state){
					return;
				}
				
				if(parseInt(result) >0){
					$(".modal-body").html("처리가 완료되었습니다.");
				}
				
				$("#myModal").modal("show");
			}
			
			
			$("#regBtn").on("click", function(){
				self.location = "/board/register";
			});
			
			var actionForm = $("#actionForm");
			
			$(".page-link a").on("click", function(e){
				
				//a태그 말고 form태그로 이동하도록
				e.preventDefault();
				
				console.log('클릭');
				
				actionForm.find("input[name='pageNum']").val($(this).attr("href"));
				actionForm.submit();
				
			});
			
			$(".move").on("click", function(e){
				
				e.preventDefault();
				actionForm.append("<input type='hidden' name='bno' value='" + $(this).attr("href") + "'>");
				actionForm.attr("action", "/board/detail");
				actionForm.submit();
				
			});
			
			//검색
			var searchForm = $("#searchForm");
			$("#searchBtn").on("click", function(e){
				
				if(!searchForm.find("option:selected").val()){
					alert("검색 종류를 선택하세요");
					return false;
				}
				
				if(!searchForm.find("input[name='keyword']").val()){
					alert("키워드를 입력하세요");
					return false;
				}
				
				searchForm.find("input[name='pageNum']").val("1");
				e.preventDefault();
				
				searchForm.submit();
			});
			
		});
	</script>
</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">자유 게시판</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="index.html">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>Dashboard</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Interface
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>Components</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Components:</h6>
                        <a class="collapse-item" href="buttons.html">Buttons</a>
                        <a class="collapse-item" href="cards.html">Cards</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                    <i class="fas fa-fw fa-wrench"></i>
                    <span>Utilities</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Custom Utilities:</h6>
                        <a class="collapse-item" href="utilities-color.html">Colors</a>
                        <a class="collapse-item" href="utilities-border.html">Borders</a>
                        <a class="collapse-item" href="utilities-animation.html">Animations</a>
                        <a class="collapse-item" href="utilities-other.html">Other</a>
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                    aria-expanded="true" aria-controls="collapsePages">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Pages</span>
                </a>
                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Login Screens:</h6>
                        <a class="collapse-item" href="login.html">Login</a>
                        <a class="collapse-item" href="register.html">Register</a>
                        <a class="collapse-item" href="forgot-password.html">Forgot Password</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Other Pages:</h6>
                        <a class="collapse-item" href="404.html">404 Page</a>
                        <a class="collapse-item" href="blank.html">Blank Page</a>
                    </div>
                </div>
            </li>

            <!-- Nav Item - Charts -->
            <li class="nav-item">
                <a class="nav-link" href="charts.html">
                    <i class="fas fa-fw fa-chart-area"></i>
                    <span>Charts</span></a>
            </li>

            <!-- Nav Item - Tables -->
            <li class="nav-item active">
                <a class="nav-link" href="tables.html">
                    <i class="fas fa-fw fa-table"></i>
                    <span>Tables</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <form class="form-inline">
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>
                    </form>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">김하영</span>
                                <img class="img-profile rounded-circle"
                                    src="/resources/img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">게시판</h1>
                    <p class="mb-4">자유롭게 글을 쓰는 공간입니다.</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                    
                    	<!-- 검색 -->
                        <div class="card-header py-3" align="right">
		         			<form id='searchForm' action='/board/list' method='get'>
		                        <div class="input-group">
		                        	<select name='type'>
		                        		<option value="" <c:out value="${pageMaker.cri.type == null? 'selected':''}"></c:out>>--</option>
		                        		<option value="T" <c:out value="${pageMaker.cri.type eq 'T'? 'selected':''}"></c:out>>제목</option>
		                        		<option value="C" <c:out value="${pageMaker.cri.type eq 'C'? 'selected':''}"></c:out>>내용</option>
		                        		<option value="I" <c:out value="${pageMaker.cri.type eq 'I'? 'selected':''}"></c:out>>작성자</option>
		                        		<option value="TC" <c:out value="${pageMaker.cri.type eq 'TC'? 'selected':''}"></c:out>>제목 or 내용</option>
		                        		<option value="TI" <c:out value="${pageMaker.cri.type eq 'TI'? 'selected':''}"></c:out>>제목 or 작성자</option>
		                        		<option value="TCI" <c:out value="${pageMaker.cri.type eq 'TCI'? 'selected':''}"></c:out>>제목 or 내용 or 작성자</option>
		                        	</select>
		                            <input type="text" name="keyword" placeholder="Search for..." value='<c:out value="${pageMaker.cri.keyword}"/>'>
		                            <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
		                            <input type="hidden" name="amount" value="${pageMaker.cri.amount}">
		                            
		                            <div class="input-group-append">
		                                <button id='searchBtn' class="btn btn-primary" type="button">
		                                    <i class="fas fa-search fa-sm"></i>
		                                </button>
		                                &nbsp;               
                        				<button id='regBtn' type="button" class="btn btn-outline-primary" >새 글 등록</button>
		                            </div>

		                        </div>
		                    </form>
                        </div>
                        

                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="" width="100%" cellspacing="0">
                                    <thead>
                                    	<tr>
                                    		<th>번호</th>
                                    		<th>제목</th>
                                    		<th>내용</th>
                                    		<th>작성자</th>
                                    		<th>작성일</th>
                                    	</tr>
                                    </thead>
                					
                					<c:forEach items="${boardList}" var="board">
                						<tr>
                							<td><c:out value="${board.bno}"></c:out></td>
                							<td>
                								<a class='move' href='<c:out value="${board.bno}"></c:out>'>
                								<c:out value="${board.btitle}"></c:out>
                								</a> 
                							</td>
                							<td><c:out value="${board.bcontent}"></c:out></td>
                							<td><c:out value="${board.bid}"></c:out></td>
                							<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.bregdate}"></fmt:formatDate></td>
                						</tr>
                					</c:forEach>
                                </table>
                                
                                <!-- 페이징 -->
								<div class="float-sm-right">
									<ul class="pagination">
										<c:if test="${pageMaker.prev}">
											<li class="page-link"><a href="${pageMaker.startPage -1}">Previous</a></li>
										</c:if>
										
										<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
											<li class="${pageMaker.cri.pageNum == num ? "btn":"page-link"} "><a href="${num}">${num}</a></li>
										</c:forEach>
										
										<c:if test="${pageMaker.next}">
											<li class="page-link"><a href="${pageMaker.endPage +1}">Next</a></li>
										</c:if>
									</ul>
									<form id='actionForm' action="/board/list" method="get">
										<input type='hidden' name='pageNum' value='${pageMaker.cri.pageNum}'>
										<input type='hidden' name='amount' value='${pageMaker.cri.amount}'>
										<input type='hidden' name='type' value='${pageMaker.cri.type}'>
										<input type='hidden' name='keyword' value='${pageMaker.cri.keyword}'>
									</form>
								</div>                                

                                <!-- Modal창 -->
                                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                	<div class="modal-dialog">
                                		<div class="modal-content">
                                			<div class="modal-header">
                                				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                			</div>
                                			<div class="modal-body" align="center">처리가 완료되었습니다.</div>
                                			<div class="modal-footer">
                                 				<button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
<!--                                				<button type="button" class="btn btn-primary">Save changes</button> -->
                                			</div>
                                		</div>
                                	</div>
                                </div> 
                                <!-- Modal창 끝 -->
                                
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2020</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

	<%@include file="../includes/footer.jsp" %>
</body>

</html>