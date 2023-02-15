FROM python:3.10-slim

ENV PYTHONUNBUFFERED 1
ENV PYTHONDONTWRITEBYTECODE 1

WORKDIR /backend
COPY requirements.txt /backend
RUN apt-get update \
  # dependencies for building Python packages
  && apt-get install -y build-essential \
  # psycopg2 dependencies
  && apt-get install -y libpq-dev
RUN apt-get install ffmpeg libsm6 libxext6  -y
RUN pip install --upgrade pip
RUN pip install cryptography
RUN pip install -r requirements.txt 

COPY . /taegong/
EXPOSE 8000