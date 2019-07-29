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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `board` (
  `board_no` int(11) NOT NULL AUTO_INCREMENT,
  `board_category_code` int(11) NOT NULL,
  `board_writer` varchar(45) NOT NULL DEFAULT ' ',
  `board_title` varchar(45) NOT NULL DEFAULT '제목 없음',
  `board_contents` longtext,
  `board_register_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `board_views` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`board_no`),
  KEY `board_category_code_idx` (`board_category_code`),
  KEY `board_writer_idx` (`board_writer`),
  CONSTRAINT `board_category_code` FOREIGN KEY (`board_category_code`) REFERENCES `category` (`category_code`),
  CONSTRAINT `board_writer` FOREIGN KEY (`board_writer`) REFERENCES `member` (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,3,'daksdj','안내드립니다','핸드폰을 분실하신 분은 데스크에서 찾아가세요','2019-05-02 16:44:35',6),(2,5,'lfkvl3','기구 소개','벤치프레스, 머신 벤치프레스, 스쿼트 머신, 레그프레스 머신, 레그컬 머신, 레그익스텐션 머신, 풀업 머신, 숄더프레스 머신, 플라이 머신, 랫풀다운 머신','2019-05-02 16:46:30',10),(3,4,'haserhdf','어깨운동','바벨 숄더프레스 4세트, 래터럴 레이즈 4세트, 프런트 레이즈 4세트, 밴트 오버 래터럴레이즈 4세트','2019-05-02 16:47:55',8),(4,4,'haserhdf','하체운동','스쿼트 4세트, 레그익스텐션 4세트, 레그컬 4세트, 런지 3세트','2019-05-02 16:48:16',8),(5,4,'haserhdf','가슴운동','벤치프레스 4세트, 머신플라이 4세트, 딥스 4세트, 케이블크로스 4세트','2019-05-02 16:48:59',8),(6,4,'haserhdf','등운동','랫풀다운 4세트, 풀업 4세트, 바벨 로우 4세트, 데드리프트 4세트','2019-05-02 16:50:03',8),(7,2,'jgdhdfhd33','미세먼지가 많네요','다들 마스크 하고 나가세요 ^ㅡ^','2019-05-02 16:50:30',4),(8,2,'haserhdf','점심 식사 맛있게 하세요','^^','2019-05-02 16:50:58',4),(9,2,'daksdj','곧 주말이네요','다들 화이팅','2019-05-02 16:51:17',4),(10,2,'ehsdff','오갱끼데스까','아리가또 고자이마스','2019-05-02 16:51:34',4),(11,2,'fdhdhdfh4','동에번쩍','서에번쩍','2019-05-02 16:51:49',4),(12,2,'gfhfdhd3','탐앤','탐스','2019-05-02 16:52:04',4),(13,2,'sehseee','해피','뉴 이얼','2019-05-02 16:52:24',4),(14,2,'lee2324','사랑했지만','그대를 사랑했지만','2019-05-02 16:52:52',4),(15,9,'hdfhdjrdfh','파인 옷좀 입지 맙시다 ㅡㅡ','3대 500 이상 아니면 파인 옷좀 입지 마세요 ㅡㅡ','2019-05-03 09:26:46',0),(16,9,'jgdhdfhd33','가슴 파인 옷좀 입지 마세요','뚝배기 깨버립니다 진짜','2019-05-03 09:27:19',0),(17,9,'khfkffjff','무슨 자신감으로 파인 옷 입는지','토할 거 같아요 ㅡㅡ 몸이라도 좋으면 몰라','2019-05-03 09:27:45',0),(18,9,'lee2324','파인 옷 입은 분들 감사합니다','체해서 속 안좋았는데 덕분에 토해서 개운하네요','2019-05-03 09:28:16',0),(19,1,'jgdhdfhd33','문의 드립니다','파인 옷 입은 사람들 뚝배기 깨도 되나요','2019-05-03 09:32:06',0),(20,1,'hdfhdjrdfh','파인 옷 제한 걸 수 없나요','몸도 안좋은데 파인 옷 입고 있는 거 보면 진짜 뚝배기 깨고 싶어지네요','2019-05-03 09:33:55',0),(21,1,'lee2324','그저 이렇게','멀리서 바라볼 뿐 다가설 수 없어','2019-05-03 09:34:23',0),(22,1,'khfkffjff','파인 옷 좀 못입게 해주세요','눈이 썩네요','2019-05-03 09:35:01',0);
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

-- Dump completed on 2019-07-29 12:18:04
