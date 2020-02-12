package edu.wctc.spring;

import edu.wctc.spring.beans.Movie;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Movie theMovie = context.getBean("myMovie", Movie.class);

        System.out.println(theMovie.getmName());
        System.out.println(theMovie.getOverview());
        System.out.println(theMovie.getYear());

        System.out.println(theMovie.logChange());

        context.close();
    }
}
