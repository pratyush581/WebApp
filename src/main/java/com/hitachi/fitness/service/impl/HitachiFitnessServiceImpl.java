/**
 * 
 */
package com.hitachi.fitness.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hitachi.fitness.dao.HitachiFitnessChallengeDao;
import com.hitachi.fitness.model.HitachiFitnessChallange;
import com.hitachi.fitness.service.HitachiFitnessService;

/**
 * @author Pratyush
 *
 */
@Service

public class HitachiFitnessServiceImpl  implements  HitachiFitnessService {

	
	@Autowired
	private  HitachiFitnessChallengeDao dao;
	
	
	
	public List<HitachiFitnessChallange> getChallengeByTypeandPartialName(String type, String searchQuery) {
		return dao.getChallengeByTypeandPartialName( type,  searchQuery);
	}

	public List<HitachiFitnessChallange> getChallengeByTypeandDifficultLevel(String type, String level) {
		return dao.getChallengeByTypeandDifficultLevel(type , level);
	}


	
	
	
	
}
