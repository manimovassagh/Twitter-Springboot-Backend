-- Create the Users table
CREATE TABLE Users (
  user_id SERIAL PRIMARY KEY,
  username VARCHAR(255),
  email VARCHAR(255),
  password VARCHAR(255)
);

-- Create the Tweets table
CREATE TABLE Tweets (
  tweet_id SERIAL PRIMARY KEY,
  user_id INT,
  content TEXT,
  timestamp TIMESTAMPTZ,
  FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Create the Follows table
CREATE TABLE Follows (
  follow_id SERIAL PRIMARY KEY,
  follower_id INT,
  following_id INT,
  FOREIGN KEY (follower_id) REFERENCES Users(user_id),
  FOREIGN KEY (following_id) REFERENCES Users(user_id)
);

-- Create the Likes table
CREATE TABLE Likes (
  like_id SERIAL PRIMARY KEY,
  user_id INT,
  tweet_id INT,
  FOREIGN KEY (user_id) REFERENCES Users(user_id),
  FOREIGN KEY (tweet_id) REFERENCES Tweets(tweet_id)
);

-- Create the Retweets table
CREATE TABLE Retweets (
  retweet_id SERIAL PRIMARY KEY,
  user_id INT,
  tweet_id INT,
  FOREIGN KEY (user_id) REFERENCES Users(user_id),
  FOREIGN KEY (tweet_id) REFERENCES Tweets(tweet_id)
);

-- Create the RetweetLikes table
CREATE TABLE RetweetLikes (
  retweetlike_id SERIAL PRIMARY KEY,
  user_id INT,
  retweet_id INT,
  FOREIGN KEY (user_id) REFERENCES Users(user_id),
  FOREIGN KEY (retweet_id) REFERENCES Retweets(retweet_id)
);
