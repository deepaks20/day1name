package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.pojoclass;

@RestController
public class controller {
	@RequestMapping("student")
   public List <pojoclass> info(){
	   return Arrays.asList(new pojoclass(1,"alcy","IT"),
			   new pojoclass(2,"dharuni","IT"));
   }
}