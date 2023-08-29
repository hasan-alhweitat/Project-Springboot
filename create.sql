
    create table books (
        id integer not null,
        year integer not null,
        category varchar(255),
        name_book varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table book (
        price float(53),
        year integer,
        cart_id bigint,
        id bigint not null auto_increment,
        order_id bigint,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table cart (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    create table order (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    alter table book 
       add constraint FKnqqwgf4vpry5kqjgbclg52xi 
       foreign key (cart_id) 
       references cart (id);

    alter table book 
       add constraint FKjivuhjle9ok7f3vh82chnh0a5 
       foreign key (order_id) 
       references order (id);

    create table book (
        price float(53),
        year integer,
        cart_id bigint,
        id bigint not null auto_increment,
        order_id bigint,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table cart (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    create table order (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    alter table book 
       add constraint FKnqqwgf4vpry5kqjgbclg52xi 
       foreign key (cart_id) 
       references cart (id);

    alter table book 
       add constraint FKjivuhjle9ok7f3vh82chnh0a5 
       foreign key (order_id) 
       references order (id);

    create table book (
        price float(53),
        year integer,
        cart_id bigint,
        id bigint not null auto_increment,
        order_id bigint,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table cart (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    create table order (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    alter table book 
       add constraint FKnqqwgf4vpry5kqjgbclg52xi 
       foreign key (cart_id) 
       references cart (id);

    alter table book 
       add constraint FKjivuhjle9ok7f3vh82chnh0a5 
       foreign key (order_id) 
       references order (id);

    create table book (
        price float(53),
        year integer,
        cart_id bigint,
        id bigint not null auto_increment,
        order_id bigint,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table cart (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    create table order (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    alter table book 
       add constraint FKnqqwgf4vpry5kqjgbclg52xi 
       foreign key (cart_id) 
       references cart (id);

    alter table book 
       add constraint FKjivuhjle9ok7f3vh82chnh0a5 
       foreign key (order_id) 
       references order (id);

    create table book (
        price float(53),
        year integer,
        cart_id bigint,
        id bigint not null auto_increment,
        order_id bigint,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table cart (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    create table order (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    alter table book 
       add constraint FKnqqwgf4vpry5kqjgbclg52xi 
       foreign key (cart_id) 
       references cart (id);

    alter table book 
       add constraint FKjivuhjle9ok7f3vh82chnh0a5 
       foreign key (order_id) 
       references order (id);

    create table book (
        price float(53),
        year integer,
        cart_id bigint,
        id bigint not null auto_increment,
        order_id bigint,
        book_name varchar(255),
        category varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table cart (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    create table order (
        id bigint not null auto_increment,
        primary key (id)
    ) engine=InnoDB;

    alter table book 
       add constraint FKnqqwgf4vpry5kqjgbclg52xi 
       foreign key (cart_id) 
       references cart (id);

    alter table book 
       add constraint FKjivuhjle9ok7f3vh82chnh0a5 
       foreign key (order_id) 
       references order (id);
