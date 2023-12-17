package Homework7_Arfan.src.test.java.apitest;

import com.intuit.karate.junit5.Karate;

public class RunGet {
    @Karate.Test
    public Karate runGetWithTag() {
        // getRequest is name feature files
        return Karate.run("getRequest").relativeTo(getClass());
    }
}
