package kafkaHelpers

import java.util
import org.apache.kafka.clients.consumer.KafkaConsumer
import java.util.Properties
import scala.collection.JavaConverters._


class  KafkaConsumerProgram {
    def main(args: Array[String]): Unit = {
        consumeFromKafka("TopicName")
    }

    def consumeFromKafka(topic: String)= {
        val props: Properties = new Properties()
        // Define properties

        val consumer = new KafkaConsumer(props)

        try {
            consumer.subscribe(util.Arrays.asList(topic))
            while (true) {
                val records = consumer.poll(10)
                for (record <- records.asScala) {
                // Do Stuff
                }
            }
        } catch {
            case e: Exception => e.printStackTrace()
            } finally {
            consumer.close()
            }
    }

    def q1(): Unit = {

    }
    def q2(): Unit = {

    }
    def q3(): Unit = {

    }
    def q4(): Unit = {

    }


}
