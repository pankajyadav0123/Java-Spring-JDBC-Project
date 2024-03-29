package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started..." );
        //spring jdbc => JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query="insert into student values(?,?,?)";
        
        //fire query
        int result = template.update(query,103,"Suraj","GRK");
        System.out.println("inserted successfully...." + result);
        
    }
} 
