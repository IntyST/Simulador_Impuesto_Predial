CREATE DATABASE  IF NOT EXISTS `bdd_impuesto_predial` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdd_impuesto_predial`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: bdd_impuesto_predial
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `auditardatosprediales`
--

DROP TABLE IF EXISTS `auditardatosprediales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auditardatosprediales` (
  `id_audi` int NOT NULL AUTO_INCREMENT,
  `id_pred` int DEFAULT NULL,
  `cod_castral_pred` varchar(45) DEFAULT NULL,
  `tipo_pred` varchar(15) DEFAULT NULL,
  `direccion_pred` varchar(100) DEFAULT NULL,
  `valor_terreno_pred` double(10,2) DEFAULT NULL,
  `valor_edificacion_pred` double(10,2) DEFAULT NULL,
  `valor_comercial_pred` double(10,2) DEFAULT NULL,
  `accion` varchar(50) DEFAULT NULL,
  `fechaHora` datetime DEFAULT NULL,
  `usuario` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_audi`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditardatosprediales`
--

LOCK TABLES `auditardatosprediales` WRITE;
/*!40000 ALTER TABLE `auditardatosprediales` DISABLE KEYS */;
INSERT INTO `auditardatosprediales` VALUES (1,11,'102325','Urbano','Urcuqui',30000.00,20000.00,50000.00,'Se incerto datos de este predio','2024-02-19 09:24:50','root@localhost'),(2,12,'42343fg','Urbano','Enrique segoviano',3000.00,5069.00,8069.00,'Se incerto datos de este predio','2024-02-19 10:26:34','root@localhost');
/*!40000 ALTER TABLE `auditardatosprediales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auditarpersona`
--

DROP TABLE IF EXISTS `auditarpersona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auditarpersona` (
  `id_audi` int NOT NULL AUTO_INCREMENT,
  `idpersona` int DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `apellido` varchar(40) DEFAULT NULL,
  `cedula` varchar(10) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `accion` varchar(50) DEFAULT NULL,
  `fechaHora` datetime DEFAULT NULL,
  `usuario` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_audi`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditarpersona`
--

LOCK TABLES `auditarpersona` WRITE;
/*!40000 ALTER TABLE `auditarpersona` DISABLE KEYS */;
INSERT INTO `auditarpersona` VALUES (1,7,'Paul','Fuerez','1005125879','fuerez@','0999999999','INSERT','2024-02-18 13:01:59','root@localhost'),(2,7,'Paul','Fuerez','1005125879','fuerez@','0999999999','DELETE','2024-02-18 14:23:42','root@localhost'),(3,8,'Diego','Cumbal','1006824962','cumbal@gmail.com','0952876328','Se inserto datos de esta persona','2024-02-19 02:03:23','root@localhost'),(4,9,'Diego','Cumbal','1006824962','cumbal@gmail.com','0952876328','Se inserto datos de esta persona','2024-02-19 02:08:43','root@localhost'),(5,8,'Diego','Cumbal','1006824962','cumbal@gmail.com','0952876328','Se elimino esta persona','2024-02-19 02:08:54','root@localhost'),(6,9,'Diego','Cumbal','1006824962','cumbal@gmail.com','0952876328','Se elimino esta persona','2024-02-19 02:08:54','root@localhost'),(7,10,'Jose','Gerrero','1005184320','jose@gmail.com','0952368753','Se inserto datos de esta persona','2024-02-19 02:21:13','root@localhost'),(8,11,'paulina','Jacome','1003525273','paulina@gmail.com','0964253468','Se inserto datos de esta persona','2024-02-19 09:23:02','root@localhost'),(9,12,'Dylan','Lara','1005184456','dilanlara@gmail.com','0987768656','Se inserto datos de esta persona','2024-02-19 10:21:49','root@localhost'),(10,12,'Dylan','Lara','1005184456','dilanlara@gmail.com','0987768656','Se modificó los datos de esta persona','2024-02-19 10:23:37','root@localhost');
/*!40000 ALTER TABLE `auditarpersona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultapagos`
--

DROP TABLE IF EXISTS `consultapagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultapagos` (
  `ID_PAGO` int NOT NULL AUTO_INCREMENT,
  `ID_PRED` int NOT NULL,
  `FECHA_INGRESO_PAGO` date NOT NULL,
  `FECHA_VENCIMIENTO_PAGO` date NOT NULL,
  `DESCRIPCION_PAGO` varchar(75) NOT NULL,
  `SUB_TOTAL_PAGO` double(10,2) NOT NULL,
  PRIMARY KEY (`ID_PAGO`),
  KEY `FK_REFERENCE_6` (`ID_PRED`),
  CONSTRAINT `FK_REFERENCE_6` FOREIGN KEY (`ID_PRED`) REFERENCES `datosprediales` (`ID_PRED`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultapagos`
