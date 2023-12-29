USE division_db;

CREATE TABLE divisiones (
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    chet_id bigint not null,
    can_id bigint not null,
    pdc_id bigint not null,
    coz_id bigint not null,
    fcp_id bigint not null,

    primary key (id)
);