package com.sy.swagger.config;

import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * <p>
 * Description:SwaggerConfig<br />
 * </p>
 * 
 * @title SwaggerConfig.java
 * @package com.sy.swagger.config
 * @author zhaowei
 * @version 0.1 2016年3月18日
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerSpringMvcPlugin() {
		return new Docket(DocumentationType.SWAGGER_2)
					.groupName("business-api")
					.select()
					.paths(paths())
					.build()
					.apiInfo(apiInfo())
					.securitySchemes(securitySchemes())
					.securityContexts(securityContexts());
	}

	@SuppressWarnings("unchecked")
	private Predicate<String> paths() {
		return or(regex("/restapi.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("涨工资理财API")
				.description("此API仅提供给移动端使用")
				.termsOfServiceUrl("http://www.zgzlc.com.cn")
				.license("ZGZLC License Version 2.0")
				.licenseUrl("http://http://www.zgzlc.com.cn")
				.version("2.0").build();
	}
	
	private List<ApiKey> securitySchemes() {
		return newArrayList(
				new ApiKey("clientId", "客户端ID", "header"),
				new ApiKey("clientSecret", "客户端秘钥", "header"),
				new ApiKey("accessToken", "客户端访问标识", "header"));
	}
	
	private List<SecurityContext> securityContexts() {
		return newArrayList(
				SecurityContext.builder()
					.securityReferences(defaultAuth())
					.forPaths(PathSelectors.regex("/*.*"))
					.build()
				);
	}

	List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return newArrayList(
				new SecurityReference("clientId", authorizationScopes),
				new SecurityReference("clientSecret", authorizationScopes),
				new SecurityReference("accessToken", authorizationScopes));
	}

}
