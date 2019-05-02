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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `member` (
  `member_id` varchar(45) NOT NULL DEFAULT ' ',
  `member_pw` varchar(255) NOT NULL DEFAULT ' ',
  `member_name` varchar(15) DEFAULT NULL,
  `member_nickname` varchar(45) DEFAULT NULL,
  `member_address` varchar(45) DEFAULT NULL,
  `member_phone` varchar(45) DEFAULT NULL,
  `member_period` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('daksdj','fjddk2k2','마동석','상큼하게터져볼래','미국','010-4353-2232','2019-03-22~2019-09-22'),('ehsdff','43dfgdg','스미마셍','아리가또','일본','010-5246-3333','2019-03-22~2019-09-22'),('fdhdhdfh4','gfdgdg4g','홍길동','신림동','산골짜기','010-6246-2352','2019-03-22~2019-06-22'),('gfhfdhd3','gdfgdg3','tom','jerry','영국','010-6262-2333','2019-03-22~2019-06-22'),('haserhdf','dfgdrgrd','의자왕','체어맨','평양','010-5426-2344','2019-03-22~2019-09-22'),('jgdhdfhd33','gegege4','유관순','태극기','한양','010-6777-7843','2019-03-22~2019-06-22'),('john123','fsdkfks','johnson','john','미국','010-3434-5656','2019-03-22~2019-06-22'),('lee2324','jrejrre2','이순신','거북선','한양','010-5566-7788','2019-03-22~2019-09-22'),('lfkvl3','gadkfadk','임꺽정','괜한걱정','한양','010-1212-3434','2019-03-22~2019-06-22'),('sehseee','2tdgffdh','이노무스키','제트스키','러시아','010-5367-3534','2019-03-22~2019-06-22');
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

-- Dump completed on 2019-05-02 17:21:04
