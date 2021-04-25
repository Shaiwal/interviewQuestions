package com.test.leetcode;

/*
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 */
public class DefangIPAddress {
	
	public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
	
	public static void main(String args[]) {
		System.out.println(DefangIPAddress.defangIPaddr("1.1.1.1"));
	}

}
