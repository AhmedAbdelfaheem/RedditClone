CREATE TABLE post (
  id            bigint                       NOT NULL primary key,
  user_id       bigint                       NOT NULL,
  content       char varying,
  created_at    timestamp                     NOT NULL,
  updated_at    timestamp                     NOT NULL
)
