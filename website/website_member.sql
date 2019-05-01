CREATE DATABASE  IF NOT EXISTS `website` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `website`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: website
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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `member` (
  `member_no` int(11) NOT NULL AUTO_INCREMENT,
  `member_cafe_name` varchar(45) DEFAULT NULL,
  `member_user_id` varchar(45) DEFAULT NULL,
  `member_grade` varchar(30) NOT NULL DEFAULT '일반',
  `member_board_count` int(11) NOT NULL DEFAULT '0',
  `member_visit_count` int(11) NOT NULL DEFAULT '0',
  `member_last_visit` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`member_no`),
  KEY `member_cafe_name_idx` (`member_cafe_name`),
  KEY `member_user_id_idx` (`member_user_id`),
  CONSTRAINT `member_cafe_name` FOREIGN KEY (`member_cafe_name`) REFERENCES `cafe` (`cafe_name`),
  CONSTRAINT `member_user_id` FOREIGN KEY (`member_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'몬스터짐','aksdajdsja','장인',2,0,'2019-04-30 14:38:34'),(2,'몬스터짐','lc028','일반',1,0,'2019-04-30 14:38:34'),(3,'몬스터짐','lfduisj','전문',1,0,'2019-04-30 14:38:48'),(4,'검도매니아','adkfahf7fj','장인',2,0,'2019-04-30 14:39:12'),(5,'둥글레차','akfakfladfd','일반',1,0,'2019-04-30 14:39:47'),(6,'싀사상싁','aksdjasdu','장인',2,0,'2019-04-30 14:40:06'),(7,'싀사상싁','lllloooo','숙련',1,0,'2019-04-30 14:40:59'),(8,'오갱끼데스까','hongsos','장인',1,0,'2019-04-30 14:40:59'),(9,'오릔쥐','jywhk','명인',1,0,'2019-04-30 14:40:59'),(10,'오릔쥐','mamaksj','도인',1,0,'2019-04-30 14:41:15'),(11,'쿡쿡쿡','kjkh22','전문',2,0,'2019-04-30 14:41:39'),(12,'포켓몬스터','lahkeh','숙련',1,0,'2019-04-30 14:41:39'),(13,'검도매니아','aksdajdsja','장인',0,0,'2019-03-22 00:00:00'),(14,'오릔쥐','lc028','일반',0,0,'2019-04-30 14:57:02'),(15,'쿡쿡쿡','lllloooo','숙련',0,0,'2019-04-30 14:57:55'),(16,'둥글레차','jywhk','장인',0,0,'2019-04-30 14:57:55'),(17,'쿡쿡쿡','lfduisj','일반',0,0,'2019-04-30 14:57:55'),(18,'포켓몬스터','lllloooo','일반',0,0,'2019-04-30 14:57:55'),(19,'몬스터짐','hongsos','일반',0,0,'2019-04-30 14:57:55'),(20,'쿡쿡쿡','jywhk','장인',0,0,'2019-04-30 14:59:24'),(21,'오릔쥐','lllloooo','숙련',0,0,'2019-04-30 14:59:38'),(22,'검도매니아','jywhk','전문',0,0,'2019-04-30 15:24:58'),(23,'오갱끼데스까','mamaksj','전문',0,0,'2019-04-30 15:26:36'),(24,'오갱끼데스까','lllloooo','전문',0,0,'2019-04-30 15:26:44'),(25,'싀사상싁','hongsos','일반',0,0,'2019-05-01 11:28:42'),(26,'싀사상싁','akfakfladfd','일반',0,0,'2019-05-01 11:29:38'),(27,'싀사상싁','lc028','일반',0,0,'2019-05-01 11:30:01'),(28,'싀사상싁','lfduisj','일반',0,0,'2019-05-01 11:30:57'),(29,'포켓몬스터','jywhk','일반',0,0,'2019-05-01 11:34:13'),(30,'포켓몬스터','aksdajdsja','일반',0,0,'2019-05-01 11:34:29'),(32,'포켓몬스터','kjkh22','일반',0,0,'2019-05-01 11:58:44'),(33,'포켓몬스터','lc028','일반',0,0,'2019-05-01 11:59:29');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-01 17:26:21
