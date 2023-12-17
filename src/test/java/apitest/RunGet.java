package Homework7_Arfan.src.test.java.apitest;

import com.intuit.karate.junit5.Karate;

public class RunPost {
    @Karate.Test
    public Karate runPostWithTag() {
        // getRequest is name feature files
        return Karate.run("postRequest").relativeTo(getClass());
    }
}
