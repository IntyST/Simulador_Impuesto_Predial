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
END