cd web-controller
call ./mvnw package
cd ..
cd analytics-module
call ./mvnw package
cd ..
call docker-compose up --build -d