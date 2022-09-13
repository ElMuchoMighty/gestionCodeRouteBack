package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.gestionCodeRouteBack.entities.ExamenBlanc;
import com.inti.gestionCodeRouteBack.entities.ExamenFinal;
import com.inti.gestionCodeRouteBack.entities.Role;
import com.inti.gestionCodeRouteBack.entities.Test;
import com.inti.gestionCodeRouteBack.service.interfaces.IExamenBlancService;
import com.inti.gestionCodeRouteBack.service.interfaces.IExamenFinalService;
import com.inti.gestionCodeRouteBack.service.interfaces.ITestService;

@RestController
@CrossOrigin
public class TestController {

	@Autowired
	IExamenBlancService examenBlancService;
	
	@Autowired
	IExamenFinalService examenFinalService;
	
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
			@RequestParam("timerRep") int timerrep,
			@RequestParam("idExamenBlanc") int idExBl,
			@RequestParam("idExamenFinal") int idExFi) {
		try {
			Test currentTest = new Test();
			currentTest.setImage(file.getBytes());
			currentTest.setQuestion(question);
			currentTest.setCodeBonneReponse(codeBonneReponse);
			currentTest.setTimerRep(timerrep);
			System.out.println(idExBl);
			Long LongIdExBl = Long.valueOf(idExBl);
			ExamenBlanc examenBlanc=examenBlancService.findOne(LongIdExBl);
			currentTest.setExamenBlanc(examenBlanc);
			
			if (idExFi != 0){
				Long LongIdExFi = Long.valueOf(idExFi);
				ExamenFinal examenFinal=examenFinalService.findOne(LongIdExFi);
				currentTest.setExamenFinal(examenFinal);	
			}
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
