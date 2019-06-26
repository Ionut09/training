package com.java.training.day2.annotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@CustomAnnotation(value = "value", intValue = 1)
@Component("componentName")
@Service    //inherits from @Component
@Repository  //inherits from @Component
public class UseAnnotation {

    @CustomAnnotation(value = "value", intValue = 1)
    private int field;

    public static void main(String[] args) {
        System.out.println("no efect onto the current code");
    }
}
