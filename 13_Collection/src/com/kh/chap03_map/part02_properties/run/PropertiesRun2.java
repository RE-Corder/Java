package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 { // 다시듣기

	public static void main(String[] args) {

		Properties prop = new Properties();	// 비어있음!
		
		try {
			// 5. load(InputStream is)
			// prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		/*
		 * * .properties파일을 사용하는 경우
		 * 	    프로그램상에 필요한 기본 환경설정관련한 구문을 기술할거임!
		 * 	  => 모두 문자열이기 때문에 개발자가 아닌 일반인 관리자가 해당 문서를 파악해서 수정하기 쉽다!
		 * 
		 * * xml 파일의 특징
		 * 	  프로그래밍 언어들간에 있어서 호환이 쉽다!!
		 */
		
	}

}
