package gilyeon.spring.batch;

import gilyeon.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class CustomItemWriter implements ItemWriter<Customer> {

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        list.forEach(item -> System.out.println(item));
    }
}
