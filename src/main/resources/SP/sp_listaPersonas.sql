CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listaPersonas`()
BEGIN
    SELECT * FROM PERSONA;
END