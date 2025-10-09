package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("parrot2",Parrot.class);

        System.out.println(p.getName());
    }
}
