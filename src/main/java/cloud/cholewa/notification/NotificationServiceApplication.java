package cloud.cholewa.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.tools.agent.ReactorDebugAgent;

@SpringBootApplication(scanBasePackages = "cloud.cholewa")
public class NotificationServiceApplication {

    public static void main(String[] args) {
        ReactorDebugAgent.init();
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

}
