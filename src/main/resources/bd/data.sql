

IF NOT EXISTS
    (SELECT 1 FROM usuario WHERE id = 1)
    BEGIN
        INSERT usuario (id,password,username) VALUES(1,'$2a$04$I6aCuSlNfFonKN44nE4Hr.yTpK0p6jSypWj7faX7AYdFfcMxlfg5G','admin') -- password: 1234
    END;
IF NOT EXISTS
    (SELECT 1 FROM usuario WHERE id = 2)
    BEGIN
        INSERT usuario (id,password,username) VALUES(2,'$2a$04$bU7JceNofKgQErmZy3T6cOhUARTapKzj3Fbx5NbFhNgNiRvVW6vL6','user') -- password: 1234
    END;
IF NOT EXISTS
    (SELECT 1 FROM authority WHERE id = 1)
    BEGIN
        INSERT authority (id,authority) VALUES (1,'ROLE_ADMIN')
    END;
IF NOT EXISTS
    (SELECT 1 FROM authority WHERE id = 2)
    BEGIN
        INSERT authority (id,authority) VALUES (2,'ROLE_USER')
    END;
IF NOT EXISTS
    (SELECT 1 FROM authorities_users WHERE usuario_id = 1 AND authority_id = 1)
    BEGIN
        INSERT authorities_users (usuario_id, authority_id) VALUES (1,1)
    END;
IF NOT EXISTS
    (SELECT 1 FROM authorities_users WHERE usuario_id = 1 AND authority_id = 2)
    BEGIN
        INSERT authorities_users (usuario_id, authority_id) VALUES (1,2)
    END;
IF NOT EXISTS
    (SELECT 1 FROM authorities_users WHERE usuario_id = 2 AND authority_id = 2)
    BEGIN
        INSERT authorities_users (usuario_id, authority_id) VALUES (2,2)
    END;










---datos de la tabla usuario----
--IF NOT EXISTS

    --(SELECT 1 FROM usuario WHERE usuario_id = 1 AND usuario_nombre = 'Ramiro'  AND usuario_password = 'LPII')

   -- BEGIN

        --INSERT usuario (usuario_id, usuario_nombre,usuario_password) VALUES (1, 'Ramiro','LPII')

   -- END;

---datos de la tabla aportesempleado---

    IF NOT EXISTS
        (SELECT 1 FROM aportesEmpleado WHERE aportesEmpleado_id = 1 AND aportesEmpleado_nombre = 'AFP')
        BEGIN
            INSERT aportesEmpleado (aportesEmpleado_id, aportesEmpleado_nombre) VALUES (1, 'AFP')
        END;

        IF NOT EXISTS
                (SELECT 1 FROM aportesEmpleado WHERE aportesEmpleado_id = 2 AND aportesEmpleado_nombre = 'ONP')
                BEGIN
                    INSERT aportesEmpleado (aportesEmpleado_id, aportesEmpleado_nombre) VALUES (2, 'ONP')
                END;

-----datos de la tabla turnoempleado---
     IF NOT EXISTS
            (SELECT 1 FROM turnoEmpleado WHERE turnoEmpleado_id = 1 AND turnoEmpleado_nombre = 'Dia')
            BEGIN
                INSERT turnoEmpleado (turnoEmpleado_id, turnoEmpleado_nombre) VALUES (1, 'Dia')
            END;

              IF NOT EXISTS
                        (SELECT 1 FROM turnoEmpleado WHERE turnoEmpleado_id = 2 AND turnoEmpleado_nombre = 'Noche')
                        BEGIN
                            INSERT turnoEmpleado (turnoEmpleado_id, turnoEmpleado_nombre) VALUES (2, 'Noche')
                        END;


---datos de la tabla rolempleado--
            IF NOT EXISTS
                (SELECT 1 FROM rolEmpleado WHERE rolEmpleado_id = 1 AND rolEmpleado_nombre = 'Administrador')
                BEGIN
                    INSERT rolEmpleado (rolEmpleado_id, rolEmpleado_nombre) VALUES (1, 'Administrador')
                END;

                 IF NOT EXISTS
                                (SELECT 1 FROM rolEmpleado WHERE rolEmpleado_id = 2 AND rolEmpleado_nombre = 'Gerente')
                                BEGIN
                                    INSERT rolEmpleado (rolEmpleado_id, rolEmpleado_nombre) VALUES (2, 'Gerente')
                                END;




                ----datos de la tabla sexo

                IF NOT EXISTS
                    (SELECT 1 FROM sexo WHERE sexo_id = 1 AND sexo_nombre = 'Masculino')
                    BEGIN
                        INSERT sexo (sexo_id, sexo_nombre) VALUES (1, 'Masculino')
                    END;
                IF NOT EXISTS
                    (SELECT 1 FROM sexo WHERE sexo_id = 2 AND sexo_nombre = 'Femenino')
                    BEGIN
                        INSERT sexo (sexo_id, sexo_nombre) VALUES (2, 'Femenino')
                    END;
                IF NOT EXISTS
                    (SELECT 1 FROM sexo WHERE sexo_id = 3 AND sexo_nombre = 'Otros')
                    BEGIN
                        INSERT sexo (sexo_id, sexo_nombre) VALUES (3, 'Otros')
                    END;




---data de la tabla motos--

--=====================MARCA MOTO=============
IF NOT EXISTS
    (SELECT 1 FROM marcamoto WHERE marcamoto_id = 1 AND marca_nombre = 'Susuki')
    BEGIN
        INSERT marcamoto (marcamoto_id, marca_nombre) VALUES (1, 'Susuki')
    END;

IF NOT EXISTS
    (SELECT 2 FROM marcamoto WHERE marcamoto_id = 2 AND marca_nombre = 'Kawasaki')
    BEGIN
        INSERT marcamoto (marcamoto_id, marca_nombre) VALUES (2, 'Kawasaki')
    END;

