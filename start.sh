cd web-controller
./mvnw package
cd ..
cd analytics-module
./mvnw package
cd ..
docker-compose up --build -d