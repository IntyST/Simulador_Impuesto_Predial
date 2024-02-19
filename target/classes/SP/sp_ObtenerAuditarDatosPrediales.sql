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
END