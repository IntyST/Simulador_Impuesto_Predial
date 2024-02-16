CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarPersona`(IN cedulaI VARCHAR(10))
BEGIN
    SELECT * FROM persona WHERE CONCAT(CEDULA_PER,'') LIKE cedulaI;
END