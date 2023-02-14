FROM node:16.13.0-alpine as build-stage
RUN mkdir /app
WORKDIR /app
COPY package*.json /app/
RUN yarn 
COPY . /app/
RUN yarn build

# # # root 에 app 폴더를 생성
# RUN mkdir /app

# # # work dir 고정
# WORKDIR /app

# COPY ./package.json .
# COPY ./package-lock.json .

# RUN yarn install

# COPY . .

# RUN yarn build

# nginx 이미지를 사용합니다. 뒤에 tag가 없으면 latest 를 사용합니다.
FROM nginx

# root 에 app 폴더를 생성
# RUN mkdir /app

# work dir 고정
WORKDIR /app

# # work dir 에 build 폴더 생성 /app/build
# # RUN mkdir ./build

# # host pc의 현재경로의 build 폴더를 workdir 의 build 폴더로 복사
# # ADD ./build ./build

COPY --from=build-stage /app/dist/ /app
# nginx 의 default.conf 를 삭제
RUN rm /etc/nginx/conf.d/default.conf

# host pc 의 nginx.conf 를 아래 경로에 복사
COPY ./nginx.conf /etc/nginx/conf.d

# 80 포트 오픈
EXPOSE 8080

# container 실행 시 자동으로 실행할 command. nginx 시작함
CMD ["nginx", "-g", "daemon off;"]
