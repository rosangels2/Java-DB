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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `member` (
  `id` varchar(15) NOT NULL,
  `pw` varchar(255) NOT NULL,
  `gender` varchar(1) NOT NULL DEFAULT 'M',
  `email` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL DEFAULT ' ',
  `authority` varchar(45) NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('00000000','$2a$10$iiWSJ2UjTkxEFwuhyQer5uVvrUZkbETfLxK0m/Cl0/.i9TFXc00gS','남','rosangels2@naver.com','홍길동','ADMIN'),('11111111','$2a$10$Tr/svV5BTUHitl0maF/3A.5uUEeabT45azXYESzCRfXpSm3f/iO9a','여','rosangels2@naver.com','홍길동','ADMIN'),('111111111','$2a$10$qGwOCxILebfaZBujfgGKHejHBFEW5YtQ3ZBfzKL0HvcDwF2zzEHmy','남','rosangels2@naver.com','홍길동','ADMIN'),('11111221','$2a$10$3iymKXESyvNoMyybSv7g0.sjYU8yCfs388DCiCay9.dCT49vTjRj2','남','123@456','홍길동','ADMIN'),('11111234','$2a$10$OWPno51oPEKHCcoD23/MvO.4g0Ll2fe99UrZVBG4GaYmlHDpoalti','남','123@456','홍길동','ADMIN'),('12121212','$2a$10$SR2wvFpfpQSS2xM4hyoHf.Ng2BwOd6W/KEZ35EL2F8XzptO5ZGA4m','남','rosangels2@naver.com','홍길동','USER'),('12211111','$2a$10$1m/8UgmsdJJXCJnmDc9Ykepi3haU30Q1gfzfPk5BgS466wEg8Njte','남','rosangels2@naver.com','홍길동','USER'),('12211221','$2a$10$sgZFQZ6vcNyXcqsRnNIB9.ZRHbLvCCvnC/viJ4J3rjD9uzNPpwjTK','남','123@456','홍길동','ADMIN'),('123123123','$2a$10$6lNJp65pBS56REm3WIC9fO.OEmMUbosWHSxteBWqtYPRhUn5bgK7G','남','123@456','홍길동','USER'),('1231231234','$2a$10$kzW6k7zNKRkbHx/lKos4yedmNdi6U7wPg4jK1wQLeC24vgnITxf0W','남','a@b','홍길동','USER'),('123412341','$2a$10$ujEhWsXC0A8JpY/5ioaCzO2F6ZiSn1CDClSnE.zYUKbYqdgSfqVJW','남','a@b','홍길동','USER'),('12345678','$2a$10$yfUWO64B0KrKi6yJ7sTO.OUG5WdN7Fb/Sj/rD0kyV8OnsFfQ0Aeo2','남','rosangels2@naver.com','홍길동','ADMIN'),('21111111','$2a$10$zAYTrD3cR7.L.XOM5AnoN.TdUkl6Lj/Lil5QKwqFa68Jb40i04OkG','남','1@1','홍길동','USER'),('22222222','$2a$10$f0Ez2tETdG4UhWuUukZlkutTStYwNDFIPpPpq82KJvMLbzp9HHYfy','남','rosangels2@naver.com','홍길동','ADMIN'),('222222222','$2a$10$.8FQlWRNPm1wa3xYLnv4m.LJ.E9dhJLDopgL0.jIgEkXMZ5o5MpbW','남','rosangels2@naver.com','홍길동','ADMIN'),('33333333','$2a$10$NmBoQnKiKUyzpvnfyYimSej7tkcCLcjD0x966XYZvvWaUA7mc.OQW','남','rosangels2@naver.com','홍길동','USER'),('44444444','$2a$10$OmGT/OqWTG74LbV3oJJpG.0prSS.BnGGaYBNX/ovYjI1TbNZuo4My','남','rosangels2@naver.com','홍길동','USER'),('55555555','$2a$10$0X5HZ9JRWnS4rHyqM46Ezehf7/BW8IvGrq.THWWYC/BOmgnqfiBRS','남','rosangels2@naver.com','홍길동','ADMIN'),('66666666','$2a$10$xt.7hgmIincW87oa.i6R1uX28eMMWS1E5wNVvgq/VBEolTBBDxose','남','rosangels2@naver.com','홍길동','ADMIN'),('77777777','$2a$10$RBlwpIteW5lJRUmmC7wJz.pf5PKoZfYijIIa0D0gootjS3QgkiIZi','남','rosangels2@naver.com','홍길동','USER'),('88888888','$2a$10$XbNwzrEt6AVxRyRJHZK2OeKdEMo19RJ9q6iqPX9JLfUevdsFBcpXG','남','rosangels2@naver.com','홍길동','USER'),('99999999','$2a$10$ZEbhv3637mYj6zYVXmTzaO30KefCaIzMIh8OK1oX57sl3Ry4bAA7C','남','rosangels2@naver.com','홍길동','USER'),('z1111111','$2a$10$pwph4Mzzf.ItOkufaXZXieuVu88lnNE.28RLQQa5K3uW2NGI8vcXa','남','rosangels2@naver.com','홍길동','ADMIN');
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

-- Dump completed on 2019-07-30 17:19:25
