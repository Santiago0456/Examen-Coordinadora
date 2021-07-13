DROP DATABASE IF EXISTS Bomberos;
CREATE DATABASE Bomberos;
USE Bomberos;

CREATE TABLE ZONA(
IDZona VARCHAR(10) NOT NULL PRIMARY KEY,
Nombre VARCHAR(30),
Riesgo VARCHAR(30)
);

CREATE TABLE INCENDIO(
IDIncendio varchar(10) NOT NULL PRIMARY KEY,
IDZONA Varchar(10),
Hora VARCHAR(50),
Fecha DATE,
Area_afectada VARCHAR(30),
Causa_General VARCHAR(70),
Causa_Especifica VARCHAR(70),
FOREIGN KEY (IDZona) REFERENCES ZONA(IDZona)
);

CREATE TABLE INFORMANTE(
IDInformante varchar(10) NOT NULL PRIMARY KEY,
Primer_nombre VARCHAR(30),
Segundo_nombre VARCHAR(30),
Primer_apellido VARCHAR(70),
Segundo_apellido VARCHAR(70)
);

CREATE TABLE EQUIPO(
IDEquipo varchar(10) NOT NULL PRIMARY KEY,
Escuadron VARCHAR(30)
);

CREATE TABLE BOMBERO(
IDEquipo VARCHAR(10),
Cedula varchar(10) NOT NULL PRIMARY KEY,
Primer_nombre VARCHAR(30),
Segundo_nombre VARCHAR(30),
Primer_apellido VARCHAR(30),
Segundo_apellido VARCHAR(30),
FOREIGN KEY (IDEquipo) REFERENCES EQUIPO(IDEquipo)
);

CREATE TABLE REGISTRO(
IDRegistro VARCHAR(10) NOT NULL PRIMARY KEY,
IDIncendio varchar(10),
IDInformante VARCHAR(10),
IDEquipo VARCHAR(10),
FOREIGN KEY (IDIncendio) REFERENCES INCENDIO(IDIncendio),
FOREIGN KEY (IDInformante) REFERENCES INFORMANTE(IDInformante),
FOREIGN KEY (IDEquipo) REFERENCES EQUIPO(IDEquipo)
);

#Llenado de Datos Zona
INSERT INTO ZONA
VALUES('z01','Robledo','Loma muy empinada'
);
INSERT INTO ZONA
VALUES('z02','Castilla','Altas Temperaturas'
);
INSERT INTO ZONA
VALUES('z03','Manrique','Pocas Lluvias'
);
INSERT INTO ZONA
VALUES('z04','Buenos Aires','Fábricas Cercanas'
);
INSERT INTO ZONA
VALUES('z05','Santa Mónica','Distancia de Estación'
);

#Llenado de Datos Incendio
INSERT INTO INCENDIO
VALUES('i01','z01','3:00pm','2020-07-15','300x300','Descuido','Pipeta de gas'
);
INSERT INTO INCENDIO
VALUES('i02','z02','1:00pm','2020-07-11','350x800','Accidente Aereo','Choque de avión'
);
INSERT INTO INCENDIO
VALUES('i03','z03','3:00am','2021-03-01','200x330','Descuido','Vela'
);
INSERT INTO INCENDIO
VALUES('i04','z04','5:00pm','2019-07-18','1100x1300','Accidente Natural','Altas temperaturas'
);
INSERT INTO INCENDIO
VALUES('i05','z05','8:40pm','2021-04-25','34300x5300','Descuido','Sancocho'
);

#Llenado de Datos Informante
INSERT INTO INFORMANTE
VALUES('112844830','Armando','Julián','Perea','Cardona'
);
INSERT INTO INFORMANTE
VALUES('34844430','Carlos','Andrés','Ramirez','Sanchez'
);
INSERT INTO INFORMANTE
VALUES('12234840','Carolina','Marcela','Parra','Pino'
);
INSERT INTO INFORMANTE
VALUES('6212320','Sofia','','Cardozo','Cardozo'
);
INSERT INTO INFORMANTE
VALUES('12134123','Jefer','','Ocaña','Calle'
);

#Llenado de Datos Equipo
INSERT INTO EQUIPO
VALUES('e1','Alfa'
);
INSERT INTO EQUIPO
VALUES('e2','Bravo'
);
INSERT INTO EQUIPO
VALUES('e3','Charlie'
);
INSERT INTO EQUIPO
VALUES('e4','Delta'
);
INSERT INTO EQUIPO
VALUES('e5','Echo'
);

#Llenado de Datos Bombero
INSERT INTO BOMBERO
VALUES('e1','2341234','Jairo','','Lee','Xu'
);
INSERT INTO BOMBERO
VALUES('e1','1234152','Julián','Esteban','Weng','Liang'
);
INSERT INTO BOMBERO
VALUES('e2','32345232','Alvaro','','Lara','Moscoso'
);
INSERT INTO BOMBERO
VALUES('e2','213452334','Tanya','Andrea','López','Pérez'
);
INSERT INTO BOMBERO
VALUES('e3','12341231','Arisbeth','','Carreón','Benavides'
);

#Llenado de Datos Registro
INSERT INTO REGISTRO
VALUES('r1','i01','112844830','e1'
);
INSERT INTO REGISTRO
VALUES('r2','i02','34844430','e1'
);
INSERT INTO REGISTRO
VALUES('r3','i03','12234840','e2'
);
INSERT INTO REGISTRO
VALUES('r4','i04','6212320','e2'
);
INSERT INTO REGISTRO
VALUES('r5','i05','12134123','e3'
);

# Updates de Zona
UPDATE ZONA SET Nombre = 'Los Cerros' WHERE nombre = 'Castilla';
UPDATE ZONA SET Nombre = 'Poblado' WHERE nombre = 'Santa Mónica';

# Updates de Incendio
UPDATE INCENDIO SET Hora = '3:45am' WHERE Hora = '8:40pm';
UPDATE INCENDIO SET Area_afectada = '1200x1200' WHERE Area_afectada = '300x300';

# Updates de Informante
UPDATE INFORMANTE SET Primer_nombre = 'Pedro' WHERE Primer_nombre = 'Jefer';
UPDATE INFORMANTE SET Segundo_apellido = 'Loaiza' WHERE Segundo_apellido = 'Sanchez';

# Updates de Equipo
UPDATE EQUIPO SET Escuadron = 'Alfalfa' WHERE Escuadron = 'Alfa';
UPDATE EQUIPO SET Escuadron = 'Charly' WHERE Escuadron = 'Charlie';

SELECT * FROM bombero;
UPDATE BOMBERO SET Escuadron = 'Charly' WHERE BOMBERO = 'Charlie';
UPDATE BOMBERO SET Escuadron = 'Charly' WHERE BOMBERO = 'Charlie';