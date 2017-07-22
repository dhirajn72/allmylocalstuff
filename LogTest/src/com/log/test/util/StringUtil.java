package com.log.test.util;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class StringUtil {

	public static final Logger _log = Logger.getLogger(StringUtil.class);

	public static String removeSpecialCharacters(String inputString) {
		_log.info("Under removeSpecialCharacters of " + _log.getName());
		_log.info("Input string is: " + inputString);
		String filteredString = StringUtils.replaceEach(inputString,
				new String[] { "*", "-", "%" }, new String[] { "", "", "" });
		_log.info("filtered string is: " + filteredString);

		return filteredString;

	}

}
