create table user
(
    id  int auto_increment primary key,
    first_name varchar(25) not null,
    last_name  varchar(25) not null,
    email      varchar(50) not null
#     role_id int null
--     constraint user_role_id
--         foreign key (role_id) references role (id)
);

create table action_point
(
    id int auto_increment primary key,
    name    varchar(100) not null
);

create table role
(
    id int auto_increment primary key,
    name    varchar(100) not null
);