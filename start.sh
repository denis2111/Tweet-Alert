cd web-controller
./mvnw package
cd ..
cd analytics-module
./mvnw package
cd ..
docker-compose up --build -d

#wsl -d docker-desktop
#sysctl -w vm.max_map_count=262144