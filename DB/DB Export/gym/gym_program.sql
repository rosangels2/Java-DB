CREATE DATABASE  IF NOT EXISTS `gym` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gym`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: gym
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
-- Table structure for table `program`
--

DROP TABLE IF EXISTS `program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `program` (
  `program_no` int(11) NOT NULL AUTO_INCREMENT,
  `program_trainer_no` int(11) NOT NULL,
  `program_title` varchar(45) DEFAULT NULL,
  `program_contents` longtext,
  `program_schedule` varchar(45) DEFAULT NULL,
  `program_total_limit` int(11) DEFAULT NULL,
  `program_total` int(11) NOT NULL DEFAULT '0',
  `program_price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`program_no`),
  KEY `program_trainer_no_idx` (`program_trainer_no`),
  CONSTRAINT `program_trainer_no` FOREIGN KEY (`program_trainer_no`) REFERENCES `trainer` (`trainer_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `program`
--

LOCK TABLES `program` WRITE;
/*!40000 ALTER TABLE `program` DISABLE KEYS */;
INSERT INTO `program` VALUES (1,4,'스피닝','자전거 타기','13:00~15:00',20,2,'월 50,000원'),(2,4,'스피닝','자전거 타기','16:00~18:00',20,2,'월 50,000원'),(3,4,'스피닝','자전거 타기','19:00~21:00',20,2,'월 50,000원'),(4,5,'에어로빅','에어로빅 댄스','13:00~15:00',25,1,'월 40,000원'),(5,5,'에어로빅','에어로빅 댄스','16:00~18:00',25,1,'월 40,000원'),(6,5,'에어로빅','에어로빅 댄스','19:00~21:00',25,1,'월 40,000원'),(7,6,'요가','요가','13:00~15:00',30,1,'월 45,000원'),(8,6,'요가','요가','16:00~18:00',30,1,'월 45,000원'),(9,6,'요가','요가','19:00~21:00',30,1,'월 45,000원');
/*!40000 ALTER TABLE `program` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-14 17:12:33