--

LOCK TABLES `consultapagos` WRITE;
/*!40000 ALTER TABLE `consultapagos` DISABLE KEYS */;
INSERT INTO `consultapagos` VALUES (3,2,'2024-02-11','2024-03-11','Pago anual',100.00),(7,7,'2024-01-01','2024-12-31','Pago de impuestos rural',80000.00),(9,9,'2024-01-01','2024-12-31','Pago de impuestos predial anual Urbano',110.00),(10,10,'2024-01-01','2024-12-31','Pago de impuestos predial anual Urbano',55.00),(11,11,'2024-01-01','2024-12-31','Pago de impuestos predial anual Urbano',55.00),(12,12,'2024-01-01','2024-12-31','Pago de impuestos predial anual Urbano',8.88);
/*!40000 ALTER TABLE `consultapagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datosprediales`
--

DROP TABLE IF EXISTS `datosprediales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datosprediales` (
  `ID_PRED` int NOT NULL AUTO_INCREMENT,
  `ID_PER` int NOT NULL,
  `COD_CASTRAL_PRED` varchar(45) NOT NULL,
  `TIPO_PRED` varchar(15) NOT NULL,
  `DIRECCION_PRED` varchar(100) NOT NULL,
  `AREA_TOTAL_PRED` double(10,2) NOT NULL,
  `AREA_CONSTRUCCION_PRED` double(10,2) NOT NULL,
  `VALOR_TERRENO_PRED` double(10,2) NOT NULL,
  `VALOR_EDIFICACION_PRED` double(10,2) NOT NULL,
  `VALOR_COMERCIAL_PRED` double(10,2) NOT NULL,
  PRIMARY KEY (`ID_PRED`),
  KEY `FK_REFERENCE_9` (`ID_PER`),
  CONSTRAINT `FK_REFERENCE_9` FOREIGN KEY (`ID_PER`) REFERENCES `persona` (`ID_PER`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosprediales`
--

LOCK TABLES `datosprediales` WRITE;
/*!40000 ALTER TABLE `datosprediales` DISABLE KEYS */;
INSERT INTO `datosprediales` VALUES (2,2,'Ibarra','Urbano','Calle Principal #123',250.50,180.30,50.00,50.00,100.00),(7,1,'COD 3','Rural','Otavalo',200.00,150.00,50000.00,30000.00,80000.00),(9,1,'COD 4','Urbano','Ibarra',2334.00,5432.00,50000.00,50000.00,100000.00),(10,1,'COD 5','Urbano','Ibarra',2334.00,5432.00,25000.00,25000.00,50000.00),(11,11,'102325','Urbano','Urcuqui',20000.00,1000.00,30000.00,20000.00,50000.00),(12,12,'42343fg','Urbano','Enrique segoviano',20000.00,1000.00,3000.00,5069.00,8069.00);
/*!40000 ALTER TABLE `datosprediales` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `crearPredios` AFTER INSERT ON `datosprediales` FOR EACH ROW BEGIN
   INSERT INTO auditarDatosPrediales(id_pred, cod_castral_pred, tipo_pred, direccion_pred, valor_terreno_pred, valor_edificacion_pred, valor_comercial_pred, accion, fechaHora, usuario)
   VALUES (NEW.ID_PRED, NEW.COD_CASTRAL_PRED, NEW.TIPO_PRED, NEW.DIRECCION_PRED, NEW.VALOR_TERRENO_PRED, NEW.VALOR_EDIFICACION_PRED, NEW.VALOR_COMERCIAL_PRED, 'Se incerto datos de este predio', NOW(), USER());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `modificarPredios` AFTER UPDATE ON `datosprediales` FOR EACH ROW BEGIN
   INSERT INTO auditarDatosPrediales(id_pred, cod_castral_pred, tipo_pred, direccion_pred, valor_terreno_pred, valor_edificacion_pred, valor_comercial_pred, accion, fechaHora, usuario)
   VALUES (OLD.ID_PRED, OLD.COD_CASTRAL_PRED, OLD.TIPO_PRED, OLD.DIRECCION_PRED, OLD.VALOR_TERRENO_PRED, OLD.VALOR_EDIFICACION_PRED, OLD.VALOR_COMERCIAL_PRED, 'Se modificó los datos de este predio', NOW(), USER());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `eliminarPredios` AFTER DELETE ON `datosprediales` FOR EACH ROW BEGIN
   INSERT INTO auditarDatosPrediales(id_pred, cod_castral_pred, tipo_pred, direccion_pred, valor_terreno_pred, valor_edificacion_pred, valor_comercial_pred, accion, fechaHora, usuario)
   VALUES (OLD.ID_PRED, OLD.COD_CASTRAL_PRED, OLD.TIPO_PRED, OLD.DIRECCION_PRED, OLD.VALOR_TERRENO_PRED, OLD.VALOR_EDIFICACION_PRED, OLD.VALOR_COMERCIAL_PRED, 'se elimino este predio ', NOW(), USER());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `ID_PER` int NOT NULL AUTO_INCREMENT,
  `CEDULA_PER` varchar(10) NOT NULL,
  `NOMBRES_PER` varchar(40) NOT NULL,
  `APELLIDOS_PER` varchar(40) NOT NULL,
  `CORREO_PER` varchar(50) NOT NULL,
  `TELEFONO_PER` varchar(10) NOT NULL,
  `FECHA_NACIMIENTO_PER` date NOT NULL,
  PRIMARY KEY (`ID_PER`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'1005184328','Inty','Simbaña','bryan1@gmail.com','0959290328','2003-02-21'),(2,'1234567890','Segunda','Chavez','chavez@','1234567890','2001-01-12'),(3,'1002003008','Jose','Flores','flores@','0658204868','2000-12-20'),(4,'1002586324','Jymi','Cuyago','jymi@','0925830587','2003-08-12'),(6,'1058505452','Kevin ','Teran','teran@','0924125410','2024-02-01'),(10,'1005184320','Jose','Gerrero','jose@gmail.com','0952368753','1997-02-15'),(11,'1003525273','paulina','Jacome','paulina@gmail.com','0964253468','2000-02-16'),(12,'1005184456','Dylan','Lara','dilanlara@gmail.com','0987768656','2002-10-17');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `crearPersona` AFTER INSERT ON `persona` FOR EACH ROW BEGIN
   INSERT INTO auditarPersona(idpersona, nombre, apellido, cedula, correo, telefono, accion, fechaHora, usuario)
   VALUES (NEW.ID_PER, NEW.NOMBRES_PER, NEW.APELLIDOS_PER, NEW.CEDULA_PER, NEW.CORREO_PER, NEW.TELEFONO_PER, 'Se inserto datos de esta persona', NOW(), USER());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `mosficarPersona` AFTER UPDATE ON `persona` FOR EACH ROW BEGIN
   INSERT INTO auditarPersona(idpersona, nombre, apellido, cedula, correo, telefono, accion, fechaHora, usuario)
   VALUES (OLD.ID_PER, OLD.NOMBRES_PER, OLD.APELLIDOS_PER, OLD.CEDULA_PER, OLD.CORREO_PER, OLD.TELEFONO_PER, 'Se modificó los datos de esta persona', NOW(), USER());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `eliminarPersona` AFTER DELETE ON `persona` FOR EACH ROW BEGIN
   INSERT INTO auditarPersona(idpersona, nombre, apellido, cedula, correo, telefono, accion, fechaHora, usuario)
   VALUES (OLD.ID_PER, OLD.NOMBRES_PER, OLD.APELLIDOS_PER, OLD.CEDULA_PER, OLD.CORREO_PER, OLD.TELEFONO_PER, 'Se elimino esta persona', NOW(), USER());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `ID_USUARIO` int NOT NULL AUTO_INCREMENT,
  `ID_PERSONA_PER` int NOT NULL,
  `CONTRASENIA_USUARIO` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_USUARIO`),
  KEY `FK_REFERENCE_3` (`ID_PERSONA_PER`),
  CONSTRAINT `FK_REFERENCE_3` FOREIGN KEY (`ID_PERSONA_PER`) REFERENCES `persona` (`ID_PER`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,3,'123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bdd_impuesto_predial'
--

--
-- Dumping routines for database 'bdd_impuesto_predial'
--
/*!50003 DROP PROCEDURE IF EXISTS `sp_ActualizarDatosPredialesPagos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ActualizarDatosPredialesPagos`(
    IN p_CEDULA_PER VARCHAR(10),
    IN p_COD_CASTRAL_PRED VARCHAR(45),
    IN p_TIPO_PRED VARCHAR(15),
    IN p_DIRECCION_PRED VARCHAR(100),
    IN p_AREA_TOTAL_PRED DOUBLE,
    IN p_AREA_CONSTRUCCION_PRED DOUBLE,
    IN p_VALOR_TERRENO_PRED DOUBLE,
    IN p_VALOR_EDIFICACION_PRED DOUBLE,
    IN p_FECHA_INGRESO_PAGO DATE,
    IN p_FECHA_VENCIMIENTO_PAGO DATE,
    IN p_DESCRIPCION_PAGO VARCHAR(75),
    IN p_SUB_TOTAL_PAGO DOUBLE
)
BEGIN
    -- Declarar variable para el valor comercial
    DECLARE p_VALOR_COMERCIAL_PRED DOUBLE;

    -- Calcular el valor comercial como la suma del valor del terreno y la edificación
    SET p_VALOR_COMERCIAL_PRED = p_VALOR_TERRENO_PRED + p_VALOR_EDIFICACION_PRED;

    -- Actualizar los datos prediales asociados a la persona
    UPDATE DATOSPREDIALES
    INNER JOIN PERSONA ON DATOSPREDIALES.ID_PER = PERSONA.ID_PER
    SET 
        TIPO_PRED = p_TIPO_PRED,
        DIRECCION_PRED = p_DIRECCION_PRED,
        AREA_TOTAL_PRED = p_AREA_TOTAL_PRED,
        AREA_CONSTRUCCION_PRED = p_AREA_CONSTRUCCION_PRED,
        VALOR_TERRENO_PRED = p_VALOR_TERRENO_PRED,
        VALOR_EDIFICACION_PRED = p_VALOR_EDIFICACION_PRED,
        VALOR_COMERCIAL_PRED = p_VALOR_COMERCIAL_PRED
    WHERE PERSONA.CEDULA_PER = p_CEDULA_PER AND DATOSPREDIALES.COD_CASTRAL_PRED = p_COD_CASTRAL_PRED;

    -- Actualizar los datos de los pagos asociados al predio
    UPDATE CONSULTAPAGOS
    INNER JOIN DATOSPREDIALES ON CONSULTAPAGOS.ID_PRED = DATOSPREDIALES.ID_PRED
    INNER JOIN PERSONA ON DATOSPREDIALES.ID_PER = PERSONA.ID_PER
    SET 
        CONSULTAPAGOS.FECHA_INGRESO_PAGO = p_FECHA_INGRESO_PAGO,
        CONSULTAPAGOS.FECHA_VENCIMIENTO_PAGO = p_FECHA_VENCIMIENTO_PAGO,
        CONSULTAPAGOS.DESCRIPCION_PAGO = p_DESCRIPCION_PAGO,
        CONSULTAPAGOS.SUB_TOTAL_PAGO = p_SUB_TOTAL_PAGO
    WHERE PERSONA.CEDULA_PER = p_CEDULA_PER AND DATOSPREDIALES.COD_CASTRAL_PRED = p_COD_CASTRAL_PRED;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_ActualizarPersona` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ActualizarPersona`(
    IN p_cedula VARCHAR(10),
    IN p_nuevos_nombres VARCHAR(40),
    IN p_nuevos_apellidos VARCHAR(40),
    IN p_nuevo_correo VARCHAR(50),
    IN p_nuevo_telefono VARCHAR(10),
    IN p_nueva_fecha_nacimiento DATE
)
BEGIN
    UPDATE PERSONA
    SET 
        NOMBRES_PER = p_nuevos_nombres,
        APELLIDOS_PER = p_nuevos_apellidos,
        CORREO_PER = p_nuevo_correo,
        TELEFONO_PER = p_nuevo_telefono,
        FECHA_NACIMIENTO_PER = p_nueva_fecha_nacimiento
    WHERE 
        CEDULA_PER = p_cedula;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_BuscarPersona` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarPersona`(IN cedulaI VARCHAR(10))
BEGIN
    SELECT * FROM persona WHERE CONCAT(CEDULA_PER,'') LIKE cedulaI;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_BuscarPropiedadesPorCedula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarPropiedadesPorCedula`(IN cedula_param VARCHAR(20))
BEGIN
    SELECT 
        p.CEDULA_PER,
        p.NOMBRES_PER,
        p.APELLIDOS_PER,
        dp.COD_CASTRAL_PRED,
        dp.TIPO_PRED,
        dp.DIRECCION_PRED,
        dp.AREA_TOTAL_PRED,
        dp.AREA_CONSTRUCCION_PRED,
        dp.VALOR_TERRENO_PRED,
        dp.VALOR_EDIFICACION_PRED,
        dp.VALOR_COMERCIAL_PRED
    FROM PERSONA p
    INNER JOIN DATOSPREDIALES dp ON p.ID_PER = dp.ID_PER
    WHERE p.CEDULA_PER LIKE CONCAT('%', cedula_param, '%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_ConsultaPagos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ConsultaPagos`(
    IN p_CEDULA_PER varchar(10)
)
BEGIN
    SELECT 
        DATOSPREDIALES.COD_CASTRAL_PRED,
        CONSULTAPAGOS.FECHA_INGRESO_PAGO,
        CONSULTAPAGOS.FECHA_VENCIMIENTO_PAGO,
        CONSULTAPAGOS.DESCRIPCION_PAGO,
        DATOSPREDIALES.DIRECCION_PRED,
        CONSULTAPAGOS.SUB_TOTAL_PAGO
    FROM CONSULTAPAGOS
    INNER JOIN DATOSPREDIALES ON CONSULTAPAGOS.ID_PRED = DATOSPREDIALES.ID_PRED
    INNER JOIN PERSONA ON DATOSPREDIALES.ID_PER = PERSONA.ID_PER
    WHERE PERSONA.CEDULA_PER = p_CEDULA_PER;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_EliminarDatosPredialesYPagos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarDatosPredialesYPagos`(
    IN codCastralParam VARCHAR(45)
)
BEGIN
    DECLARE idPredio INT;

    -- Obtener el ID_PRED del predio por su código catastral
    SELECT ID_PRED INTO idPredio FROM DATOSPREDIALES WHERE COD_CASTRAL_PRED = codCastralParam;

    -- Eliminar los datos de pago asociados al predio
    DELETE FROM CONSULTAPAGOS WHERE ID_PRED = idPredio;

    -- Eliminar los datos prediales
    DELETE FROM DATOSPREDIALES WHERE ID_PRED = idPredio;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_EliminarPersonaPorCedula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarPersonaPorCedula`(
    IN p_cedula VARCHAR(10)
)
BEGIN
    DELETE FROM PERSONA
    WHERE CEDULA_PER = p_cedula;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_InsertarDatosPredialesYPagos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InsertarDatosPredialesYPagos`(
    IN cedulaParam VARCHAR(10),
    IN codCastralParam VARCHAR(45),
    IN tipoPredParam VARCHAR(15),
    IN direccionPredParam VARCHAR(100),
    IN areaTotalParam DOUBLE,
    IN areaConstruccionParam DOUBLE,
    IN valorTerrenoParam DOUBLE,
    IN valorEdificacionParam DOUBLE,
    IN fechaIngresoPagoParam DATE,
    IN fechaVencimientoPagoParam DATE,
    IN descripcionPagoParam VARCHAR(75),
    IN subTotalPagoParam DOUBLE
)
BEGIN
    DECLARE idPersona INT;
    DECLARE valorComercial DOUBLE;
    DECLARE idPredio INT;

    -- Obtener el ID_PER de la persona por su cédula
    SELECT ID_PER INTO idPersona FROM PERSONA WHERE CEDULA_PER = cedulaParam;

    -- Calcular el valor comercial como la suma del valor del terreno y la edificación
    SET valorComercial = valorTerrenoParam + valorEdificacionParam;

    -- Insertar los datos prediales asociados a la persona
    INSERT INTO DATOSPREDIALES (ID_PER, COD_CASTRAL_PRED, TIPO_PRED, DIRECCION_PRED, AREA_TOTAL_PRED, AREA_CONSTRUCCION_PRED, VALOR_TERRENO_PRED, VALOR_EDIFICACION_PRED, VALOR_COMERCIAL_PRED)
    VALUES (idPersona, codCastralParam, tipoPredParam, direccionPredParam, areaTotalParam, areaConstruccionParam, valorTerrenoParam, valorEdificacionParam, valorComercial);

    -- Obtener el ID_PRED del predio recién insertado
    SET idPredio = LAST_INSERT_ID();

    -- Insertar los datos de pago asociados al predio
    INSERT INTO CONSULTAPAGOS (ID_PRED, FECHA_INGRESO_PAGO, FECHA_VENCIMIENTO_PAGO, DESCRIPCION_PAGO, SUB_TOTAL_PAGO)
    VALUES (idPredio, fechaIngresoPagoParam, fechaVencimientoPagoParam, descripcionPagoParam, subTotalPagoParam);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_InsertarPersona` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InsertarPersona`(
    IN cedula VARCHAR(10),
    IN nombres VARCHAR(40),
    IN apellidos VARCHAR(40),
    IN correo VARCHAR(50),
    IN telefono VARCHAR(10),
    IN fecha_nacimiento DATE
)
BEGIN
    DECLARE cedula_existente INT;
    SELECT COUNT(*) INTO cedula_existente FROM PERSONA WHERE CEDULA_PER = cedula;
    
    IF cedula_existente = 0 THEN
        INSERT INTO PERSONA (CEDULA_PER, NOMBRES_PER, APELLIDOS_PER, CORREO_PER, TELEFONO_PER, FECHA_NACIMIENTO_PER)
        VALUES (cedula, nombres, apellidos, correo, telefono, fecha_nacimiento);
    ELSE
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'La cédula ya está registrada';
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_InsertarPersonaYUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InsertarPersonaYUsuario`(
    IN cedulaParam VARCHAR(10),
    IN nombresParam VARCHAR(40),
    IN apellidosParam VARCHAR(40),
    IN correoParam VARCHAR(50),
    IN telefonoParam VARCHAR(10),
    IN fechaNacimientoParam DATE,
    IN contraseniaParam VARCHAR(25)
)
BEGIN
    DECLARE idPersona INT;

    -- Insertar en PERSONA
    INSERT INTO PERSONA (CEDULA_PER, NOMBRES_PER, APELLIDOS_PER, CORREO_PER, TELEFONO_PER, FECHA_NACIMIENTO_PER)
    VALUES (cedulaParam, nombresParam, apellidosParam, correoParam, telefonoParam, fechaNacimientoParam);

    -- Obtener el ID_PER de la persona recién insertada
    SET idPersona = LAST_INSERT_ID();

    -- Insertar en USUARIO
    INSERT INTO USUARIO (ID_PERSONA_PER, CONTRASENIA_USUARIO)
    VALUES (idPersona, contraseniaParam);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_listaPersonas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listaPersonas`()
BEGIN
    SELECT * FROM PERSONA;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_ObtenerAuditarDatosPrediales` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ObtenerAuditarDatosPrediales`()
BEGIN
    SELECT 
        cod_castral_pred,
        tipo_pred,
        direccion_pred,
        valor_terreno_pred,
        valor_edificacion_pred,
        valor_comercial_pred,
        accion,
        fechaHora
    FROM auditarDatosPrediales;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_ObtenerAuditarPersona` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ObtenerAuditarPersona`()
BEGIN
    SELECT 
        nombre,
        apellido,
        cedula,
        correo,
        telefono,
        accion,
        fechaHora
    FROM auditarPersona;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_ObtenerDatosPrediales` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ObtenerDatosPrediales`()
BEGIN
    SELECT 
        p.CEDULA_PER,
        p.NOMBRES_PER,
        p.APELLIDOS_PER,
        dp.COD_CASTRAL_PRED,
        dp.TIPO_PRED,
        dp.DIRECCION_PRED,
        dp.AREA_TOTAL_PRED,
        dp.AREA_CONSTRUCCION_PRED,
        dp.VALOR_TERRENO_PRED,
        dp.VALOR_EDIFICACION_PRED,
        dp.VALOR_COMERCIAL_PRED
    FROM PERSONA p
    INNER JOIN DATOSPREDIALES dp ON p.ID_PER = dp.ID_PER;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_RecuperarDatosPersona` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_RecuperarDatosPersona`(
    IN cedula_param VARCHAR(10)
)
BEGIN
    DECLARE nombres_res VARCHAR(40);
    DECLARE apellidos_res VARCHAR(40);
    DECLARE correo_res VARCHAR(50);
    DECLARE telefono_res VARCHAR(10);
    DECLARE fechaNacimiento_res DATE;

    -- Buscar los datos de la persona usando la cédula
    SELECT NOMBRES_PER, APELLIDOS_PER, CORREO_PER, TELEFONO_PER, FECHA_NACIMIENTO_PER
    INTO nombres_res, apellidos_res, correo_res, telefono_res, fechaNacimiento_res
    FROM PERSONA
    WHERE CEDULA_PER = cedula_param;

    -- Devolver los resultados
    SELECT nombres_res, apellidos_res, correo_res, telefono_res, fechaNacimiento_res;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_ValidarLogin` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ValidarLogin`(
    IN correoParam VARCHAR(50),
    IN contraseniaParam VARCHAR(25)
)
BEGIN
    DECLARE nombreUsuario VARCHAR(40);
    DECLARE apellidoUsuario VARCHAR(40);

    -- Buscar en la tabla USUARIO
    SELECT NOMBRES_PER, APELLIDOS_PER INTO nombreUsuario, apellidoUsuario
    FROM USUARIO
    INNER JOIN PERSONA ON USUARIO.ID_PERSONA_PER = PERSONA.ID_PER
    WHERE PERSONA.CORREO_PER = correoParam AND USUARIO.CONTRASENIA_USUARIO = contraseniaParam;

    -- Si no se encontró el usuario, devolver un error
    IF nombreUsuario IS NULL OR apellidoUsuario IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Correo electrónico o contraseña incorrectos';
    END IF;

    -- Si se encontró el usuario, devolver el nombre y apellido del usuario
    SELECT nombreUsuario, apellidoUsuario;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_VerDatosPredialesCiudadano` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_VerDatosPredialesCiudadano`(
    IN p_CEDULA_PER VARCHAR(10)
)
BEGIN
    SELECT 
        DP.COD_CASTRAL_PRED AS codCastral,
        DP.TIPO_PRED AS TipoPred,
        DP.DIRECCION_PRED AS direccion,
        DP.AREA_TOTAL_PRED AS areaTotal,
        DP.AREA_CONSTRUCCION_PRED AS areaConstruccion,
        DP.VALOR_TERRENO_PRED AS valorTerreno,
        DP.VALOR_EDIFICACION_PRED AS valorEdificacion,
        DP.VALOR_COMERCIAL_PRED AS valorComercial
    FROM PERSONA P
    INNER JOIN DATOSPREDIALES DP ON P.ID_PER = DP.ID_PER
    WHERE P.CEDULA_PER = p_CEDULA_PER;
END ;;
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

-- Dump completed on 2024-02-22  9:35:51
