package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.gestionCodeRouteBack.entities.Role;
import com.inti.gestionCodeRouteBack.entities.Test;
import com.inti.gestionCodeRouteBack.service.interfaces.ITestService;

@RestController
@CrossOrigin
public class TestController {

	@Autowired
	ITestService testService;
	
	@GetMapping("/tests") 
	public List<Test> findAll() {
		return testService.findAll();
	}
	
	@GetMapping("/tests/{idTest}")
	
	public Test findOne(@PathVariable("idTest") long id) {
		return testService.findOne(id);
	}
	
	@PostMapping("/tests")
	public String saveTest(@RequestParam("fileTest") MultipartFile file,
			@RequestParam("question") String question,
			@RequestParam("codeBonneReponse") int codeBonneReponse,
			@RequestParam("timerRep") int timerrep) {
		try {
			Test currentTest = new Test();
			currentTest.setImage(file.getBytes());
			currentTest.setQuestion(question);
			currentTest.setCodeBonneReponse(codeBonneReponse);
			currentTest.setTimerRep(timerrep);
			testService.save(currentTest);
			return "File uploaded successfully! filename=" + file.getOriginalFilename();
		}catch (Exception ex) {
			ex.printStackTrace();
			return "Fail! maybe you had uploaded the file before or the file's size > 500KB";
		}
		
	}
	
	@DeleteMapping("/tests/{idTest}") 
	public void deleteTest(@PathVariable("idTest") Long id) {
		testService.delete(id);
	}
	

}
