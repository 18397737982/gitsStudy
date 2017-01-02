package com.gy.springframe.annotation;

import java.lang.annotation.Annotation;

public class AnnotationConfigApplicationContext {
	
	public AnnotationConfigApplicationContext(Class clz){
		Annotation[] anos=clz.getAnnotations();
		for(Annotation a:anos){
			if(a instanceof Hello){
				//String name=((Hello) a).get
			}
		}
		
	}
}
