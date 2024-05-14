
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: BookManagement
-- ------------------------------------------------------
-- Server version	8.0.36

--
-- Table structure for table `book_data`
--
create database BookManagement;
use BookManagement;
DROP TABLE IF EXISTS `book_data`;
CREATE TABLE `book_data` (
  `book_id` int NOT NULL,
  `book_name` varchar(30) DEFAULT NULL,
  `book_price` double DEFAULT NULL,
  `book_qunt` int DEFAULT NULL,
  `author_id` int DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `author_id` (`author_id`),
  CONSTRAINT `book_data_ibfk_1` FOREIGN KEY (`author_id`) REFERENCES `author_data` (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `book_data`
--

LOCK TABLES `book_data` WRITE;
INSERT INTO `book_data` VALUES (1,'Computer',200,3,NULL);
UNLOCK TABLES;

-- Dump completed on 2024-03-19 21:54:41


-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: BookManagement
-- ------------------------------------------------------
-- Server version	8.0.36

CREATE TABLE `author_data` (
  `author_id` int NOT NULL,
  `author_name` varchar(30) DEFAULT NULL,
  `author_email` varchar(100) DEFAULT NULL,
  `author_phone` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `author_data`
--

LOCK TABLES `author_data` WRITE;

INSERT INTO `author_data` VALUES (1,'Mukta','mkta123@gmail.com','9011533192');
DELETE FROM author_data WHERE author_id=1;
UNLOCK TABLES;

-- Dump completed on 2024-03-19 21:54:40
