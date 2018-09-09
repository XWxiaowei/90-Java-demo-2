package com.liugh.sqlSession;

import java.lang.reflect.Proxy;

public class MySqlsession {
	
	private Excutor excutor= new MyExcutor();  
	
	private MyConfiguration myConfiguration = new MyConfiguration();
	
    public <T> T selectOne(String statement,Object parameter){  
        return excutor.query(statement, parameter);  
    }  
	      
    @SuppressWarnings("unchecked")
	public <T> T getMapper(Class<T> clas){

        /**
         * 动态代理调用
         * 为什么要用动态代理？？
         * 原因：因为XxxMapper只是一个接口，没有实现类，
         * 可以说实现类只是一条XxxMapperXml的一条sql而已，
         * 因此需要动态代理来完成接口的实现方法
         *
         */
        return (T)Proxy.newProxyInstance(clas.getClassLoader(),new Class[]{clas},
        		new MyMapperProxy(myConfiguration,this));  
    }  

}
