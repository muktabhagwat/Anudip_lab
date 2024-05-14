package storesystem;
/*
public class onlinebookmanagementsystem_book_data {

-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: onlinebookmanagement
-- ------------------------------------------------------
-- Server version	8.0.36

--
-- Table structure for table `book_data`
--

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

}
*/