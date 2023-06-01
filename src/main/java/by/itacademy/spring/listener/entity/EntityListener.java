package by.itacademy.spring.listener.entity;

import lombok.EqualsAndHashCode;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@EqualsAndHashCode
public class EntityListener {

    @EventListener(condition = "#p0.accessType.name == 'DELETE'")
    public void acceptEntity(EntityEvent entityEvent) {
        System.out.println("Entity: " + entityEvent);
    }
}
