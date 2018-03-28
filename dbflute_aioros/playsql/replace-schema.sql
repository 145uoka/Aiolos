
/* Drop Tables */

DROP TABLE IF EXISTS aiolos.answer;
DROP TABLE IF EXISTS aiolos.challenge_detail_history;
DROP TABLE IF EXISTS aiolos.challenge_history;
DROP TABLE IF EXISTS aiolos.question;
DROP TABLE IF EXISTS aiolos.genre;




/* Create Tables */

CREATE TABLE aiolos.answer
(
	anwer_id serial NOT NULL,
	question_id int NOT NULL,
	branch_no int NOT NULL,
	label text,
	PRIMARY KEY (anwer_id),
	UNIQUE (question_id, branch_no)
) WITHOUT OIDS;


CREATE TABLE aiolos.challenge_detail_history
(
	histroy_detail_id serial NOT NULL,
	challenge_history_id int NOT NULL,
	question_id int NOT NULL,
	answer text,
	correct_flag boolean NOT NULL,
	PRIMARY KEY (histroy_detail_id)
) WITHOUT OIDS;


CREATE TABLE aiolos.challenge_history
(
	challenge_history_id serial NOT NULL,
	genre_id int NOT NULL,
	user_name text NOT NULL,
	score double precision NOT NULL,
	attendance_rate int NOT NULL,
	elapsed_time bigint DEFAULT 0 NOT NULL,
	correct_sum int DEFAULT 0 NOT NULL,
	incorrect_sum int DEFAULT 0 NOT NULL,
	detail_clean_flag boolean DEFAULT 'false' NOT NULL,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	PRIMARY KEY (challenge_history_id)
) WITHOUT OIDS;


CREATE TABLE aiolos.genre
(
	genre_id serial NOT NULL,
	genre_name text NOT NULL,
	PRIMARY KEY (genre_id)
) WITHOUT OIDS;


CREATE TABLE aiolos.question
(
	question_id serial NOT NULL,
	genre_id int NOT NULL,
	question_num int NOT NULL,
	answer_branch_no text NOT NULL,
	description text,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	PRIMARY KEY (question_id)
) WITHOUT OIDS;



