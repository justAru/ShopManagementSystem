package kz.iitu.midtermProject.event;

import org.springframework.context.ApplicationListener;

public class ItemChangeEventHandler implements ApplicationListener<ItemChangeEvent> {
    @Override
    public void onApplicationEvent(ItemChangeEvent itemChangeEvent) {
        System.out.println("Changing: " + itemChangeEvent.getItem());
    }
}
