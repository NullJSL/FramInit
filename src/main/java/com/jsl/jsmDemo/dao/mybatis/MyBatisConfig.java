package com.jsl.jsmDemo.dao.mybatis;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.util.Properties;

/**
 * Filename:    com.jsl.jsmDemo.dao.mybatis
 * Copyright:   Copyright (c)2017
 * Company:     冠群驰骋
 *
 * @author: 贾.帅.
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2018-09-03 15:41
 * Description:
 * <p/>
 * Modification History:整合mybatis
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2018-09-03  贾帅      1.0     1.0 Version
 */
public class MyBatisConfig {

    private final Logger log = org.slf4j.LoggerFactory.getLogger(MyBatisConfig.class);

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        //bean.setDataSource(dataSource());
        bean.setTypeAliasesPackage("com.jsl.jsmDemo.bean");

        //分页的设置
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable","true");
        properties.setProperty("supportMethodsArguments","true");
        properties.setProperty("returnPageInfo","check");
        properties.setProperty("params","count=countSql");
        pageHelper.setProperties(properties);

        //添加分页插件
        bean.setPlugins(new Interceptor[]{pageHelper});
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            //基于注解扫描Mapper，不需要配置xnl路径
            return bean.getObject();
        }catch (Exception e){
            e.printStackTrace();
            log.error("mybatis结合失败："+e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
