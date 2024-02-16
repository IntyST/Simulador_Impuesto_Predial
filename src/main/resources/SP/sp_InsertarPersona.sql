CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InsertarPersona`(IN cedula VARCHAR(10), IN nombres VARCHAR(40), IN apellidos VARCHAR(40), IN correo VARCHAR(50), IN telefono VARCHAR(10), IN fecha_nacimiento DATE)
BEGIN
    INSERT INTO PERSONA(CEDULA_PER, NOMBRES_PER, APELLIDOS_PER, CORREO_PER, TELEFONO_PER, FECHA_NACIMIENTO_PER)
    VALUES (cedula, nombres, apellidos, correo, telefono, fecha_nacimiento);
END