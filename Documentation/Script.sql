CREATE TABLE users (
	user_id SERIAL PRIMARY KEY,
	first_name VARCHAR(200) NOT NULL,
	last_name VARCHAR(200) NOT NULL,
	email VARCHAR(200) NOT NULL,
	username VARCHAR(200) NOT NULL,
	"password" VARCHAR(200) NOT NULL
);

CREATE TABLE requests (
	request_id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	reimbursement_amount INT NOT NULL,
	message VARCHAR(2000),
	user_id INT,
	completed BOOL,
	CONSTRAINT requests_users_fk FOREIGN KEY (user_id) REFERENCES users (user_id)
);

SELECT * FROM users