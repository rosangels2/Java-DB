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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `student_num` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(15) DEFAULT NULL,
  `student_age` int(11) DEFAULT NULL,
  `student_major_num` int(11) DEFAULT NULL,
  `student_grade` int(11) DEFAULT NULL,
  `student_term` int(11) DEFAULT NULL,
  `student_degree` varchar(45) DEFAULT NULL,
  `student_address` varchar(45) DEFAULT NULL,
  `student_phone` varchar(45) DEFAULT NULL,
  `student_register` varchar(45) DEFAULT NULL,
  `student_year` int(20) DEFAULT NULL,
  `student_resident_num` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`student_num`),
  KEY `student_major_num_idx` (`student_major_num`),
  CONSTRAINT `student_major_num` FOREIGN KEY (`student_major_num`) REFERENCES `major` (`major_num`)
) ENGINE=InnoDB AUTO_INCREMENT=201920202 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (201610100,'미미',20,1,NULL,NULL,NULL,NULL,NULL,NULL,2019,NULL),(201910100,'니 취팔러 마',23,1,4,1,'학사','중국','010-1234-1234','재적',2016,'971112-1234567'),(201910101,'마동석',21,2,2,1,'학사','미국','010-1234-1235','재적',2018,'990301-1234567'),(201910102,'율곡이이',22,3,3,1,'학사','한국','010-1234-1236','재적',2017,'981211-1234567'),(201910103,'신사임당',20,2,1,1,'학사','한국','010-1234-1231','재적',2019,'001225-2113456'),(201910104,'이순신',23,2,4,1,'학사','한국','010-1235-1198','재적',2016,'970309-1211123'),(201910105,'세종대왕',22,3,3,1,'학사','한국','010-2222-2222','재적',2017,'980102-1234567'),(201910106,'이노무스키',21,2,2,1,'학사','러시아','010-1010-2020','재적',2018,'990129-1234567'),(201910107,'나까무라',23,3,4,1,'학사','일본','010-9999-8888','재적',2016,'970815-1231231'),(201910108,'Johnsons baby',20,3,1,1,'학사','영국','010-8888-9998','재적',2019,'000622-1234567');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `input_graduation` AFTER INSERT ON `student` FOR EACH ROW begin
	declare r_num int;
	declare r_year int;
    set r_year = new.student_num / 100000;
	if new.student_major_num is not null then
		set r_num = (select requirement_num from requirement where 
		new.student_major_num = requirement_major_num and requirement_year = r_year);
	end if;
    
	insert graduation(graduation_student_num, graduation_requirement_num)
	values(new.student_num, r_num);
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

-- Dump completed on 2019-07-08 10:25:51
