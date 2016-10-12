package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Service;

@Service
public class MyMetricsService {
    private final CounterService counterService;
    private final GaugeService gaugeService;

    @Autowired
    public MyMetricsService(CounterService counterService, GaugeService gaugeService) {
        this.counterService = counterService;
        this.gaugeService = gaugeService;
    }

    public void incrementServiceCall() {
        this.counterService.increment("myservice.requestNumber");
    }

    public void setServiceNumber(double number) {
        this.gaugeService.submit("myservice.serviceNumber", number);
    }

}