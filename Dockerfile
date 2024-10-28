# Sử dụng base image phù hợp với Java (ví dụ OpenJDK)
FROM openjdk:17

# Đặt thư mục làm việc trong container
WORKDIR /usr/src/app

# Copy toàn bộ mã nguồn vào container
COPY . /usr/src/app

# Build ứng dụng bằng Gradle
RUN ./gradlew clean build

# Chỉ định thư mục chứa các artifact sau khi build (tùy thuộc vào cấu trúc dự án của bạn)
RUN cp /usr/src/app/build/libs/*.jar /usr/src/app/app.jar
