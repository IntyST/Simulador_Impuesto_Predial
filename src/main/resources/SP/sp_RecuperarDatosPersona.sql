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
END