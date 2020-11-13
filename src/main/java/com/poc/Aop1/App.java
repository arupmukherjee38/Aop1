package com.poc.Aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        Student student=applicationContext.getBean(Student.class);
        student.dailyWorkForLearing();
        
        student.numberToget();
        student.totalGDPA(4,7);
        
        Employee employee=applicationContext.getBean(Employee.class);
        employee.dailyWorkForEarning();
    }
}
