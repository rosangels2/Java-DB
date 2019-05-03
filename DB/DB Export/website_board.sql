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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `board` (
  `board_no` int(11) NOT NULL AUTO_INCREMENT,
  `board_cafe_name` varchar(45) NOT NULL DEFAULT ' ',
  `board_title` varchar(255) NOT NULL DEFAULT ' ',
  `board_contents` longtext,
  `board_writer` varchar(45) NOT NULL DEFAULT ' ',
  `board_category_code` varchar(6) NOT NULL DEFAULT ' ',
  `board_views` int(11) NOT NULL DEFAULT '0',
  `board_like_count` int(11) NOT NULL DEFAULT '0',
  `board_registered_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`board_no`),
  KEY `board_category_code_idx` (`board_category_code`),
  KEY `board_cafe_name_idx` (`board_cafe_name`),
  CONSTRAINT `board_cafe_name` FOREIGN KEY (`board_cafe_name`) REFERENCES `cafe` (`cafe_name`),
  CONSTRAINT `board_category_code` FOREIGN KEY (`board_category_code`) REFERENCES `category` (`category_code`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,'검도매니아','안녕하세요','가입했습니다','adkfahf7fj','mos01',1,0,'2019-04-27 00:00:00'),(2,'둥글레차','안녕하세요','가입했습니다','akfakfladfd','mos02',1,0,'2019-04-26 00:00:00'),(3,'몬스터짐','안녕하세요','가입이요','aksdajdsja','mos03',1,0,'2019-02-02 00:00:00'),(4,'싀사상싁','하이','가입','aksdjasdu','mos04',1,0,'2019-01-28 00:00:00'),(5,'오갱끼데스까','ㅎㅇ','ㅎㅇ','hongsos','mos02',1,0,'2018-12-12 00:00:00'),(6,'오릔쥐','하이염','가입염','jywhk','mos06',1,0,'2018-11-11 00:00:00'),(7,'쿡쿡쿡','하잉','하잉','kjkh22','mos01',1,0,'2019-02-22 00:00:00'),(8,'포켓몬스터','hi','hi','lahkeh','mos02',1,0,'2019-01-30 00:00:00'),(9,'몬스터짐','안냥','안냥','lc028','mos03',1,0,'2019-01-13 00:00:00'),(10,'몬스터짐','님들','하이요','lfduisj','mos04',1,0,'2019-02-06 00:00:00'),(11,'싀사상싁','헐','하이','lllloooo','mos03',1,0,'2019-03-22 00:00:00'),(12,'오릔쥐','방가방가','햄토리','mamaksj','mos06',1,0,'2019-04-22 00:00:00'),(13,'검도매니아','공지','알려드립니다','adkfahf7fj','mos07',1,0,'2019-01-29 00:00:00'),(14,'몬스터짐','스탭 회의','해당 유저 제재','aksdajdsja','mos08',1,0,'2019-04-30 14:53:22'),(15,'싀사상싁','카페 설명','시사 정보 공유','aksdjasdu','mos05',1,0,'2019-03-22 00:00:00'),(16,'몬스터짐','날씨가 좋네요','점심 맛있게 드세요','aksdajdsja','mos02',0,0,'2019-05-01 10:05:56'),(17,'검도매니아','날씨가 좋네요','점심 맛있게 드세요','adkfahf7fj','mos01',0,0,'2019-05-01 10:09:10'),(18,'둥글레차','날씨가 좋네요','점심 맛있게 드세요','akfakfladfd','mos01',0,0,'2019-05-01 10:09:34'),(19,'싀사상싁','날씨가 좋네요','점심 맛있게 드세요','aksdjasdu','mos01',0,0,'2019-05-01 10:09:55'),(20,'오갱끼데스까','날씨가 좋네요','점심 맛있게 드세요','hongsos','mos01',0,0,'2019-05-01 10:10:10'),(21,'오릔쥐','날씨가 좋네요','점심 맛있게 드세요','jywhk','mos01',0,0,'2019-05-01 10:10:23'),(23,'포켓몬스터','날씨가 좋네요','점심 맛있게 드세요','lahkeh','mos01',0,0,'2019-05-01 10:10:43'),(24,'몬스터짐','날씨가 좋네요','점심 맛있게 드세요','lc028','mos01',0,0,'2019-05-01 10:10:59'),(25,'몬스터짐','날씨가 좋네요','점심 맛있게 드세요','lfduisj','mos01',0,0,'2019-05-01 10:12:30'),(26,'싀사상싁','날씨가 좋네요','점심 맛있게 드세요','lllloooo','mos01',0,0,'2019-05-01 10:12:44'),(27,'오릔쥐','갑자기 비가 오네요','우산 있지롱 ^ㅡ^','mamaksj','mos01',0,0,'2019-05-01 10:12:59'),(28,'검도매니아','날씨가 좋네요','점심 맛있게 드세요','adkfahf7fj','mos01',0,0,'2019-05-01 10:13:16'),(35,'쿡쿡쿡','날씨가 좋네요','점심 맛있게 드세요','kjkh22','mos01',0,0,'2019-05-01 12:33:52');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-03 17:07:50
