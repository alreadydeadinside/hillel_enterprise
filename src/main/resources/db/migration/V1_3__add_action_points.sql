create table action_points_roles
(
    id              int auto_increment
        primary key,
    role_id         int not null,
    action_point_id int not null,
    constraint action_points_roles_ibfk_1
        foreign key (role_id) references role (id)
            on delete cascade,
    constraint action_points_roles_ibfk_2
        foreign key (action_point_id) references action_point (id)
            on delete cascade
);