/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-03-04 12:34:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/workspace/springBoard/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/board/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/board/../includes/footer.jsp", Long.valueOf(1614788844087L));
    _jspx_dependants.put("jar:file:/D:/workspace/springBoard/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/board/../includes/header.jsp", Long.valueOf(1614788658887L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1604315684370L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>게시글 수정</title>\r\n");
      out.write("\t");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom fonts for this template -->\r\n");
      out.write("    <link href=\"/resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"/resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this page -->\r\n");
      out.write("    <link href=\"/resources/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
      out.write("\r\n");
      out.write("\t<!-- include summernote css/js -->\r\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("    \tvar toolbar = [\r\n");
      out.write("\t\t    // 글꼴 설정\r\n");
      out.write("\t\t    ['fontname', ['fontname']],\r\n");
      out.write("\t\t    // 글자 크기 설정\r\n");
      out.write("\t\t    ['fontsize', ['fontsize']],\r\n");
      out.write("\t\t    // 굵기, 기울임꼴, 밑줄,취소 선, 서식지우기\r\n");
      out.write("\t\t    ['style', ['bold', 'italic', 'underline','strikethrough', 'clear']],\r\n");
      out.write("\t\t    // 글자색\r\n");
      out.write("\t\t    ['color', ['forecolor','color']],\r\n");
      out.write("\t\t    // 표만들기\r\n");
      out.write("\t\t    ['table', ['table']],\r\n");
      out.write("\t\t    // 글머리 기호, 번호매기기, 문단정렬\r\n");
      out.write("\t\t    ['para', ['ul', 'ol', 'paragraph']],\r\n");
      out.write("\t\t    // 줄간격\r\n");
      out.write("\t\t    ['height', ['height']],\r\n");
      out.write("\r\n");
      out.write("\t\t];\r\n");
      out.write("\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("            height : 300,\r\n");
      out.write("            minHeight : null,\r\n");
      out.write("            maxHeight : null,\r\n");
      out.write("            focus : true,\r\n");
      out.write("            lang : 'ko-KR',\r\n");
      out.write("            toolbar : toolbar\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        $('.summernote').summernote(setting);\r\n");
      out.write("       \r\n");
      out.write("      //버튼이벤트\r\n");
      out.write("        var formObj = $(\"form\");\r\n");
      out.write("        \r\n");
      out.write("        $('button').on(\"click\", function(e){\r\n");
      out.write("        \t\r\n");
      out.write("        \te.preventDefault();\r\n");
      out.write("        \t\r\n");
      out.write("        \tvar operation = $(this).data(\"oper\");\r\n");
      out.write("        \t\r\n");
      out.write("        \tconsole.log(operation);\r\n");
      out.write("        \t\r\n");
      out.write("        \tif(operation==='remove'){\r\n");
      out.write("        \t\tformObj.attr(\"action\", \"/board/remove\");\r\n");
      out.write("        \t\r\n");
      out.write("        \t}else if(operation==='list'){\r\n");
      out.write("        \t\tself.location = \"/board/list\";\r\n");
      out.write("        \t\treturn;\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t}\r\n");
      out.write("        \tformObj.submit();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Wrapper -->\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar - Brand -->\r\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\r\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                    <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">자유 게시판</div>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Dashboard -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                    <span>Dashboard</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Heading -->\r\n");
      out.write("            <div class=\"sidebar-heading\">\r\n");
      out.write("                Interface\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                    <span>Components</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Components:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"buttons.html\">Buttons</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"cards.html\">Cards</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-wrench\"></i>\r\n");
      out.write("                    <span>Utilities</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
      out.write("                    data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Utilities:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-color.html\">Colors</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-border.html\">Borders</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-animation.html\">Animations</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-folder\"></i>\r\n");
      out.write("                    <span>Pages</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"login.html\">Login</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"register.html\">Register</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"forgot-password.html\">Forgot Password</a>\r\n");
      out.write("                        <div class=\"collapse-divider\"></div>\r\n");
      out.write("                        <h6 class=\"collapse-header\">Other Pages:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"404.html\">404 Page</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Charts -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("                    <span>Charts</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Tables -->\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-table\"></i>\r\n");
      out.write("                    <span>Tables</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Wrapper -->\r\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Main Content -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Topbar -->\r\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                    <form class=\"form-inline\">\r\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar Navbar -->\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - User Information -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">김하영</span>\r\n");
      out.write("                                <img class=\"img-profile rounded-circle\"\r\n");
      out.write("                                    src=\"/resources/img/undraw_profile.svg\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - User Information -->\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                                aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Profile\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Settings\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                                    Logout\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Begin Page Content -->\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Page Heading -->\r\n");
      out.write("                  <!--   <h1 class=\"h3 mb-2 text-gray-800\">게시글 쓰기</h1> -->\r\n");
      out.write("                    <p class=\"mb-4\">게시글 쓰기</p>\r\n");
      out.write("\r\n");
      out.write("                    <!-- DataTales Example -->\r\n");
      out.write("                    <div class=\"card shadow mb-4\">\r\n");
      out.write("                        <div class=\"card-header py-3\">\r\n");
      out.write("\t\t       \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                        <form action=\"/board/edit\" method=\"post\">\r\n");
      out.write("                        \t<div class=\"form-group\">\r\n");
      out.write("                        \t\t<label>제목</label> <input class=\"form-control\" name='btitle' value='");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("' >\r\n");
      out.write("                        \t</div>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t<div class=\"form-group\">\r\n");
      out.write("                        \t\t<label>내용</label> <textarea class=\"summernote\" name='bcontent'>");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("</textarea>\r\n");
      out.write("                        \t</div>\r\n");
      out.write("                        \t\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                       \t\t\t<label>작성일</label> <input class=\"form-control\" value='");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("' >\r\n");
      out.write("                       \t\t</div>  \r\n");
      out.write("                       \t\t                 \t\r\n");
      out.write("                        \t<input type=\"hidden\" name='bno' value='");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("                        \t<div>첨부파일</div>\r\n");
      out.write("                        \t<button type=\"submit\" data-oper='edit' class=\"btn btn-primary\">수정</button>\r\n");
      out.write("                        \t<button type=\"submit\" data-oper='remove' class=\"btn btn-primary\">삭제</button>\r\n");
      out.write("                        \t<button type=\"submit\" data-oper='list' class=\"btn btn-primary\">목록으로</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                <div class=\"container my-auto\">\r\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                        <span>Copyright &copy; Your Website 2020</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("    <!-- Scroll to Top Button-->\r\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Logout Modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("        aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript-->\r\n");
      out.write("<!--<script src=\"/resources/vendor/jquery/jquery.min.js\"></script> -->\r\n");
      out.write("    <script src=\"/resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"/resources/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom scripts for all pages-->\r\n");
      out.write("    <script src=\"/resources/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level plugins -->\r\n");
      out.write("    <script src=\"/resources/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level custom scripts -->\r\n");
      out.write("    <script src=\"/resources/js/demo/datatables-demo.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    \t$(document).ready(function(){\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t$('#dataTables-example').DataTable({\r\n");
      out.write("    \t\t\tresponsive: true\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t$(\".sidebar-nav\").attr(\"class\", \"sidebar-nav navbar-collapse collapse\")\r\n");
      out.write("    \t\t                 .attr(\"aria-expanded\", 'false')\r\n");
      out.write("    \t\t                 .attr(\"style\", \"height:1px\");\r\n");
      out.write("    \t});\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/board/edit.jsp(251,93) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bvo.btitle}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /WEB-INF/views/board/edit.jsp(255,89) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bvo.bcontent}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/board/edit.jsp(259,80) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
      // /WEB-INF/views/board/edit.jsp(259,80) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bvo.bregdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent(null);
      // /WEB-INF/views/board/edit.jsp(262,64) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bvo.bno}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }
}