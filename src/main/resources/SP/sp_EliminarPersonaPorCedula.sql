CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarPersonaPorCedula`(
    IN p_cedula VARCHAR(10)
)
BEGIN
    DELETE FROM PERSONA
    WHERE CEDULA_PER = p_cedula;
END