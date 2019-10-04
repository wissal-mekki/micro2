-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: micro2
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.16.04.1

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
-- Table structure for table `proposition`
--

DROP TABLE IF EXISTS `proposition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proposition` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `contenu` varchar(255) NOT NULL,
  `question_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtj6dpxjctpf47mu00u4w38hdm` (`question_id`)
) ENGINE=MyISAM AUTO_INCREMENT=124 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proposition`
--

LOCK TABLES `proposition` WRITE;
/*!40000 ALTER TABLE `proposition` DISABLE KEYS */;
INSERT INTO `proposition` VALUES (116,'open source',245),(115,'setter, getter et constructeur',244),(110,'Aucune de ces réponses n’est vraie.',243),(111,'Les deux sont vrais',243),(112,'constructeur et setter',244),(113,'constructeur et getter',244),(114,'getter et setter',244),(106,'C’est une technique pour obtenir des dépendances de n’importe quel projet.',242),(109,'Le Framework Spring est une solution lourde(heavy-weight solution).',243),(108,'Le Framework Spring est une solution légère(light-weight solution).',243),(107,'Il est utilisé pour promouvoir un couplage étroit dans le code.',242),(104,'C’est un design pattern qui implémente le pattern Inversion de contrôle(inversion of control, IoC) pour des applications logicielles.',242),(105,'C’est l’un des modules de Spring.',242),(117,'gratuit',245),(118,'sous une licence',245),(119,'propriétaire',245),(120,'wiss',248),(121,'wiss',248),(122,'wiss',249),(123,'wiss',249);
/*!40000 ALTER TABLE `proposition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nbprop` tinyblob NOT NULL,
  `type` varchar(255) NOT NULL,
  `contenu` varchar(255) NOT NULL,
  `reponse` varchar(255) NOT NULL,
  `quest_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK685sgkpr1sbd5wqqm1cmrtvyn` (`quest_id`)
) ENGINE=MyISAM AUTO_INCREMENT=251 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (243,_binary '4','checkbox',' Lequel des énoncés suivants est correct concernant le Framework Spring ?','Le Framework Spring est une solution légère(light-weight solution).',160),(242,_binary '4','checkbox','Qu’est-ce que l’injection de dépendance?','C’est un design pattern qui implémente le pattern Inversion de contrôle(inversion of control, IoC) pour des applications logicielles.',160),(244,_binary '4','checkbox','Quels sont les différents types d’injection de Bean?','constructeur et setter',160),(247,_binary '4','checkbox','wiss','bb',161),(246,_binary '0','texte','Le Controller dans Spring est une_______________?','interface',160),(245,_binary '4','checkbox','Spring est un framework','open source',160),(248,_binary '2','checkbox','wiss','bb',161),(249,_binary '2','checkbox','wiss','bb',162),(250,_binary '0','texte','wiss','bb',162);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questionnaire`
--

DROP TABLE IF EXISTS `questionnaire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questionnaire` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nbques` tinyblob NOT NULL,
  `sujet` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=163 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questionnaire`
--

LOCK TABLES `questionnaire` WRITE;
/*!40000 ALTER TABLE `questionnaire` DISABLE KEYS */;
INSERT INTO `questionnaire` VALUES (160,_binary '5','JEE'),(161,_binary '3','devops'),(162,_binary '3','angular');
/*!40000 ALTER TABLE `questionnaire` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-24 16:04:32
