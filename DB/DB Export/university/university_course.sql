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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `course_num` int(11) NOT NULL AUTO_INCREMENT,
  `course_student_num` int(11) DEFAULT NULL,
  `course_class_num` int(11) DEFAULT NULL,
  `course_mid` double DEFAULT NULL,
  `course_end` double DEFAULT NULL,
  `course_report` varchar(45) DEFAULT NULL,
  `course_attendance` double DEFAULT NULL,
  `course_total` double DEFAULT NULL,
  `course_rating` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`course_num`),
  KEY `course_student_id_idx` (`course_student_num`),
  KEY `course_class_num_idx` (`course_class_num`),
  CONSTRAINT `course_class_num` FOREIGN KEY (`course_class_num`) REFERENCES `class` (`class_num`),
  CONSTRAINT `course_student_num` FOREIGN KEY (`course_student_num`) REFERENCES `student` (`student_num`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,201910100,1,100,80,'100',100,91,'A+'),(2,201910101,2,90,85,'100',100,91.25,'A+'),(3,201910102,3,80,100,'100',100,94,'A+'),(4,201910103,2,100,100,'100',100,100,'A+'),(5,201910104,1,80,90,'90',100,87,'A'),(6,201910105,3,90,90,'90',100,91,'A+'),(7,201910106,2,70,85,'80',100,80,'B+'),(8,201910107,3,80,80,'80',100,82,'B+'),(9,201910108,3,85,70,'80',100,80,'B+'),(10,201910100,2,85,70,'80',100,80,'B+');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-01 17:26:23
