/**
 * 
 */
package com.hitachi.fitness.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hitachi.fitness.config.EntityManager;
import com.hitachi.fitness.dao.HitachiFitnessChallengeDao;
import com.hitachi.fitness.model.HitachiFitnessChallange;

/**
 * @author Pratyush
 *
 */

@Component
public class HitachiFitnessChallengeDaoImpl implements HitachiFitnessChallengeDao {


	private Connection connection;

	public HitachiFitnessChallengeDaoImpl() {
		connection = EntityManager.getConnection();
	}

	

	public List<HitachiFitnessChallange> getChallengeByTypeandPartialName(String type, String searchQuery) {
		List<HitachiFitnessChallange> challenges = new LinkedList<HitachiFitnessChallange>();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select * from fitness_challenges where challenge_type=?  and  LOWER(challenge_name) LIKE  ? ");
			
			preparedStatement.setString(1,  type.toUpperCase() );
			preparedStatement.setString(2, "%" + searchQuery.toLowerCase() + "%");
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				HitachiFitnessChallange challenge = new HitachiFitnessChallange();
				challenge.setId(rs.getInt("id"));
				challenge.setChallengeName(rs.getString("challenge_name"));
				challenge.setChallengeType(rs.getString("challenge_type")); 
				challenge.setLevel(rs.getString("challenge_level"));
				challenge.setRewardPoints(rs.getInt("calorie_burnt"));
				challenge.setCaloriesBurnt(rs.getInt("reward_points"));
				challenges.add(challenge);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return challenges;
	}

	
	
	
	public List<HitachiFitnessChallange> getChallengeByTypeandDifficultLevel(String type, String level) {
		List<HitachiFitnessChallange> challenges = new LinkedList<HitachiFitnessChallange>();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select * from fitness_challenges where challenge_type=?  and  challenge_level =  ? ");
			
			preparedStatement.setString(1,  type.toUpperCase() );
			preparedStatement.setString(2,  level.toUpperCase() );
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				HitachiFitnessChallange challenge = new HitachiFitnessChallange();
				challenge.setId(rs.getInt("id"));
				challenge.setChallengeName(rs.getString("challenge_name"));
				challenge.setChallengeType(rs.getString("challenge_type")); 
				challenge.setLevel(rs.getString("challenge_level"));
				challenge.setRewardPoints(rs.getInt("calorie_burnt"));
				challenge.setCaloriesBurnt(rs.getInt("reward_points"));
				challenges.add(challenge);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return challenges;
	}



}
