package com.duchung.controller.admin;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.duchung.constant.SystemConstant;
import com.duchung.model.NewModel;
import com.duchung.service.INewService;

@WebServlet(urlPatterns = {"/admin-new" })
public class NewController extends HttpServlet{
	
	private static final long serialVersionUID = -7764312555266175933L;
	
	@Inject
	private INewService newService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NewModel newModel = new NewModel();
		newModel.setListResult(newService.findAll()); 
		request.setAttribute(SystemConstant.MODEL, newModel);
		RequestDispatcher rd = request.getRequestDispatcher("views/admin/new/list.jsp");
		rd.forward(request, response);
	}
}
