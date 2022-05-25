-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2022 a las 19:32:25
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `next3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE `area` (
  `id_area` int(11) NOT NULL,
  `nombre_area` varchar(30) NOT NULL,
  `descri_area` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auditor`
--

CREATE TABLE `auditor` (
  `id_auditor` int(11) NOT NULL,
  `nombre_auditor` varchar(30) NOT NULL,
  `apellido_auditor` varchar(30) NOT NULL,
  `cedula_auditor` varchar(10) NOT NULL,
  `correo_auditor` varchar(45) NOT NULL,
  `telefono_auditor` varchar(10) NOT NULL,
  `cargo_auditor` varchar(25) NOT NULL,
  `sector_auditor` varchar(25) NOT NULL,
  `nick` varchar(25) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `id_niveles` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `auditor`
--

INSERT INTO `auditor` (`id_auditor`, `nombre_auditor`, `apellido_auditor`, `cedula_auditor`, `correo_auditor`, `telefono_auditor`, `cargo_auditor`, `sector_auditor`, `nick`, `contraseña`, `id_niveles`) VALUES
(1, 'Karen Tatiana', 'Romero Pineda', '1000021059', 'karen@gmail.com', '3208791391', 'Senior', 'Telecomunicaciones', 'Karen', '32b33fe077e61397a6858467d37f720f', 1),
(2, 'Laura Camila', 'Alvarez Gaitan', '1000589222', 'laura@gmail.com', '3012595538', 'Socio', 'Telecomunicaciones', 'Laura', 'b7be34b8d0075f2d879943e95ebde4a4', 2),
(3, 'Jesus David', 'Torres Martinez', '1000589613', 'jesus@gmail.com', '3154264102', 'Senior', 'Telecomunicaciones', 'Jesus', 'd8e474cd721bf92fe923ce8dc094bb5d', 3),
(4, 'Ana Maria', 'Manrique Duque', '1003614704', 'anam@gmail.com', '3057531891', 'Asistente', 'Telecomunicaciones', 'Ana', '2bfe695b26ac5031c40b9627ec2f38f2', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clasificacion`
--

CREATE TABLE `clasificacion` (
  `id_clasificacion` int(11) NOT NULL,
  `nombre_clasificacion` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clasificacion`
--

INSERT INTO `clasificacion` (`id_clasificacion`, `nombre_clasificacion`) VALUES
(1, 'Contexto de la organizacion'),
(2, 'Liderazgo'),
(3, 'Politica'),
(4, 'Planificacion'),
(5, 'Apoyo'),
(6, 'Generalidades'),
(7, 'Evaluacion de desempeño');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documentos`
--

CREATE TABLE `documentos` (
  `id_doc` int(11) NOT NULL,
  `nombre_doc` varchar(45) NOT NULL,
  `detalle` mediumtext NOT NULL,
  `tipo_doc` varchar(25) NOT NULL,
  `categoria` varchar(25) NOT NULL,
  `version` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `ruta_doc` blob NOT NULL,
  `id_area` int(11) NOT NULL,
  `id_auditoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejecucion_auditoria`
--

CREATE TABLE `ejecucion_auditoria` (
  `id_auditoria` int(11) NOT NULL,
  `titulo` varchar(30) NOT NULL,
  `id_auditor` int(11) NOT NULL,
  `fecha_auditoria` date NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `niveles`
--

CREATE TABLE `niveles` (
  `id_niveles` int(11) NOT NULL,
  `nivel` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `niveles`
--

INSERT INTO `niveles` (`id_niveles`, `nivel`) VALUES
(1, 'Nivel 1'),
(2, 'Nivel 2'),
(3, 'Nivel 3'),
(4, 'Nivel 4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `id_pregunta` int(11) NOT NULL,
  `nom_pregunta` mediumtext NOT NULL,
  `id_clasificacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id_pregunta`, `nom_pregunta`, `id_clasificacion`) VALUES
(1, 'La empresa determina asuntos externos e internos que sean importantes para su propósito y que influyen en su capacidad para alcanzar los resultados previstos de su sistema de gestión de la seguridad de la información.', 1),
(2, 'La empresa establece los límites y la aplicabilidad del sistema de gestión de la seguridad de la información con tal de verificar su alcance.', 1),
(3, 'La compañía construye, implementa y desarrolla continuamente un sistema de gestión de seguridad de la información, de acuerdo con las exigencias de la Norma.', 1),
(4, 'Garantiza que el sistema de seguridad de la información y sus objetivos estén construidos y sean compatibles con la dirección estratégica de la empresa.', 2),
(5, 'Se evidencia que el acceso a los recursos son necesarios para el sistema de gestión de la seguridad de la información.', 2),
(6, 'El sistema de gestión de la seguridad de la información alcanza los resultados previstos.', 2),
(7, 'Apoyar a las personas para que aporten a la eficacia del sistema de gestión de la seguridad de la información.', 2),
(8, 'La alta dirección cubre los objetivos de seguridad de la información o presenta el marco para establecerlos.', 3),
(9, 'Las políticas de seguridad de la información están disponibles de manera documentada, al igual que es comunicada dentro de la empresa y accesible a las partes interesadas.', 3),
(10, 'La compañía planifica las acciones para abordar los riesgos y oportunidades.\r\n', 4),
(11, 'Se establecen y mantienen criterios de riesgo de seguridad de la información que incluyen la aceptación y evaluaciones.', 4),
(12, 'Asegura que las evaluaciones de los riesgos en cuanto a la seguridad de la información repetida producen resultados consistentes, válidos y comparables.', 4),
(13, 'Se tienen en cuenta las exigencias aplicables en materia de seguridad de la información y los resultados de la evaluación, al igual que el tratamiento de los riesgos, tienen que ser comunicados y actualizados según proceda.', 4),
(14, 'La empresa define y proporciona los recursos necesarios para el establecimiento, aplicación, apoyo y desarrollo continuo del sistema de gestión de la seguridad de la información', 5),
(15, 'Define las competencias necesarias para que las personas que realizan actividades, influyan en su desempeño de acuerdo a la seguridad de la información.', 5),
(16, 'Se conserva la información debidamente documentada como prueba de su competencia.', 5),
(17, 'La empresa planifica, regula y controla los procesos necesarios para satisfacer las demandas de seguridad de la información, con tal de llevar a cabo las acciones determinadas.', 6),
(18, 'La empresa mantendrá información documentada en la medida en que sea necesario, con tal de tener la seguridad de que los métodos se han llevado a cabo según lo previsto.', 6),
(19, 'Se examina el sistema de gestión de la seguridad de la información de la empresa en intervalos planificados para asegurar su continua idoneidad, adecuación y eficacia.\r\n', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `responder`
--

CREATE TABLE `responder` (
  `id_responder` int(11) NOT NULL,
  `id_pregunta` int(11) NOT NULL,
  `id_respuesta` int(11) NOT NULL,
  `id_auditoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `id_respuesta` int(11) NOT NULL,
  `descri_respuesta` varchar(25) NOT NULL,
  `valor_respuesta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`id_respuesta`, `descri_respuesta`, `valor_respuesta`) VALUES
(1, 'Cumple', 1),
(2, 'No cumple', 0),
(3, 'Oportunidad de mejora', 1),
(4, 'No aplica', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(30) NOT NULL,
  `apellido_usuario` varchar(30) NOT NULL,
  `cif_niif` varchar(30) NOT NULL,
  `correo_usuario` varchar(45) NOT NULL,
  `telefono_usuario` varchar(10) NOT NULL,
  `id_area` int(11) NOT NULL,
  `cargo_usuario` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`id_area`);

--
-- Indices de la tabla `auditor`
--
ALTER TABLE `auditor`
  ADD PRIMARY KEY (`id_auditor`),
  ADD KEY `id_niveles` (`id_niveles`);

--
-- Indices de la tabla `clasificacion`
--
ALTER TABLE `clasificacion`
  ADD PRIMARY KEY (`id_clasificacion`);

--
-- Indices de la tabla `documentos`
--
ALTER TABLE `documentos`
  ADD PRIMARY KEY (`id_doc`),
  ADD KEY `documentos_ibfk_1` (`id_auditoria`),
  ADD KEY `documentos_ibfk_2` (`id_area`);

--
-- Indices de la tabla `ejecucion_auditoria`
--
ALTER TABLE `ejecucion_auditoria`
  ADD PRIMARY KEY (`id_auditoria`),
  ADD KEY `ejecucion_auditoria_ibfk_1` (`id_auditor`),
  ADD KEY `ejecucion_auditoria_ibfk_2` (`id_usuario`);

--
-- Indices de la tabla `niveles`
--
ALTER TABLE `niveles`
  ADD PRIMARY KEY (`id_niveles`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id_pregunta`),
  ADD KEY `preguntas_ibfk_1` (`id_clasificacion`);

--
-- Indices de la tabla `responder`
--
ALTER TABLE `responder`
  ADD PRIMARY KEY (`id_responder`),
  ADD KEY `responder_ibfk_1` (`id_pregunta`),
  ADD KEY `responder_ibfk_2` (`id_auditoria`),
  ADD KEY `responder_ibfk_3` (`id_respuesta`);

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id_respuesta`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `usuario_ibfk_1` (`id_area`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `area`
--
ALTER TABLE `area`
  MODIFY `id_area` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `auditor`
--
ALTER TABLE `auditor`
  MODIFY `id_auditor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `clasificacion`
--
ALTER TABLE `clasificacion`
  MODIFY `id_clasificacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `ejecucion_auditoria`
--
ALTER TABLE `ejecucion_auditoria`
  MODIFY `id_auditoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `niveles`
--
ALTER TABLE `niveles`
  MODIFY `id_niveles` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id_pregunta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `responder`
--
ALTER TABLE `responder`
  MODIFY `id_responder` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `auditor`
--
ALTER TABLE `auditor`
  ADD CONSTRAINT `auditor_ibfk_1` FOREIGN KEY (`id_niveles`) REFERENCES `niveles` (`id_niveles`);

--
-- Filtros para la tabla `documentos`
--
ALTER TABLE `documentos`
  ADD CONSTRAINT `documentos_ibfk_1` FOREIGN KEY (`id_auditoria`) REFERENCES `ejecucion_auditoria` (`id_auditoria`),
  ADD CONSTRAINT `documentos_ibfk_2` FOREIGN KEY (`id_area`) REFERENCES `area` (`id_area`);

--
-- Filtros para la tabla `ejecucion_auditoria`
--
ALTER TABLE `ejecucion_auditoria`
  ADD CONSTRAINT `ejecucion_auditoria_ibfk_1` FOREIGN KEY (`id_auditor`) REFERENCES `auditor` (`id_auditor`),
  ADD CONSTRAINT `ejecucion_auditoria_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD CONSTRAINT `preguntas_ibfk_1` FOREIGN KEY (`id_clasificacion`) REFERENCES `clasificacion` (`id_clasificacion`);

--
-- Filtros para la tabla `responder`
--
ALTER TABLE `responder`
  ADD CONSTRAINT `responder_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id_pregunta`),
  ADD CONSTRAINT `responder_ibfk_2` FOREIGN KEY (`id_auditoria`) REFERENCES `ejecucion_auditoria` (`id_auditoria`),
  ADD CONSTRAINT `responder_ibfk_3` FOREIGN KEY (`id_respuesta`) REFERENCES `respuestas` (`id_respuesta`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_area`) REFERENCES `area` (`id_area`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
