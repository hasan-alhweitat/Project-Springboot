
    create table book (
        year integer,
        id bigint not null auto_increment,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;
