package com.mulesoft.training;

import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

 /*   @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
    @Test
    public void retrieveFlightsAddsAppropriateHeader() throws Exception {
      MuleEvent event = runFlow("retrieveFlights");
      String contentType = event.getMessage().getOutboundProperty("Content-Type");
     System.out.println("*****"+contentType);
      assertEquals("application/json", contentType);
    }
  */  
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
