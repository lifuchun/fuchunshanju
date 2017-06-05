package com.fuchunshanju.web.util;

import com.fuchunshanju.web.start.InterfaceUrlInti;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @ClassName: InterfaceUni
 * @Description: (项目启动初始化类 )
 * @author Lee
 * @date 2017年4月21日 上午11:57:48
 *
 */
public class InterfaceUni extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		InterfaceUrlInti.init();
	}
}
