package com.usertemplate.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.usertemplate.model.User;

@RestController
@RequestMapping("/template")
public class UserTemplateController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/user/all")
	public String getUserList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8080/user/all", HttpMethod.GET, entity, String.class).getBody();
	}

	@GetMapping("/user/{id}")
	public String getUserById(@PathVariable int id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8080/user/" + id, HttpMethod.GET, entity, String.class)
				.getBody();
	}

	@PostMapping("/user/add")
	public String addUser(@RequestBody User user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity = new HttpEntity<User>(user, headers);

		return restTemplate.exchange("http://localhost:8080/user/add", HttpMethod.POST, entity, String.class).getBody();
	}
	
	@PutMapping("/user/update/{id}")
	public String updateUser(@RequestBody User user, @PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity = new HttpEntity<User>(user, headers);

		return restTemplate.exchange("http://localhost:8080/user/update/" + id, HttpMethod.PUT, entity, String.class).getBody();
	}
	
	@DeleteMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<User> entity = new HttpEntity<User>(headers);

		return restTemplate.exchange("http://localhost:8080/user/delete/"+id, HttpMethod.DELETE, entity, String.class).getBody();
	}

}
