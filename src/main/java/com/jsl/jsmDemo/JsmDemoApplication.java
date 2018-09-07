package com.jsl.jsmDemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jsl.jsmDemo"})		//这个注释，是扫描所有这个包下面的注解，比如：controller加载的时候，注入的service还没能加载，所以在controller加载前，需要扫描一遍
@EnableScheduling	//增加支持定时任务的注解
@EnableAutoConfiguration	//用于自动配置，它会根据你的pom配置（实际上应该是根据具体的依赖）来判断这是一个什么应用，并创建相应的环境
public class JsmDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JsmDemoApplication.class,args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(JsmDemoApplication.class);
		//修改Banner的模式为OFF
		builder.bannerMode(Banner.Mode.CONSOLE).run(args);
	}
}
