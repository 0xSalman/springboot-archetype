#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class AppConfig {

	private String cloudDBService;

	public String getCloudDBService() {
		return cloudDBService;
	}

	public void setCloudDBService(String cloudDBService) {
		this.cloudDBService = cloudDBService;
	}
}
