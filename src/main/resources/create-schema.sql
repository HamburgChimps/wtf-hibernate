create table grand_parent (
    id number(10)
);

create table crazy_uncle (
    id number(10),
    name varchar2(200)
);

create table parent (
    id number(10),
    is_responsible boolean,
    uncle_id number(10)
);

create table child (
    id number(10),
    is_responsible boolean,
    troublemaker boolean,
    uncle_id number(10)
);