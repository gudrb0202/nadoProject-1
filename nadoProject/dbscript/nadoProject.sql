DROP TABLE EMPLOYEE CASCADE CONSTRAINTS;
DROP TABLE CHATTING CASCADE CONSTRAINTS;
DROP TABLE INTHECHAT CASCADE CONSTRAINTS;
DROP TABLE CHCONTENT CASCADE CONSTRAINTS;
DROP SEQUENCE SEQ_CHATTING;
DROP SEQUENCE SEQ_CHCONTENT;

CREATE TABLE EMPLOYEE(
  EMP_ID VARCHAR2(20) CONSTRAINT PK_EMPLOYEE PRIMARY KEY,
  EMAIL  VARCHAR2(50) CONSTRAINT NN_EMP_EMAIL NOT NULL,
  MY_PROFILE VARCHAR2(20),
  USER_ID VARCHAR2(20) CONSTRAINT NN_EMP_USERID NOT NULL,
  EMP_NAME VARCHAR2(20) CONSTRAINT NN_EMP_EMPNAME NOT NULL,
  USER_PWD VARCHAR2(20) CONSTRAINT NN_EMP_USERPWD NOT NULL,
  EMP_NO CHAR(14) CONSTRAINT NN_EMP_EMPNO NOT NULL,
  PHONE VARCHAR2(20) CONSTRAINT NN_EMP_PHONE NOT NULL,
  ADDRESS VARCHAR2(50) CONSTRAINT NN_EMP_ADDRESS NOT NULL,
  EMP_PHONE VARCHAR2(20),
  SALARY NUMBER,
  BONUS NUMBER,
  MARRIAGE CHAR(1) DEFAULT 'N',
  HIRE_DATE DATE DEFAULT SYSDATE,
  ID_LEVEL CHAR(1) DEFAULT 'G',
  SIGN VARCHAR2(20),
  
  CONSTRAINT UNI_EMP_EMAIL UNIQUE(EMAIL),
  CONSTRAINT UNI_EMP_EMPNO UNIQUE(EMP_NO),
  CONSTRAINT UNI_EMP_USERID UNIQUE(USER_ID),
  CONSTRAINT UNI_EMP_PHONE UNIQUE(PHONE),
  CONSTRAINT CHK_EMP_MARRIAGE CHECK(MARRIAGE IN ('Y', 'N')),
  CONSTRAINT CHK_EMP_IDLEVLE CHECK(ID_LEVEL IN ('G', 'M'))
);

COMMENT ON TABLE EMPLOYEE IS '사원';
COMMENT ON COLUMN EMPLOYEE.EMP_ID IS '사번';
COMMENT ON COLUMN EMPLOYEE.EMAIL IS '이메일';
COMMENT ON COLUMN EMPLOYEE.MY_PROFILE IS '프로필 사진';
COMMENT ON COLUMN EMPLOYEE.USER_ID IS '아이디';
COMMENT ON COLUMN EMPLOYEE.EMP_NAME IS '이름';
COMMENT ON COLUMN EMPLOYEE.USER_PWD IS '비밀번호';
COMMENT ON COLUMN EMPLOYEE.EMP_NO IS '주민번호';
COMMENT ON COLUMN EMPLOYEE.PHONE IS '전화번호';
COMMENT ON COLUMN EMPLOYEE.ADDRESS IS '주소';
COMMENT ON COLUMN EMPLOYEE.EMP_PHONE IS '내선번호';
COMMENT ON COLUMN EMPLOYEE.SALARY IS '연봉';
COMMENT ON COLUMN EMPLOYEE.BONUS IS '보너스';
COMMENT ON COLUMN EMPLOYEE.MARRIAGE IS '결혼여부';
COMMENT ON COLUMN EMPLOYEE.HIRE_DATE IS '입사일';
COMMENT ON COLUMN EMPLOYEE.ID_LEVEL IS '계정구분';
COMMENT ON COLUMN EMPLOYEE.SIGN IS '전자사인';

