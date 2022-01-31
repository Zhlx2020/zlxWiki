drop table if exists `test`;
create table `test` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '姓名',
    `password` varchar(50) comment '密码',
    primary key (`id`)
);

drop table if exists `demo`;
create table `demo` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '姓名',
    primary key (`id`)
);

insert into demo (id, name) values
                                   (0, 'wxy'),
                                   (1, 'zlx');

drop table if exists `ebook`;
create table `ebook` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '书名',
    `category1_id` bigint comment '分类1',
    `category2_id` bigint comment '分类2',
    `description` varchar(200) comment '描述',
    `cover` varchar(200) comment '封面',
    `doc_count` int comment '文档数',
    `view_count` int comment '预览数',
    `vote_count` int comment '点赞数',
    primary key (`id`)
)engine = innodb default charset =utf8mb4 comment '电子书';

insert into ebook (id, name)
values (1,'深入浅出vue.js'),
       (2,'高级程序设计js'),
       (3,'深入理解es6'),
       (4,'你不知道的JavaScript'),
       (5,'http权威指南')