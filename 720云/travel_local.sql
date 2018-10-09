/*
Navicat MySQL Data Transfer

Source Server         : msq-con
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-09-27 17:23:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for travel_local
-- ----------------------------
DROP TABLE IF EXISTS `travel_local`;
CREATE TABLE `travel_local` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text,
  `author` text,
  `detail` text,
  `image` text,
  `category` text,
  `address` text,
  `src` text,
  `link` text,
  `text` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of travel_local
-- ----------------------------
INSERT INTO `travel_local` VALUES ('1', '上海', '张三', '这里是上海！', 'img\\sh.jpg', '0', 'http://localhost:8080/Travel/sh', null, null, null);
INSERT INTO `travel_local` VALUES ('2', '广东', '李四', '这里是广东！', 'img\\gd.jpg', '1', 'http://localhost:8080/Travel/s', null, null, null);
INSERT INTO `travel_local` VALUES ('3', '江西', '王五', '这里是江西！', 'img\\jx.jpg', '1', 'https://720yun.com/t/75cjO54wsm0', null, null, null);
INSERT INTO `travel_local` VALUES ('4', '北京', '赵六', '这里是北京！', 'img\\bj.jpg', '1', 'https://720yun.com/t/9b1jOrsntn6', null, null, null);
INSERT INTO `travel_local` VALUES ('5', '广西', '123', '这里是广西！', 'img\\gx.jpg', null, 'https://720yun.com/t/a02jvphkvw3', null, null, null);
INSERT INTO `travel_local` VALUES ('6', '西藏', '321', '这里是西藏！', 'img\\xz.jpg', null, 'https://720yun.com/t/ce0jeOwvty8', null, null, null);
INSERT INTO `travel_local` VALUES ('7', '湖北', '144', '这里是湖北！', 'img\\hb.jpg', null, 'https://720yun.com/t/cc4jzzhyrv9', null, null, null);