CREATE TABLE CHATTING(
    CHAT_ROOM_NO NUMBER CONSTRAINT PK_CHATTING PRIMARY KEY,
    CHAT_TITLE VARCHAR2(20) CONSTRAINT NN_CHAT_CHATTITLE NOT NULL,
    CHAT_USERS_TOTAL NUMBER CONSTRAINT NN_CHAT_CHATUSERSTOTAL NOT NULL,
    CHAT_CREATE_DATE DATE DEFAULT SYSDATE CONSTRAINT NN_CHAT_CHATCREATEDATE NOT NULL,
    EMP_ID VARCHAR2(20) CONSTRAINT NN_CHAT_EMPID NOT NULL,
    
    CONSTRAINT FK_CHAT_EMPID FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE(EMP_ID)
);

COMMENT ON TABLE CHATTING IS '채팅방' ;
COMMENT ON COLUMN CHATTING.CHAT_ROOM_NO IS '방번호';
COMMENT ON COLUMN CHATTING.CHAT_TITLE IS '방제목';
COMMENT ON COLUMN CHATTING.CHAT_USERS_TOTAL IS '참여인원';
COMMENT ON COLUMN CHATTING.CHAT_CREATE_DATE IS '방생성날짜';
COMMENT ON COLUMN CHATTING.EMP_ID IS '방생성자';

CREATE SEQUENCE SEQ_CHATTING
  START WITH 1
  INCREMENT BY 1 
  NOMAXVALUE 
  NOCYCLE;
  
CREATE TABLE INTHECHAT (
    CHAT_ROOM_NO NUMBER CONSTRAINT NN_ITC_CHATROOMNO NOT NULL,
    EMP_ID VARCHAR2(20) CONSTRAINT NN_ITC_EMPID NOT NULL,
    CONSTRAINT FK_ITC_CHATROOMNO FOREIGN KEY(CHAT_ROOM_NO) REFERENCES CHATTING(CHAT_ROOM_NO),
    CONSTRAINT FK_ITC_EMPID FOREIGN KEY(EMP_ID) REFERENCES EMPLOYEE(EMP_ID),
    CONSTRAINT PK_INTHECHAT PRIMARY KEY(CHAT_ROOM_NO, EMP_ID)
);

COMMENT ON TABLE INTHECHAT IS '방참여사용자' ;
COMMENT ON COLUMN INTHECHAT.EMP_ID IS '사번';
COMMENT ON COLUMN INTHECHAT.CHAT_ROOM_NO IS '방번호';

CREATE TABLE CHCONTENT(
    CHAT_NO NUMBER CONSTRAINT PK_CHCONTENT PRIMARY KEY,
    CHAT_ROOM_NO NUMBER CONSTRAINT NN_CHCON_CHATROOMNO NOT NULL,
    EMP_ID VARCHAR2(20) CONSTRAINT NN_CHCON_EMPID NOT NULL,
    CHAT_CONTENT VARCHAR2(200) CONSTRAINT NN_CHCON_CHATCONTENT NOT NULL,
    CHAT_SEND_TIME DATE DEFAULT SYSDATE,
    
    CONSTRAINT FK_CHCON_IDNO FOREIGN KEY(CHAT_ROOM_NO, EMP_ID) REFERENCES INTHECHAT(CHAT_ROOM_NO, EMP_ID)
);

COMMENT ON TABLE CHCONTENT IS '채팅글' ;
COMMENT ON COLUMN CHCONTENT.CHAT_ROOM_NO IS '방번호';
COMMENT ON COLUMN CHCONTENT.EMP_ID IS '사번';
COMMENT ON COLUMN CHCONTENT.CHAT_CONTENT IS '글';
COMMENT ON COLUMN CHCONTENT.CHAT_SEND_TIME IS '글생성시간';
 
CREATE SEQUENCE SEQ_CHCONTENT
START WITH 1
INCREMENT BY 1
NOMAXVALUE
NOCYCLE;
   
