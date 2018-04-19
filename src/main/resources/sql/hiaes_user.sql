/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : hiaes

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-14 20:24:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hiaes_user
-- ----------------------------
DROP TABLE IF EXISTS `hiaes_user`;
CREATE TABLE `hiaes_user` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `user_role` int(255) DEFAULT NULL,
  `is_login` tinyint(1) DEFAULT NULL,
  `enable` tinyint(1) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hiaes_user
-- ----------------------------
INSERT INTO `hiaes_user` VALUES ('1', 'jalen', '1', '1', '1', '1', '2017-12-13 16:51:05', 'jalen', '2017-12-13 16:51:18', 'jalen', '1152357479@qq.com', '18055381010', '4c49d0e5-0091-49dc-a197-b5c5e73191dd', '123');
