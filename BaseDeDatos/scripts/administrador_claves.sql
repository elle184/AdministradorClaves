/**
 * Creado por Adrian Francisco Becerra Arias - shogunato184@gmail.com
 *
 *
 * Script de creación de la base de datos administrador_claves
 *
 * Los scripts a continuación están construidos para ser ejecutados en la
 * versión 5.5.x de MySQL
 *
 *
 *
 *
 *
 */

create database if not exists administrador_claves collate utf8_general_ci charset utf8;

use administrador_claves;

create table if not exists secuencias(
  nombre_secuencia varchar(100) not null primary key,
  valor_secuencia bigint not null
);

create table if not exists usuarios(
  id_usuario bigint not null primary key,
  nom_usuario varchar(20) not null,
  clave varchar(32) not null,
  fecha_registro TIMESTAMP default CURRENT_TIMESTAMP,
  fecha_actualizacion DATETIME DEFAULT NULL
);

create table if not exists cuentas(
	id_usuario bigint not null primary key,
	nom_cuenta varchar(100) not null,
	tipo_aplicacion enum('RED_SOCIAL', 'CORREO_ELECTRONICO', 'MENSAJERIA_INSTANTANEA', 'DISCOS_VIRTUALES')
);
