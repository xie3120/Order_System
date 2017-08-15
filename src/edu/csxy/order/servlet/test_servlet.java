package edu.csxy.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.Dao.Dao;
import edu.csxy.order.Dao_impl.Address_Dao_impl;
import edu.csxy.order.Dao_impl.BaseDao;
import edu.csxy.order.Dao_impl.user_Dao_impl;
import edu.csxy.order.service_domain.Address_Bean;
import edu.csxy.order.service_domain.User_Bean;

/**
 * Servlet implementation class Team_servlet
 */
@WebServlet("/Team_servlet")
public class test_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String U_phone=request.getParameter("U_phone");
		String U_password=request.getParameter("U_password");
		user_Dao user=new user_Dao_impl();
		String result=user.checkUser(U_phone, U_password);
		if(result!=null){
			response.getWriter().append(result);
		}
		//address_Dao address_Dao = new Address_Dao_impl();
		//Address_Bean result = address_Dao.getAddress("1");
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append("���ݿ����").append(result.getallpath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
