/**
 * 
 */
package com.hitachi.fitness.service;

import java.util.List;

import com.hitachi.fitness.model.HitachiFitnessChallange;

/**
 * @author Pratyush
 *
 */
public interface HitachiFitnessService {

	List<HitachiFitnessChallange> getChallengeByTypeandPartialName(String type, String searchQuery);

	List<HitachiFitnessChallange> getChallengeByTypeandDifficultLevel(String type, String level);

}
