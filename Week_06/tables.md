
用户表 

create table users
(
    id           int auto_increment comment '主键id 自增'''
        primary key,
    username     varchar(32) not null comment '用户名 用户名',
    password     varchar(64) not null comment '密码',
    mobile       varchar(64) not null comment '电话号码',
    email        varchar(64) not null comment '电子邮件',
    birthday     date        null comment '生日',
    created_time mediumtext  not null comment '创建时间',
    updated_time mediumtext  not null comment '修改时间'
);



商品表 

create table products
(
    id           int auto_increment comment '商品ID， 主键，自增'
        primary key,
    name         varchar(64) not null comment '商品名称
',
    image        varchar(64) null comment '商品照片路径',
    price        int         not null comment '商品价格',
    stock        int         not null comment '商品库存',
    created_time mediumtext  not null comment '创建时间戳',
    updated_time mediumtext  not null comment '修改时间戳'
)
    comment '商品表';


订单表

create table orders
(
    id               int auto_increment comment '订单ID  主键 '
        primary key,
    user_id          int         not null comment '购买的用户 id',
    receiver_name    varchar(64) not null comment '收货人',
    receiver_address varchar(64) not null comment '收货人地址',
    receiver_mobile  int         null comment '收货人电话',
    total_amount     decimal     not null comment '购买金额
',
    left_msg         varchar(64) null comment '订单 留言',
    created_time     mediumtext  not null comment '订单创建时间',
    updated_time     mediumtext  not null comment '订单修改时间'
)
    comment '订单表';




