package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice    //全局异常处理
public class allExceptionRunner {
	@ExceptionHandler
	public void allException(Exception e){
//		根据异常类型，转移到不同错误页
//		if(e instanceof NullPointerException) {
//			
//		}
	}
}
