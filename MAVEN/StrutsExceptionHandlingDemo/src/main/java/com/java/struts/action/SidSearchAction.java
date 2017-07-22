package com.java.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.struts.SidSearchForm;
import com.java.struts.Student;
import com.java.struts.action.exception.StudentNotFoundException;

public class SidSearchAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SidSearchForm sidSearchForm = (SidSearchForm) form;
		String sid = sidSearchForm.getSid();
		if ("99".equals(sid)) {
			Student stu = new Student();
			stu.setSid(sid);
			stu.setSname("Singh");
			stu.setEmail("singh@gmail.com");
			stu.setPhone("9743854499");
			request.setAttribute("STU", stu);
		} else {
			throw new StudentNotFoundException(sid);
		}
		return mapping.findForward("home");
	}

}
