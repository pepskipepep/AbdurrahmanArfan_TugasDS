package Homework7_Arfan.src.test.java.apitest;

import com.intuit.karate.junit5.Karate;

public class RunDelete {
    @Karate.Test
    public Karate runDeleteWithTag() {
        // getRequest is name feature files
        return Karate.run("deleteRequest").relativeTo(getClass());
    }
}
