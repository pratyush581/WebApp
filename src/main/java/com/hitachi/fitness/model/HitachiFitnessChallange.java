/**
 * 
 */
package com.hitachi.fitness.model;

import org.springframework.stereotype.Component;

import com.hitachi.fitness.model.HitachiFitnessChallange.DifficultyLevel;
import com.hitachi.fitness.model.HitachiFitnessChallange.Type;

/**
 * @author dalaipra
 *
 */
@Component
public class HitachiFitnessChallange {
	

	private int id;
	private String challengeName;
	private Type challengeType;
	private int CaloriesBurnt;
	private int rewardPoints;
	private DifficultyLevel level;
	
	
	public enum Type {

		CARDIO,
		ABS,
		MUSCLE
	}
	
	public enum DifficultyLevel {

		BEGINNER,
		INTERMEDIATE,
		ADVANCED
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChallengeName() {
		return challengeName;
	}

	public void setChallengeName(String challengeName) {
		this.challengeName = challengeName;
	}

	public Type getChallengeType() {
		return challengeType;
	}

	public void setChallengeType(Type challengeType) {
		this.challengeType = challengeType;
	}

	public void setChallengeType(String challengeTypeStr) {
		this.challengeType = Type.valueOf(challengeTypeStr) ;
	}
	public int getCaloriesBurnt() {
		return CaloriesBurnt;
	}

	public void setCaloriesBurnt(int caloriesBurnt) {
		CaloriesBurnt = caloriesBurnt;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public DifficultyLevel getLevel() {
		return level;
	}

	public void setLevel(DifficultyLevel level) {
		this.level = level;
	}
	
	public void setLevel(String levelStr) {
		this.level = DifficultyLevel.valueOf(levelStr);
	}


	
	
	

}
