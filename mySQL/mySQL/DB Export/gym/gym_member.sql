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
  `member_course_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `member_course_no_idx` (`member_course_no`),
  CONSTRAINT `member_course_no` FOREIGN KEY (`member_course_no`) REFERENCES `course` (`course_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('aaafgeg','vcsdas','정형돈','정형돈','서울시 63빌딩 562호','010-3677-2424','2019-03-22~2019-08-22',7),('abcdfe','qwrqere','하하','호호','미국 타임스퀘어 602호','010-5662-3236','2019-03-22~2019-06-22',8),('avbnn','jkkmdghd','정준하','동네 바보형','미국 타임스퀘어 501호','010-6788-2423','2019-03-22~2019-06-22',6),('daksdj','fjddk2k2','마동석','상큼하게터져볼래','미국 타임스퀘어 402호','010-4353-2232','2018-03-27~',NULL),('ehsdff','43dfgdg','스미마셍','아리가또','훗카이도 횡단열차 26번석','010-5246-3333','2019-03-22~2019-09-22',9),('fdhdhdfh4','gfdgdg4g','홍길동','신림동','산골짜기 234번 나무','010-6246-2352','2019-03-22~2019-06-22',10),('gfhfdhd3','gdfgdg3','tom','jerry','영국 미역국 사골국','010-6262-2333','2019-03-22~2019-06-22',11),('ghdhdhr','gsdgsdgs','차이코프스키','수상스키','청주시 청원구 242번지','010-6773-2532','2019-03-22~2019-06-22',12),('haserhdf','dfgdrgrd','의자왕','체어맨','청주시 상당구 가로수길 24','010-5426-2344','2018-09-22~',NULL),('hdfhdjrdfh','asdasg','손오공','카카로트','서울시 63빌딩 409호','010-6783-5326','2019-03-22~2019-08-22',NULL),('hdfjrrhd','uujhfdhs','성춘향','박하향','서울시 63빌딩 502호','010-5326-3535','2019-03-22~2019-08-22',NULL),('jgdhdfhd33','gegege4','유관순','태극기','서울시 여러분 번지점프','010-6777-7843','2019-03-22~2019-06-22',13),('jjsjesj','3sgsgs','유아인','어이가없네','청주시 청원구 말하는대로 22','010-5326-2626','2019-03-22~2019-06-22',NULL),('jkkthd','vbsbsge','베지터','베지테리언','서울시 63빌딩 408호','010-6783-5326','2019-03-22~2019-08-22',NULL),('john123','fsdkfks','johnson','john','미국 256번길 29','010-3434-5656','2019-03-22~2019-06-22',14),('khfkffjff','hehsgsd','크리링','클리닝','서울시 63빌딩 406호','010-7839-0583','2019-03-22~2019-08-22',NULL),('lee2324','jrejrre2','이순신','거북선','서울시 32분 34초','010-5566-7788','2019-03-22~2019-09-22',NULL),('lfkvl3','gadkfadk','임꺽정','괜한걱정','서울시 상당구 2924번지','010-1212-3434','2019-01-22~',15),('lljgjggf','hfhjdd','야무치','깻잎무침','서울시 63빌딩 407호','010-6883-3294','2019-03-22~2019-08-22',NULL),('loVOoOVol','dldfksd','김근육','근육','바다 건너 외딴섬 202호','010-3332-3434','2018-09-22~',NULL),('lsafjkasjf','dskfskdf','사람','휴먼','훗카이도 뒷동산 303','010-1241-1232','2019-01-11~',18),('qvxbxcbf','weqrg','손오반','1학년2반','서울시 63빌딩 405호','010-7724-2541','2019-03-22~2019-08-22',NULL),('sdgsersgs','pjgfjfj','이몽룡','공룡','서울시 63빌딩 410호','010-7772-2555','2019-03-22~2019-08-22',NULL),('sehseee','2tdgffdh','이노무스키','제트스키','러시아 이노무스키마을 24번지','010-5367-3534','2019-03-22~2019-06-22',NULL),('speedking','kgjksdg','김번개','스피드왕','훗카이도 가로수길 202','010-1111-1111','2019-01-22~',NULL),('tdhdhd','dsfewew','셀','셀룰러폰','서울시 63빌딩 403호','010-8888-1111','2019-03-22~2019-08-22',NULL),('uursgf','asdafg','노홍철','사기꾼','미국 타임스퀘어 702호','010-6426-2352','2019-03-22~2019-06-22',16),('vvvdgsg','hhh4ds','유재석','날유','미국 타임스퀘어 403호','010-3526-3253','2019-03-22~2019-06-22',NULL),('wqefxfsdg','bcxvxcv','길','가로수길','미국 타임스퀘어 772호','010-5255-8888','2019-03-22~2019-06-22',NULL),('wrhhdfgs','mbncvbb','천진반','천진난만','서울시 63빌딩 404호','010-6889-6966','2019-03-22~2019-08-22',17),('zategsg','csdhhh','박명수','삿포로박','미국 타임스퀘어 404호','010-2555-2424','2019-03-22~2019-06-22',NULL);
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

-- Dump completed on 2019-07-08 16:57:23
