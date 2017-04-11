CREATE DATABASE ProtoEpic DEFAULT CHARACTER SET 'utf8'
  DEFAULT COLLATE 'utf_unicode_ci';

USE ProtoEpic;

CREATE TABLE Projects (
  ProjectId BIGINT UNSIGNED NOT NULL PRIMARY KEY,
  ProjectName VARCHAR(100) NOT NULL,
  INDEX Project_Names (ProjectName)
) ENGINE = InnoDB;

USE ProtoEpic;

CREATE TABLE Users (
  Userid BIGINT UNSIGNED NOT NULL PRIMARY KEY,
  Username VARCHAR(20) NOT NULL,
  FirstName VARCHAR(20) NOT NULL,
  LastName VARCHAR(20) NOT NULL,
  Password VARCHAR(20) NOT NULL,
  INDEX Usernames (Username)
) ENGINE = InnoDB;