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
END