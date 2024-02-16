CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ActualizarPersona`(
    IN p_cedula VARCHAR(10),
    IN p_nuevos_nombres VARCHAR(40),
    IN p_nuevos_apellidos VARCHAR(40),
    IN p_nuevo_correo VARCHAR(50),
    IN p_nuevo_telefono VARCHAR(10),
    IN p_nueva_fecha_nacimiento DATE
)
BEGIN
    UPDATE PERSONA
    SET 
        NOMBRES_PER = p_nuevos_nombres,
        APELLIDOS_PER = p_nuevos_apellidos,
        CORREO_PER = p_nuevo_correo,
        TELEFONO_PER = p_nuevo_telefono,
        FECHA_NACIMIENTO_PER = p_nueva_fecha_nacimiento
    WHERE 
        CEDULA_PER = p_cedula;
END