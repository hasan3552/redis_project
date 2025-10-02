@Service
public class MessageService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    public void sendMessage(Object message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
        System.out.println("Xabar yuborildi: " + message);
    }
}