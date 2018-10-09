/*
Navicat MySQL Data Transfer

Source Server         : msq-con
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-09-27 17:22:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for travel_city
-- ----------------------------
DROP TABLE IF EXISTS `travel_city`;
CREATE TABLE `travel_city` (
  `name` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of travel_city
-- ----------------------------
