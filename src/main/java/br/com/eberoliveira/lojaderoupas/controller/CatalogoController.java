package br.com.eberoliveira.lojaderoupas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eberoliveira.lojaderoupas.business.bean.CatalogoBean;

/**
 * Servlet implementation class CatalogoController
 */
@WebServlet("/catalogo")
public class CatalogoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CatalogoBean catalogoBean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogoController() {
        super();
       
        //Inicia o catalogo com as roupas padrão
        catalogoBean = new CatalogoBean();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Envia as roupas do catalogo para o FrontEnd
		request.setAttribute("roupas", catalogoBean.getRoupas() );
		
		// Envia pagina JSP na requisicao
		request.getRequestDispatcher("/catalogo.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
