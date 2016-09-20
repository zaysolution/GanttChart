
create database ganttchart;
USE ganttchart;
create table Task (
        id bigint not null auto_increment,
        title varchar(255),
        description varchar(255),
        startDate DATE ,
        duration DOUBLE ,
        primary key (id)
)