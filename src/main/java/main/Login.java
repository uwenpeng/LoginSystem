/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

package main;

import java.util.HashMap;
import java.util.Map;

/***************************************************************************
 *<PRE>
 * 
 *  Creation Date   : Oct 26, 2015
 * 
 *  Author          : Uwen
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 *</PRE>
 ***************************************************************************/
public class Login {

	public static Map<String, String> up = new HashMap<String, String>();

	public static void main(String[] args) {

	}

	public static Map<String, String> list() {
		up.put("Uwen", "1111");
		up.put("Steven", "2222");
		up.put("Keson", "3333");
		return up;
	}

	public static boolean check(Map<String, String> up,String username,String password) throws NullPointerException{
		try {
			if (up.get(username).equals(password)) {
				return true;
			}else{
				return false;
			}
		} catch (NullPointerException e) {
			System.out.println("\n\n\n\nyou have wrong username");
			return false;
		}

	}

	public static String yesOrNo(boolean b) {
		if (b==true) {
			return "恭喜你登陆成功";
		} else {
			return "账号密码错误，请重新登陆";
		}
	}


}
