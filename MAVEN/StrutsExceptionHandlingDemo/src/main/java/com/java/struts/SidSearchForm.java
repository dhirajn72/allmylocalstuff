package com.java.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SidSearchForm extends ActionForm {
	private String sid;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.sid = null;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (sid == null || sid.length() == 0) {
			errors.add("sid", new ActionMessage("errors.sid.mandatory"));
		}
		return errors;
	}

}
