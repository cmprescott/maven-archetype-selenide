#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Before;

import com.codeborne.selenide.Configuration;

public abstract class ASelenideTest {

   public PropertiesConfiguration globalConfig;
   public PropertiesConfiguration localConfig;

   @Before
   public void setUp() throws ConfigurationException {
      globalConfig = new PropertiesConfiguration("global.properties");
      Configuration.browser = globalConfig.getString("browser");
   }
}
