DROP TABLE IF EXISTS post;
------------------------------
CREATE TABLE reddit_post (
 id            bigint                       NOT NULL primary key,
 user_id       bigint                       NOT NULL REFERENCES  reddit_user (id),
 content       char varying                 NOT NULL,
 image_url     char varying,
 upvote        bigint                       DEFAULT  0,
 created_at    timestamp with time zone     NOT NULL,
 updated_at    timestamp  with time zone    NOT NULL
)