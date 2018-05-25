-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2018 a las 14:11:41
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fundabiem`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `consulta` ()  NO SQL
SELECT a.pnombre,a.papellido, p.diagnostico_final, t.fecha_proxsesion, t.nivel, a.id  from persona a INNER JOIN paciente p ON a.id = p.persona_id INNER JOIN terapia t ON p.id=t.paciente_id ORDER BY t.id DESC LIMIT 1$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evolucion_tecnica`
--

CREATE TABLE `evolucion_tecnica` (
  `idevolucion_tecnica` int(11) NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `objetivos` varchar(150) DEFAULT NULL,
  `tratamiento` varchar(150) DEFAULT NULL,
  `fecha_evaluacion` date DEFAULT NULL,
  `paciente_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `id` int(11) NOT NULL,
  `fecha_cita` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE `historia_clinica` (
  `idhistoria_clinica` int(11) NOT NULL,
  `no_historiaclinica` varchar(45) DEFAULT NULL,
  `motivoconsulta` varchar(150) DEFAULT NULL,
  `E` varchar(10) DEFAULT NULL,
  `ab` varchar(10) DEFAULT NULL,
  `hijosvivos` int(11) DEFAULT NULL,
  `estadosalud_hv` varchar(20) DEFAULT NULL,
  `hijosmuertos` int(11) DEFAULT NULL,
  `causa_hm` varchar(80) DEFAULT NULL,
  `padres` varchar(45) DEFAULT NULL,
  `otros` varchar(45) DEFAULT NULL,
  `pesonacimiento` varchar(45) DEFAULT NULL,
  `duracionembarazo` varchar(45) DEFAULT NULL,
  `problemas_gestionales` varchar(45) DEFAULT NULL,
  `medicamentos_embarazo` varchar(45) DEFAULT NULL,
  `tabaquismo` tinyint(4) DEFAULT NULL,
  `alcohol` tinyint(4) DEFAULT NULL,
  `duracionparto` varchar(45) DEFAULT NULL,
  `sufrimientofetal` varchar(45) DEFAULT NULL,
  `vaginal` varchar(45) DEFAULT NULL,
  `cesarea` varchar(45) DEFAULT NULL,
  `estadoalnacer` varchar(45) DEFAULT NULL,
  `apgar` varchar(45) DEFAULT NULL,
  `sostener_cabeza` varchar(45) DEFAULT NULL,
  `sentarse_solo` varchar(45) DEFAULT NULL,
  `sonreir` varchar(45) DEFAULT NULL,
  `pararse` varchar(45) DEFAULT NULL,
  `andar` varchar(45) DEFAULT NULL,
  `caminar_solo` varchar(45) DEFAULT NULL,
  `rodar` varchar(45) DEFAULT NULL,
  `hablar` varchar(45) DEFAULT NULL,
  `vacunaciones` varchar(45) DEFAULT NULL,
  `enfermedades` varchar(45) DEFAULT NULL,
  `antecedentesqx` varchar(300) DEFAULT NULL,
  `diagnostico` varchar(45) DEFAULT NULL,
  `paciente_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int(11) NOT NULL,
  `fecha_admision` date DEFAULT NULL,
  `fecha_sesion` date DEFAULT NULL,
  `diagnostico_final` varchar(45) DEFAULT NULL,
  `encargadonombre` varchar(45) DEFAULT NULL,
  `encargadotel` varchar(8) DEFAULT NULL,
  `recomendaciones` varchar(45) DEFAULT NULL,
  `terapeuta_id` int(11) NOT NULL,
  `persona_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id`, `fecha_admision`, `fecha_sesion`, `diagnostico_final`, `encargadonombre`, `encargadotel`, `recomendaciones`, `terapeuta_id`, `persona_id`) VALUES
