-- 방명록 테이블 

create table guestbook_message (
    message_id number(4) primary key,
    guest_name varchar2(50) not null,
    password varchar2(10) not null,
    message varchar2(2000) not null
);

create sequence message_id_seq increment by 1 start with 1; 

insert into guestbook_message
values (message_id_seq.nextVal, '테스터','1111','테스트 글쓰기');

drop table guestbook_message;

select *
from guestbook_message;

rollback;
