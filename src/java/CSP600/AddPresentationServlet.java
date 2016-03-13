/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "AddPresentationServlet", urlPatterns = {"/addPresentation"})
public class AddPresentationServlet extends HttpServlet {
     public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {
                               // response.setContentType("text/html");
                               // PrintWriter out = response.getWriter();
 
                                 //for (int i=0;i<4;i++)
                                 //{
                                 
                                 for (String id : request.getParameterValues("id_test")) {
                                    
                                     String presentationDay = request.getParameter("presentationDay_" + id);
                                    String presentationStart = request.getParameter("presentationStart_" + id);
                                    String presentationEnd = request.getParameter("presentationEnd_" + id);
                                }
                                 

                                 PresentationBean presentation = new PresentationBean();
                                 presentation.setPresentationDay(request.getParameter("presentationDay"));
                                 presentation.setPresentationStart(request.getParameter("presentationStart"));
                                 presentation.setPresentationEnd(request.getParameter("presentationEnd"));
//                               String[] presentationDay = request.getParameterValues("presentationDay");  
//                               String[] presentationStart = request.getParameterValues("presentationStart"); 
//                               String[] presentationEnd =  request.getParameterValues("presentationEnd");
                                presentation = AddPresentationDAO.addpresentation(presentation);
                               //  }
                                
//                                out.println("I am an alert box!");
                                
                                response.sendRedirect("addPresentation.jsp");

//			String action = request.getParameter("action");
//
//                        if ("Add more".equals(action)) {
//                            
//                                PresentationBean presentation = new PresentationBean();
//                                presentation.setPresentationDay(request.getParameter("presentationDay"));
//                                presentation.setPresentationStart(Integer.parseInt(request.getParameter("presentationStart")));
//                                presentation.setPresentationEnd(Integer.parseInt(request.getParameter("presentationEnd")));
//
//                                presentation = AddPresentationDAO.addpresentation(presentation);
//                            
//                        } else if ("Delete".equals(action)) {
//                            
//                                PresentationBean presentation = new PresentationBean();
//                                presentation.setPresentationDay(request.getParameter("presentationDay"));
//                                presentation.setPresentationStart(Integer.parseInt(request.getParameter("presentationStart")));
//                                presentation.setPresentationEnd(Integer.parseInt(request.getParameter("presentationEnd")));
//
//                                presentation = DeletePresentationDAO.deletepresentation(presentation); 
//                            
//                        }
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

}
