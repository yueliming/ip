/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liming;

/**
 *
 * @author Liming YUE
 */
public class Solution {
    public static long ipToLong(String ip) {
        String[] items = ip.split("\\.");
        return (Long.parseLong(items[0]) << 24)
                + (Long.parseLong(items[1]) << 16)
                + (Long.parseLong(items[2]) << 8)
                + (Long.parseLong(items[3]));
    }

    public static String longToIp(long ipLong) {
        StringBuilder str = new StringBuilder();
        str.append((ipLong >>> 24) & 0xFF).append(".");
        str.append((ipLong >>> 16) & 0xFF).append(".");
        str.append((ipLong >>> 8) & 0xFF).append(".");
        str.append(ipLong & 0xFF);             
        return str.toString();
    }

    public static void main(String[] args) {
        String ip = "192.168.1.1";
        long result = ipToLong(ip);
        System.out.println(result);
        System.out.println(longToIp(result));
    }
}
