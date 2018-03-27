package com.springboot.login.registration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RibbonClient(name="login")
@FeignClient(name="login")
public interface LoginProxy {
	
	
	
	@GetMapping("/login/username/{username}/password/{password}")
	public String CheckLogin(@PathVariable("username") String username , @PathVariable("password") String password);

}
