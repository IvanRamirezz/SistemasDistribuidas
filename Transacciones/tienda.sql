-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2023 a las 07:24:26
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProducto`, `nombre`, `precio`, `cantidad`) VALUES
(1, 'Audifonos Alambricos', 100.00, 15),
(2, 'Cargador Tipo C', 150.50, 5),
(3, 'Protector IPhone', 200.00, 2),
(4, 'Cargador IPhone', 300.00, 52),
(5, 'Audifonos Inalambricos', 900.99, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetasdedebito`
--

CREATE TABLE `tarjetasdedebito` (
  `id` int(11) NOT NULL,
  `numeroTarjeta` varchar(16) NOT NULL,
  `codigoCVV` varchar(3) NOT NULL,
  `nombreTitular` varchar(100) NOT NULL,
  `fondos` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tarjetasdedebito`
--

INSERT INTO `tarjetasdedebito` (`id`, `numeroTarjeta`, `codigoCVV`, `nombreTitular`, `fondos`) VALUES
(1, '1111222233334444', '123', 'Juan Perez', 5000.00),
(2, '5555666677778888', '456', 'Maria Lopez', 3000.00),
(3, '9999000011112222', '789', 'Pedro Ramirez', 10000.00);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `tarjetasdedebito`
--
ALTER TABLE `tarjetasdedebito`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tarjetasdedebito`
--
ALTER TABLE `tarjetasdedebito`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
