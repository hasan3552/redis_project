@Component
public class MessageListener {

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(Object message) {
        System.out.println("Qabul qilindi: " + message);
    }
}