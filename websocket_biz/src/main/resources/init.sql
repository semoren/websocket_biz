CREATE TABLE `ws_base_info` (
  `id` varchar(32) NOT NULL DEFAULT '' COMMENT 'UUID生成',
  `m_id` int(32) DEFAULT '0' COMMENT '消息ID',
  `msg` varchar(255) DEFAULT '' COMMENT '消息',
  `url` varchar(255) DEFAULT '' COMMENT '链接',
  `title` varchar(50) DEFAULT '' COMMENT '标题',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0-未完成 1-已完成',
  `system` int(1) unsigned NOT NULL DEFAULT '0' COMMENT '系统 0-合同系统',
  `type` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '0-发给系统多个人 1-发给系统所有人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间戳',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `ws_send_info` (
  `id` varchar(32) NOT NULL,
  `wbi_id` varchar(32) NOT NULL COMMENT '对应base_info中的id',
  `user` varchar(32) NOT NULL COMMENT '接收人',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0-未完成 1-已完成',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '完成时间',
  PRIMARY KEY (`id`),
  KEY `wsi_wbi_id` (`wbi_id`),
  KEY `wsi_user` (`user`),
  KEY `wsi_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `ws_send_log` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `wbi_id` varchar(32) NOT NULL DEFAULT '',
  `wsi` varchar(32) NOT NULL,
  `user` varchar(32) NOT NULL,
  `system` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0-发送出去 1-已接收',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8