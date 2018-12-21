-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: super_erp
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_material_information`
--

DROP TABLE IF EXISTS `tb_material_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_material_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_name` varchar(20) DEFAULT NULL,
  `material_type` varchar(20) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `seller` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_material_information`
--

LOCK TABLES `tb_material_information` WRITE;
/*!40000 ALTER TABLE `tb_material_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_material_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_material_inventory`
--

DROP TABLE IF EXISTS `tb_material_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_material_inventory` (
  `material_id` int(11) NOT NULL,
  `rest_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`material_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_material_inventory`
--

LOCK TABLES `tb_material_inventory` WRITE;
/*!40000 ALTER TABLE `tb_material_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_material_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_material_inventory_record`
--

DROP TABLE IF EXISTS `tb_material_inventory_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_material_inventory_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_id` int(11) NOT NULL,
  `material_amount` int(11) DEFAULT NULL,
  `in_out_code` int(11) DEFAULT NULL,
  `record_date` varchar(20) DEFAULT NULL,
  `target` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_material_inventory_record`
--

LOCK TABLES `tb_material_inventory_record` WRITE;
/*!40000 ALTER TABLE `tb_material_inventory_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_material_inventory_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_material_plan`
--

DROP TABLE IF EXISTS `tb_material_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_material_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_id` int(11) DEFAULT NULL,
  `material_amount` int(11) DEFAULT NULL,
  `workline_plan_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_material_plan`
--

LOCK TABLES `tb_material_plan` WRITE;
/*!40000 ALTER TABLE `tb_material_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_material_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_material_record`
--

DROP TABLE IF EXISTS `tb_material_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_material_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_id` int(11) DEFAULT NULL,
  `material_amount` int(11) DEFAULT NULL,
  `workline_record_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_material_record`
--

LOCK TABLES `tb_material_record` WRITE;
/*!40000 ALTER TABLE `tb_material_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_material_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_order`
--

DROP TABLE IF EXISTS `tb_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(20) DEFAULT NULL,
  `customer_phone` varchar(30) DEFAULT NULL,
  `start_date` varchar(20) DEFAULT NULL,
  `valid_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_order`
--

LOCK TABLES `tb_order` WRITE;
/*!40000 ALTER TABLE `tb_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_order_detail`
--

DROP TABLE IF EXISTS `tb_order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_type` varchar(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `end_date` varchar(20) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_order_detail`
--

LOCK TABLES `tb_order_detail` WRITE;
/*!40000 ALTER TABLE `tb_order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_product_information`
--

DROP TABLE IF EXISTS `tb_product_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_product_information` (
  `product_type` varchar(20) DEFAULT NULL,
  `material_id` int(11) NOT NULL,
  `cost` int(11) DEFAULT NULL,
  PRIMARY KEY (`material_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_product_information`
--

LOCK TABLES `tb_product_information` WRITE;
/*!40000 ALTER TABLE `tb_product_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_product_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_product_inventory`
--

DROP TABLE IF EXISTS `tb_product_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_product_inventory` (
  `product_type` varchar(20) NOT NULL,
  `rest_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_product_inventory`
--

LOCK TABLES `tb_product_inventory` WRITE;
/*!40000 ALTER TABLE `tb_product_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_product_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_product_inventory_record`
--

DROP TABLE IF EXISTS `tb_product_inventory_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_product_inventory_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_type` varchar(20) DEFAULT NULL,
  `product_amount` int(11) DEFAULT NULL,
  `in_out_code` int(11) DEFAULT NULL,
  `record_date` varchar(20) DEFAULT NULL,
  `target` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_product_inventory_record`
--

LOCK TABLES `tb_product_inventory_record` WRITE;
/*!40000 ALTER TABLE `tb_product_inventory_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_product_inventory_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_production_plan`
--

DROP TABLE IF EXISTS `tb_production_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_production_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plan_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_production_plan`
--

LOCK TABLES `tb_production_plan` WRITE;
/*!40000 ALTER TABLE `tb_production_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_production_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_production_record`
--

DROP TABLE IF EXISTS `tb_production_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_production_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `record_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_production_record`
--

LOCK TABLES `tb_production_record` WRITE;
/*!40000 ALTER TABLE `tb_production_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_production_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_purchase_plan`
--

DROP TABLE IF EXISTS `tb_purchase_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_purchase_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_id` int(11) DEFAULT NULL,
  `material_amount` int(11) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `deadline` varchar(20) DEFAULT NULL,
  `valid_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_purchase_plan`
--

LOCK TABLES `tb_purchase_plan` WRITE;
/*!40000 ALTER TABLE `tb_purchase_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_purchase_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_workline_capacity`
--

DROP TABLE IF EXISTS `tb_workline_capacity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_workline_capacity` (
  `workline_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_type` varchar(20) DEFAULT NULL,
  `able_amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`workline_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_workline_capacity`
--

LOCK TABLES `tb_workline_capacity` WRITE;
/*!40000 ALTER TABLE `tb_workline_capacity` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_workline_capacity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_workline_plan`
--

DROP TABLE IF EXISTS `tb_workline_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_workline_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `workline_id` int(11) DEFAULT NULL,
  `product_type` varchar(20) DEFAULT NULL,
  `product_amount` int(11) DEFAULT NULL,
  `production_plan_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_workline_plan`
--

LOCK TABLES `tb_workline_plan` WRITE;
/*!40000 ALTER TABLE `tb_workline_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_workline_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_workline_record`
--

DROP TABLE IF EXISTS `tb_workline_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_workline_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `workline_id` int(11) DEFAULT NULL,
  `product_type` varchar(20) DEFAULT NULL,
  `product_amount` int(11) DEFAULT NULL,
  `production_record_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_workline_record`
--

LOCK TABLES `tb_workline_record` WRITE;
/*!40000 ALTER TABLE `tb_workline_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_workline_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-21 11:28:21
