use dawoo;



alter table emp(
	emp_id int not null,
    emp_name varchar(100) not null,
    emp_salary int not null,
    branch_id int
);

create table test(
	stu_id int ,
    sub varchar(100) ,
    grade varchar(100),
    age int,
    primary key(stu_id, sub)
);
insert into test(stu_id, sub, grade, age)
values(300, "C123", "A", 4);
insert into test(stu_id, sub, grade, age)
values(300, "C124", "A", 4);

select * from test;

update test set age = '4' where stu_id = 300 and sub = "C123";

insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(4603,"alayna",180,15);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(3201,"kassidi",960,16);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(864,"holly",330,15);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(2842,"kyra",280,16);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(2716,"audrina",870,16);

select *
from emp;

select emp_id, emp_name, cnt-1 as num_co_worker
from emp a,
(
	select branch_id, count(branch_id) as cnt
	from emp
    group by branch_id
)b
where a.branch_id = b.branch_id
order by a.emp_id ASC;

-- 여기가 제대로 된 답--  
select ID, NAME, cnt-1 as num_co_worker
from emp a,
(
	select branch_id, count(branch_id) as cnt
	from emp
    group by branch_id
)b
where a.branch_id = b.branch_id
order by a.emp_id ASC;
use dawoo;

-- 자바 웹 개발 워크북 데이터베이스 sql
use dawoo;
create table members(
	mno int not null,
    email varchar(40) not null,
    pwd varchar(100) not null,
    mname varchar(50) not null,
    cre_date datetime not null,
    mod_date datetime not null
);

alter table members add constraint pk_members
primary key (
	mno
);

create unique index uix_members on members
(
	email asc
);
-- 테이블 한글 characterset 바기기
alter table members convert to charset utf8;
alter table tele convert to charset utf8;

alter table members modify column mno integer not null auto_increment;
insert into members(email, pwd, mname, cre_date, mod_date)
values ('s1@test.com', '1111', '홍길동', now(),now());
insert into members(email, pwd, mname, cre_date, mod_date)
values ('s2@test.com', '1111', '임꺽정', now(),now());
insert into members(email, pwd, mname, cre_date, mod_date)
values ('s3@test.com', '1111', '일지매', now(),now());
insert into members(email, pwd, mname, cre_date, mod_date)
values ('s4@test.com', '1111', '이몽룡', now(),now());
insert into members(email, pwd, mname, cre_date, mod_date)
values ('s5@test.com', '1111', '성춘향', now(),now());

create table tele(
	mmno int,
	sex varchar(1),
    tele varchar(100)
);
alter table tele change mmno mno int;
insert into tele(mno, sex,  tele)
values (1,'남','01022223333');
insert into tele(mno, sex, tele)
values (2, '여','01023232323');
insert into tele(mno, sex, tele)
values (3, '여','01023232323');
insert into tele(mno, sex, tele)
values (4, '여','01023232323');

select mno
from tele natural join members
where sex = '여';

create table test1(
	grade1 int,
    grade2 int
);	

insert into test1(grade1, grade2)
values (1,1),(2,2),(3,3),(4,4),(5,5);
insert into test1(grade1, grade2)
values (1,1),(2,2),(3,3),(4,4),(5,null);

create table test2(
	dept varchar(20)
);

insert into test2(dept) values
('cs'),('cs'),('math'),('math'),('elec'),('elec');

select distinct dept from test2;

select *
from test1
where grade2 is null;


delete from test1;

select * from members;
select * from tele;

drop table emp;


create table emp(
	emp_id int primary key not null,
    emp_name varchar(40) not null,
    emp_salary int not null,
    branch_id int not null
);

create table selling(
	s_car_id int not null,
    s_emp_id int not null,
    s_date datetime null,
    s_price int not null
    
);

insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(4603,"alayna",180,15);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(4651,"kassidi",300,15);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(864,"holly",330,16);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(2842,"kyra",280,17);
insert into emp(emp_id, emp_name, emp_salary, branch_id)
values(4521,"Margaret",400,17);


insert into selling
values(306,4603,20160905223752,5200);
insert into selling
values(309,2455,20160905223752,5000);
insert into selling
values(305,864,20160905223752,5100);
insert into selling
values(307,4521,20160905223752,5000);
insert into selling
values(310,4651,20160905223752,5500);
insert into selling
values(388,4603,20160905223752,5700);

select * from selling;
select * from emp;

select branch_id, count(branch_id) as 계약건수
from emp e, selling s
where e.emp_id = s.s_emp_id
group by e.branch_id;
