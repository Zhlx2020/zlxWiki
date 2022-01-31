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