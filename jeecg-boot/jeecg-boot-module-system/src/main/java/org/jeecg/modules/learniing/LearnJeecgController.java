/**  
* Description:  
* Title: LearnJeecgController.java   
* @author yangyang.zhang
* @date 2019年12月31日   
*/  
package org.jeecg.modules.learniing;

import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**  
* Description:  
* Title: LearnJeecgController 
* @author yangyang.zhang
* @date 2019年12月31日  
*/
@RestController
@RequestMapping("/learn")
@Slf4j
public class LearnJeecgController {

	@GetMapping(value="/hello")
	public Result<String> hello(){
		
		log.info("----- 测试例子 -----");
		Result<String> result = new Result<String>();
		result.setResult("Hello World!");
		result.setSuccess(true);
		result.setCode(200);
		result.setMessage("前后台开发测试！");
		return result;
	} 
}
