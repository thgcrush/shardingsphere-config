DROP TABLE IF EXISTS `tb_announcement` ;

CREATE TABLE `tb_announcement` (
    `id` VARCHAR(32) PRIMARY KEY AUTO INCREMENT,
    `title` VARCHAR(16) NOT NULL DEFAULT '',
    `content` VARCHAR(16) NOT NULL DEFAULT ''
)Engine = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;