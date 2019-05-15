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
-- Table structure for table `pt`
--

DROP TABLE IF EXISTS `pt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pt` (
  `pt_no` int(11) NOT NULL AUTO_INCREMENT,
  `pt_trainer_no` int(11) DEFAULT NULL,
  `pt_member_id` varchar(45) NOT NULL DEFAULT ' ',
  `pt_contents` longtext,
  `pt_schedule` varchar(45) DEFAULT NULL,
  `pt_round` int(11) DEFAULT NULL,
  PRIMARY KEY (`pt_no`),
  KEY `pt_trainer_no_idx` (`pt_trainer_no`),
  KEY `pt_member_id_idx` (`pt_member_id`),
  CONSTRAINT `pt_member_id` FOREIGN KEY (`pt_member_id`) REFERENCES `member` (`member_id`),
  CONSTRAINT `pt_trainer_no` FOREIGN KEY (`pt_trainer_no`) REFERENCES `trainer` (`trainer_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pt`
--

LOCK TABLES `pt` WRITE;
/*!40000 ALTER TABLE `pt` DISABLE KEYS */;
INSERT INTO `pt` VALUES (1,1,'lee2324','다이어트','10:00~12:00',20),(2,2,'sehseee','근육량 증가','11:00~13:00',15),(3,3,'john123','다이어트','13:00~15:00',17),(4,1,'tdhdhd','근육량 증가','13:00~15:00',5),(5,2,'uursgf','체지방 커팅','14:00~16:00',7),(6,3,'vvvdgsg','다이어트','16:00~18:00',11),(7,1,'wqefxfsdg','다이어트','15:00~17:00',9),(8,2,'wrhhdfgs','다이어트','16:00~18:00',8),(9,3,'zategsg','다이어트','18:00~20:00',7);
/*!40000 ALTER TABLE `pt` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-15 17:12:22
