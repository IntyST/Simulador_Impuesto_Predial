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
END