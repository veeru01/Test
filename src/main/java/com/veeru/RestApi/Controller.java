package com.veeru.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
	
	@Autowired
	private UserInfo userInfo;
	
	List<UserInfo> listModel = new ArrayList<>();
	
	public Controller() {
		listModel.add(new UserInfo("test1@gmail.com", "Y"));
		listModel.add(new UserInfo("test2@gmail.com", "N"));
		listModel.add(new UserInfo("test3@gmail.com", "Y"));
		listModel.add(new UserInfo("test4@gmail.com", "N"));
		listModel.add(new UserInfo("test5@gmail.com", "Y"));
		
	}

	@GetMapping("/health")
	public String health() {
		return "Good";
	}
	
	
	
	@PostMapping("/emailVerification")
	public UserInfo emailVerification(@RequestBody  UserInfo request) {
		for (UserInfo userInfo2 : listModel) {
			if(userInfo2.getEmail().equals(request.getEmail())){
				userInfo.setEmail(request.getEmail());
				userInfo.setEmailMigrated(userInfo2.getEmailMigrated());
				userInfo.setEmailRecognized("Y");
				break;
			}else {
				userInfo.setEmail(request.getEmail());
				userInfo.setEmailMigrated("N");
				userInfo.setEmailRecognized("N");
			}
		}

		System.out.println("Adding a system the out for cheery picking1");
		System.out.println("Adding a system the out for cheery picking2");
		
		return userInfo;
	}
	
}
