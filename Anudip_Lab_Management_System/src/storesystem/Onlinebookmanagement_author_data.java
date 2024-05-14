package storesystem;
/*
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: onlinebookmanagement
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

INSERT INTO `author_data` VALUES (1,'Sneha','sneha123@gmail.com','7035467898');

UNLOCK TABLES;

-- Dump completed on 2024-03-19 21:54:40*/