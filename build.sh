source /etc/profile
mvn clean package -Dmaven.test.skip=true docker:build
cd docker/default
docker-compose up -d