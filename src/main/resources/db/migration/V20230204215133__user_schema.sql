CREATE TABLE IF NOT EXISTS reddit_user (
   id              bigint                       NOT NULL primary key,
   first_name      char varying                 NOT NULL,
   last_name       char varying                 NOT NULL,
   password        char varying                 NOT NULL,
   phone_number    char varying                 NOT NULL,
   user_type       char varying                 NOT NULL,
   created_at    timestamp                     NOT NULL,
   updated_at    timestamp                     NOT NULL
)