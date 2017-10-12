package com.book.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;


// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseController {
}
