-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2016 a las 20:04:05
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdpizzeria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IDCliente` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `ApPaterno` varchar(20) NOT NULL,
  `ApMaterno` varchar(20) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IDCliente`, `Nombre`, `ApPaterno`, `ApMaterno`, `Direccion`, `Telefono`) VALUES
(1, 'Francisco Segundo', 'Ascencio', 'Vera', 'San Pedro (Manzan f lote 1)', '9267803'),
(2, 'Susana Angela', 'Mora', 'Soutullo', 'Los Copihues', '5807029'),
(3, 'Sonia Inés', 'Leal', 'Leal', 'Psje. Jerusalén', '8306420'),
(4, 'Juan', 'Carrasco', 'Vega', 'Psje. Galilea', '9812901'),
(5, 'Rosa Elena', 'Romero', 'Benavente', 'Caupolicán', '7920371'),
(6, 'Heraldo', 'Cuevas', 'Orellana', 'California', '8982020'),
(7, 'Alejandra del Carmen', 'Contreras', 'Rodriguez', 'Pasaje Fresia', '9993562718'),
(8, 'Roguers Alberto', 'Morales', 'Navarrete', 'Pablo Neruda', '9911802736'),
(9, 'Estela Mercedes', 'Zapata', 'Arriagada', 'Los Acacios', '6477582029'),
(10, 'Luis Ricardo', 'Faundez', 'Retamal', 'Los Sauces Poniente', '2225679193'),
(11, 'José Luis', 'Flores', 'Terán', 'Pasaje 1 Casa', '9823020'),
(12, 'Ricardo', 'Pech', 'Basto', 'San José Tecoh', '9992111111'),
(13, 'José Carlos', 'Broca', 'Sanchéz', 'Col. Roma', '3487291'),
(14, 'Javier Alberto', 'Ortiz', 'Medina', 'Col. Obrera', '9289182922'),
(15, 'Vicente', 'Yah', 'Dzul', 'Gonzalo Guerrero', '8723829003'),
(16, 'Felipe', 'Chan', 'Palomo', 'Lindavista', '3873832'),
(17, 'Gema', 'Ferrera', 'Euán', 'Chuburna', '3847387349'),
(18, 'Daniel', 'Gleber', 'Sellers', 'Montes de Amé', '8729031'),
(19, 'Alvaro Omar', 'Teyer', 'Saldivar', 'Vergel II', '9901891026'),
(20, 'Pedro Pablo', 'Cetina', 'Pacheco', 'Mulsay', '6576388391');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `IDProducto` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `CantidadKg` int(11) NOT NULL,
  `PrecioKg` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`IDProducto`, `Nombre`, `CantidadKg`, `PrecioKg`) VALUES
(1, 'Masa', 50, 18.5),
(2, 'Salsa de Tomate', 50, 22.8),
(3, 'Queso', 50, 45),
(4, 'Pepperoni', 50, 27.5),
(5, 'Salami', 50, 18.8),
(6, 'Jamón', 50, 58),
(7, 'Tocino', 50, 60),
(8, 'Chorizo', 50, 14.7),
(9, 'Piña', 50, 19.3),
(10, 'Pimiento', 50, 24),
(11, 'Jalapeño', 50, 32),
(12, 'Aceitunas', 50, 26.2),
(13, 'Champiñones', 50, 92),
(14, 'Cebolla', 50, 15.9),
(15, 'Salchicha Italiana', 30, 27.6),
(16, 'Frijoles', 20, 15),
(17, 'Ajonjolí', 10, 150);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pizzas`
--

CREATE TABLE `pizzas` (
  `IDPizza` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Tamaño` varchar(20) NOT NULL,
  `Precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pizzas`
--

INSERT INTO `pizzas` (`IDPizza`, `Nombre`, `Tamaño`, `Precio`) VALUES
(11, 'Mexicana Gde', 'Grande', 100),
(12, 'Mexicana Md', 'Mediana', 80),
(13, 'Mexicana Pr', 'Personal', 28),
(21, 'Hawaiana Gde', 'Grande', 99),
(22, 'Hawaiana Md', 'Mediana', 83),
(23, 'Hawaiana Pr', 'Personal', 25),
(31, 'Walfris Gde', 'Grande', 120),
(32, 'Walfris Md', 'Mediana', 92),
(33, 'Walfris Pr', 'Personal', 23),
(41, 'Pastor Gde', 'Grande', 138),
(42, 'Pastor Md', 'Mediana', 105),
(43, 'Pastor Pr', 'Personal', 32),
(51, 'Especial Gde', 'Grande', 127),
(52, 'Especial Md', 'Mediana', 105),
(53, 'Especial Pr', 'Personal', 80),
(61, 'Ranchera Gde', 'Grande', 99),
(62, 'Ranchera Md', 'Mediana', 83),
(63, 'Ranchera Pr', 'Personal', 71),
(71, 'Vegetariana Gde', 'Grande', 112),
(72, 'Vegetariana Md', 'Mediana', 88),
(73, 'Vegetariana Pr', 'Personal', 69),
(81, 'Queso de Bola Gde', 'Grande', 117),
(82, 'Queso de Bola Md', 'Mediana', 95),
(83, 'Queso de Bola Pr', 'Personal', 68);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IDUsuario` varchar(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `ApPaterno` varchar(20) NOT NULL,
  `ApMaterno` varchar(20) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `Contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IDUsuario`, `Nombre`, `ApPaterno`, `ApMaterno`, `Tipo`, `Usuario`, `Contraseña`) VALUES
('0', 'Rodrigo', 'Vera', 'Garcia', 'Administrador', 'Admin', 'administrador123'),
('1', 'Miguel Augusto', 'Romero', 'Povedano', 'Vendedor', 'MRvend', 'vendedor123'),
('2', 'Santos', 'Pech', 'Sanchéz', 'Vendedor', 'SPvend', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `IDUsuario` int(11) NOT NULL,
  `Nombre(s)` varchar(20) NOT NULL,
  `ApPaterno` varchar(20) NOT NULL,
  `ApMaterno` varchar(20) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `Contraseña` varchar(20) NOT NULL,
  `VenBrutas` double NOT NULL,
  `Sueldo` double NOT NULL,
  `Horario` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`IDUsuario`, `Nombre(s)`, `ApPaterno`, `ApMaterno`, `Tipo`, `Usuario`, `Contraseña`, `VenBrutas`, `Sueldo`, `Horario`) VALUES
(0, 'Rodrigo', 'Vera', 'Garcia', 'Administrador', 'Admin', 'administrador123', 0, 3000, '12:00 p.m. - 7:00 p.m.'),
(1, 'Miguel Augusto', 'Romero', 'Povedano', 'Vendedor', 'MRvend', 'vendedor123', 0, 2500, '11:00 a.m. - 11:30 p.m.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`IDCliente`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`IDProducto`);

--
-- Indices de la tabla `pizzas`
--
ALTER TABLE `pizzas`
  ADD PRIMARY KEY (`IDPizza`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IDUsuario`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`IDUsuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
