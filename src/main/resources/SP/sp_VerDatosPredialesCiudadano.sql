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
END