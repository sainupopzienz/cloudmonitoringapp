import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class CPUUtilizationChecker {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        double cpuUtilization = osBean.getSystemCpuLoad() * 100;

        System.out.println("CPU Utilization: " + cpuUtilization + "%");
    }
}