(3, '2018-05-01', '2018-05-03', 'Terapia Lenguaje', 'Irma Fuetnes', '77601245', 'Una prueba VIH', 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `pnombre` varchar(45) DEFAULT NULL,
  `snombre` varchar(45) DEFAULT NULL,
  `papellido` varchar(45) DEFAULT NULL,
  `sapellido` varchar(45) DEFAULT NULL,
  `nacimiento` date DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `dpi` varchar(45) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `grupoetnico` varchar(45) DEFAULT NULL,
  `nombrepadre` varchar(45) DEFAULT NULL,
  `nombremadre` varchar(45) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `pnombre`, `snombre`, `papellido`, `sapellido`, `nacimiento`, `direccion`, `telefono`, `email`, `dpi`, `edad`, `grupoetnico`, `nombrepadre`, `nombremadre`, `sexo`) VALUES
(1, 'Exson', 'Saqueo', 'Cardona', 'Fuentes', '2018-05-01', '10 calle 12 avenida', '55153914', 'exsoncardona@hotmail.com', '2149111791203', 25, 'Mestizo', 'Alejandro Martinez', 'Alejandra Marta', 'M'),
(2, 'Alejandra', 'Yadira', 'Garcia', 'Navarro', '2018-05-02', '10 calle 12 avenida', '55153914', 'danita@hotmail.com', '2149111791204', 19, 'Man', 'Anibal Navarro', 'Edna Cardona', 'F');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `terapeuta`
--

CREATE TABLE `terapeuta` (
  `id` int(11) NOT NULL,
  `especialidad` varchar(45) DEFAULT NULL,
  `user` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `persona_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `terapeuta`
--

INSERT INTO `terapeuta` (`id`, `especialidad`, `user`, `password`, `persona_id`) VALUES
(1, 'Educacion Lenguaje', 'exson', '123', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `terapia`
--

CREATE TABLE `terapia` (
  `id` int(11) NOT NULL,
  `fecha_sesion` date DEFAULT NULL,
  `fecha_proxsesion` date DEFAULT NULL,
  `tiempo_sesion` decimal(5,0) DEFAULT NULL,
  `indicador_sensorial` int(11) DEFAULT NULL,
  `nivel` int(11) DEFAULT NULL,
  `indicador_tiempo` int(11) DEFAULT NULL,
  `indicador_intelectual` int(11) DEFAULT NULL,
  `tipo_terapia` varchar(45) DEFAULT NULL,
  `paciente_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `terapia`
--

INSERT INTO `terapia` (`id`, `fecha_sesion`, `fecha_proxsesion`, `tiempo_sesion`, `indicador_sensorial`, `nivel`, `indicador_tiempo`, `indicador_intelectual`, `tipo_terapia`, `paciente_id`) VALUES
(1, '2018-05-25', '2018-05-31', '20', 3, 1, 30, 5, 'Terapia Lenguaje', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `evolucion_tecnica`
--
ALTER TABLE `evolucion_tecnica`
  ADD PRIMARY KEY (`idevolucion_tecnica`),
  ADD KEY `fk_evaluacion_tecnica_paciente1_idx` (`paciente_id`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD PRIMARY KEY (`idhistoria_clinica`),
  ADD KEY `fk_historia_clinica_paciente1_idx` (`paciente_id`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_paciente_persona1_idx` (`persona_id`),
  ADD KEY `fk_paciente_terapeuta1_idx` (`terapeuta_id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `terapeuta`
--
ALTER TABLE `terapeuta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_terapeuta_persona_idx` (`persona_id`);

--
-- Indices de la tabla `terapia`
--
ALTER TABLE `terapia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_terapia_paciente1_idx` (`paciente_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `terapeuta`
--
ALTER TABLE `terapeuta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `terapia`
--
ALTER TABLE `terapia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `evolucion_tecnica`
--
ALTER TABLE `evolucion_tecnica`
  ADD CONSTRAINT `fk_evaluacion_tecnica_paciente1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD CONSTRAINT `fk_historia_clinica_paciente1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `fk_paciente_persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_paciente_terapeuta1` FOREIGN KEY (`terapeuta_id`) REFERENCES `terapeuta` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `terapeuta`
--
ALTER TABLE `terapeuta`
  ADD CONSTRAINT `fk_terapeuta_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `terapia`
--
ALTER TABLE `terapia`
  ADD CONSTRAINT `fk_terapia_paciente1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
