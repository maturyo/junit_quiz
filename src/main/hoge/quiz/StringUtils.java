package hoge.quiz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringUtils {
	public static List<String> distinct(List<String> list) {

		if (list == null) {
			return null;
		} else {
			Set<String> set = new LinkedHashSet<String>(list);
			List<String> list2 = new ArrayList<String>(set);
			return list2;
		}
	}

	public static boolean isBlank(String str) {
		if (str == null || str.isEmpty() || str.replaceAll("　", " ").trim().length() == 0) {
			return true;
		}
		return false;
	}

	public static int indexOf(String str, char searchChar) {

		if (str == null) {
			return -1;
		}
		return str.indexOf(searchChar);
	}

	public static String defaultString(String str) {
		if (str == null) {
			return "";
		}
		return str;
	}

	public static String defaultString(String str, String defaultStr) {
		if (str == null) {
			return defaultStr;
		}
		return str;
	}

	public static int length(String str) {
		if(str == null) {
			return 0;
		}
			return str.length();
	}

	public static String substring(String str, int start) {
		if (start < 0) {
			if (str.length() < (-start)) {
				start = 0;
			} else {
				start = str.length() + (start);
			}
		}
		if (str == null) {
			return null;
		} else if (str.length() < start) {
			return "";
		}
		return str.substring(start);
	}


	public static String substring(String str, int start, int end) {
		return null;
	}

	public static String replace(String text, String searchString, String replacement) {
		return null;
	}
}
