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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `course_no` int(11) NOT NULL AUTO_INCREMENT,
  `course_program_no` int(11) NOT NULL,
  `course_member_id` varchar(45) NOT NULL,
  `course_period` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`course_no`),
  KEY `course_program_no_idx` (`course_program_no`),
  KEY `course_member_id_idx` (`course_member_id`),
  CONSTRAINT `course_member_id` FOREIGN KEY (`course_member_id`) REFERENCES `member` (`member_id`),
  CONSTRAINT `course_program_no` FOREIGN KEY (`course_program_no`) REFERENCES `program` (`program_no`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (6,1,'avbnn','2019-04-01~2019-05-31'),(7,2,'aaafgeg','2019-04-01~2019-05-31'),(8,3,'abcdfe','2019-04-01~2019-05-31'),(9,4,'ehsdff','2019-04-01~2019-05-31'),(10,5,'fdhdhdfh4','2019-04-01~2019-05-31'),(11,6,'gfhfdhd3','2019-04-01~2019-05-31'),(12,7,'ghdhdhr','2019-04-01~2019-05-31'),(13,8,'jgdhdfhd33','2019-04-01~2019-05-31'),(14,9,'john123','2019-04-01~2019-05-31'),(15,1,'lfkvl3','2019-04-01~2019-05-31'),(16,2,'uursgf','2019-04-01~2019-05-31'),(17,3,'wrhhdfgs','2019-04-01~2019-05-31'),(18,2,'lsafjkasjf','2019-04-01~2019-05-31');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `add_course` AFTER INSERT ON `course` FOR EACH ROW begin
declare _program_total int default 0;
declare _member_course_no int default 0;
set _program_total = (select count(*) from course where new.course_program_no = course_program_no);
set _member_course_no = new.course_no; 
update program
set program_total = _program_total
where program_no = new.course_program_no;
update member
set member_course_no = _member_course_no
where member_id = new.course_member_id;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:57:23
