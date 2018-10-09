/*
Navicat MySQL Data Transfer

Source Server         : msq-con
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-09-27 17:23:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for travel_user
-- ----------------------------
DROP TABLE IF EXISTS `travel_user`;
CREATE TABLE `travel_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1 ROW_FORMAT=COMPRESSED;

-- ----------------------------
-- Records of travel_user
-- ----------------------------
INSERT INTO `travel_user` VALUES ('1', '0', 'x');
INSERT INTO `travel_user` VALUES ('7', '0', 'x');
INSERT INTO `travel_user` VALUES ('8', '0', 'x');
INSERT INTO `travel_user` VALUES ('9', '0', 'x');
INSERT INTO `travel_user` VALUES ('10', '100', '100');
INSERT INTO `travel_user` VALUES ('11', '100', '100');
INSERT INTO `travel_user` VALUES ('13', '123', 'Willin');
INSERT INTO `travel_user` VALUES ('14', '123', 'Willin');
