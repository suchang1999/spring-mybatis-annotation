package org.framestudy.spring_mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtils {
	private static SqlSessionFactory sf;
	static {
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("mybatis.cfg.xml");
			sf = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	public static SqlSession getSession(){
		return sf.openSession();
	}
}
