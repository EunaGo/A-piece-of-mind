-- 현재 계정의 테이블 목록을 보여줌
SELECT *
FROM tab;

-- 모든 계정의 테이블 목록을 보여줌
SELECT *
FROM all_tables
WHERE OWNER = SCOTT;

SELECT *
FROM user_tables;

--
create table phoneInfo_basic
(idx number(6) not null,
fr_name varchar2(20) not null,
fr_phonenumber varchar2(20) not null,
fr_email varchar2(20),
fr_address varchar2(20),
fr_regdate date default sysdate,
primary key(idx));

desc phoneInfo_basic;

insert into phoneInfo_basic values(123456,'goeuna','010-9389-8415','abc@gmail','성산동','');

select * from phoneInfo_basic; 

create table phoneInfo_univ(
idx number(6) not null,
fr_u_major varchar2(20) default 'n' not null,
fr_u_year number(1) default 1 not null,
fr_ref number(7) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx),
constraint year_heck check(fr_u_year>0 and fr_u_year<5));

select * from phoneInfo_univ;

create table phoneInfo_com(
idx number(6) not null,
fr_c_company varchar(20) default 'n' not null,
fr_ref number(6) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx));

create table phonebook(
pidx number(4),
name varchar2(10) not null,
phonenum varchar2(20) not null,
address varchar2(20) default '입력 없음' not null,
email varchar2(20) default '입력 없음' not null,
pbtype varchar2(50) not null,
major varchar2(10),
grade number(1),
comname varchar2(20),
deptname varchar2(20),
deptjob varchar2(10),
cafename varchar2(20),
nickname varchar2(10),
primary key(pidx),
constraint category_pbtype check(pbtype in ('univ', 'com', 'cafe')),
constraint phonenum_check unique(phonenum));

select *
from phonebook;
