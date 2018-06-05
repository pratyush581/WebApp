CREATE DATABASE `hitachi_fitness` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `fitness_challenges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `challenge_name` varchar(100) NOT NULL COMMENT 'challange name may not be unique, however multiple challanges from different category can have same name',
  `challenge_type` varchar(45) NOT NULL COMMENT 'challenge type can be CARDIO, ABS, MUSCLES etc',
  `calorie_burnt` int(10) NOT NULL COMMENT 'approx calories burnt by doing this challenge',
  `reward_points` int(100) DEFAULT NULL COMMENT 'points gained by completing this challenge, can be null, if challanges are simple or free membership or something',
  `challenge_level` varchar(45) NOT NULL COMMENT 'possible values BIGINNER, INTERMEDIATE,ADVANCED',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `composite_unique_type_name` (`challenge_type`,`challenge_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='This table contains all types of challanges, CARDIO, ABS, MUSCLES..etc.';

