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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_id` varchar(45) NOT NULL,
  `user_pw` varchar(255) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `user_nick` varchar(45) DEFAULT NULL,
  `user_email` varchar(45) DEFAULT NULL,
  `user_phone` varchar(20) DEFAULT NULL,
  `user_add` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('adkfahf7fj','22kdkajfa','박명수','삿포로박','akdajsdha2@naver.com','010-5352-1212','서울시 여의도 2822번지'),('akfakfladfd','asdkaskdas','johnsonz baby','johnmat','sdjfajf@naver.com','010-4444-1121','미국 대포동 292-1번지'),('aksdajdsja','i822jks','나까무라','그만무라','8a3kaka@yahoo.com','010-6562-1321','일본 훗카이도 2911번지'),('aksdjasdu','akjdasda','신사임당','맞슴당','ajsdhasdj@naver.com','010-2424-1221','경상남도 하동군 292번지'),('hongsos','lkakdja','헐크','쿠앤크','hongkkkk@naver.com','010-5552-1843','중국 쓰촨성 어우동 9-1번지'),('jywhk','skjdsfsdjf','유재석','메뚜기','kskdahd@naver.com','010-5551-0421','서울시 강남구 101번지'),('kjkh22','lslkl3','아이언맨','아연','kjkh@daum.net','010-4444-4232','미국 강호동 3번길 23'),('lahkeh','jfhdsfs','캡틴 아메리카','아메리카노','lahkdjfs@naver.com','010-5555-9999','프랑스 김제동 100-1번지'),('lc028','ksh729','홍길동','홍차','lc028@naver.com','010-3254-4423','한양시 홍길동 203번지'),('ldjfjd','sjdshwk','이순신','거북선','skjfdjk@naver.com','010-2221-2213','한양시 강남구 101번지'),('lfduisj','fjdhfdsf','임꺽정','괜한걱정','jhdkfjdb@google.com','010-4232-1112','한양시 두막골 201번지'),('lllloooo','fjadfhsdg','울버린','게보린','llllooooo@daum.net','010-4242-2111','이탈리아 가로수길 221'),('mamaksj','mansj32','토르','자일리톨','mama022@google.com','010-4255-9284','영국 신길동 193-1번지'),('oOoOo','s2847','정대세','trend','tom@naver.com','010-2323-2333','북한 평양시 222번지');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-14 17:13:12
