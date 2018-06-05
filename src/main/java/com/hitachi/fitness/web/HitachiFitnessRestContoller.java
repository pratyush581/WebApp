/**
 * 
 */
package com.hitachi.fitness.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hitachi.fitness.model.HitachiFitnessChallange;
import com.hitachi.fitness.service.HitachiFitnessService;

/**
 * @author Pratyush
 *
 */

@RestController
public class HitachiFitnessRestContoller {

	@Autowired
	private HitachiFitnessService service;
	

	

	
	@RequestMapping(value="/challenges/{type}",method = RequestMethod.GET,headers="Accept=application/json")
	public List<HitachiFitnessChallange> getChallangesByPartialNameFromDB(@PathVariable("type") String  type, @RequestParam("partialName") String searchQuery) { 

		List<HitachiFitnessChallange> challenges=service.getChallengeByTypeandPartialName(type, searchQuery);
		return challenges;
	}
	
	
	
	@RequestMapping(value="/challenges/{type}/filter",method = RequestMethod.GET,headers="Accept=application/json")
	public List<HitachiFitnessChallange> getChallangesByDifficultyLevelFromDB(@PathVariable("type") String  type, @RequestParam("difficulty") String level) { 

		List<HitachiFitnessChallange> challenges=service.getChallengeByTypeandDifficultLevel(type, level);
		return challenges;
	}
}
