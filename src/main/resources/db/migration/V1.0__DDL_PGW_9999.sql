create table PROPERTIES
(
    "ID"         serial primary key,
    "CREATED_ON" timestamp,
    APPLICATION  text,
    PROFILE      text,
    LABEL        text,
    "KEY"        text,
    "VALUE"      text
);


GRANT INSERT, SELECT, UPDATE, DELETE ON TABLE PROPERTIES TO config_server_user;