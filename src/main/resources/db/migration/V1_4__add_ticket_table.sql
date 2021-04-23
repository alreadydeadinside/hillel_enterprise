create table ticket
(
    id          int auto_increment primary key,
    name        varchar(25) not null,
    description varchar(50) not null,
    assignee    varchar(25) not null,
    reporter    varchar(25) not null,
    status      varchar(25) not null,
    priority    varchar(25) not null,

    spent       int         not null,
    estimated   int         not null,
    creat_on DATE  not null,
    ticket_type ENUM('USER_STORY', 'EPIC', 'SUB_TASK') not null
);