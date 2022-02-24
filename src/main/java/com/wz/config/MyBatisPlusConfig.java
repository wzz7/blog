package com.wz.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 09:02
 * @description：分页插件配置
 */
@Configuration
//扫包，将此包下的接口生成代理实现类，并且注册到spring容器中
@MapperScan("com.wz.mapper")
public class MyBatisPlusConfig {
    //分页插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
