
/* Drop Tables */

DROP TABLE IF EXISTS aiolos.challenge_detail_history;
DROP TABLE IF EXISTS aiolos.challenge_history;
DROP TABLE IF EXISTS aiolos.question;




/* Create Tables */

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
	score int NOT NULL,
	attendance_rate int NOT NULL,
	user_name text NOT NULL,
	elapsed_time bigint DEFAULT 0 NOT NULL,
	correct_sum int DEFAULT 0 NOT NULL,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	PRIMARY KEY (challenge_history_id)
) WITHOUT OIDS;


CREATE TABLE aiolos.question
(
	question_id serial NOT NULL,
	keyword text NOT NULL,
	description text,
	order_num int UNIQUE,
	delete_flag boolean DEFAULT 'false' NOT NULL,
	register_datetime timestamp(3) DEFAULT CURRENT_TIMESTAMP NOT NULL,
	update_datetime timestamp(3),
	PRIMARY KEY (question_id)
) WITHOUT OIDS;



