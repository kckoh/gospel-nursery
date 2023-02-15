from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

import os
# if the docker compose is running change it to 172.17.0.1
# otherwise localhost
SQLALCHEMY_DATABASE_URL = "mysql+pymysql://gospel:gospel@172.17.0.1:3306/gospel"

engine = create_engine(
    SQLALCHEMY_DATABASE_URL,
    # connect_args={"check_same_thread": False}
)
SessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)


Base = declarative_base()
