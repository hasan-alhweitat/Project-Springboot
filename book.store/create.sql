

    create table books (
        id integer not null,
        year integer not null,
        category varchar(255),
        name_book varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table books_seq (
        next_val bigint
    ) engine=InnoDB;

    insert into books_seq values ( 1 );
