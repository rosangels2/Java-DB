CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `university`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: university
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `student_num` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(15) DEFAULT NULL,
  `student_age` int(11) DEFAULT NULL,
  `student_major_num` int(11) DEFAULT NULL,
  `student_grade` int(11) DEFAULT NULL,
  `student_term` int(11) DEFAULT NULL,
  `student_degree` varchar(45) DEFAULT NULL,
  `student_address` varchar(45) DEFAULT NULL,
  `student_phone` varchar(45) DEFAULT NULL,
  `student_register` varchar(45) DEFAULT NULL,
  `student_year` int(20) DEFAULT NULL,
  `student_resident_num` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`student_num`),
  KEY `student_major_num_idx` (`student_major_num`),
  CONSTRAINT `student_major_num` FOREIGN KEY (`student_major_num`) REFERENCES `major` (`major_num`)
) ENGINE=InnoDB AUTO_INCREMENT=201910103 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (201910100,'임꺽정',27,1,4,1,'학사','한국','01012341234','재적',2016,'9311121234567'),(201910101,'마동석',25,2,2,1,'학사','미국','01012341235','재적',2018,'9503011234567'),(201910102,'율곡이이',26,3,3,1,'학사','중국','01012341236','재적',2017,'9412111234567');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26 17:13:46
