CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ValidarLogin`(
    IN correoParam VARCHAR(50),
    IN contraseniaParam VARCHAR(25)
)
BEGIN
    DECLARE nombreUsuario VARCHAR(40);
    DECLARE apellidoUsuario VARCHAR(40);

    -- Buscar en la tabla USUARIO
    SELECT NOMBRES_PER, APELLIDOS_PER INTO nombreUsuario, apellidoUsuario
    FROM USUARIO
    INNER JOIN PERSONA ON USUARIO.ID_PERSONA_PER = PERSONA.ID_PER
    WHERE PERSONA.CORREO_PER = correoParam AND USUARIO.CONTRASENIA_USUARIO = contraseniaParam;

    -- Si no se encontró el usuario, devolver un error
    IF nombreUsuario IS NULL OR apellidoUsuario IS NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Correo electrónico o contraseña incorrectos';
    END IF;

    -- Si se encontró el usuario, devolver el nombre y apellido del usuario
    SELECT nombreUsuario, apellidoUsuario;
END