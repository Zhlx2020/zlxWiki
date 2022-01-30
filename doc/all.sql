drop table if exists `test`;
create table `test` (
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '姓名',
    `password` varchar(50) comment '密码',
    primary key (`id`)
);