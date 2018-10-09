/*
Navicat MySQL Data Transfer

Source Server         : msq-con
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-09-27 17:23:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for travel_design
-- ----------------------------
DROP TABLE IF EXISTS `travel_design`;
CREATE TABLE `travel_design` (
  `id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `tag` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `img` text,
  `author_id` int(11) DEFAULT NULL,
  KEY `author_id` (`author_id`),
  CONSTRAINT `author_id` FOREIGN KEY (`author_id`) REFERENCES `travel_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of travel_design
-- ----------------------------
