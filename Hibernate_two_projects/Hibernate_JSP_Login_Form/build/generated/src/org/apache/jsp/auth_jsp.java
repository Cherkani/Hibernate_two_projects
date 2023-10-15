package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Login</title>*\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"/chemin/vers/fontawesome/css/all.min.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha384-oCEkGTXDExWJLg9Rk5FpGrzUS3bJqZ8Jwq5FvVqkrdA18Bj4lPUOqogFJJwS8DXeH\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" \r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" id=\"container\">\r\n");
      out.write("\t<div class=\"form-container sign-up-container\">\r\n");
      out.write("\t\t<form action=\"Inscription\" method=\"POST\">\r\n");
      out.write("\t\t\t<h1>Create Account</h1>\r\n");
      out.write("                        \r\n");
      out.write("\t\t<div class=\"social-container\">\r\n");
      out.write("    <a href=\"https://www.facebook.com/\" class=\"social\"><img src=\"https://cdn-icons-png.flaticon.com/512/4494/4494479.png\" alt=\"Icône personnalisée\"></a>\r\n");
      out.write("    <a href=\"https://www.google.com/\" class=\"social\"><img src=\"https://cdn-icons-png.flaticon.com/512/300/300221.png\" alt=\"Icône personnalisée\"></a>\r\n");
      out.write("    <a href=\"https://www.linkedin.com/\" class=\"social\"><img src=\"https://cdn-icons-png.flaticon.com/512/3670/3670236.png\" alt=\"Icône personnalisée\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write(" \r\n");
      out.write("            <input type=\"text\" name=\"nom\" placeholder=\"Nom\">\r\n");
      out.write("            <input type=\"text\" name=\"prenom\" placeholder=\"Prénom\">\r\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Mot de passe\">\r\n");
      out.write("            <input type=\"date\" name=\"date\" placeholder=\"Date de naissance\">\r\n");
      out.write("            \r\n");
      out.write("   \r\n");
      out.write("\t\t\t\r\n");
      out.write("                        <input type=\"submit\" value=\"Sign Up\" class=\"custom-input\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("              <div class=\"error-message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t<div class=\"form-container sign-in-container\">\r\n");
      out.write("\t\t<form action=\"auth\" method=\"POST\">\r\n");
      out.write("\t\t\t<h1>Sign in</h1>\r\n");
      out.write("\t\t\t<div class=\"social-container\">\r\n");
      out.write("    <a href=\"https://www.facebook.com/\" class=\"social\"><img src=\"https://cdn-icons-png.flaticon.com/512/4494/4494479.png\" alt=\"Icône personnalisée\"></a>\r\n");
      out.write("    <a href=\"https://www.google.com/\" class=\"social\"><img src=\"https://cdn-icons-png.flaticon.com/512/300/300221.png\" alt=\"Icône personnalisée\"></a>\r\n");
      out.write("    <a href=\"https://www.linkedin.com/\" class=\"social\"><img src=\"https://cdn-icons-png.flaticon.com/512/3670/3670236.png\" alt=\"Icône personnalisée\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<span>or use your account</span>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"text\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("           \r\n");
      out.write("                        \r\n");
      out.write("                         <a href=\"forgotPassword.jsp\">Forgot your password?</a>\r\n");
      out.write("\t\t   \r\n");
      out.write("  <input type=\"submit\" value=\"Sign In\" class=\"custom-input\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t<div class=\"overlay-container\">\r\n");
      out.write("\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-left\">\r\n");
      out.write("\t\t\t\t<h1>Welcome Back!</h1>\r\n");
      out.write("\t\t\t\t<p>To keep connected with us please login with your personal info</p>\r\n");
      out.write("\t\t\t\t<button class=\"ghost\" id=\"signIn\">Sign In</a></button>\r\n");
      out.write("                                \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-right\">\r\n");
      out.write("\t\t\t\t<h1>Hello, Friend!</h1>\r\n");
      out.write("\t\t\t\t<p>Enter your personal details and start journey with us</p>\r\n");
      out.write("\t\t\t\t<button class=\"ghost\" id=\"signUp\">Sign Up</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    \r\n");
      out.write("    const signUpButton = document.getElementById('signUp');\r\n");
      out.write("const signInButton = document.getElementById('signIn');\r\n");
      out.write("const container = document.getElementById('container');\r\n");
      out.write("\r\n");
      out.write("signUpButton.addEventListener('click', () => {\r\n");
      out.write("\tcontainer.classList.add(\"right-panel-active\");\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("signInButton.addEventListener('click', () => {\r\n");
      out.write("\tcontainer.classList.remove(\"right-panel-active\");\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
