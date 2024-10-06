CREATE TABLE user_ (
                       user_id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
                       first_name TEXT NOT NULL,
                       last_name TEXT NOT NULL,
                       email TEXT NOT NULL UNIQUE,
                       role VARCHAR(50),
                       phone_number TEXT,
                       password TEXT,
                       city TEXT,
                       address TEXT,
                       CONSTRAINT email_unique UNIQUE (email)
);