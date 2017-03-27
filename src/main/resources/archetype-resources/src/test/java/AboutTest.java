#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;
import org.junit.Test;

public class AboutTest extends ASelenideTest {
	   /**
	    * 
	    */
	   @Before
	   public void setUp() throws ConfigurationException {
	      super.setUp();
	      localConfig = new PropertiesConfiguration("About.properties");
	   }

	   /**
	    * Verify greeting banner.
	    * 
	    * @throws InterruptedException
	    */
	   @Test
	   public void testLogin() throws InterruptedException {
	      // Open page
	      open(globalConfig.getString("baseurl") + "/about");
	      
	      // Verify & document that system greets us
	      String expectedHeading = localConfig.getString("expected.heading");
	      $("#wrapper > article > header > h1").shouldHave(text(expectedHeading));

	      screenshot("About.png");
	   }	
}
