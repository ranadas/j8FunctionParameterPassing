package com.ooad;

import ooad.FunctionalClient;
import org.junit.Test;

/**
 * Created by rdas on 09/11/2016.
 */
public class FunctionalClientTest {

    @Test
    public void showDemo() {
        FunctionalClient functionalClient = new FunctionalClient() ;
        functionalClient.lambdaUser();
    }
}
