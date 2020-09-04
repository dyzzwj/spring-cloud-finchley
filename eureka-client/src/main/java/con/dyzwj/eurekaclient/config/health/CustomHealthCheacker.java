package con.dyzwj.eurekaclient.config.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author zwj
 * @version 1.0.0
 * @ClassName CustomHealthCheacker.java
 * @Description 自定义health端口监控内容
 * @createTime 2020年01月11日 14:48:00
 */

@Component
public class CustomHealthCheacker implements HealthIndicator {

    private boolean up = true;

    @Override
    public Health health() {
        if(up){
            return new Health.Builder().withDetail("status","up").up().build();
        }else {

            return new Health.Builder().withDetail("error","client is down").down().build();
        }

    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }
}
