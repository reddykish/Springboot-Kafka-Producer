commands to runs the kafka


//zookeeper
bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

//kafka-server

bin\windows\kafka-server-start.bat config\server.properties


//topic creation


bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Employee


//consumer command


bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Employee --from-beginning
