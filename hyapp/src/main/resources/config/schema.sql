DROP TABLE IF EXISTS `obj_test`;
CREATE TABLE `obj_test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `birthday` datetime NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `telephone` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;