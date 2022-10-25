-- noinspection SqlNoDataSourceInspectionForFile

create table grand_parent (
    id number(10) primary key
);

create table crazy_uncle (
    id number(10) primary key,
    name varchar2(200)
);

create table parent (
    id number(10) primary key,
    is_responsible boolean,
    uncle_id number(10),
    foreign key (uncle_id) references crazy_uncle
);

create table child (
    id number(10) primary key,
    is_responsible boolean,
    is_troublemaker boolean,
    uncle_id number(10),
    foreign key (uncle_id) references crazy_uncle
);
