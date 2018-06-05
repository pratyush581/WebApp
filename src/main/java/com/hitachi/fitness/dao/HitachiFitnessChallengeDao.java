/**
 * 
 */
package com.hitachi.fitness.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hitachi.fitness.model.HitachiFitnessChallange;

/**
 * @author Pratyush
 *
 */

public interface HitachiFitnessChallengeDao {

	List<HitachiFitnessChallange> getChallengeByTypeandPartialName(String type, String searchQuery);

	List<HitachiFitnessChallange> getChallengeByTypeandDifficultLevel(String type, String level);

}
