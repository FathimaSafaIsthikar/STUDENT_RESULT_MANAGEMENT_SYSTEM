-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 23, 2021 at 09:06 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `srm`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `rollNo` varchar(15) NOT NULL,
  `course` varchar(20) NOT NULL,
  `branch` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `fatherName` varchar(100) NOT NULL,
  PRIMARY KEY (`rollNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`rollNo`, `course`, `branch`, `name`, `gender`, `fatherName`) VALUES
('10006', 'B.tech', 'IT', 'Asna', 'Female', 'Azwar'),
('10005', 'B.tech', 'Mechanics', 'Sana', 'Female', 'Ishfak'),
('10003', 'B.tech', 'CSE', 'saf', 'Female', 'isthi'),
('10004', 'B.tech', 'Mechanics', 'Ifad Ahamed', 'Male', 'Isthikar'),
('10010', 'B.tech', 'CSE', 'Sandy', 'Female', 'John'),
('10001', 'B.tech', 'CSE', 'Safa ISthikar', 'Female', 'Isthikar'),
('10002', 'B.tech', 'CSE', 'Salma', 'Female', 'Mahdhy');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
