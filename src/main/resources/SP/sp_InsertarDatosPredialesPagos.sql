CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InsertarDatosPredialesPagos`(
    IN cedulaParam VARCHAR(10),
    IN codCastralParam VARCHAR(45),
    IN tipoPredParam VARCHAR(15),
    IN direccionPredParam VARCHAR(100),
    IN areaTotalParam DOUBLE,
    IN areaConstruccionParam DOUBLE,
    IN valorTerrenoParam DOUBLE,
    IN valorEdificacionParam DOUBLE,
    IN fechaIngresoPago DATE,
    IN fechaVencimientoPago DATE,
    IN descripcionPago VARCHAR(75),
    IN subTotalPago DOUBLE
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
    SELECT LAST_INSERT_ID() INTO idPredio;

    -- Insertar los datos de pago asociados al predio
    INSERT INTO CONSULTAPAGOS (ID_PRED, FECHA_INGRESO_PAGO, FECHA_VENCIMIENTO_PAGO, DESCIPCION_PAGO, SUB_TOTAL_PAGO)
    VALUES (idPredio, fechaIngresoPago, fechaVencimientoPago, descripcionPago, subTotalPago);
END