IF NOT EXISTS
    (SELECT 3 FROM marcamoto WHERE marcamoto_id = 3 AND marca_nombre = 'Yamaha')
    BEGIN
        INSERT marcamoto (marcamoto_id, marca_nombre) VALUES (3, 'Yamaha')
    END;

IF NOT EXISTS
    (SELECT 4 FROM marcamoto WHERE marcamoto_id = 4 AND marca_nombre = 'Honda')
    BEGIN
        INSERT marcamoto (marcamoto_id, marca_nombre) VALUES (4, 'Honda')
    END;

IF NOT EXISTS
    (SELECT 5 FROM marcamoto WHERE marcamoto_id = 5 AND marca_nombre = 'Bajaj')
    BEGIN
        INSERT marcamoto (marcamoto_id, marca_nombre) VALUES (5, 'Bajaj')
    END;

--====================TIPOMOTO==================

IF NOT EXISTS
    (SELECT 1 FROM tipomoto WHERE tipomoto_id = 1 AND tipomoto_nombre = 'Scooter')
    BEGIN
        INSERT tipomoto (tipomoto_id, tipomoto_nombre) VALUES (1, 'Scooter')
    END;

IF NOT EXISTS
    (SELECT 2 FROM tipomoto WHERE tipomoto_id = 2 AND tipomoto_nombre = 'Deportiva')
    BEGIN
        INSERT tipomoto (tipomoto_id, tipomoto_nombre) VALUES (2, 'Deportiva')
    END;

IF NOT EXISTS
    (SELECT 3 FROM tipomoto WHERE tipomoto_id = 3 AND tipomoto_nombre = 'Enduro')
    BEGIN
        INSERT tipomoto (tipomoto_id, tipomoto_nombre) VALUES (3, 'Enduro')
    END;


    --data de carros--
    IF NOT EXISTS
        (SELECT 1 FROM marca WHERE marca_id = 1 AND marca_nombre = 'Toyota')
        BEGIN
            INSERT marca (marca_id, marca_nombre) VALUES (1, 'Toyota')
        END;
    IF NOT EXISTS
        (SELECT 1 FROM marca WHERE marca_id = 2 AND marca_nombre = 'Kia')
        BEGIN
            INSERT marca (marca_id, marca_nombre) VALUES (2, 'Kia')
        END;
    IF NOT EXISTS
        (SELECT 1 FROM marca WHERE marca_id = 3 AND marca_nombre = 'Chevrolet')
        BEGIN
            INSERT marca (marca_id, marca_nombre) VALUES (3, 'Chevrolet')
        END;

    IF NOT EXISTS
        (SELECT 1 FROM combustible WHERE combustible_id = 1 AND combustible_nombre = 'Gasolina')
        BEGIN
            INSERT combustible (combustible_id, combustible_nombre) VALUES (1, 'Gasolina')
        END;
    IF NOT EXISTS
        (SELECT 1 FROM combustible WHERE combustible_id = 2 AND combustible_nombre = 'Electrico')
        BEGIN
            INSERT combustible (combustible_id, combustible_nombre) VALUES (2, 'Electrico')
        END;


    IF NOT EXISTS
        (SELECT 1 FROM estado WHERE estado_id = 1 AND estado_nombre = 'Usado')
        BEGIN
            INSERT estado (estado_id, estado_nombre) VALUES (1, 'Usado')
        END;
    IF NOT EXISTS
        (SELECT 1 FROM estado WHERE estado_id = 2 AND estado_nombre = 'SemiNuevo')
        BEGIN
            INSERT estado (estado_id, estado_nombre) VALUES (2, 'SemiNuevo')
        END;
    IF NOT EXISTS
        (SELECT 1 FROM estado WHERE estado_id = 3 AND estado_nombre = 'Nuevo')
        BEGIN
            INSERT estado (estado_id, estado_nombre) VALUES (3, 'Nuevo')
        END;




        ----data de carro--

        IF NOT EXISTS
            (SELECT 1 FROM marcaca WHERE marcaca_id = 1 AND marcaca_nombre = 'Hyundai')
            BEGIN
                INSERT marcaca (marcaca_id, marcaca_nombre) VALUES (1, 'Hyundai')
            END;
        IF NOT EXISTS
            (SELECT 1 FROM marcaca WHERE marcaca_id = 2 AND marcaca_nombre = 'Suzuki')
            BEGIN
                INSERT marcaca (marcaca_id, marcaca_nombre) VALUES (2, 'Suzuki')
            END;
        IF NOT EXISTS
            (SELECT 1 FROM marcaca WHERE marcaca_id = 3 AND marcaca_nombre = 'Honda')
            BEGIN
                INSERT marcaca (marcaca_id, marcaca_nombre) VALUES (3, 'Honda')
            END;

        IF NOT EXISTS
            (SELECT 1 FROM estadoca WHERE estadoca_id = 1 AND estadoca_nombre = 'Nuevo')
            BEGIN
                INSERT estadoca (estadoca_id, estadoca_nombre) VALUES (1, 'Nuevo')
            END;
        IF NOT EXISTS
            (SELECT 1 FROM estadoca WHERE estadoca_id = 2 AND estadoca_nombre = 'SemiNuevo')
            BEGIN
                INSERT estadoca (estadoca_id, estadoca_nombre) VALUES (2, 'SemiNuevo')
            END;
        IF NOT EXISTS
            (SELECT 1 FROM estadoca WHERE estadoca_id = 3 AND estadoca_nombre = 'Usado')
            BEGIN
                INSERT estadoca (estadoca_id, estadoca_nombre) VALUES (3, 'Usado')
            END;








