/*
 Navicat Premium Data Transfer

 Source Server         : local host
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : db01

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 10/01/2020 10:08:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `deptname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `db_source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', DATABASE());
INSERT INTO `dept` VALUES (2, '人事部', DATABASE());
INSERT INTO `dept` VALUES (3, '财务部', DATABASE());
INSERT INTO `dept` VALUES (4, '市场部', DATABASE());
INSERT INTO `dept` VALUES (5, '运维部', DATABASE());

SET FOREIGN_KEY_CHECKS = 1;