INSERT INTO EMPLOYEE VALUES('1004', 'BSJZZANG3@NAVER.COM', NULL, 'BSJZZANG3', '변상준', '1Q2W3E', '890127-1111111', '010-3333-3333'
    , '의정부시 호원동', '1230-001', 5000000, 0.5, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('1008', 'DECEMBER3104@NAVER.COM', NULL, 'DECEMBER', '손혜진', '111111', '901224-2001111', '010-3332-2222'
    , '의정부시 민락동', '1230-002', 5000000, 0.5, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('1024', 'YHSAAA@NAVER.COM', NULL, 'YHSAAA', '양호성', '1029QPWO', '910812-1031111', '010-3456-2152'
    , '구리시 구리동', '1230-006', 4800000, 0.4, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('1050', 'KHGYU@NAVER.COM', NULL, 'KHGYU', '김형규', 'OKOKOK', '920812-1077711', '010-3111-2444'
    , '강남구 오피스텔', '1230-013', 4700000, 0.4, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('1067', 'LAOPOS@NAVER.COM', NULL, 'LAOPOS', '우수연', 'DNTJDUS', '920813-2077711', '010-5511-5224'
    , '송파구 마천', '1230-021', 4700000, 0.4, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('2001', 'AWIEJF@NAVER.COM', NULL, 'ASDF', '신승민', '102938', '930101-1234123', '010-2838-4949'
    , '의정부시 의정부동', '1230-139', 4000000, 0.3, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('4048', 'WWNW@GMAIL.COM', NULL, 'QOQOQO', '조하영', 'QWERASDF', '920303-2123456', '010-2345-8888'
    , '신림동 54번길', '1231-003', 3000000, 0.3, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('4049', 'SLSLSL@GMAIL.COM', NULL, 'WIWIWI', '박근수', 'POIUPP', '930213-1020000','010-2838-2819'
    , '강남구 82번길', '1232-001', 2900000, 0.2, DEFAULT, DEFAULT, DEFAULT, NULL);
INSERT INTO EMPLOYEE VALUES('4072', 'BEGSE@GMAIL.COM', NULL, 'WAXXX', '김은수', 'ZXCVVCXZ', '910421-1120300','010-1555-2444'
    , '동대문구1번길', '1232-004', 2900000, 0.2, DEFAULT, DEFAULT, DEFAULT, NULL);    
    
INSERT INTO CHATTING VALUES(SEQ_CHATTING.NEXTVAL, '나도방', 5, DEFAULT, '1004');
INSERT INTO CHATTING VALUES(SEQ_CHATTING.NEXTVAL, '개인톡은수', 2, DEFAULT, '2001');
INSERT INTO CHATTING VALUES(SEQ_CHATTING.NEXTVAL, '개인톡승민', 2, DEFAULT, '1004');
INSERT INTO CHATTING VALUES(SEQ_CHATTING.NEXTVAL, '개인톡은수', 2, DEFAULT, '4048');
INSERT INTO CHATTING VALUES(SEQ_CHATTING.NEXTVAL, '개인톡근수', 2, DEFAULT, '4072');
INSERT INTO INTHECHAT VALUES(1, '1004');
INSERT INTO INTHECHAT VALUES(1, '1008');
INSERT INTO INTHECHAT VALUES(1, '1024');
INSERT INTO INTHECHAT VALUES(1, '1050');
INSERT INTO INTHECHAT VALUES(1, '1067');
INSERT INTO INTHECHAT VALUES(2, '2001');
INSERT INTO INTHECHAT VALUES(2, '4072');
INSERT INTO INTHECHAT VALUES(3, '1004');
INSERT INTO INTHECHAT VALUES(3, '2001');
INSERT INTO INTHECHAT VALUES(4, '4048');
INSERT INTO INTHECHAT VALUES(4, '4072');
INSERT INTO INTHECHAT VALUES(5, '4072');
INSERT INTO INTHECHAT VALUES(5, '4049');
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 1, '1004','안녕', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 1, '1008', '배고파', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 2, '2001', '안녕하세요', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 4, '4072', '어디가', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 4, '4048', '집', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 1, '1024', '안녕하세요', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 3, '1004', '밥먹자', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 3, '2001', '어디갈까요', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 5, '4072', '안녕하세요', DEFAULT);
INSERT INTO CHCONTENT VALUES(SEQ_CHCONTENT.NEXTVAL, 5, '4049', '동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라만세', DEFAULT);

 
 
SELECT * FROM CHCONTENT WHERE CHAT_ROOM_NO = 1;
 
    