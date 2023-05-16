package com.yj.test.javaTest.selfJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String etc_path = "0||20220722||더하기대부중개||대전-3561||CLFA-중개-05818||042-488-7142"
				+ "@@1||20220722||주식회사 오케이엔캐시대부중개||2017-서울강남-0268(대부중개업)||CLFA-중개-02805||02-523-3891"
				+ "@@2||20220722||주식회사 오케이엔캐시대부중개||2017-서울강남-0268(대부중개업)||CLFA-중개-02805||02-523-3891";
		
		String[] arr1 = etc_path.split("@@");
		String result = "";
		String[] arr3 = new String[arr1.length];
		String rlt = "";
		
		int i = 0;
		
		for(String str : arr1) {
			String[] arr2 = str.split("\\|\\|");
			arr2[0] = String.valueOf(Integer.parseInt(arr2[0])+1);
			result = String.join("||", arr2);
			arr3[i] = result;
			i++;
		}
		rlt = String.join("@@", arr3);
		System.out.println(rlt);
		
//		String[] arr1 = etc_path.split("@@");
//		String result = "";
//		
//		for(int i = 0; i < arr1.length; i ++ ) { 
//			if(i > 0) result += "@@";
//			
//			String[] arr2 = arr1[i].split("\\|\\|");
//			arr2[0] = String.valueOf(Integer.parseInt(arr2[0])+1);
//			
//			result += String.join("||", arr2);
//		}
//		System.out.println(result);
	}
	
	
}
	
