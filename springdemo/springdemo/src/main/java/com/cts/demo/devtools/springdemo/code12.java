package com.cts.demo.devtools.springdemo;
//20
public class code12 {

	public static void main(String[] args) {
		String s1="shubham";
		String s2="mads";
		getvalues(s1, s2);
	}
	 public static void getvalues(String s1,String s2) {
		 StringBuffer sb=new StringBuffer();
		 int l1=s1.length();
		 int l2=s2.length();
		 if (l1==l2) {
			 sb.append(s1).append(s2);
		 }
		 else  if(l1>l2){
			 sb.append(s1.substring(s1.length()-s2.length(),s2.length())).append(s2);
		 }
		 else  if(l1<l2){
			 sb.append(s1).append(s2.substring(s2.length()-s1.length(),s2.length()));
		 }
		 System.out.println(sb);
	 }
}
