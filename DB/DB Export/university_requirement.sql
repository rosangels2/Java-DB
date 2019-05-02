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
-- Table structure for table `requirement`
--

DROP TABLE IF EXISTS `requirement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `requirement` (
  `requirement_num` int(11) NOT NULL AUTO_INCREMENT,
  `requirement_year` varchar(45) DEFAULT NULL,
  `requirement_major_num` int(11) DEFAULT NULL,
  `requirement_degree` varchar(45) DEFAULT NULL,
  `requirement_subject_point` int(11) DEFAULT NULL,
  `requirement_majorsubject_point` int(11) DEFAULT NULL,
  `requirement_normal_subject_point` int(11) DEFAULT NULL,
  `requirement_english_grade` double DEFAULT NULL,
  `requirement_graduation_work` varchar(45) DEFAULT NULL,
  `requirementgraduation_thesis` varchar(45) DEFAULT NULL,
  `requirement_graduation_test` varchar(45) DEFAULT NULL,
  `requirement_graduation_license` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`requirement_num`),
  KEY `requirement_major_num_idx` (`requirement_major_num`),
  CONSTRAINT `requirment_major_num` FOREIGN KEY (`requirement_major_num`) REFERENCES `major` (`major_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requirement`
--

LOCK TABLES `requirement` WRITE;
/*!40000 ALTER TABLE `requirement` DISABLE KEYS */;
INSERT INTO `requirement` VALUES (1,'2016',1,'학사',150,130,20,800,'80','80','70','100'),(2,'2016',2,'학사',140,120,20,700,'80','80','70','100'),(3,'2016',3,'학사',140,120,20,700,'80','80','70','100');
/*!40000 ALTER TABLE `requirement` ENABLE KEYS */;
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
