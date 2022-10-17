-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 17-10-2022 a las 21:15:33
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `recipebd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE `category` (
  `id_category` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`id_category`, `name`) VALUES
(1, 'Postres'),
(2, 'Sopas'),
(4, 'Arroces');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comment`
--

CREATE TABLE `comment` (
  `id_comment` int(11) NOT NULL,
  `date` date NOT NULL,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `comment` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `cod_recipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `image`
--

CREATE TABLE `image` (
  `id_image` int(11) NOT NULL,
  `urlImage` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `cod_recipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredient`
--

CREATE TABLE `ingredient` (
  `id_ingredient` int(11) NOT NULL,
  `ingredient` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `cod_recipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instruction`
--

CREATE TABLE `instruction` (
  `id_instruction` int(11) NOT NULL,
  `step` int(3) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `text` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `url` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `id_recipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recipe`
--

CREATE TABLE `recipe` (
  `id_recipe` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `date_published` date NOT NULL,
  `description` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `prep_time` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `cook_time` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `totalTime` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `keywords` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `recipeYield` char(10) COLLATE utf8_unicode_ci NOT NULL,
  `recipeCuisine` char(20) COLLATE utf8_unicode_ci NOT NULL,
  `calories` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `protein` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `fat` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `carbs` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `satfat` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `sugar` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `likes` int(11) NOT NULL,
  `dislikes` int(11) NOT NULL,
  `published` tinyint(1) NOT NULL,
  `id_cat` int(11) NOT NULL,
  `id_image` int(11) NOT NULL,
  `id_instruction` int(11) NOT NULL,
  `id_ingredient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recipe2`
--

CREATE TABLE `recipe2` (
  `id_recipe2` int(11) NOT NULL,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `id_category` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `recipe2`
--

INSERT INTO `recipe2` (`id_recipe2`, `title`, `image`, `description`, `id_category`) VALUES
(1, 'Receta de Galletas de limón caseras', 'galletas_limon.jpg', 'Las galletas de limón se elaboran con una masa sencilla y, además, son muy fáciles y rápidas de preparar. Unas deliciosas galletas con mucho sabor a limón, ideales para acompañar un café, para el desayuno o para la merienda.', 1),
(2, 'Receta de Budín de avena y limón', 'budin_avena_y_limon.jpg', 'La avena es un cereal con un alto porcentaje de fibra y hierro, un ingrediente muy saludable que deberías incluir en tu alimentación cotidiana. No solo para cuidar tu salud o bajar de peso, sino también si tienes diabetes.', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

CREATE TABLE `role` (
  `cod_role` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `fullName` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `celular` int(15) NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(4) NOT NULL,
  `avatar` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `id_role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id_category`);

--
-- Indices de la tabla `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id_comment`),
  ADD KEY `cod_recipe` (`cod_recipe`);

--
-- Indices de la tabla `image`
--
ALTER TABLE `image`
  ADD PRIMARY KEY (`id_image`),
  ADD KEY `cod_recipe` (`cod_recipe`);

--
-- Indices de la tabla `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`id_ingredient`),
  ADD KEY `cod_recipe` (`cod_recipe`);

--
-- Indices de la tabla `instruction`
--
ALTER TABLE `instruction`
  ADD PRIMARY KEY (`id_instruction`),
  ADD KEY `id_recipe` (`id_recipe`);

--
-- Indices de la tabla `recipe`
--
ALTER TABLE `recipe`
  ADD PRIMARY KEY (`id_recipe`),
  ADD KEY `id_cat` (`id_cat`),
  ADD KEY `id_image` (`id_image`),
  ADD KEY `id_instruction` (`id_instruction`),
  ADD KEY `id_ingredient` (`id_ingredient`);

--
-- Indices de la tabla `recipe2`
--
ALTER TABLE `recipe2`
  ADD PRIMARY KEY (`id_recipe2`),
  ADD KEY `id_category` (`id_category`);

--
-- Indices de la tabla `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`cod_role`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_role` (`id_role`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `category`
--
ALTER TABLE `category`
  MODIFY `id_category` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `comment`
--
ALTER TABLE `comment`
  MODIFY `id_comment` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `image`
--
ALTER TABLE `image`
  MODIFY `id_image` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `id_ingredient` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `instruction`
--
ALTER TABLE `instruction`
  MODIFY `id_instruction` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `recipe`
--
ALTER TABLE `recipe`
  MODIFY `id_recipe` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `recipe2`
--
ALTER TABLE `recipe2`
  MODIFY `id_recipe2` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `role`
--
ALTER TABLE `role`
  MODIFY `cod_role` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`cod_recipe`) REFERENCES `recipe` (`id_recipe`);

--
-- Filtros para la tabla `image`
--
ALTER TABLE `image`
  ADD CONSTRAINT `image_ibfk_1` FOREIGN KEY (`cod_recipe`) REFERENCES `recipe` (`id_recipe`);

--
-- Filtros para la tabla `ingredient`
--
ALTER TABLE `ingredient`
  ADD CONSTRAINT `cod_recipe` FOREIGN KEY (`cod_recipe`) REFERENCES `recipe` (`id_recipe`);

--
-- Filtros para la tabla `instruction`
--
ALTER TABLE `instruction`
  ADD CONSTRAINT `id_recipe` FOREIGN KEY (`id_recipe`) REFERENCES `recipe` (`id_recipe`);

--
-- Filtros para la tabla `recipe`
--
ALTER TABLE `recipe`
  ADD CONSTRAINT `id_cat` FOREIGN KEY (`id_cat`) REFERENCES `category` (`id_category`),
  ADD CONSTRAINT `id_image` FOREIGN KEY (`id_image`) REFERENCES `image` (`id_image`),
  ADD CONSTRAINT `id_ingredient` FOREIGN KEY (`id_ingredient`) REFERENCES `ingredient` (`id_ingredient`),
  ADD CONSTRAINT `id_instruction` FOREIGN KEY (`id_instruction`) REFERENCES `instruction` (`id_instruction`);

--
-- Filtros para la tabla `recipe2`
--
ALTER TABLE `recipe2`
  ADD CONSTRAINT `id_category` FOREIGN KEY (`id_recipe2`) REFERENCES `category` (`id_category`);

--
-- Filtros para la tabla `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `id_role` FOREIGN KEY (`id_role`) REFERENCES `role` (`cod_role`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
