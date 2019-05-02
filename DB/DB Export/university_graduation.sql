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
-- Table structure for table `graduation`
--

DROP TABLE IF EXISTS `graduation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `graduation` (
  `graduation_student_num` int(11) NOT NULL AUTO_INCREMENT,
  `graduation_requirement_num` int(11) DEFAULT NULL,
  `graduation_check` varchar(45) DEFAULT NULL,
  `graduation_english_grade` double DEFAULT NULL,
  `graduation_work` varchar(45) DEFAULT NULL,
  `graduation_thesis` varchar(45) DEFAULT NULL,
  `graduation_test` varchar(45) DEFAULT NULL,
  `graduation_license` varchar(45) DEFAULT NULL,
  `graduation_subject_point` int(11) DEFAULT NULL,
  PRIMARY KEY (`graduation_student_num`),
  KEY `graduation_requirement_num_idx` (`graduation_requirement_num`),
  CONSTRAINT `graduation_requirement_num` FOREIGN KEY (`graduation_requirement_num`) REFERENCES `requirement` (`requirement_num`),
  CONSTRAINT `graduation_student_num` FOREIGN KEY (`graduation_student_num`) REFERENCES `student` (`student_num`)
) ENGINE=InnoDB AUTO_INCREMENT=201910108 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `graduation`
--

LOCK TABLES `graduation` WRITE;
/*!40000 ALTER TABLE `graduation` DISABLE KEYS */;
INSERT INTO `graduation` VALUES (201910100,1,'가능',800,'100','80','80','100',150),(201910104,2,'가능',900,'90','85','90','100',145),(201910107,3,'가능',850,'95','85','90','100',140);
/*!40000 ALTER TABLE `graduation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-02 17:21:05
