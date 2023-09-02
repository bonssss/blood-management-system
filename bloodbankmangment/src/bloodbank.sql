-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Jul 11, 2023 at 02:23 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--
-- Error reading structure for table bloodbank.donor: #1932 - Table 'bloodbank.donor' doesn't exist in engine
-- Error reading data for table bloodbank.donor: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `bloodbank`.`donor`' at line 1

-- --------------------------------------------------------

--
-- Table structure for table `donors`
--

CREATE TABLE `donors` (
  `ID` int(11) NOT NULL,
  `name` varchar(300) NOT NULL,
  `Age` varchar(10) NOT NULL,
  `Phone` varchar(40) NOT NULL,
  `Gender` varchar(40) NOT NULL,
  `BloodGroup` varchar(10) NOT NULL,
  `city` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `donors`
--

INSERT INTO `donors` (`ID`, `name`, `Age`, `Phone`, `Gender`, `BloodGroup`, `city`) VALUES
(1, 'eduye', '36', '7548', 'Gender', 'A+', 'Hawassa'),
(5, 'bon', '43', '2345', 'Gender', 'B', 'sdf'),
(6, 'ahavah sd', '22', '964799523', 'Gender', 'A', 'admas'),
(7, 'abrsh', '11', '34556', 'Male', 'A', 'adamaa'),
(8, 'eyob', '23', '54657868', 'Gender', 'O+', 'addis abeba'),
(9, 'bini', '19', '45678', 'Gender', 'AB+', 'nazret'),
(10, 'kaleab', '41', '87564', 'Gender', 'A', 'mexico'),
(11, 'abel', '34', '45678', 'Gender', 'O', 'gonder'),
(12, 'abel', '54', '3456', 'Gender', 'O+', 'kara'),
(13, 'abe', '32', '34567', 'Gender', 'A', 'addis ababa'),
(14, 'bety', '34', '3456', 'Female', 'A', 'dfg'),
(15, 'hanan', '25', '345687', 'Gender', 'AB', 'harar'),
(16, 'hayat', '30', '34567', 'Female', 'A', 'addis'),
(20, 'bini', '23', '3454', 'Male', 'A', 'addis');

-- --------------------------------------------------------

--
-- Table structure for table `purchaser`
--

CREATE TABLE `purchaser` (
  `ID` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `Age` varchar(30) NOT NULL,
  `Phone` varchar(100) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `BloodGroup` varchar(10) NOT NULL,
  `city` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `purchaser`
--

INSERT INTO `purchaser` (`ID`, `name`, `Age`, `Phone`, `Gender`, `BloodGroup`, `city`) VALUES
(2, 'eyo', '34', '345', 'Male', 'A', 'weerr'),
(3, 'alem', '23', '4567', 'Fmale', 'AB', 'axum'),
(4, 'arif', '45', '456', 'Male', 'O+', 'arbaminch'),
(5, 'abrsh', '20', '87564', 'Male', 'A', 'nekemt'),
(6, 'blen', '43', '23456', 'Male', 'AB', 'Addis'),
(7, 'bety', '123', '3243', 'Female', 'A', 'ert'),
(8, 'hana', '22', '3456', 'Female', 'A', 'ert'),
(9, 'kebe', '33', '56', 'Male', 'A', 'sheger'),
(10, 'hira', '94', '987564321', 'Male', 'A', 'arbaminch');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donors`
--
ALTER TABLE `donors`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `purchaser`
--
ALTER TABLE `purchaser`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donors`
--
ALTER TABLE `donors`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `purchaser`
--
ALTER TABLE `purchaser`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
